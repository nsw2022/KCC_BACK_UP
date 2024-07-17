/**
 * 비동기식
 */

// function longWork() {
//   const now = new Date();
//   const milisecnds = now.getTime()
//   const afterTwoSeconds = milisecnds + 2 * 1000;

//   while(new Date().getTime() < afterTwoSeconds){}

//   console.log('완료')

// }

// 동기식
// console.log('Hello')
// longWork()
// console.log('완료')

function longWork() {
  setTimeout(() => {
    console.log('완료')
  }, 2000);
}

// 비동기식
// console.log('Hello')
// longWork()
// console.log('완료')

function waitAndRun() {
  setTimeout(() => {
    console.log('1')
    setTimeout(() => {
      console.log('2')
      setTimeout(() => {
        console.log('3')
      }, 2000);
    }, 2000);
  }, 2000);
}

waitAndRun()