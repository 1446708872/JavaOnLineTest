<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<c:set var="basePath" value="${pageContext.request.contextPath}"></c:set>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>Document</title>
	<script type="text/javascript" src="${basePath}/js/jquery-3.1.1.min.js"></script>
	<script src="${basePath}/js/mian.js"></script>
	<link rel="stylesheet" href="${basePath}/css/mian.css">
	<link rel="stylesheet" href="${basePath}/css/initialize.css">
	<!-- record -->
	<link rel="stylesheet" href="${basePath}/css/record.css">
	<!-- classification -->
	<link rel="stylesheet" href="${basePath}/css/classification.css">
	<!-- padging -->
	<link rel="stylesheet" href="${basePath}/css/padging.css">
	<!-- information -->
	<link rel="stylesheet" href="${basePath}/css/information.css">
	<!-- 小图标 -->
	<link href="//netdna.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet">
</head>
<body onload="initialization()">
	<div class="header" id="header">
		<!-- <div class="bjt"></div> -->
	</div>
	<div class="middle" id="middle">
		<div class="lside">
			<ul class="side-na">
				<c:forEach items="${title}" var="tl">
					<li ><a href="javascript:;" id="${tl.title_id}" onclick="side_na(this,${tl.title_power})"><span>${tl.title}</span></a></li>
				</c:forEach>
					<%--<li ><a href="javascript:;" id="information" onclick="side_na(this)"><span>个人信息</span></a></li>--%>
				    <%--<li ><a href="javascript:;" id="classification" onclick="side_na(this)"><span>试题分类</span></a></li>--%>
				    <%--<li ><a href="javascript:;" id="record" onclick="side_na(this)"><span>练习记录</span></a></li>--%>
				    <%--<li ><a href="javascript:;" id="rankingList" onclick="side_na(this)"><span>排&nbsp;&nbsp;行&nbsp;&nbsp;榜</span></a></li>--%>
				    <%--<li ><a href="javascript:;" id="formativeTest" onclick="side_na(this)"><span>阶段检测</span></a></li>--%>
				    <%--<li ><a href="javascript:;" id="onlineTesting" onclick="side_na(this)"><span>在线测试</span></a></li>--%>
			</ul>
		</div>
		<div class="rside">
			<div class="rside-top">
				<div class="ltop">
					<h3 id="nav_top">试题编号</h3>
				</div>
				<div class="rtop">
					<ul>
						<li><a href="${pageContext.request.contextPath}/user/exit.do">退出</a></li>
						<li>欢迎回来:<span>${user.name}</span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</li>
					</ul>
				</div>
			</div>
			<div class="rside-lset">
				<div class="rside-bottom" id="mian"></div>
				</div>
			</div>
		</div>
	</div>
	<div class="footer" id="footer"></div>
</body>
</html>