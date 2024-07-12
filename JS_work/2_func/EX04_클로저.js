/**
 * 함수 클로저
 * => 함수 호출 이후에도 함수의 실행 컨텍스트 영역을 유지
 * 
 */

function ouuterFunc() {
  let x = 10;
  var innerFunc = function(){
    console.log(x)
  }

  return innerFunc
}

let inner = ouuterFunc()
inner()

// 데이터 캐싱
function cashFunction(newNumb) {
  // 아주 오래 소요하는 작업

  var number = 10 * 10
  return number * newNumb
}

console.log(cashFunction(10)) // 만약 number가 오래 걸리는 작업이라면 반드시 함수를 호출할때마다 새로 작성해함
console.log(cashFunction(20))

console.log("==========================")

function cashFunction2() {
  // 아주 오래 소요하는 작업
  var number = 10 * 10

  function innerCashFunction(newNumb){
    return number * newNumb
  }

  return innerCashFunction;
}

const runner = cashFunction2()
console.log(runner(30)) // return 에 오래걸리는 함수를 넣어 캐싱처리를 해줌

function outer(arg1, arg2){
  let sum = arg1 + arg2

  function inner(newNum){
    sum += newNum;
    return sum
  }

  return inner
}

const runner1 = outer(16,14)
// console.log(runner1(30))
// console.log(runner1(60))

function outer2(arg1, arg2){
  function inner(innerArg){
    console.log((arg1+arg2)/innerArg)
  }
  return inner
}

outer2(16,14)(10)


