<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!-- information -->

<div class="input-rh"style="padding-top: 15px;padding-left: 15px;margin-left: 20px">
    <input type="text" style="height: 35px;width: 200px" id="query" placeholder="搜索">
    <input type="button" style="width: 135px;height: 35px;" value="查询" onclick="querySize('user','${pageContext.request.contextPath}')">
</div>

<div class="inf-lside">
    <div style="margin: 0 auto;width: 17%;margin-top: 30px"><strong style="font-size:30px">学生信息列表</strong></div>

    <div class="table-cf">
        <table>
            <thead>
            <tr>
                <th>学生学号</th>
                <th>学生信息</th>
                <th>学生性别</th>
                <th>修改信息</th>
                <th>删除学生</th>
            </tr>
            </thead>
            <tbody id="stu_list">
            <%--<tr>--%>
            <%--<td style="text-align:center ">data[i].user_id</td>--%>
            <%--<td style="text-align:center">data[i].name</td>--%>
            <%--<td style="text-align:center "><button type="button">进入学生记录</button></td>--%>
            <%--<td style="text-align:center "><button type="button">修改学生信息</button></td>--%>
            <%--<td style="text-align:center "><button type="button">删除学生信息</button></td>--%>
            <%--</tr>--%>
            </tbody>
        </table>
    </div>
    <button style="margin-top: -530px;margin-left: 878px" type="button" class="inf-rside" onclick="op()" id="">刷新</button>
    <button style="margin-top: -530px;margin-left: 1010px" type="button" class="inf-rside" onclick="side_na(this,0)" id="studentInformation">返回</button>
</div>

<script>
 op()

    function queryop(data) {
        var list=''
        for(var i=0;i<data.length;i++){
            list+= '            <tr>\n' +
                '            <td style="text-align:center ">'+data[i].user_id+'</td>\n' +
                '            <td style="text-align:center"><button type="button" style="width: 110px">'+data[i].name+'</button></td>\n' +
                '            <td style="text-align:center ">'+data[i].sex+'</td>\n' +
                '            <td style="text-align:center "><button type="button" id="'+data[i].user_id+'"  onclick="Student(this)"> 修改学生信息</button></td>\n' +
                '            <td style="text-align:center "><button type="button" ondblclick="Delete('+data[i].id+')" >删除学生信息</button></td>\n' +
                '            </tr>'
        }

        $("#stu_list").html(list)
    }
     function Student(obj) {
         // //更改面包屑导航目录
         $("#hidden").val(obj.id)
         // //加载所点击功能模块
         $.get("../views/teacher_function/studentInformation/StidentList/updateStudent.jsp",function(data){
             $("#mian").html(data);
         });
     }

    function op() {
        $.ajax({
            url : '${pageContext.request.contextPath}/stu/getStudent.do',
            type : "post",
            data:{"selectId":$("#hidden").val()},
            success: function (data) {
               queryop(data)
            }
        })
    }

    function Delete(a) {
        var list='';
        $.ajax({
            url : '${pageContext.request.contextPath}/stu/deleteByIdStudent.do',
            type : "post",
            data:{"id":a,"selectId":$("#hidden").val()},
            success: function (data) {
                queryop(data)
            }
        })
    }
</script>

