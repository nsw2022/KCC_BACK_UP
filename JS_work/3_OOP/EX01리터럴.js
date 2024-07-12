/**
 * 자바스크립트 객체
 * 1) 사용자 정의 객체
 *  1. Object 2. 객체 리터럴 3. 생성자 함수(프로토타입)
 * 2) 내장객체(빌트인 객체)
 *  1. 코아객체 : string, number, math, array
 *  2. 브라우저객체 : window, document, history, navigator
 *  3. DOM객체 : 문서내 모든 요소 : div, form p ...
 *  
 */

// 1) 사용자 정의객체 - Object
// 1. Object 객체 이용
//  - 자바스크립트 객체는 동적으로 프로퍼티를 추가/삭제 할수있다.

let obj = new Object();
console.log(obj)

obj.name = '홍길동';
obj.age = 20;

console.log(`이름 : ${obj.name}`)
console.log(`나이 : ${obj.age}`)

// 함수도 1급 객체이다.
function add(a, b) {
  let sum = a+b;
  return sum;
}

console.log(typeof add);
console.log(add instanceof Object)

add.result = add(10,20)
console.log(`결과: ${add.result}`)

// 2. 리터럴 형식으로 객체 사용 => 1개의 객체를 생성해서 사용하는 경우
let obj2 = {
  name : "김길동",
  age : 30,
  display : function() {
    console.log(this.name) 
  }
}
obj2.fff=10

obj2.display() 
console.log(`나이 : ${obj2.age}`); 
console.log(`나이 : ${obj2['age']}`); 

// 퀴즈 > 리터럴 형식으로 빈 객체를 생성 후 
//    동적프로터피와 함수를 추가 후 호출하는 예제를 구현하시오
let obj3 = {}
obj3.name="백종원"
obj3.solution="조보아씨 내려와봐유"
obj3.show =()=> console.log(`${obj3.name}님의 명대사는 ${obj3.solution}`)
obj3.show()
obj3.show(100) // <= 파라미터가 없는 메소드에 값 전달하면? 에러안나고 무시됨(걍실행) ㅋㅋ 마주할일은 없을지도

// 객체 디스트럭처링 : 객체의 프로퍼티를 풀어서 별개의 변수에 저장하는 방식
let person = {
  first : '홍',
  last : '길동'
}

let {first,last} = person
console.log(first,last)

//const 객체 생성
//1) const로 선언할 경우 객체 자체를 변경할 수는 없다.
//2) 객체 안의 프로퍼티나 메서드는 변경이 가능하다.
const test = {
  value : 25
}
console.log(test.value)
test.value=20
console.log(test.value)

