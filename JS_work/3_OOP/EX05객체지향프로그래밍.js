/**
 * class 기반의 객체지향 프로그래밍
 */

class IdolModel{
  name;
  year;

  constructor(name,year){
    this.name = name
    this.year = year
  }
}

console.log(new IdolModel('안유진',2003))

class IdolModel2{
  #name; // private
  #year;

  constructor(name,year){
    this.#name = name // private
    this.#year = year
  }

  set name(name){
    this.#name = name
  }

  get name(){
    return this.#name
  }

  set year(year){
    this.#year = year
  }

  get year(){
    return this.#year
  }

  static returnGroupName(){
    return '아이브'
  }

}

let yuJin = new IdolModel2('안유진',2003)
//console.log(yuJin.name) 접근 안됨
yuJin.name = '장원영'
console.log(yuJin.name)
console.log(yuJin.year)
console.log(IdolModel2.returnGroupName())

/**
 * facoty constructor
 *  
 */

class IdolModel3{
  name;
  year;

  constructor(name, year){
    this.name = name;
    this.year=year;
  }

  static fromObject(object){
    return new IdolModel3(
      object.name,
      object.year,
    )
  }

  static fromList(list){
    return new IdolModel3(list[0], list[1])
  }
}

const youJin2 = IdolModel3.fromObject({
  name:'안유진',
  year:2003,
})

console.log(youJin2)

const wonYoung = IdolModel3.fromList(['장원영',2003])
console.log(wonYoung)
