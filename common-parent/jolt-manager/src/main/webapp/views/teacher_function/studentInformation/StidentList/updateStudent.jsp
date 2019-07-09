<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!-- information -->
<div class="inf-lside">
    <form id="PasswordFrom">
        <table>
            <tr>
                <td>学号：<span><input type="text" id="user_id" name="user_id" maxlength="16" ></span></td>
            </tr>
            <tr>
                <td>密码：<span><input type="text" id="password" name="password" maxlength="16"></span></td>
            </tr>
            <tr>
                <td>姓名：<span><input type="text" id="name" name="name" maxlength="16"></span></td>
            </tr>
            <tr>
                <td>
                    性别：<span>
                    <select name="sex" style="height: 30px;width: 135px" id="sex">
                        <option value ="男"  id="nan">男</option>
                        <option value ="女" id="nu">女</option>
                    </select>
                </span>
                </td>
            </tr>
            <tr>
                <td>
                    <input style="margin-left: 43px" type="button" id="changePasswordFrom" value="修改">
                    <span style="display: none;color: red" id="error">
                        错误提示：<span id="error_val" style="color: red"></span>
                    </span>
                    <span style="display: none" id="tips">
                        友好提示：<span id="tips_val" style="color: blue"></span>
                    </span>
                </td>
            </tr>
        </table>
    </form>
</div>

<button type="button" class="inf-rside" onclick="StidentList()">返回</button>

<script>
    $.ajax({
        type: "post",
        url: "${pageContext.request.contextPath}/user/byIntUser.do",
        data:{"id":$("#hidden").val()},
        success: function (data) {
            $("#user_id").val(data.user_id)
            $("#password").val(data.password);
            $("#name").val(data.name);
            $("#hidden").val(data.user_class)
            if(data.sex=="男"){
                $("#nan").attr("SELECTED","SELECTED")
                return;
            }
            $("#nu").attr("SELECTED","SELECTED")
        }
    })


    $("#changePasswordFrom").click(function () {
        none()
        if(cleck()){
            $.ajax({
                type: "post",
                url: "${pageContext.request.contextPath}/user/updateUser.do",
                data:$("#PasswordFrom").serialize(),
                success: function (data) {
                    $("#user_id").val("")
                    $("#password").val("");
                    $("#name").val("");
                    if(data=="true"){
                        tips("添加成功！")
                        StidentList()
                    }else {
                        error("添加失败,您输入的学号已存在！")
                    }
                }
            })
        }
    })
    function cleck() {
        var re = /^[0-9]+.?[0-9]*$/;

        if($("#user_id").val()==""){
            error("请输入学号！")
            return false;
        }

        if(!re.test($("#user_id").val())){
            error("请输入（全数字）正确的学号！")
            return false;
        }

        if($("#password").val()==""){
            error("请输入密码！")
            return false;
        }

        if($("#name").val()==""){
            error("请输入姓名！")
            return false;
        }


        if($("#sex").val()==""){
            error("请输入性别！")
            return false;
        }

        return true;
    }
    function StidentList() {
        // //加载所点击功能模块
        $.get("../views/teacher_function/studentInformation/StidentList.jsp",function(data){
            $("#mian").html(data);
        });
    }
</script>