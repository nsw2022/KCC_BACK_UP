$(function() {
	$(window).on('load', function() {
		$.ajax({
			url: '/jQuery/blogmission2/server.jsp',
            type: 'post',
            dataType : 'json',
            success : function(data) {
            	 $.each(data, function(index, item) {
                     let html = '<div class="entry">'
                         html += '<h3 class="term">' + item.writer + '</h3>';
                     html += '<div class="definition">' + item.title+ '</div>';
                         html += '<div class="part">' + item.contents + '</div>';
                         html += '<a  class="delete"> delete' +'</a>'
                         html += '</div>';
                     $('#list').append(html);
                 });
             
      
            }
		})
	})
})



$(function() {
	  // 폼 제출 핸들러
    $('form').submit(function() {
        // event.preventDefault(); // 기본 제출 방지
        $.ajax({
            url: '/jQuery/blogmission2/server.jsp',
            type: 'post',
            data: $(this).serialize(), // 폼 데이터 직렬화
            dataType : 'json',
            success: function(data) {
                // 데이터를 받아서 HTML로 변환 후 페이지에 추가
                console.log('success'+data)
            },
            error: function(xhr, status, error) {
                console.error("Error: " + error);
            }
        });
        
        return false;
    });

});


$(function() {
	 // 삭제 링크 이벤트 핸들링
    $('#list').on('click', '.delete', function(e) {
        e.preventDefault(); // 링크 기본 동작 방지
        let index = $(this).data('index'); // 데이터 인덱스 얻기
        $(this).closest('.entry').remove(); // 해당 항목 제거
    });
})