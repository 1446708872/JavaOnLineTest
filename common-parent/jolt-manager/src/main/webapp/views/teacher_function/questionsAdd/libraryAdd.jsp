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
                <td colspan="2">分类名称：<span><input type="text" id="introduce" name="introduce" maxlength="16"></span></td>
            </tr>
            <tr>
                <td><input style="margin-left: 80px" type="button" id="changePasswordFrom" value="添加分类"></td>
            </tr>
        </table>
    </form>
</div>
<button type="button" class="inf-rside" onclick="side_na(this,0)" id="questionsAdd">返回</button>

<script>
    $("#changePasswordFrom").click(function () {
        none()
        if(cleck()){
            $.ajax({
                type: "post",
                url: "${pageContext.request.contextPath}/lib/addLibrary.do",
                data:$("#PasswordFrom").serialize(),
                success: function (data) {
                    $("#introduce").val("")
                    if(data=="true"){
                        tips("添加成功！")
                    }else {
                        error("添加失败您输入的分类已存在！")
                    }
                }
            })
        }
    })

    function cleck() {
        if($("#introduce").val()==""){
            error("请输入班级年级！")
            return false;
        }
        return true;
    }
</script>