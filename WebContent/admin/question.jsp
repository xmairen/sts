<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="com.sts.vo.ExamAddVO"%>

<!DOCTYPE html>
<html>
<link href="/skin/css/table.css" rel="stylesheet" type="text/css" />
<link href="/skin/css/list.css" rel="stylesheet" type="text/css" />
<link href="/skin/css/frame.css" rel="stylesheet" type="text/css" />
<script>
function add_question(){
	var que_con = document.getElementById("question_content").value;
	var an_a = document.getElementById("answer_a").value;
	var an_b = document.getElementById("answer_b").value;
	var an_c = document.getElementById("answer_c").value;
	var an_d = document.getElementById("answer_d").value;
	
	if(que_con =="" || an_a =="" ||an_b =="" ||an_c =="" ||an_d ==""){
		alert("请输入正确的内容！");
		return false;
	}else{
		document.getElementById("addquestionform").submit();
	}
}
</script>
<body class="">
			<!-- header -->
		<jsp:include page="../framework/header.jsp"></jsp:include>
		<div class="container">

		
			<!-- menu -->
			<jsp:include page="../framework/menu.jsp"></jsp:include>
			

			<div id="frameDiv" class="frame">
				<div class="contentContainer">
					<div class="content">
						

						<div id="mainFrame" class="projectContent">
						<!-- content -->
							   <!-- start -->
		<form id="addquestionform" method="post"  action='/admin/QuestionController' >
		<input id="method" name="method" value="add" type="hidden"/>
		<span class="label">试题内容：</span>
		<div  style="height:100px;">
		<textarea id="question_content" name="question_content" style="height:100px; width: 1000px;"></textarea>
		 </div>
		 <span class="label">选择项：</span>
		<div  style="height:50px;">
		 <span class="label">A：</span><input id="answer_a" name="answer_a" type="text"/>
		 <span class="label">B：</span><input id="answer_b" name="answer_b" type="text"/>
		 <span class="label">C：</span><input id="answer_c" name="answer_c" type="text"/>
		 <span class="label">D：</span><input id="answer_d" name="answer_d" type="text"/>
		 </div>
		 
		 <span class="label">正确答案：</span>
		<div  style="height:50px;">
		<select id="answer" name="answer">
		<option>A</option>
		<option>B</option>
		<option>C</option>
		<option>D</option>
		</select>
		 </div>
		
		<input type="button" value="添 加" onclick="return add_question();" class="findOut" />	
		</form>
	
	
	
	
	
	<div class="serchResult" >
		<div class="resultTableTitle">
			<div class="result">
						<span class="resultTitle">查询结果</span>（数据共<span>10</span>条）
			</div>
		</div>
<form id="alldatafile" method="post" name="alldatafile" action='' >
	<hr>
	<div class="resultTableTitle">
	<div class="lfloat">
	</div>
	
  </div>
		<table  id="resultList" >
		
			 <thead style="background: #ebebeb;font-size:13px;">
				<th>试题ID</th>
				<th>内容</th>
				<th>选择项A</th>
				<th>选择项B</th>
				<th>选择项C</th>
				<th>选择项D</th>
				<th>正确答案</th>
				<th>操作</th>
			</thead>

		
		<% List list = (List)request.getAttribute("question_list");%>
		
		<% 
		if(list!=null)
		for(int i=0; i<list.size(); i++){
			ExamAddVO vo = (ExamAddVO)list.get(i);%>
			<tr align="center">
			<td><%=vo.getId() %></td>
			<td><%=vo.getContans() %></td>
			<td><%=vo.getAnswerA() %></td>
			<td><%=vo.getAnswerB() %></td>
			<td><%=vo.getAnswerC() %></td>
			<td><%=vo.getAnswerD() %></td>
			<td><%=vo.getAnswer() %></td>
			<td ><a href="/admin/QuestionController?method=delete&id=<%=vo.getId() %>"><i>删除</i></a>&nbsp;&nbsp;&nbsp;&nbsp;<a href="/admin/QuestionController?method=modify&id=<%=vo.getId() %>"><i>编辑</i></a></td>
			</tr>
		<% } %>


		</table>
	
	</form>
	</div>
							   
							   <!-- end -->
							   
						</div>

				<!-- footer -->
			<jsp:include page="../framework/footer.jsp"></jsp:include>			

				</div>
			</div>
		</div>
	</div>




</body>


</html>
