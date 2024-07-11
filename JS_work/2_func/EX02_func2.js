// 함수를 호출할 때 함수의 파라미터 개수가 일치하지 않아도 
// 오류가 발생하지않음
function add(a, b, c){
  console.log(a,b,c)
}

add(10)

function sumAll(){
  let sum = 0;
  for (let i = 0; i < arguments.length; i++) {
    sum += arguments[i];  
  }
  return sum;
}

console.log(sumAll(1,2,3,4,5,6,7,8,9,10))

// 함수의 파라미터에 기본값 설정
function calcurate(total, tax=0.1, tip=0.2){
  return total + (total * tax) + (total * tip)
}

console.log(calcurate(100,0.5,0.1))
console.log(calcurate(100))

//함수형 함수(함수형 프로그래밍)
var greeting = function (name) {
  return "Hello " + name
}
console.log(greeting(' 홍길동'))


var greeting2 = name=>{
  return `Hello ${name}`
}
console.log(greeting2('박길동'))

function multiply(x) {
  return function (y) {
    return function (z) {
      return `x:${x} y:${y} z:${z}`
    }
  }
}


console.log(multiply(3)(4)(5))
const multiply2 = x => y => z => `x:${x} y:${y} z:${z}`;
console.log(multiply2(6)(7)(8))
console.log("=========================================")

/*
 1. 정수 n이 매개변수로 주어 질 때 각 자리 숫자의 합을 return 하도록
 solution 함수를 완성해주세요
 ex)console.log(solution(930211))

 2. 문자열 my_string이 매개변수로 주어질 때,
 my_string 안에 있는 숫자만 골라 오름차순 정렬한 리스트를
 return 하도록 solution 함수를 작성해보세요
 힌트 isNaN()
 ex)console.log(solution("p2o4i8gj2"))

 3. 년도인자만 받을 경우 -> "1234년"과 같은 문자열을 리턴
년도, 월 인자를 받을 경우 -> "1234년 5월" 과 같은 문자열 리턴
년도, 월, 일 인자를 받을 경우 -> "1234/5/6" 과 같은 형식의 문자열을 리턴해주세요
ex) console.log(meetAt(2024,7,11))
*/



//1
function solution(q) {
  let result = 0; 
  let stringQ = q.toString();  

  for (let i = 0; i < stringQ.length; i++) {
    result += parseInt(stringQ[i]);  
  }

  //console.log(result);  
  return result;  
}
//1
function num1(num){
  return num
  .toString()
  .split('')
  .reduce((acc,cur)=> acc + parseInt(cur), 0)
}

console.log('1번'+ solution(930211));  
console.log(num1(1234))

//2
function solution2(my_string) {
  let my_int=[];
  for (let i = 0; i < my_string.length; i++) {
    if(!isNaN(my_string[i])){
      my_int.push(my_string[i])
    }
  }
  console.log(my_int)
  return my_int = my_int.sort((a,b)=>a-b)
}

//2 
function num2(my_string) {
  return my_string
  .split('')
  .filter((el)=> !isNaN(el))
  .map((n)=>n)
  .sort()
}

console.log('2번'+solution2("p2o4i8gh"))
console.log(num2('p2o4i8gh'))


//3
function meeAt(my_year,my_month,my_day) {
  if  (typeof my_day === 'undefined'&& typeof my_month=='undefined') {
    return `${my_year}년`
  }else if( typeof my_day === 'undefined'){
    return `${my_year}년 ${my_month}월`
  }else{
    return `${my_year}년 ${my_month}월 ${my_day}일`
  }
}

function meetAt(my_year, my_month = "", my_day = "") {
  let dateStr = `${my_year}년`;
  if (my_month) dateStr += ` ${my_month}월`;
  if (my_day) dateStr += ` ${my_day}일`;
  return dateStr;
}

console.log(meeAt(2024))



