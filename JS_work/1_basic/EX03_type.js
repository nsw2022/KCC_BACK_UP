/**
 * 타입 변환(형변환)
 * 1) 명시적
 * 2) 암묵적
 *
 */

// 명시적
let age = 20;
let stringAge = age.toString()
console.log(typeof stringAge)

// 암시적
let test = age + ''
console.log(typeof test)

console.log('100' + '2')
console.log('100' - '2')
console.log('100' * '2')
console.log('100' / '2')

// 문자열 => number : eval(), Number(), parseInt(), parseFloat()
let num = '100안녕' // 해석할수 있는 범위 까지 알.아.서 해석함;;
num = parseInt(num)
let result = num + 100
console.log(result)

/**
 * Hoisting(호이스팅)
 * - 모든 변수 선언문이 코드의 최상단으로 이동되는 것 처럼 느껴지는 현상
 *  변수는 var를 쓰는것을 지양하고 let과 const를 써야하고, 함수는 최대한 allow function으로 지향해야한다
 * 아래의 사래처럼 var는 undifinde였지만 let을 사용했을때는 undifinde가 아닌 에러가 나게된다
 */
console.log("==================================================")
// var name;
// console.log(name)
// name = "홍길동"
// console.log(name)

// console.log(kim)
let kim = '어이 김씨'

var x = 2
var q = x % 2  ? '홀수':'짝수';
console.log(q)