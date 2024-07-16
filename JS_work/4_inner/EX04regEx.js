/**
 * 정규표현식
 */

// 1. 문자열.match(정규표현식) => 매칭된 결과(문자열)리턴
// const result = 'sports'.match(/sp/)
// console.log(result)

// 2. ReqExp.exec('문자열') => 매칭된 결과(문자열)리턴
// const str = 'fdsffs eundlaskdFs;321ldfjka;sldf fs'
// const re = /fs/ig;// i: 소대문자 구문 없음, g: 전역검사
// let result = re.exec(str)

// while (result) {
//   console.log(result)
//   result = re.exec(str)
// }

// 퀴즈> => July 16 2024
// const str = 'This is a data: July 16 2024'
// const result = str.match(/July.*\w/g);
// console.log(result)

// 퀴즈 문자열.replace() sw를 소프트웨어로 변경
// const str = '오늘 우리는 SW 세상에서 살고 있다. sw가 매우 중요한 시기이다. 그래서 SW 열심히 공부하자'
// let result = str.replaceAll(/SW/ig,'소프트웨어')
// console.log(result)


// const str = 'Java--JavaScript';
// const re = /(\w+)-*(\w+)/;
// const result = str.replace(re,"$2-$1")
// console.log(result)

// 이메일 체크
// 정규표현식.test(문자열) => 해당 문자열이 정규표현식에 매칭 유무(true/false)
// 정상 : dolsam77@nate.com
// 비정상 : 숫자가 먼저시작, 골뱅이X, 뒤에문자열이 너무 길다

const str = "tmddn3410@naver.com";
const regex = /^[a-zA-Z][a-zA-Z0-9]{7,}@[a-z]{2,10}\.[a-z]{2,4}$/;
const re = /^\D\w+@\w+\.\w{2,3}$/ig
console.log(regex.test(str));

emailArray = [
  "tmddn3410@naver.com",
  "1234@naver.con",
  "tmddn3410@naver.1a3sd2fas3d5f",
]
emailArray.forEach(email => {
  console.log(`${email}: ${regex.test(email)}`)
});

emailArray.forEach(email => {
  console.log(`${re.test(email)}`)
})
