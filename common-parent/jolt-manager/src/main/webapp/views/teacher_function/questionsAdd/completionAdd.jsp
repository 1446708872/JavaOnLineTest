<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!-- information -->
<div class="inf-lside" >
    <form id="PasswordFrom">
        <table>
            <tr style="display: none" id="error">
                <td style="color: red">错误提示：<span id="error_val" style="color: red"></span></td>
            </tr>
            <tr style="display: none" id="tips">
                <td>友好提示：<span id="tips_val" style="color: blue"></span></td>
            </tr>
            <tr>
                <td>试题内容：<span><textarea style="height: 200px;width: 848px" id="introduce" name="introduce"></textarea></span></td>
            </tr>
            <tr>
                <td>试题答案：<span><textarea style="height: 200px;width: 848px" id="answer" name="answer"></textarea></span></td>
            </tr>
            <tr>
                <td>
                    分类&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;：
                    <select name="problem_id" style="height: 30px;width: 135px" id="problem_id">
                    </select>
                </td>
            </tr>
            <tr>
                <td><input style="margin-left: 80px" type="button" id="changePasswordFrom" value="添加填空题"></td>
            </tr>
        </table>
    </form>
</div>
<button type="button" class="inf-rside" onclick="side_na(this,0)" id="questionsAdd">返回</button>

<script>
    $.ajax({
        type: "post",
        url: "${pageContext.request.contextPath}/lib/addLibraryList.do",
        success: function (data) {
            var size = '<option value ="" SELECTED>请选择</option>'
            for(var i=0; i<data.length;i++){
                size +='<option value ="'+data[i].problem_id+'">'+data[i].introduce+'</option>'
            }
            $("#problem_id").html(size)
        }
    })

    $("#changePasswordFrom").click(function () {
        none()
        if(cleck()){
            $.ajax({
                type: "post",
                url: "${pageContext.request.contextPath}/lib/addCompletion.do",
                data:$("#PasswordFrom").serialize(),
                success: function (data) {
                    if(data=="true"){
                        tips("添加成功！")
                        $("#introduce").val("")
                        $("#answer").val("")
                    }else {
                        error("添加失败您输入的分类已存在！")
                    }
                }
            })
        }
    })

    function cleck() {
        if($("#introduce").val()==""){
            error("请输入选择题内容！")
            return false;
        }

        if($("#answer").val()==""){
            error("请输入答案！")
            return false;
        }

        if($("#problem_id").val()==""){
            error("请选择分类！")
            return false;
        }
        return true;
    }
</script>