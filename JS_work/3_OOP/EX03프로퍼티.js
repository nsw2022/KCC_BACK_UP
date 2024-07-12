/**
 * Prototype
 * 
 */


// __proto__ 모든 객체에 존재하는 프로퍼티

const testObj = {}
console.log(testObj.__proto__)

function IdolModel(name, year) {
  this.name = name
  this.year = year
}

// console.log(IdolModel.prototype)
// console.dir(IdolModel.prototype,{
//   showHidden:true
// })


console.log(IdolModel.prototype.constructor === IdolModel)//서로서로 참조가능함 true
console.log(IdolModel.prototype.constructor.prototype === IdolModel.prototype)

const yuJin = new IdolModel('안유진',2003)
console.log(yuJin.__proto__)
console.log(yuJin.__proto__===IdolModel.prototype)//ture

console.log(testObj.__proto__ == Object.prototype)

console.log(yuJin.toString())
console.log(Object.prototype.toString())

console.log(IdolModel.__proto__ === Function.prototype)
console.log(Function.prototype.__proto__ == Object.prototype)
console.log(IdolModel.prototype.__proto__ === Object.prototype)

function IdolModel2(name, year) {
  this.name = name
  this.year = year
  this.sayHello = function () {
    return `${this.name}이 인사를 합니다.`
  }
}
const youJin2 = new IdolModel2('안유진',2003)
const wonYoung2 = new IdolModel2('장원형',2002)

console.log(youJin2.sayHello())
console.log(wonYoung2.sayHello())
console.log(youJin2.sayHello === wonYoung2.sayHello)

console.log(youJin2.hasOwnProperty('sayHello'))

function IdolModel3(name, year) {
  this.name = name
  this.year = year
  
}

IdolModel3.prototype.sayHello = function () {
  return `${this.name}이 인사를 합니다.`
}

const youJin3 = new IdolModel3('안유진',2003)
const wonYoung3 = new IdolModel3('장원형',2002)

console.log(youJin3.sayHello())

console.log(youJin3.sayHello === wonYoung3.sayHello)
console.log(youJin3.hasOwnProperty('sayHello'))
