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
                <td colspan="2">题库编号：<span><input type="text" id="problem_id" name="problem_id" onblur="change()" maxlength="16" ></span></td>
            </tr>
            <tr>
                <td colspan="2">分类名称：<span><input type="text" id="introduce" name="introduce" maxlength="16"></span></td>
            </tr>
            <tr>
                <td><input style="margin-left: 80px" type="button" id="changePasswordFrom" value="修改分类"></td>
            </tr>
        </table>
    </form>
</div>
<button type="button" class="inf-rside" onclick="side_na(this,0)" id="questionsAdd">返回</button>

<script>
    var bool = false;

    function change(){
        none()
        if($("#problem_id").val()==""){
            error("请输入班级编号！")
            return false;
        }
        bool =true;
        $.ajax({
            type: "post",
            url: "${pageContext.request.contextPath}/lib/getLibrary.do",
            data:{"problem_id":$("#problem_id").val()},
            success: function (data) {
                if(!data){
                    error("您输入的编辑编号不存在！")
                    $("#introduce").val("")
                    $("#introduce").attr("disabled","disabled")

                    return false;
                }
                $("#introduce").removeAttr("disabled");
                $("#introduce").val(data.introduce);
                return true;
            }
        })
    }

    $("#changePasswordFrom").click(function () {
        none()
        if(cleck()&&bool){
            $.ajax({
                type: "post",
                url: "${pageContext.request.contextPath}/lib/updateLibrary.do",
                data:$("#PasswordFrom").serialize(),
                success: function (data) {
                    $("#problem_id").val("")
                    $("#introduce").val("")
                    if(data=="true"){
                        tips("修改成功！")
                    }
                }
            })
        }
    })
    function cleck() {
        if($("#problem_id").val()==""){
            error("请输入分类编号！")
            return false;
        }

        if($("#introduce").val()==""){
            error("请输入分类内容！")
            return false;
        }
        return true;
    }
</script>