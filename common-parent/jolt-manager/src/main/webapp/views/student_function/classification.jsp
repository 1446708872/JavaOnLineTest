<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!-- information -->
<form action="" method="post">
	<div class="input-rh"style="padding-top: 15px;padding-left: 15px;margin-left: 20px">
		<input type="text" style="height: 35px;width: 200px" id="query" placeholder="搜索">
		<input type="button" style="width: 135px;height: 35px" value="查询" onclick="querySize('library','${pageContext.request.contextPath}')">
	</div>
</form>

<div class="inf-lside">
	<div style="margin: 0 auto;width: 17%;margin-top: 30px"><strong style="font-size:30px">试题分类列表</strong></div>
	<div class="table-cf">
		<table>
			<thead>
			<tr>
				<th>分类编号</th>
				<th>分类信息</th>
				<th>选择题库</th>
				<th>编程题库</th>
			</tr>
			</thead>
			<tbody id="class_list">
			<%--<tr>--%>
			<%--<td style="text-align:center ">0</td>--%>
			<%--<td style="text-align:center ">17级别</td>--%>
			<%--<td style="text-align:center ">软件开发（三班）</td>--%>
			<%--<td style="text-align:center "><button type="button">进入学生信息</button></td>--%>
			<%--<td style="text-align:center "><button type="button">删除班级信息</button></td>--%>
			<%--</tr>--%>
			</tbody>
		</table>
	</div>
	<button style="margin-top: -530px;margin-left: 1010px" type="button" class="inf-rside" onclick="op()">刷新</button>
</div>

<script>
	op()
	function queryop(data) {
		var list=''
		for(var i=0;i<data.length;i++){
			list+=' <tr>\n' +
					'                <td style="text-align:center ">'+data[i].problem_id+'</td>\n' +
					'                <td style="text-align:center ">'+data[i].introduce+'</td>\n' +
					'                <td style="text-align:center "><button type="button" id="'+data[i].problem_id+'" onclick="choiceList(this)">进入选择题库</button></td>\n' +
					'                <td style="text-align:center "><button type="button" id="'+data[i].problem_id+'" onclick="questionschoiceList(this)">进入判断题库</button></td>\n'+
					'</tr>'

		}
		$("#class_list").html(list)
	}

	function choiceList(obj) {
		$("#hidden").val(obj.id)
		//加载所点击功能模块
		$.get("../views/student_function/classification/choiceList.jsp",function(data){
			$("#mian").html(data);
		});
	}
	function questionschoiceList(obj) {
		$("#hidden").val(obj.id)
		//加载所点击功能模块
		$.get("../views/student_function/classification/completionList.jsp",function(data){
			$("#mian").html(data);
		});
	}

	function op(){
		$.ajax({
			url : '${pageContext.request.contextPath}/lib/LibraryList.do',
			type : "post",
			success: function (data) {
				queryop(data)
			}
		})
	}


</script>
