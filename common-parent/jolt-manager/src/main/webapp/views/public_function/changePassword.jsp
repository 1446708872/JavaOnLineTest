<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!-- information -->
<div class="inf-lside">
	<form id="PasswordFrom">
		<table>
			<tr style="display: none" id="error">
				<td style="color: red">错误提示：<span id="error_val" style="color: red"></span></td>
			</tr>
			<tr style="display: none" id="tips">
				<td>友好提示：<span id="tips_val" style="color: blue"></span></td>
			</tr>
			<tr>
				<td>原先密码：<span><input type="password" id="originalPassword" name="originalPassword" maxlength="16" ></span></td>
			</tr>
			<tr>
				<td>新的密码：<span><input type="password" id="newPassword" name="newPassword" maxlength="16"></span></td>
			</tr>
			<tr>
				<td>确认密码：<span><input type="password" id="determinePassword" name="determinePassword" maxlength="16"></span></td>
			</tr>
			<tr>
				<td><input style="margin-left: 80px" type="button" id="changePasswordFrom" value="修改密码&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"></td>
			</tr>
		</table>
	</form>
	<script>
		$("#changePasswordFrom").click(function () {
			none()
			if(cleck()){
				$.post("changePassword.do",$("#PasswordFrom").serialize(),function (data) {
					switch (data) {
						case "1":
							tips('修改密码成功!将于<span id="jumpTo">5</span>秒后跳转到登陆界面！')
							countDown(5,'${pageContext.request.contextPath}/user/login.do')
							break;
						case "0":
							error("您输入原密码与现密码不符！")
							break;
					}
				})
			}
		})

		function cleck() {
			if($("#originalPassword").val()==""){
				error("请输入原密码！")
				return false;
			}

			if($("#newPassword").val()==""){
				error("请输入新密码！")
				return false;
			}

			if($("#determinePassword").val()==""){
				error("请输入确认密码！")
				return false;
			}

			if($("#determinePassword").val()!=($("#newPassword").val())){
				error("请输入正确的确认密码！")
				return false;
			}

			return true;
		}

		function countDown(secs,surl){
			//alert(surl);
			var jumpTo = document.getElementById('jumpTo');
			jumpTo.innerHTML=secs;
			if(--secs>0){
				setTimeout("countDown("+secs+",'"+surl+"')",1000);
			}
			else
			{
				location.href=surl;
			}
		}
	</script>
</div>


