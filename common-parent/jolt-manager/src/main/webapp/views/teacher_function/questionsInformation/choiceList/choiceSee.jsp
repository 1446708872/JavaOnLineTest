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
                <td colspan="2">内容&nbsp;&nbsp;&nbsp;：<span><textarea disabled style="height: 100px;width: 917px" id="introduce" name="introduce"></textarea></span></td>
            </tr>
            <tr>
                <td>选择A：<span><textarea disabled style="margin: 0px; width: 364px; height: 59px;" id="a" name="a"></textarea></span></td>
                <td>选择B：<span><textarea disabled style="margin: 0px; width: 364px; height: 59px;" id="b" name="b"></textarea></span></td>
            </tr>
            <tr>
                <td>选择C：<span><textarea disabled style="margin: 0px; width: 364px; height: 59px;" id="c" name="c"></textarea></span></td>
                <td>选择D：<span><textarea disabled style="margin: 0px; width: 364px; height: 59px;" id="d" name="d"></textarea></span></td>
            </tr>
            <tr>
                <td>
                    答案&nbsp;&nbsp;&nbsp;：<span id="answer"></span>
                </td>
            </tr>
        </table>
    </form>
</div>
<button type="button" class="inf-rside" onclick="choiceList(this)">返回</button>

<script>
    function choiceList(obj) {
        $.get("../views/teacher_function/questionsInformation/choiceList.jsp",function(data){
            $("#mian").html(data);
        });
    }

    $.ajax({
        url : '${pageContext.request.contextPath}/lib/getChoice.do',
        type : "post",
        data:{"id":$("#hidden").val()},
        success: function (data) {
            $("#hidden").val(data.problem_id)
            $("#introduce").val(data.introduce)
            $("#a").val(data.a)
            $("#b").val(data.b)
            $("#c").val(data.c)
            $("#d").val(data.d)
            $("#answer").html(data.answer)
        }
    })
</script>
