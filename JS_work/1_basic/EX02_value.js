//주석
/*
* 여러줄 주석
*
*/



// 컴파일 언어 : 데이터형, 문법 => 엄격히 요구
// 인터프리터 언어 : 문법적으로 느슨한 것 요구

/*
  var : 여러 큰 스ㅗ프에서 공유하기 위한 최상위 변수 사용
  let : 작은 스코프에서 로컬 변수 사용
  const : 상수값으로 사용


*/

// 변수선언, 사용
var num = 100;
num = '안녕'
console.log(num)

//데이터 타입(자료형)
let intNum = 10;
let floatNum = 3.14

//console.log(typeof intNum)
//console.log(typeof floatNum)

let sinS = 'single'
let doubleS = "double"

//console.log(typeof sinS)
//console.log(typeof doubleS)

/**
 * TEmplate Literal
 * 1. newline -> \n
 * 2. tab -> \t
 * 3. 백슬러시 문자열안에 넣고 싶을때 -> \\
 * 
 */

// const kcc = '김진아\\이수호'
// console.log(kcc)

//const groupName = 'kcc'
//console.log(groupName + ' 이수호')
//console.log(`${groupName} 이한희`)// <- 홑따옴표 아님 1옆에 ` 어커스트로피 레스고

// 논리형(boolean)
/**
 * false
 * => String : 빈문자열
 * => 값이 없는 경우
 * => 0
 */
let boolVar = true;
//console.log(typeof boolVar)
console.log(!!false)
console.log(!!'')// <- 아무 문자열이라도 없음 false 
console.log(!!0) //<- 0도 false
console.log(!!undefined)//false
console.log(!!null)
console.log(!!{}) // <- 객체는 true
console.log(!![]) // <- 배열도 true

// undefined
let emptyVar;
console.log(typeof emptyVar)

// null
let nullVar = null;
console.log(typeof nullVar)

//함수(function)
let fun = function(){}
console.log(fun)

// 객체(object)
let person = {
  name : '홍길동',
  age : 20
}

console.log(typeof person)
console.log(person.name)
console.log(person['age'])
console.table(person)

//배열(Array)
const kccMember = [
  "김현민","윤채원","김연호","원승언"
]
console.log(typeof kccMember)
console.log(kccMember)

/**
 * Sybol타입
 * - 유일 무이한 값을 생성 할대 사용
 * 
 */
const test1 = '1'
const test2 = '1'

console.log(test1==test2) // true

const symbol1 = Symbol('1')
const symbol2 = Symbol('1')
console.log(symbol1==symbol2)