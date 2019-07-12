<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!-- information -->
<div class="inf-lside" >
    <form id="PasswordFrom">
        <input type="hidden" name="completion_id" id="completion_id">
        <table>
            <tr style="display: none" id="error">
                <td style="color: red">错误提示：<span id="error_val" style="color: red"></span></td>
            </tr>
            <tr style="display: none" id="tips">
                <td>友好提示：<span id="tips_val" style="color: blue"></span></td>
            </tr>
            <tr>
                <td>试题题目：<span><textarea textarea disabled style="height: 100px;width: 848px"  id="subject" name="subject"></textarea></span></td>
            </tr>
            <tr>
                <td>试题内容：<span><textarea style="height: 200px;width: 848px"  id="introduce" name="answer"></textarea></span></td>
            </tr>
            <tr>
                <td><input style="margin-left: 80px" type="button" id="changePasswordFrom" value="提交答案"></td>
            </tr>
        </table>
    </form>
</div>
<button type="button" class="inf-rside" onclick="choiceList(this)">返回</button>

<script>
    function choiceList(obj) {
        $.get("../views/student_function/classification/completionList.jsp",function(data){
            $("#mian").html(data);
        });
    }

    $.ajax({
        url : '${pageContext.request.contextPath}/lib/getCompletion.do',
        type : "post",
        data:{"id":$("#hidden").val()},
        success: function (data) {
            $("#hidden").val(data.problem_id)
            $("#subject").val(data.subject)
            $("#introduce").val(data.introduce)
            $("#completion_id").val(data.completion_id)
        }
    })

    $("#changePasswordFrom").click(function () {
        none()
        if(cleck()){
            $.ajax({
                type: "post",
                url: "${pageContext.request.contextPath}/lib/submitCompletion.do",
                data:$("#PasswordFrom").serialize(),
                success: function (data) {
                    if(data=="true"){
                        tips("恭喜您做对了！")
                    }else {
                        error("抱歉，您的答案错误！")
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
        return true;
    }
</script>