$(function() {
	// 1. <ol id="note> 생성 => <div id="footer"> 앞에 위치하도록 하자
	$('<ol id="note"></ol>').insertBefore('#footer')
	
	// 2. foonote 클래스명을 가진 span이 3개가 있다
	//    앞에 <a id="">[1][2]...
	// 3.<ol id="note> 태그 앞으로 <span> 이동
   $('span.footnote').each(function(index) {
        $('<a id="context-' + (index + 1) + '">[' + (index + 1) + ']</a> ').insertBefore(this);
        $('<a href="#context-'  + (index + 1 ) +'">' + 'context' +(index+1)+'</a>').prependTo($(this))
	}).appendTo('#note').wrap('<li></li>');
	 

	
})