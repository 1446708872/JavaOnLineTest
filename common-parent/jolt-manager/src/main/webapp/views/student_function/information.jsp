<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!-- information -->
<div class="inf-lside">
	<table>
		<tr>
			<td>姓名：<span><s:property value="#session.student.username"/></span></td>
		</tr>
		<tr>
			<td>性别：<span><s:property value="#session.student.sex"/></span></td>
		</tr>
		<tr>
			<td>学号：<span><s:property value="#session.student.stuId"/></span></td>
		</tr>
		<tr>
			<td>班级：<span><s:property value="#session.student.clazz.classValue"/></span></td>
		</tr>
		<!--<tr>-->
			<!--<td>得分：<span><s:property value="student.stuId"/></span></td>-->
		<!--</tr>-->
	</table>
</div>
<div class="inf-rside">
	<button type="button">修改密码</button>
</div>
