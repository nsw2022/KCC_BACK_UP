<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script>
$(document).ready(function() {
    $.getJSON("/a/sample/ex07", function(data) {
        console.log(data);
        $('#name').text(data.name);
        $('#age').text(data.age);
    }).fail(function() {
        console.error("API error.");
    });
    
   
});
</script>
</head>
<body>
<h1>EX05</h1>

  name: ${sampleDTO.name}
   <br /> age: ${sampleDTO.age}
   <br /> page: ${page}
       <h1>Data Received from Server</h1>
    <p>Name: <span id="name"></span></p>
    <p>Age: <span id="age"></span></p>
</body>
</html>