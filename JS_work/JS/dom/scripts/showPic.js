function showPic(obj) {
  const source = obj.getAttribute('href'); // 속성 가져와서
  const placeholder = document.getElementById('placeholder');
  placeholder.setAttribute('src', source); // 클릭한 속성을 넣어준다
  const description = document.getElementById('description');
  console.log(obj.getAttribute('title'));
  if (description.firstChild && description.firstChild.nodeType === 3) {
    description.firstChild.nodeValue = obj.getAttribute('title');
  }
}

function prepareGallery() {
  const imagegallery = document.getElementById('imagegallery');
  
  const links = imagegallery.getElementsByTagName('a');
  for (let i = 0; i < links.length; i++) {
    links[i].addEventListener('click', function(e) {
      e.preventDefault();
      showPic(this); // 이벤트 리스너 내부에서 'this'는 현재 요소를 정상적으로 참조
    }, false);
  }
}

//document.addEventListener('DOMContentLoaded', prepareGallery); // DOM이 준비되면 prepareGallery 실행
window.onload = prepareGallery