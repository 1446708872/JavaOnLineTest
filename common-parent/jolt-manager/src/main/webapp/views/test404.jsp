<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<c:set var="basePath" value="${pageContext.request.contextPath}"></c:set>
 
<html xmlns="http://www.w3.org/1999/xhtml">
 
<head>
 
<meta charset="UTF-8" http-equiv="Content-Type" content="text/html; charset=utf-8" />
 
<title>404-对不起！您访问的页面不存在</title>
 
<style type="text/css">
 
.head404{ width:580px; height:234px; margin:50px auto 0 auto; background:url(${pageContext.request.contextPath}/img/test.png) no-repeat; }
 
.txtbg404{ width:499px; height:169px; margin:10px auto 0 auto; background:url(${pageContext.request.contextPath}/img/test2.png) no-repeat;}
 
.txtbg404 .txtbox{ width:390px; position:relative; top:30px; left:60px;color:#eee; font-size:13px;}
 
.txtbg404 .txtbox p {margin:5px 0; line-height:18px;}
 
.txtbg404 .txtbox .paddingbox { padding-top:15px;}
 
.txtbg404 .txtbox p a { color:#eee; text-decoration:none;}
 
.txtbg404 .txtbox p a:hover { color:#FC9D1D; text-decoration:underline;}
 
</style>
 
</head>
 
 
 
<body bgcolor="#494949">
 
   	<div class="head404"></div>
 
   	<div class="txtbg404">
 
  <div class="txtbox">
 
      <p>该单元测试您已经参加，请勿重复测试，如果有需要请联系监考老师！</p>
 
      <p class="paddingbox">请点击以下链接继返回主页</p>
 
      <p>》<a href="${basePath}/user/mian.do">返回网站首页</a></p>
 
    </div>
 
  </div>
 
</body>
 
</html>
</html>