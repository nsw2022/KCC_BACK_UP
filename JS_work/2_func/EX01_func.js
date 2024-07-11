// console.log(add(10,20))
// console.log(add2(10,20))//error 익명함수는 먼저 수거 되지 않음


// 선언적 함수
function add(a,b){
  let sum = a+b
  return sum
}

// 익명 함수
/**
 * 두수를 더해줌
 */
let add2 = function(a,b){
  return a+b
}

// add2  VS add2()
let plus = add2
let plus2 = add2(10,30)

console.log(plus(50, 100))
console.log(plus2)
console.log('=========================================')
// 둘의 차이는 함수 호출 여부 차이이다

// 함수의 파라미터에 함수를 전달할 수 있다. (콜백함수)
let foo = function (func) {
  if(typeof func === 'function'){
    func()
  }
}

foo(function(){
  console.log('파라미터에 함수를 전달하는 예제')
})

// 함수가 함수를 리턴 할 수 있다.
// 함수를 리턴하는 예제와 함께 리턴된 함수를 호출해 보자.
   // 당연하게 함수를 리턴값으로 전달할 수 도 있음.
function hhh(){
  
  var ppp= function(){
      console.log("ppp");
  }

  return ppp; 
}

var www= hhh(); 
www()
hhh()();     

let foo2 = function(){
  return function(){
    console.log('함수를 리턴하는 예제')
  }
}

let box = foo2()
box()

// 함수의 파라미터에(plus or minus) 호출
// plus => plus 기능을 하는 함수를 리턴
// minus => minus 기능을 하는 함수를 리턴
// 리턴받은 해당 함수를 호출해서 사용
let t=function(oper){
  if (oper === 'plus') {console.log(2+3)}
  if (oper === 'minus') {console.log(3-2)}
}
t('plus')
t('minus')

var test = {
  'plus' : 3+2,
  'minus' : 3-2
}

console.log(test.plus)
console.log(test.minus)

function call(mode) {
  let obj = {
    'plus' : function(left, right) { return left + right },
    'minus' : function(left, right) { return left - right }
  }
  return obj[mode];
}

let func2 = call('minus')
console.log(func2(50,30))

// 콜백함수(함수의  파라미터에 전달되는 함수)
let arr = [94,2,45,31,33]
console.log( arr.sort( function(a,b){return a-b} ) );//오름차순
console.log( arr.sort( function(a,b){return b-a} ) );//내림차순
console.log(arr.sort((a,b)=>a-b));

// 즉시 실행함수 : 함수 정의와 동시에 호출
(function(a,b){
  console.log(a+b);
})(10,5)

