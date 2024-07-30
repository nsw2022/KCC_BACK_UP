//step1
$(function() {
	$('#letter-a a').click(function() {
		$('#dictionary').hide().load('a.html', function() {
			$(this).fadeIn();
		})
		return false;
	})
});

/*
 * 1. data를 받는다 => 끗!
 * 2. data를 반복문으로 순회하며 제어한다.
 * 
 * each 
 * $.each(배열, 익명함수로 제어)
 * (배열).each(익명함수 제어)
 * 
 * */

//step2-1
$(function() {
    $('#letter-b a').click(function(event) {
        event.preventDefault();  
        //console.log('이벤트 체크1');
        $.ajax({
            url: 'b.json',
            type: 'get',
            dataType: 'json',  
            success: function(data) {
            	$('#dictionary').empty();
               // console.log('이벤트 체크2');

                // 알파벳 순으로 term을 기준으로 정렬
//                data.sort(function(a, b) {
//                    if (a.term < b.term) return -1;
//                    if (a.term > b.term) return 1;
//                    return 0;
//                });
                
                data.sort((a, b) => {
                	  if (a.definition < b.definition) return -1;
                	  if (a.definition > b.definition) return 1;
                	  return 0;
                	});

                $.each(data, function(index, item) {
                    let html = '<div class="entry">'
                        html += '<h3 class="term">' + item.term + '</h3>';
                        html += '<div class="part">' + item.part + '</div>';
                        html += '<div class="definition">' + item.definition + '</div>';
                        html += '</div>';
                    $('#dictionary').append(html);
                });
            },
            error: function() {
                console.log("Error loading data");
            }
        });
    });
});


//step2
//$(function() {
//	$('#letter-b a').click(function() {
//		$.getJSON('b.json', function(data) {
//			$('#dictionary').empty();
//			//결과값 : 배열 => [{}, {}, {}] => HTML
//			$.each(data, function(index, item) {
//				let html = '<div class="entry">'
//					html+= '<h3 class="term">' +item.term+'</h3>'
//					html+= '<div class="part">' +item.part+'</div>'
//					html+= '<div class="definition">' +item.definition+'</div>'
//					html+= '</div>';
//				$('#dictionary').append(html)
//			})
//		})
//		return false;
//	})
//});

//step3
$(function() {
	$('#letter-c a').click(function() {
		$.getScript('c.js');
		return false;
	})
});

//step4
$(function() {
	$('#letter-d a').click(function() {
		// xml => HTML
		$.get('d.xml', function(data) {
			$('#dictionary').empty();
			//data는 dom객체다 상위노드로부터 하위노드를 검색해야함으로 $()를 감싸주어 jQuery객체로 바꿔준다 
			$(data).find('entry').each(function(index) {
				$entry = $(this);
				let html = '<div class="entry">'
					html+= '<h3 class="term">' +$entry.attr('term')+'</h3>'
					html+= '<div class="part">' +$entry.attr('part')+'</div>'
					html+= '<div class="definition">' +$entry.find('definition').text()+'</div>'
					html+= '</div>';
				$('#dictionary').append(html)
			})
		})
		return false;
	})
});

//step5 
$(function() {
	$('#letter-e a').click(function() {
		
		$.get('server3.jsp', {'term' : $(this).text()}, function(data) {
			$('#dictionary').text(data);
		})
		return false;
	})
});

//setp6
$(function(){           //폼은 submit()
	   $('#letter-f form').submit(function(){
	      //통합함수 사용
	      $.ajax({
	         url:'server3.jsp', 
	         type:'post',
	         data:$(this).serialize(), //.serialize()는 폼에 있는 데이터를 키벨류 형태로 다 만들어준다.
	         dataType:'text',
	         success: function(data){ // 서버에 데이터가 잘 도착했을 때 수행되는 것 success
	            $('#dictionary').text(data);
	         }
	      })
	      
	      return false;
	   })
	})
