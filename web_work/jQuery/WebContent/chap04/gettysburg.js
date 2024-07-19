$(function() {
	$('div.label').click(function() {
		const pWidth = $('div.speech p').outerWidth();// 패팅값 포함 width
		const divWidth = $('#switcher').outerWidth();

		console.log(pWidth + " : " + divWidth);
		const num = parseInt(pWidth) - parseInt(divWidth);

		$('#switcher').fadeTo('fast', 0.5).animate({
			marginLeft : num
		}, 'slow')// 첫번째 인자로 왼하는 위치
		.fadeTo('fast', 1.0).slideUp('slow', function() {
			$(this).css('background', 'red')
		}).slideDown('slow')

	})
})

$(function() {
	// 2번째 p 태그를 화면에서 숨김 :hide()
	// a 태그의 read more => 클릭 : 사라진 p태그 화면에 보이게 ㄱㄱ
	// read more => 클릭 => read lesss 로 변경
	// read less =>클릭 => read more
	// text(값) 텍스트 값 변경, text() 추출

	$('.speech p:eq(1)').hide(); // 초기에 p:eq(1) 숨기기
	$('.more').click(function() {
		// console.log('이벤트체크')
		$('.speech p:eq(1)').toggle(); // p:eq(1) 표시 상태 전환
		// 버튼 텍스트 전환
		// $(this).text(function(i, text) {
		// return text === "read more" ? "read less" : "read more";
		// });
		// 강사님 버전
		const $link = $(this) // 가독성과 그때마다의 요소의 제어를 위해 $를 변수에 붙혀
		// 명시적 할당
		if ($link.text() === 'read more') {
			$link.text('read less')
		} else {
			$link.text('read more')
		}
	});
})

// 버튼을 클릭했을때 large => 기존 폰트 크기 1.2배 커지ㅔ
// small => 기존 폰트크기 1.2배 작아지도록
// default => 처음글자크기
// css('fontSize'), css('fontSzie',12px)


//
//$(function() {
//	var originalFontSize = parseFloat($('body').css('font-size'));
//	console.log(originalFontSize)
//	$('#switcher-large').click(function() {
//		
//		 $('body').animate({ 'font-size': (originalFontSize * 1.1) + 'px' }, 400); 
//	})
//	$('#switcher-small').click(function() {
//		
//		$('body').animate({ 'font-size': (originalFontSize * 0.75) + 'px' }, 400); 
//	})
//	$('#switcher-default').click(function() {
//		$('body').animate({ 'font-size': originalFontSize }, 400);
//	})
//})

$(function() {
   const $speech = $('div.speech');
   const defaultSize = parseInt($speech.css('fontSize'));

   $('#switcher button').click(function(){
      let num = parseInt($speech.css('fontSize'));
      switch(this.id){
      case 'switcher-large':
         num *=1.2;
         break;
      case 'switcher-small':
         num /= 1.2;
         break;
      case 'switcher-default':
         num = defaultSize;
         break;
      }
      
      $speech.animate({fontSize: num + 'px'},'slow')
   })
});
