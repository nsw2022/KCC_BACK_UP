$(function() {
    // 선택자 수정: 자손 선택자 사용 '> li'에 클래스 추가
    $('#selected-plays > li').addClass('horizontal');

    // li 중 horizontal 을 제외한 나머지
    $('li:not(.horizontal)').addClass('sub-level');

    // pdf로 시작 a
    $('a[href$="pdf"]').addClass('pdflink');
    
    // mailto로 끝나는 a
    $('a[href^="mailto"]').addClass('mailto');

    // 'henry'를 포함하는 mailto를 제외한 나머지
    //$('a[href*="henry"]:not(.mailtor)').addClass('henrylink');
    $('a[href*="henry"]').not('mailto').addClass('henrylink');
    
    // 짝수번째 tr들에게 클래스 주기
    //$('tr:odd').addClass('alt')//짝수번째
    //$('tr:nth-child(odd)').addClass('alt')// 홀수번째
    $('tr').filter(':odd').addClass('alt')
    
    // hery라는 td 들에게 highlight
    //$('td:contains(Henry)').addClass('highlight')
//    $('td').filter(function() {
//        return $(this).text().indexOf('Henry') !== -1;
//    }).addClass('highlight');
    
    //hery라는 td 형제 바꾸기
    //$('td:contains(Henry)').nextAll().addClass('highlight');//선택자요소 포함안됨
    //$('td:contains(Henry)').nextAll().andSelf()'td:contains(Henry)';//선택자요소 포함됨
    //$('td:contains(Henry)').parent().find('td').addClass('highlight');
    $('td:contains(Henry)').parent().find('td:first').addClass('highlight')
    	.end().find('td:eq(1)').addClass('highlight')
    
    	
    	//each()=> 배열을 받아서 각가의 작업을 수행
    	//1. $.each(배열, function(index, item){배열의 각 요소의 작업을 수행}) -> 배열의 요소가 item
    	//2. $('선택자').each(function(index, item){각 요소들의 작업 수행}) -> 선택자의 요소가 item
});
