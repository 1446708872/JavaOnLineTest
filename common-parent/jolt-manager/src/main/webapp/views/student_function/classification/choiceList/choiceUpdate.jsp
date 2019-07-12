<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!-- information -->
<div class="inf-lside" >
    <form id="PasswordFrom">
        <input type="hidden" id="choice_id" name="choice_id">
        <table>
            <tr style="display: none" id="error">
                <td style="color: red">错误提示：<span id="error_val" style="color: red"></span></td>
            </tr>
            <tr style="display: none" id="tips">
                <td>友好提示：<span id="tips_val" style="color: blue"></span></td>
            </tr>
            <tr>
                <td colspan="2">内容&nbsp;&nbsp;&nbsp;：<span><textarea disabled style="height: 100px;width: 900px" id="introduce" name="introduce"></textarea></span></td>
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
                    答案&nbsp;&nbsp;&nbsp;：
                    <select name="answer" style="height: 30px;width: 135px" id="answer">
                        <option value ="" SELECTED>请选择</option>
                        <option value ="a">a</option>
                        <option value ="b">b</option>
                        <option value ="c">c</option>
                        <option value ="d">d</option>
                    </select>
                </td>
                <td><input style="margin-left: 80px" type="button" id="changePasswordFrom" value="提交答案"></td>
            </tr>
        </table>
    </form>
</div>
<button type="button" id="sub" class="inf-rside" onclick="choiceList(this)">返回</button>

<script>
    function choiceList(obj) {
        $.get("../views/student_function/classification/choiceList.jsp",function(data){
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
            $("#choice_id").val(data.choice_id)

        }
    })

    $("#changePasswordFrom").click(function () {
        none()
        if(cleck()){
            $.ajax({
                type: "post",
                url: "${pageContext.request.contextPath}/lib/submitChoice.do",
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

        if($("#answer").val()==""){
            error("请输入答案！")
            return false;
        }

        return true;
    }
</script>
