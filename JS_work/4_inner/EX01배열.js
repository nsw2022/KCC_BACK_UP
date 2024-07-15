/**
 * Array(배열)
 * 
 */

let kccMembers = [
  '진아',
  '수호',
  '한희',
  '채원',
  '주언',
  '연호'
]

console.log(kccMembers);

//push()
console.log(kccMembers.push('승언'))
console.log(kccMembers)

console.log('-------------------------------------')

//pop()
console.log(kccMembers.pop())
console.log(kccMembers)
console.log('-------------------------------------')

//shift()
console.log(kccMembers.shift())
console.log(kccMembers)
console.log('-------------------------------------')

//unshift()
console.log(kccMembers.unshift('현민'))
console.log(kccMembers)

//splice()
console.log(kccMembers.splice(0,3))
console.log(kccMembers)

//불변성 함수
kccMembers = [
  '진아',
  '수호',
  '한희',
  '채원',
  '주언',
  '연호'
]


console.log('-------------------------------------')
console.log(kccMembers)

console.log('-------------------------------------')

//concat()
console.log(kccMembers.concat('승우'))
console.log(kccMembers)
console.log('-------------------------------------')

//slice()
console.log(kccMembers.slice(0,3))
console.log(kccMembers)//불변
console.log('-------------------------------------')

//spread operator
let kccMembers2 = [...kccMembers] // 얕은복사
console.log(kccMembers2)

let kccMembers3 = kccMembers // 깊은 복사
console.log(kccMembers3)

console.log(kccMembers === kccMembers2) // 얕은 복사 - 주소가 다름 값 안바뀜
console.log(kccMembers === kccMembers3) // 깊은 복사 - 주소가 같음 갑 바뀜

let kccMembers4 = ['홍길동', '박길동', ...kccMembers, '조길동', '한길동']
console.log(kccMembers4)

let arr1 = [100,200,300]
function sum(a,b,c) {
    return a+b+c
}
console.log(sum(...arr1))


console.log('-------------------------------------')

// join()
console.log(kccMembers.join())
console.log(kccMembers.join('/'))
console.log(kccMembers.join(', '))


console.log('-------------------------------------')

//sort
console.log(kccMembers.sort())
console.log(kccMembers.reverse())

let numbers = [1,8,3,2,6]
console.log(numbers.sort((a,b)=>a-b))
console.log(numbers.sort((a,b)=>b-a))

// 과1> 이름을 기준으로 오름차순하고 전체 출력하세요 (for~in, for~of)
// 문자열 배열을 오름차순으로 정렬
const books = [
{
  name : '도커의 완성',
  price : 20000,
  publisher : '이지스퍼블릭'
},
{
  name : '스프링의 정석',
  price : 30000,
  publisher : '길벗'
},
{
  name : '이것이 자바다',
  price : 40000,
  publisher : '한빛 미디어'
},
]

books.sort((a,b) => a.name > b.name ? 1 : -1)
console.log()

//forEach
books.forEach((book)=>{
  console.log(`책 이름 ${book.name}, 책 가격: ${book.price}, 출판사: ${book.publisher}`)
})
console.log()

// for ~ in
for (const i in books) {
  let book=books[i]
  console.log(`책 이름 ${book.name}, 책 가격: ${book.price}, 출판사: ${book.publisher}`)
}
console.log()


// for ~ of
for (const book of books) {
  console.log(`책 이름 ${book.name}, 책 가격: ${book.price}, 출판사: ${book.publisher}`)
}
console.log('-------------------------------------')

//filter
numbers = [1,8,7,4,9]
console.log(numbers.filter((x)=> x%2===0))
console.log('-------------------------------------')

//find
console.log(numbers.find((x)=>x%2===0))
console.log('-------------------------------------')

//findIndex()
console.log(numbers.findIndex((x)=> x%2 ===0))
console.log('-------------------------------------')

//reduce()
console.log(numbers.reduce((p,n)=> p+n,0))

//퀴즈 > iveMembers 변수에 있는 모든 스트링 값들을 더해보자
const iveMembers = [
  {
      name: '안유진',
      year: 2003,
  },
  {
      name: '가을',
      year: 2002,
  },
  {
      name: '레이',
      year: 2004,
  },
  {
      name: '장원영',
      year: 2004,
  },
  {
      name: '리즈',
      year: 2004,
  },
  {
      name: '이서',
      year: 2007,
  },
]

console.log(iveMembers.reduce((p, n)=> p + n.name.length, 0));
console.log(iveMembers.reduce((prev, curr) => prev + curr.name + " ", "").trim());
