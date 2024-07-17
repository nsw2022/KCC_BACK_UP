/**
 * Promise
 * 
 */

// const timeoutPromise = new Promise((resolve,reject)=>{
//   setTimeout(() => {
//     resolve('완료')
//   }, 2000);
// })
// timeoutPromise.then((res)=>{
//   console.log('--- then ---')
//   console.log(res)
// })

const getPromise = (seconds) => new Promise((resolve, reject) => {
  setTimeout(() => {
    resolve('완료')
  }, seconds * 1000);
});

Promise.all([
  getPromise(1),
  getPromise(4),
  getPromise(1)
]).then((res)=>{
  console.log(res)
})

// getPromise(3)
//   .then((res) => {
//     console.log('--- then ---');
//     console.log(res);
//     return getPromise(3);
//   })
//   .then((res) => {
//     console.log('--- then ---');
//     console.log(res);
//     return getPromise(3);
//   });

  //--reject

  // const getPromise = (seconds) => new Promise((resolve, reject) => {
  //   setTimeout(() => {
  //     // resolve('완료')
  //     reject('실패') 
  //   }, seconds * 1000);
  // });
  
  // getPromise(3)
  //   .then((res) => {
  //     console.log('--- then ---');
  //     console.log(res);
  //   })
  //   .catch((res) => {
  //     console.log('--- catch ---');
  //     console.log(res);
  //   })
  //   .finally(() => { 
  //     console.log('--- finally ---'); 
  //   });
  
// 과제 빌린 대한 원금 + 이자(10%)에 대한 상환금액을 비동기식으로 구현하시오

// const borrow = 20;  // 원금 20

// const getMymoney = (seconds, amount) => new Promise((resolve, reject) => {
//   setTimeout(() => {
//     const interest = amount * 0.10;  
//     const totalAmount = amount + interest;  
//     resolve(totalAmount);  
//   }, seconds * 1000);
// });
// getMymoney(2, borrow)
//   .then((totalAmount) => {
//     console.log(`2초 후에 받은 금액 (원금 + 10% 이자): ${totalAmount}`);
//   })
//   .catch((error) => {
//     console.error('에러 발생:', error);
//   });


