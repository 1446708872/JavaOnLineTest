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
                <td>试题题目：<span><textarea style="height: 100px;width: 848px" disabled id="subject" name="subject"></textarea></span></td>
            </tr>
            <tr>
                <td>试题内容：<span><textarea style="height: 200px;width: 848px" disabled id="introduce" name="introduce"></textarea></span></td>
            </tr>
            <tr>
                <td>试题答案：<span><textarea style="height: 200px;width: 848px" disabled id="answer" name="answer"></textarea></span></td>
            </tr>
        </table>
    </form>
</div>
<button type="button" class="inf-rside" onclick="choiceList(this)">返回</button>

<script>
    function choiceList(obj) {
        $.get("../views/teacher_function/questionsInformation/completionList.jsp",function(data){
            $("#mian").html(data);
        });
    }

    $.ajax({
        url : '${pageContext.request.contextPath}/lib/getCompletion.do',
        type : "post",
        data:{"id":$("#hidden").val()},
        success: function (data) {
            $("#hidden").val(data.completion_id)
            $("#subject").val(data.subject)
            $("#introduce").val(data.introduce)
            $("#answer").val(data.answer)
        }
    })
</script>