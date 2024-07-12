/**
 * 생성자 함수를 이용한 객체 생성 => 다수의 객체를 생성하기 위해서
 */
function Student(name, kor, eng, mat) {
  this.name = name;
  this.kor = kor;
  this.eng = eng;
  this.mat = mat;

  this.getSum = function() {
    return this.kor + this.eng + this.mat;
  };
  
  this.getAverage = () => this.getSum() / 3; 
  this.toString = () => `${this.name}\t${this.getSum()}\t${this.getAverage()}`;
}

let students = []

students.push(new Student('홍길동',80,70,90))
students.push(new Student('박길동',30,40,50))

for (const i in students) {
  console.log(students[i].toString())
}

// 퀴즈 > Rectangle 생성자 함수를 만들고 사각형 넓이를 구하여 보자
// (width, height, getArea())

function Rectangle(whidth, height) { 
  this.whidth=whidth
  this.height=height
  this.getArea = ()=>this.whidth*this.height
}

console.log(new Rectangle(30,20).getArea())

function Student2(name, kor, eng, mat) {
  this.name = name;
  this.kor = kor;
  this.eng = eng;
  this.mat = mat;

  
}
// 생성자 함수로 먼저 초기화 했기때문에 이때는 allowFunction을 할수없다
Student2.prototype.getSum = function() {
  return this.kor + this.eng + this.mat;
}

Student2.prototype.getAverage = function() {
  return this.getSum() / 3;
}

Student2.prototype.toString = function() {
  return `${this.name}\t${this.getSum()}\t${this.getAverage()}`;
}


// 두번째 방법
Student2.prototype = {
  getSum :  function() {
    return this.kor + this.eng + this.mat;
  },
  getAverage : function() {
    return this.getSum() / 3;
  },
  toString : function() {
    return `${this.name}\t${this.getSum()}\t${this.getAverage()}`;
  }
  
}
const testStu = new Student2('승우',100,100,100)
console.log(testStu.getSum())
