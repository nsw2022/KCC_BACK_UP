<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Upload with Ajax</h1>



	<style>
.uploadResult {
	width: 100%;
	background-color: gray;
}

.uploadResult ul {
	display: flex;
	flex-flow: row;
	justify-content: center;
	align-items: center;
}

.uploadResult ul li {
	list-style: none;
	padding: 10px;
}

.uploadResult ul li img {
	width: 100px;
}
</style>

	<style>
.bigPictureWrapper {
	position: absolute;
	display: none;
	justify-content: center;
	align-items: center;
	top: 0%;
	width: 100%;
	height: 100%;
	background-color: gray;
	z-index: 100;
}

.bigPicture {
	position: relative;
	display: flex;
	justify-content: center;
	align-items: center;
}
</style>

	<div class='bigPictureWrapper'>
		<div class='bigPicture'></div>
	</div>


	<div class='uploadDiv'>
		<input type='file' name='uploadFile' multiple>
	</div>

	<div class='uploadResult'>
		<ul>

		</ul>
	</div>


	<button id='uploadBtn'>Upload</button>

	<script src="https://code.jquery.com/jquery-3.3.1.min.js"
		integrity="sha256-FgpCb/KJQlLNfOu91ta32o/NMZxltwRo8QtmkMRdAu8="
		crossorigin="anonymous"></script>


	<script>
		$(document).ready(function() {
			var uploadResult = $(".uploadResult ul");

			$("#uploadBtn").on("click", function(e) {
				var formData = new FormData();
				var inputFile = $("input[name='uploadFile']");
				var files = inputFile[0].files;

				console.log(files);

				for (var i = 0; i < files.length; i++) {
					if (!checkExtension(files[i].name, files[i].size)) {
						return false;
					}
					formData.append("uploadFile", files[i]);
				}

				$.ajax({
					url : '/uploadAjaxAction',
					processData : false,
					contentType : false,
					data : formData,
					type : 'POST',
					success : function(result) {
						alert("success");
						//console.table(result)
						showUploadedFile(result); 
					},
					error : function(jqXHR, textStatus, errorThrown) {
						alert('File upload failed.');
					}
				});
			});

			function checkExtension(fileName, fileSize) {
				var regex = new RegExp("(.*?)\.(exe|sh|zip|alz)$");
				var maxSize = 5242880; // 5MB

				if (fileSize >= maxSize) {
					alert("파일 사이즈 초과");
					return false;
				}

				if (regex.test(fileName)) {
					alert("해당 종류의 파일은 업로드할 수 없습니다.");
					return false;
				}
				return true;
			}

			function showUploadedFile(uploadResultArr) {
			    var str = "";
			    $(uploadResultArr).each(function(i, obj) {
			        console.log(obj);
			        var correctedPath = obj.uploadPath.replace(/\\/g, '/'); // 백슬래시를 슬래시로 교체
			        str += "<li><img src='/resources/up/" + correctedPath + "/" + obj.fileName + "'>" + obj.fileName + "</li>"; 
			    });
			    uploadResult.append(str);
			}

		});
	</script>
	<img src="/resources/up/2024/08/13/cd483b74-e47b-4b43-98ac-ad186bc0fe63_prod002.jpg">
 

</body>
</html>
