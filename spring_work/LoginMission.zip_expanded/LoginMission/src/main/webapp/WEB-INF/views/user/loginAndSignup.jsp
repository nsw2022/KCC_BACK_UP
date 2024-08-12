<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <link rel="stylesheet" href="/resources/user/loginAndSignup.css">
  <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
  <title>회원가입/로그인 페이지</title>
</head>

<body>

  <div id="container" class="container">
    <!-- FORM SECTION -->
    <div class="row">
      <!-- SIGN UP -->
      <div class="col align-items-center flex-col sign-up">
        <div class="form-wrapper align-items-center">
          <div class="form sign-up">
            <div class="input-group">
              <div style="display: flex;">
                <i class='bx bxs-user'></i>
                <input type="text" placeholder="아이디" name="user_id" id="uid" style="margin-right: 9px;width: 90%;">
                <button style="width: 40%;" id="checkuid">ID 중복검사</button>
              </div>
            </div>
            <div class="input-group">
              <i class='bx bxs-user'></i>
              <input type="text" placeholder="이름" name="user_name" id="uname">
            </div>
         <!--    <div class="input-group">
              <div style="display: flex;">
                <i class='bx bx-mail-send'></i>
                <input type="email" placeholder="이메일" name="user_email" id="uemail" style="margin-right: 9px;width: 90%;">
                <button style="width: 40%;" id="sendemail">인증번호</button>
              </div>

            </div>
            <div style="display: none;" id="zzmessage">
              <b>60</b>초 이후에 인증번호 발송이 다시 활성화 됩니다
            </div> -->
            <div class="input-group" style="display: none;" id="emailbox">
              <div style="display: flex;">
                <i class='bx bxs-user'></i>
                <input type="text" placeholder="이메일 인증번호 확인" name="emailcheck" id="emailcheck"
                  style="margin-right: 9px;width: 90%;">
                <button style="width: 40%;" id="approveEmail">인증확인</button>
              </div>
            </div>
            <div class="input-group">
              <i class='bx bxs-lock-alt'></i>
              <input type="password" placeholder="비밀번호" name="user_pass" id="upass">
            </div>
            <div class="input-group">
              <i class='bx bxs-lock-alt'></i>
              <input type="password" placeholder="암호 확인" name="upassconfirm" id="upassconfirm">
            </div>
            <button id="signupButton">
              회원가입
            </button>
            <p>
              <span>
                이미 계정이 있으신가요?
              </span>
              <b onclick="toggle()" class="pointer">
                로그인
              </b>
            </p>
          </div>
        </div>

      </div>
      <!-- END SIGN UP -->
      <!-- SIGN IN -->
      <div class="col align-items-center flex-col sign-in">
        <div class="form-wrapper align-items-center">
          <div class="form sign-in">
            <div class="input-group">
              <i class='bx bxs-user'></i>
              <input type="text" placeholder="아이디" id="login_uid" name="login_uid">
            </div>
            <div class="input-group">
              <i class='bx bxs-lock-alt'></i>
              <input type="password" placeholder="비밀번호" id="login_upass" name="login_upass">
            </div>
            <button id="loginButton">로그인</button>

            <p>
              <b class="pointer" onclick="window.location.href='/find_password'">
                비밀번호를 잊으셧나요?
              </b>
            </p>
            <p>
              <span>
                계정이 없으신가요?
              </span>
              <b onclick="toggle()" class="pointer">
                회원가입
              </b>
            </p>
          </div>
        </div>
        <div class="form-wrapper">

        </div>
      </div>
      <!-- END SIGN IN -->
    </div>
    <!-- END FORM SECTION -->
    <!-- CONTENT SECTION -->
    <div class="row content-row">
      <!-- SIGN IN CONTENT -->
      <div class="col align-items-center flex-col">
        <div class="text sign-in">
          <h2>
            환영합니다!
          </h2>

        </div>
        <div class="img sign-in">

        </div>
      </div>
      <!-- END SIGN IN CONTENT -->
      <!-- SIGN UP CONTENT -->
      <div class="col align-items-center flex-col">
        <div class="img sign-up">

        </div>
        <div class="text sign-up">
          <h2>
            여러분을 환영합니다!
          </h2>

        </div>
      </div>
      <!-- END SIGN UP CONTENT -->
    </div>
    <!-- END CONTENT SECTION -->
  </div>
  <script src="/resources/user/loginAndSignup.js"></script>
  



</body>

</html>