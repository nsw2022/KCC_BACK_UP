/**
 * 고제 > 1. Rectangle 생성자 함수를 class 기반으로 숮어하세요
 *        2. 상속을 이용해서 square를 구현하세요
 * 
 * 
 */
// function Rectangle(whidth, height) { 
//   this.whidth=whidth
//   this.height=height
//   this.getArea = ()=>this.whidth*this.height
// }

class Rectangle {
  width;
  height;

  constructor(width, height){
    this.width = width;
    this.height = height;  
  }
}

class Square extends Rectangle {
  constructor(width, height){
    super(width, height);
  }

  
  square() {
    return this.width * this.height;  
  }
  
}

const s1 = new Square(300, 200);
console.log(s1.square());  
let iveMembers = ['유진','가을','레이','원영']

console.log(iveMembers.map((x)=>x))
console.log(iveMembers.map((x)=>`아이브: ${x}`))
console.log(iveMembers.map((x)=>{
  if(x==='유진'){
    return `아이브: ${x}`
  }else{
    return `${x}`
  }
}))