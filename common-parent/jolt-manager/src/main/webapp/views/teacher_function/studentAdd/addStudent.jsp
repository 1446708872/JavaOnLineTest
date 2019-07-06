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
                    班级：<span>
                    <select name="user_class" style="height: 30px; width: 135px" id="user_class">
                    </select>
                    </span>
                    性别：<span>
                    <select name="sex" style="height: 30px;width: 135px" id="sex">
                        <option value ="" SELECTED>请选择</option>
                        <option value ="男">男</option>
                        <option value ="女">女</option>
                    </select>
                </span>
                </td>
            </tr>
            <tr>
                <td>
                    <input style="margin-left: 43px" type="button" id="changePasswordFrom" value="添加学生&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;">
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

<button type="button" class="inf-rside" onclick="side_na(this,0)" id="studentAdd">返回</button>

<script>

    $.ajax({
    type: "post",
    url: "${pageContext.request.contextPath}/user/getClass.do",
    success: function (data) {
        var size = '<option value ="" SELECTED>请选择</option>'
        for(var i=0; i<data.length;i++){
            size +='<option value ="'+data[i].class_user+'" SELECTED>'+data[i].class_age+data[i].class_major+'</option>'
        }
        $("#user_class").html(size)
    }
    })

    $("#changePasswordFrom").click(function () {
        none()
        if(cleck()){
            $.ajax({
                type: "post",
                url: "${pageContext.request.contextPath}/user/addUser.do",
                data:$("#PasswordFrom").serialize(),
                success: function (data) {
                    $("#user_id").val("")
                    $("#password").val("");
                    $("#name").val("");
                    if(data=="true"){
                        tips("添加成功！")
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

        if($("#user_class").val()==""){
            error("请输入班级！")
            return false;
        }

        if($("#sex").val()==""){
            error("请输入性别！")
            return false;
        }

        return true;
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
</script>