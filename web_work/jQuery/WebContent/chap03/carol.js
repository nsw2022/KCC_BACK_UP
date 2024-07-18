
//step1
//$(function(){
//	$('#switcher-large').on('click', function(){
//		$('body').addClass('large');
//	})
//});

//step2 => Large Print => large, Narrow Column => narrow , Default => 처음
//addClass('클래스명'), removeClass('클래스명')
//$(function(){
//	$('#switcher-large').on('click', function(){
//		$('body').removeClass('narrow').addClass('large');
//	});
//	$('#switcher-narrow').on('click', function(){
//		$('body').removeClass('large').addClass('narrow');
//	});
//	$('#switcher-default').on('click', function(){
//		$('body').removeClass('narrow').removeClass('large');
//	});	
//});

//step3 : 클릭한 버튼만 selected 스타일 적용해 보자.
//$(function(){
//	$('#switcher-large').on('click', function(){
//		$('body').removeClass('narrow').addClass('large');
//		$('.button').removeClass('selected');
//		$(this).addClass('selected');
//	});
//	$('#switcher-narrow').on('click', function(){
//		$('body').removeClass('large').addClass('narrow');
//		$('.button').removeClass('selected');
//		$(this).addClass('selected');
//	});
//	$('#switcher-default').on('click', function(){
//		$('body').removeClass('narrow').removeClass('large');
//		$('.button').removeClass('selected');
//		$(this).addClass('selected');
//	});	
//});


//step4 : selected 관련된 중복된 코드를 최적화 하자.
//$(function(){
//	$('#switcher-large').on('click', function(){
//		$('body').removeClass('narrow').addClass('large');		
//	});
//	$('#switcher-narrow').on('click', function(){
//		$('body').removeClass('large').addClass('narrow');		
//	});
//	$('#switcher-default').on('click', function(){
//		$('body').removeClass('narrow').removeClass('large');		
//	});	
//	
//	$('#switcher .button').on('click', function(){
//		$('.button').removeClass('selected');
//		$(this).addClass('selected');
//	});	
//});

//step5 : 전체적으로 최적화 하자.
//$(function(){	
//	$('#switcher .button').on('click', function(){
//		$('.button').removeClass('selected');
//		$(this).addClass('selected');
//		$('body').removeClass();
//		
//		if(this.id  === 'switcher-large'){
//			$('body').addClass('large');		
//		}else if(this.id === 'switcher-narrow'){
//			$('body').addClass('narrow');	
//		}		
//	});	
//});


//step6 : 이벤트 통합 함수 사용 => 개별 이벤트 함수
//$(function(){	
//	$('#switcher .button').click(function(){
//		$('.button').removeClass('selected');
//		$(this).addClass('selected');
//		$('body').removeClass();
//		
//		if(this.id  === 'switcher-large'){
//			$('body').addClass('large');		
//		}else if(this.id === 'switcher-narrow'){
//			$('body').addClass('narrow');	
//		}		
//	});	
//});

//step7
$(function(){
	$('#switcher .button').hover(function() {
		$(this).addClass('hover');
	}, function() {
		$(this).removeClass('hover');
	})
})

////step 8 : <h3>스타일변환기</h3>  안에 버튼 3개 눌렀을때 각각 사라지게
//$(function(){	
//	
//	$('#switcher h3').click(function(){
//		 $('#switcher .button').toggleClass('hidden')
//	})
//	
//	$('#switcher .button').click(function(){
//		$('.button').removeClass('selected');
//		$(this).addClass('selected');
//		$('body').removeClass();
//		
//		if(this.id  === 'switcher-large'){
//			$('body').addClass('large');		
//		}else if(this.id === 'switcher-narrow'){
//			$('body').addClass('narrow');	
//		}		
//	});	
//});
//step 9 :버블링 방지
//$(function(){	
//	$('#switcher').click(function(){
//		$('#switcher .button').toggleClass('hidden')
//	})
//	
//	$('#switcher .button').click(function(event){
//		event.stopPropagation();
//		$('.button').removeClass('selected');
//		$(this).addClass('selected');
//		$('body').removeClass();
//		
//		if(this.id  === 'switcher-large'){
//			$('body').addClass('large');		
//		}else if(this.id === 'switcher-narrow'){
//			$('body').addClass('narrow');	
//		}		
//	});	
//});

// setp 10 : 통합함수 on변경 => off('click')
//$(function(){	
//	$('#switcher').on('click.kcc',function(){
//		$('#switcher .button').toggleClass('hidden')
//	})
//	
//	$('#switcher .button').click(function(event){
//		event.stopPropagation();
//		$('.button').removeClass('selected');
//		$(this).addClass('selected');
//		$('body').removeClass();
//		
//		if(this.id  === 'switcher-large'){
//			$('body').addClass('large');		
//		}else if(this.id === 'switcher-narrow'){
//			$('body').addClass('narrow');	
//		}		
//	});
//	
////	$('#switcher').click(function(){
////		alert('다른 이벤트 발생')
////	})
//	
//	$('#switcher-large, #switcher-narrow').click(function(){
//		$('#switcher').off('click.kcc');
//	})
//	
//	$('#switcher').trigger('click.kcc');
//});
$(function() {
    let classMap = {
        'switcher-large': 'large',
        'switcher-narrow': 'narrow',
        'switcher-default': ''
    };

    // switcher-default 버튼을 클릭했을 때만 #switcher .button의 표시 상태를 토글
    $('#switcher-default').on('click', function(event) {
        event.stopPropagation();
        $('#switcher .button').toggleClass('hidden');
        $('.button').removeClass('selected');
        $(this).addClass('selected');
        $('body').removeClass('large narrow');
    });

    // 다른 버튼 클릭 처리
    $('#switcher-large, #switcher-narrow').on('click', function(event) {
        event.stopPropagation();
        let newClass = classMap[this.id];
        $('body').removeClass('large narrow').addClass(newClass);
        $('.button').removeClass('selected');
        $(this).addClass('selected');
        // 이 경우 토글 상태를 변경하지 않습니다
    });
});


// 연습
//$(function(){
//    // 모든 switcher 버튼에 대한 이벤트 핸들러 설정
//    $('.button').on('click', function() {
//        var classMap = {
//            'switcher-large': 'large',
//            '#switcher"-narrow': 'narrow',
//            'switcher-default': ''
//        };
//
//        // 현재 클릭된 버튼의 ID를 기반으로 적용할 클래스 결정
//        var newClass = classMap[this.id];
//
//        // body에서 모든 관련 클래스 제거 후 새 클래스 추가 (있을 경우)
//        $('body').removeClass('large narrow').addClass(newClass);
//
//        // 모든 버튼에서 'selected' 클래스 제거 후 현재 버튼에만 추가
//        $('.button').removeClass('selected');
//        $(this).addClass('selected');
//    });
//});








