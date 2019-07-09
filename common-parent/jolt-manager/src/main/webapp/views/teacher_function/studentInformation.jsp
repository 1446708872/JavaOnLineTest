<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!-- information -->
<form action="" method="post">
    <div class="input-rh"style="padding-top: 15px;padding-left: 15px;margin-left: 20px">
        <input type="text" style="height: 35px;width: 200px" id="query" placeholder="搜索">
        <input type="button" style="width: 135px;height: 35px" value="查询" onclick="querySize('class','${pageContext.request.contextPath}')">
    </div>
</form>

<div class="inf-lside">
        <div style="margin: 0 auto;width: 17%;margin-top: 30px"><strong style="font-size:30px">班级信息列表</strong></div>
    <div class="table-cf">
        <table>
            <thead>
            <tr>
                <th>班级编号</th>
                <th>班级年级</th>
                <th>专业信息</th>
                <th>班级信息</th>
                <th>删除班级</th>
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

    function StidentList(obj) {
        // //更改面包屑导航目录
        $("#hidden").val(obj.id)
        // //加载所点击功能模块
        $.get("../views/teacher_function/studentInformation/StidentList.jsp",function(data){
            $("#mian").html(data);
        });
    }

    function queryop(data) {
        var list=''
        for(var i=0;i<data.length;i++){
            if(data[i].class_user!=0){
                list+=' <tr>\n' +
                    '                <td style="text-align:center ">'+data[i].class_user+'</td>\n' +
                    '                <td style="text-align:center ">'+data[i].class_age+'</td>\n' +
                    '                <td style="text-align:center "><button style="width: 200px" type="button">'+data[i].class_major+'</button></td>\n' +
                    '                <td style="text-align:center "><button type="button" id="'+data[i].class_user+'" onclick="StidentList(this)">查看班级信息</button></td>\n' +
                    '                <td style="text-align:center "><button type="button"   ondblclick="Delete('+data[i].class_user+')">删除班级信息</button></td>\n' +
                    '            </tr>'
            }
        }
        $("#class_list").html(list)
    }

    function op(){
        $.ajax({
            url : '${pageContext.request.contextPath}/stu/getClass.do',
            type : "post",
            success: function (data) {
                queryop(data)
            }
        })
    }


    function Delete(a) {
        $.ajax({
            url : '${pageContext.request.contextPath}/stu/deleteByIdClass.do',
            type : "post",
            data:{"class_user":a},
            success: function (data) {
                queryop(data)
            }
        })
    }

</script>
