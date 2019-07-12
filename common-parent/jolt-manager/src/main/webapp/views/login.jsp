<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<c:set var="basePath" value="${pageContext.request.contextPath}"></c:set>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>login</title>
	<link rel="stylesheet" href="${basePath}/css/login.css">
	<script type="text/javascript" src="${basePath}/js/jquery-3.1.1.min.js"></script>
</head>
<body>
<div class="login-header">
	<p>java在线测试系统</p>
</div>
<div class="login-info lside">
	<div class="form-header">
		<p>用&nbsp;户&nbsp;登&nbsp;陆</p>
		<hr>
	</div>
	<div class="form-error">
		<div class="msg-error" id="error" style="display:none;text-align: center;font-weight: bold">
			用户名或密码错误
		</div>
	</div>
	<form id="login_from">
		<div class="form" id="form">
			<div class="li">
				<div class="ele-wrap">
					<i class="icon icon-user"></i>
					<input type="text" name="user_id" id="user_id" placeholder="请输入学号" value="1730402061" maxlength="20">
				</div>
			</div>
			<div class="li">
				<div class="ele-wrap">
					<i class="icon icon-psd"></i>
					<input type="password" name="password" id="password" placeholder="请输入密码" value="123456" maxlength="16">
				</div>
			</div>
			<div class="li">
				<div class="ele-wrap">
					<div class="code-img">
						<a href="#" id="changeImg">
							<canvas class="show-captcha" id="canvas" width="94" height="42"></canvas>
							<a style="display: none" id="codeCan"></a>
						</a>
					</div>
					<div class="proving-code">
						<i class="icon icon-code"></i>
						<input type="text" name="code"  id="code" class="control-code"placeholder="验证码">
					</div>
				</div>
			</div>
			<div class="li"></div>
			<div class="li">
				<div class="ele-wrap">
					<div class="btn">
						<a href="javascript:;" class="btn-1" id="sub">登&nbsp;&nbsp;录</a>
						<!-- <a href="" class="btn-2">快捷登陆</a> -->
					</div>
				</div>
			</div>
		</div>
	</form>
</div>
<script>
	//项目部署时验证码的初始化
	codeCan();

	//提交用户信息
	$(function () {
		$("#sub").click(function () {
			if (!checkUser()) {
				return;
			}
			$.post("userLogin.do", $("#login_from").serialize(), function (data) {
                var url =window.location.host
				switch (data) {
					case "0":
						exception("请输入您正确的学号！")
						break;
					case "1":
						exception("您输入的密码与学号不匹配！")
						break;
					case "2":
						exception('此浏览器已经有登陆账户，<a href="${basePath}/user/exit.do" >点击我退出</a>之前用户！')
						break
					default:
						window.location.href= "http://" + url + "${basePath}/user/mian.do";
						break;
				}
				codeCan();
			})
		})
	})

	//判断用户信息是否输入
	function checkUser() {
		$("#error").hide();

		var re = /^[0-9]+.?[0-9]*$/;


		if(!re.test($("#user_id").val())){
			exception("请输入（全数字）正确的学号！")
			return false;
		}
		if($("#user_id").val() ==""){
			exception("您请输入您的学号！")
			return false;
		}
		if($("#password").val()==""){
			exception("您请输入您的密码！")
			return false;
		}
		if($("#code").val()==""){
			exception("您请输入您的验证码！")
			return false;
		}
		if($("#code").val().toUpperCase()!=$("#codeCan").html().toUpperCase()){
			exception("您的验证码错误，请重新输入！")
			$("#code").val("");
			return false;
		}
		return true;
	}

	//生成错误提示
	function exception(error) {
		$("#error").html(error)
		$("#error").show()
		codeCan()
	}

	//生成验证码
	function codeCan(){
		/**生成一个随机数**/
		function randomNum(min, max) {
			return Math.floor(Math.random() * (max - min) + min);
		}
		/**生成一个随机色**/
		function randomColor(min, max) {
			var r = randomNum(min, max);
			var g = randomNum(min, max);
			var b= randomNum(min, max);
			return "rgb(" + r + "," + g + "," + b + ")";
		}
		var code=drawPic();
		document.getElementById("changeImg").onclick = function(e) {
			e.preventDefault();
			code=drawPic();
		}
		/**绘制验证码图片**/
		function drawPic() {
			var canvas = document.getElementById("canvas");
			var width = canvas.width;
			var height = canvas.height;
			//获取该canvas的2D绘图环境
			var ctx = canvas.getContext('2d');
			ctx.textBaseline ='bottom';
			/**绘制背景色**/
			ctx.fillStyle = randomColor(180,240);
			//颜色若太深可能导致看不清
			ctx.fillRect(0,0,width,height);
			/**绘制文字**/
			var str ='ABCEFGHJKLMNPQRSTWXY123456789';

			var code="";
			//生成四个验证码
			for(var i=1;i<=4;i++) {
				var txt = str[randomNum(0,str.length)];
				code=code+txt;
				ctx.fillStyle = randomColor(50,160);
				//随机生成字体颜色
				ctx.font = randomNum(15,40) +'px SimHei';
				//随机生成字体大小
				var x =5 +i *15;
				var y = randomNum(25,35);
				var deg = randomNum(-45,45);
				//修改坐标原点和旋转角度
				ctx.translate(x, y);
				ctx.rotate(deg * Math.PI /180);
				ctx.fillText(txt,0,0);
				//恢复坐标原点和旋转角度
				ctx.rotate(-deg * Math.PI /180);
				ctx.translate(-x, -y);
			}
			$("#codeCan").html(code)
			return code;
		}
	}
</script>
</body>
</html>