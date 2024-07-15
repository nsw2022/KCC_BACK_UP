/**
 * 상속
 */

class IdolModel{
  name;
  year;

  constructor(name, year){
    this.name = name;
    this.year = year
  }

  sayHello(){
    return `안녕하세요 ${this.name} 입니다.`
  }

}

class FemaleIdolModel extends IdolModel{
  part;
  constructor(name,year,part){
    super(name,year);
    this.part=part;
  }
  
  dance(){
    return '여자 아이돌이 춤을 춥니다.'
  }
  sayHello(){
      return `${super.sayHello()} ${this.part}을 담당하고 있습니다.`
  }
 
}

const youJin = new FemaleIdolModel('안유진',2003,'귀여움');
console.log(youJin)
console.log(youJin.dance())

console.log(youJin instanceof FemaleIdolModel)
console.log(youJin instanceof IdolModel)

console.log(youJin.sayHello());

