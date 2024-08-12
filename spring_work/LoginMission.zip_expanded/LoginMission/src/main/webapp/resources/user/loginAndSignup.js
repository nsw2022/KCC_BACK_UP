/**
 * 
 */
 let container = document.getElementById('container')

toggle = () => {
  container.classList.toggle('sign-in')
  container.classList.toggle('sign-up')
}

setTimeout(() => {
  container.classList.add('sign-in')
}, 100)
$(function() {
    var countdown;
    var count = 60;

    const uidRegex = /^[a-zA-Z0-9]{6,15}$/; // 사용자 ID: 영숫자만 허용, 6-15자
    const upassRegex = /^(?=.*[A-Z])(?=.*[!@#$&*])[a-zA-Z0-9!@#$&*]{8,16}$/; // 비밀번호: 적어도 하나의 대문자와 특수 문자를 포함해야 함, 8-16자
    const unameRegex = /^[가-힣]+$/;
	var isUserIdValid = false; // 사용자 ID 검증 상태를 추적하는 플래그
    function startCountdown() {
        clearInterval(countdown);
        count = 60;
        $("#zzmessage").show().text(count + "초 후에 인증번호 발송이 다시 활성화됩니다.");
        countdown = setInterval(function() {
            count--;
            if (count >= 0) {
                $("#zzmessage").text(count + "초 후에 인증번호 발송이 다시 활성화됩니다.");
            } else {
                clearInterval(countdown);
                $("#zzmessage").hide().text("");
            }
        }, 1000);
    }

	 $('#checkuid').click(function() {
	    var uid = $('#uid').val();
	    if (!uidRegex.test(uid)) {
	        alert("잘못된 사용자 이름입니다. 영숫자 6-15자로 구성되어야 하며 공백이 없어야 합니다.");
	        return;
	    }
	    $.ajax({
	        type: 'POST',
	        url: '/user/checkuid',
	        data: { uid: uid },
	        success: function(response) {
	            alert(response.message);
	            if (response.success) {
	                $("#uid").prop("readOnly", true);
	                isUserIdValid = true; // 사용자 ID가 유효하다고 표시
	            } else {
	                isUserIdValid = false; // 사용자 ID가 유효하지 않다고 표시
	            }
	        },
	        error: function() {
	            alert('ID 검사 중 오류가 발생했습니다.');
	            isUserIdValid = false;
	        }
	    });
	});

    $('#sendemail').click(function() {
        const email = $('#uemail').val();
        if (!countdown || count <= 0) {
            $.ajax({
                type: 'POST',
                url: '/user/approve',
                data: { email: email },
                success: function(response) {
                    alert(response.message);
                    if (response.success) {
                        startCountdown();
                        $("#emailbox").show();
                        const savedVerificationCode = String(response.verificationCode).trim();
                        $('#approveEmail').off('click').on('click', function() {
                            const verificationCode = $('#emailcheck').val().trim();
                            console.log(savedVerificationCode + " 서버에서 받은 값");
                            console.log(verificationCode + " 사용자 입력 값");

                            if (savedVerificationCode === verificationCode) {
                                alert('인증 성공!');
                                $("#uemail, #emailcheck, #approveEmail").prop("disabled", true);
                                clearInterval(countdown);
                                $("#zzmessage").hide().text("");
                                $("emailbox").hide()
                            } else {
                                alert('인증 번호가 일치하지 않습니다.');
                            }
                        });
                    }
                },
                error: function(error) {
                    console.error('인증 에러', error);
                    alert('인증 중 문제가 발생했습니다.');
                }
            });
        } else {
            alert("잠시 후 다시 시도해주세요.");
        }
    });

  $('#signupButton').click(function() {
	    var data = {
	        userId: $('#uid').val(),   
	        userName: $('#uname').val(),  
	        userEmail: $('#uemail').val(),  
	        userPass: $('#upass').val(),   
	        upassConfirm: $('#upassconfirm').val()  
	    };
	
	    // ID 중복 검사를 완료했는지 확인
	    if (!isUserIdValid) {
	        alert('유효한 ID를 입력하고 ID 중복 검사를 완료해주세요.');
	        return;
	    }
	
	    // 이름 유효성 검사
	    if (!data.userName || data.userName.trim() === "" || !/^[가-힣]+$/.test(data.userName)) {
	        alert("유효하지 않은 이름입니다. 이름은 한글만 가능하며 공백을 포함할 수 없습니다.");
	        return;
	    }
	
	    // 비밀번호 유효성 검사
	    if (!/^(?=.*[A-Z])(?=.*[!@#$&*])[a-zA-Z0-9!@#$&*]{8,16}$/.test(data.userPass)) {
	        alert('비밀번호가 잘못되었습니다. 8-16자, 최소 한 개의 대문자와 특수 문자를 포함해야 합니다.');
	        return;
	    }
	
	    // 비밀번호 일치 확인
	    if (data.userPass !== data.upassConfirm) {
	        alert('비밀번호가 일치하지 않습니다.');
	        return;
	    }
	
	    // 서버로 데이터 전송
	    $.ajax({
	        type: 'POST',
	        url: '/user/adduser',
	        data: data,
	        success: function() {
	            alert('회원가입을 축하합니다!');
	            window.location.href = '/user/loginAndSignup'; 
	        },
	        error: function() {
	            alert('회원가입 실패!');
	        }
	    });
	});




    function handleLogin() {
        var data = {
            userId: $('#login_uid').val(),
            userPass: $('#login_upass').val()
        };

        $.ajax({
            type: 'POST',
            url: '/user/login',
            data: data,
            contentType: 'application/x-www-form-urlencoded; charset=UTF-8',
            success: function(response) {
                alert(response.message);
                if (response.success) {
                    window.location.href = response.redirectTo;
                }
            },
            error: function(error) {
                console.error('로그인 에러', error);
                alert('아이디 혹은 비밀번호를 잘못 입력하셨습니다.');
            }
        });
    }

    $('#loginButton').click(function() {
        handleLogin();
    });

    $('#login_upass').keypress(function(event) {
        if (event.which == 13) {  // 엔터 키 코드는 13입니다.
            handleLogin();
        }
    });
});
