<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<c:set var="basePath" value="${pageContext.request.contextPath}"></c:set>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8" />
		<title></title>
		<script type="text/javascript" src="${basePath}/js/jquery-3.1.1.min.js"></script>
		<script src="${basePath}/js/test.js"></script>
		<link rel="stylesheet" href="${basePath}/css/test.css">
	</head>
	<body class="body" onkeydown="if(event.keyCode==122){event.keyCode=0;return false}">
		<div class="title">
			<div class="t-left">
				<input type="button" id="fullScreen" onclick="fullScreen()" value="全屏" >
				<input type="button" id="exitFullScreen" onclick="exitFullScreen()" value="退出全屏" >
				<strong style="color: red;">注意：如果因为个人原因关闭或刷新此浏览器，系统将会自动判决0分！并不能再次考试！如果是系统原因请通知老师处理。</strong>
			</div>
			<div class="t-right">
				<strong>考试计时：</strong>
				<strong style="color: red;" id="minute_show"></strong>
				<strong style="color: red;" id="second_show"></strong>
				<input style="margin-left: 15px;margin-right: 15px;" type="button"value="提前交胶卷" />
			</div>
			</div>
		<div class="mian">
			<strong>选择题:</strong>
			<c:forEach items="${test.choiceList}" var="choice" varStatus="status">
				<div class="find">
					<div class="find-top">
						<div class="str-left">
							<strong >第${status.index+1}题</strong>
						</div>
						<div class="str-right">
							<select style="height: 30px;width: 120px" >
								<option value ="d" SELECTE	D>请选择</option>
								<option value ="a">a</option>
								<option value ="b">b</option>
								<option value ="c">c</option>
								<option value ="d">d</option>
							</select>
							<strong>（5分）</strong>
						</div>
						<div class="str-center">
							<strong>${choice.introduce}</strong>
						</div>
					</div>

					<div class="find-bottom">
						<div class="bot-center">
							<div class="size">
								A：${choice.a}
							</div>
							<div class="size">
								B：${choice.b}
							</div>
							<div class="size">
								C：${choice.c}
							</div>
							<div class="size">
								D：${choice.d}
							</div>
						</div>
					</div>
				</div>
			</c:forEach>

			<strong>编程题:</strong>
			<c:forEach items="${test.completionList}" var="completionList" varStatus="status">
				<div class="test">
					<div class="find-top">
						<div class="str-left">
							<strong >第${status.index+1}题</strong>
						</div>
						<div class="str-right">
							<strong>（10分）</strong>
						</div>
						<div class="str-center">
							<strong>${completionList.subject}</strong>
						</div>
					</div>

					<div class="find-bottom">
						<div class="bot-center">
							<textarea onpaste="return false" style="width: 100%;height: 300px;resize: none;" >${completionList.introduce}</textarea>
						</div>
					</div>
				</div>
			</c:forEach>
		</div>
	</body>
</html>
