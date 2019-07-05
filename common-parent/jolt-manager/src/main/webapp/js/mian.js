
//页面加载初始化
function initialization (){
	if(document.getElementById("information")){
		$("#information").click();
	}
}

//侧边导航导航点击事件
function side_na(obj){
	//更改面包屑导航目录
	$("#nav_top").html($("#"+obj.id+"").html());
	//初始化按钮状态
	na_color();
	//更改所点击的按钮状态
	$("#"+obj.id+"").css({"background-color":"cornflowerblue","color":"white"});
	//加载所点击功能模块
	$.get("../views/student_function/"+obj.id+".jsp",function(data){
		$("#mian").html(data);
	});
}

//侧边导航状态初始化
function na_color(){
	if(document.getElementById("classification")){
		$("#classification").css({"background-color":"transparent","color":"black"});
	}
	if(document.getElementById("record")){
		$("#record").css({"background-color":"transparent","color":"black"});
	}
	if(document.getElementById("rankingList")){
		$("#rankingList").css({"background-color":"transparent","color":"black"});
	}
	if(document.getElementById("formativeTest")){
		$("#formativeTest").css({"background-color":"transparent","color":"black"});
	}
	if(document.getElementById("onlineTesting")){
		$("#onlineTesting").css({"background-color":"transparent","color":"black"});
	}
	if(document.getElementById("information")){
		$("#information").css({"background-color":"transparent","color":"black"});
	}
}
