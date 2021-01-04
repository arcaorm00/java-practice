<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-2.2.1.js"></script>
<script>
	function clickBtn(){
		var startDate = $("#startDate").val();
		var endDate = $("#endDate").val();
		
		var startArr = startDate.split("/");
		var endArr = endDate.split("/");
		
		var startDate = new Date(startArr[0], startArr[1]-1, startArr[2]);
		var endDate = new Date(endArr[0], endArr[1]-1, endArr[2]);
		
		startDate.setMonth(startDate.getMonth() + 1);
		if(startDate.getTime() < endDate.getTime()){
			alert("기간 검색은 최대 한달까지 가능합니다.");
		}
	}
</script>
</head>
<body>
 <input type="text" id="startDate" name="startDate"/>
 <input type="text" id="endDate" name="endDate"/>
 <input type="button" id="btn" value="검색" onClick="clickBtn();"/>
</body>
</html>