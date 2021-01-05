<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-2.2.1.js"></script>
<script type="text/javascript">
$(function(){
	var round = 0;
	
	$("#addBtn").click(function(){
		$("#insertBtn").attr("disabled", false);
		if (round < 3){
			var tr = $("<tr></tr>");
			var mastercodeTd = $("<td></td>").html("COM002");
			var detailcodeTd = $("<td><input type='text' id='detailcodeTd"+round+"'/></td>");
			var codenameTd = $("<td><input type='text' id='codenameTd"+round+"'/></td>");
			var useynTd = $("<td><input type='radio' name='useYnRadio"+round+"' value='Y'/>Y<input type='radio' name='useYnRadio"+round+"' value='N'/>N</td>");
			tr.append(mastercodeTd, detailcodeTd, codenameTd, useynTd);
			$("#testTable").append(tr);
			round += 1;
		}else{
			alert("한번에 입력할 수 있는 코드는 최대 3개입니다.");
		}
	});
	
	$("#insertBtn").click(function(){
		var list = [];
		for(var i = 0; i < round; i++){
			var detailcode = $("#detailcodeTd"+i).val();
			var codename = $("#codenameTd"+i).val();
			var useyn = $("input[name=useYnRadio"+i+"]:checked").val();
			//값이 다 들어와 있는지 확인 & 중복 확인
			var row = {DECODE: detailcode, CODE_NAME: codename, USE_YN: useyn};
			list.push(row);
		}
		console.log(list);
	});
});
</script>
</head>
<body>
	<button id="addBtn">추가</button>
	<button id="insertBtn" disabled="disabled">등록</button>
	<table id="testTable" border="1">
		<tr>
			<th>마스터코드</th>
			<th>디테일코드</th>
			<th>코드이름</th>
			<th>사용여부</th>
		</tr>
		<tr>
			<td>test</td>
			<td>test</td>
			<td>test</td>
			<td>Y</td>
		</tr>
	</table>
</body>
</html>