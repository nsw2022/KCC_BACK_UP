let replyService = (function() {
  
  function create(){
    console.log('create')
  }

  function update(){
    console.log('update')
  }
  function getList(param, callback){
    let data = '결과값' + param
    callback(data)
  }

  return {
    create : create,
    update : update,
    getList : getList
  }

})()

function show() {
  replyService.create()
  replyService.getList('kosa',(result)=>console.log(`내가 원하는 쿠키~~ ${result}`))
}

show()


console.log("=============================")

function orderService(item, price, quantity, callback) {
  console.log('커피 주문을 처리합니다.');
  let data = `고객이 주문한 메뉴: ${item}, 가격: ${price*quantity}원`;
  callback(data);
}

function order() {
  orderService("아이스 아메리카노", 2000, 2, (data) => {
    console.log(data);
  });
}

order();