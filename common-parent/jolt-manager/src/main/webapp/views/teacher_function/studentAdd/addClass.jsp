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
                <td>班级年级：<span><input type="text" id="class_age" name="class_age" maxlength="16" ></span></td>
            </tr>
            <tr>
                <td>专业名称：<span><input type="text" id="class_major" name="class_major" maxlength="16"></span></td>
            </tr>
            <tr>
                <td><input style="margin-left: 80px" type="button" id="changePasswordFrom" value="添加班级&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"></td>
            </tr>
        </table>
    </form>
</div>
<button type="button" class="inf-rside" onclick="side_na(this,0)" id="studentAdd">返回</button>
<script>
    $("#changePasswordFrom").click(function () {
        none()
        if(cleck()){
            $.ajax({
            type: "post",
            url: "${pageContext.request.contextPath}/stu/addClass.do",
            data:$("#PasswordFrom").serialize(),
            success: function (data) {
                $("#class_age").val("")
                $("#class_major").val("");
                if(data=="true"){
                    tips("添加成功！")
                }else {
                    error("添加失败您输入的班级已存在！")
                }
            }
            })
        }
    })
    function cleck() {
        if($("#class_age").val()==""){
            error("请输入班级年级！")
            return false;
        }

        if($("#class_major").val()==""){
            error("请输入专业名称！")
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