

//页面加载初始化
function initialization (){
	if(document.getElementById("information")){
		$("#information").click();
	}
}


//学生管理跳转
function studentAdd(obj,title,url) {
	//更改面包屑导航目录
	$("#nav_top").html(title);
	//加载所点击功能模块
	$.get("../views/teacher_function/"+url+"/"+obj.id+".jsp",function(data){
		$("#mian").html(data);
	});
}

//修改密码跳转
function changePassword(obj,power) {
	//更改面包屑导航目录
	$("#nav_top").html("修改密码");
	//初始化按钮状态
	na_color(power);
	//加载所点击功能模块
	$.get("../views/public_function/"+obj.id+".jsp",function(data){
		$("#mian").html(data);
	});
}

//侧边导航导航跳转
function side_na(obj,power){
	var sa ="student_function";
	if(power == "0")sa="teacher_function";

	//更改面包屑导航目录
	$("#nav_top").html($("#"+obj.id+"").html());
	//初始化按钮状态
	na_color(power);
	//更改所点击的按钮状态
	$("#"+obj.id+"").css({"background-color":"cornflowerblue","color":"white"});
	//加载所点击功能模块
	$.get("../views/"+sa+"/"+obj.id+".jsp",function(data){
		$("#mian").html(data);
	});
}

//查询方法
function querySize(o,url) {
	if($("#query").val()=="")return;
	$.ajax({
		url : url+'/stu/query.do',
		type : "post",
		data:{"o":o,"val":$("#query").val()},
		success: function (data) {
			queryop(data)
		}
	})
}

//侧边导航状态初始化
function na_color(power){
	if(power == "0"){
		$("#questionsAdd").css({"background-color":"transparent","color":"black"});
		$("#questionsInformation").css({"background-color":"transparent","color":"black"});
		$("#information").css({"background-color":"transparent","color":"black"});
		$("#studentAdd").css({"background-color":"transparent","color":"black"});
		$("#studentInformation").css({"background-color":"transparent","color":"black"});
	}else{
		$("#classification").css({"background-color":"transparent","color":"black"});
		$("#record").css({"background-color":"transparent","color":"black"});
		$("#formativeTest").css({"background-color":"transparent","color":"black"});
		$("#rankingList").css({"background-color":"transparent","color":"black"});
		$("#onlineTesting").css({"background-color":"transparent","color":"black"});
		$("#information").css({"background-color":"transparent","color":"black"});
	}
}

function error(val) {
	$("#error_val").html(val)
	$("#error").show()
}

function tips(val) {
	$("#tips_val").html(val)
	$("#tips").show()
}

function none() {
	$("#error").hide()
	$("#tips").hide()
}
