<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!-- information -->
<form action="" method="post">
    <div class="input-rh"style="padding-top: 15px;padding-left: 15px;margin-left: 20px">
        <input type="text" style="height: 35px;width: 200px" id="query" placeholder="搜索">
        <input type="button" style="width: 135px;height: 35px" value="查询" id="querySub" onclick="querySize('completion','${pageContext.request.contextPath}')">
    </div>
</form>

<div class="inf-lside">
    <div style="margin: 0 auto;width: 17%;margin-top: 30px"><strong style="font-size:30px">填空题列表</strong></div>
    <div class="table-cf">
        <table>
            <thead>
            <tr>
                <th>试题编号</th>
                <th>试题信息</th>
                <th>练习试题</th>
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
    <button style="margin-top: -530px;margin-left: 878px" type="button" class="inf-rside" onclick="op()" id="">刷新</button>
    <button style="margin-top: -530px;margin-left: 1010px" type="button" class="inf-rside" onclick="side_na(this,1)" id="classification">返回</button>
</div>

<script>
    var val = $("#hidden1").val();
    if(val!=null) $("#mian").scrollTop(val);
    op()
    function queryop(data) {
        var list=''
        for(var i=0;i<data.length;i++){
            var s = data[i].subject.substring(0, 40);
            s+='.......'
            list+=' <tr>\n' +
                '                <td style="text-align:center;">'+data[i].completion_id+'</td>\n' +
                '                <td style="text-align:center;">'+s+'</td>\n' +
                '                <td style="text-align:center;"><button id="'+data[i].completion_id+'" onclick="completionUpdate(this)" style="width: 100px" type="button" >开始做题</button></td>\n'+
                '</tr>'
        }
        $("#class_list").html(list)
    }

    function op(){
        $.ajax({
        url : '${pageContext.request.contextPath}/lib/completionList.do',
        type : "post",
        data:{"selectId":$("#hidden").val()},
        success: function (data) {
        queryop(data)
        }
        })
    }


    function completionUpdate(obj) {
        $("#hidden").val(obj.id)
        var scrollTop = $("#mian").scrollTop();
        $("#hidden1").val(scrollTop)
        //加载所点击功能模块
        $.get("../views/student_function/classification/completionList/completionUpdate.jsp",function(data){
            $("#mian").html(data);
        });
    }

</script>
