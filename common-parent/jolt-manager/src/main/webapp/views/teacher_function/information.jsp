<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!-- information -->
<div class="inf-lside">
	<table>
		<tr>
			<td>账户：<span>${user.user_id}</span></td>
		</tr>
		<tr>
			<td>姓名：<span>${user.name}</span></td>
		</tr>
		<tr>
			<td>性别：<span>${user.sex}</span></td>
		</tr>
		<tr>
			<td>权限：<span>超级管理员</span></td>
	</table>
</div>

<button type="button" class="inf-rside" onclick="changePassword(this,${user.power_title})" id="changePassword">修改密码</button>


