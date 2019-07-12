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
                <td colspan="2">内容&nbsp;&nbsp;&nbsp;：<span><textarea  style="height: 100px;width: 900px" id="introduce" name="introduce"></textarea></span></td>
            </tr>
            <tr>
                <td>选择A：<span><textarea  style="margin: 0px; width: 364px; height: 59px;" id="a" name="a"></textarea></span></td>
                <td>选择B：<span><textarea  style="margin: 0px; width: 364px; height: 59px;" id="b" name="b"></textarea></span></td>
            </tr>
            <tr>
                <td>选择C：<span><textarea  style="margin: 0px; width: 364px; height: 59px;" id="c" name="c"></textarea></span></td>
                <td>选择D：<span><textarea  style="margin: 0px; width: 364px; height: 59px;" id="d" name="d"></textarea></span></td>
            </tr>
            <tr>
                <td>
                    答案&nbsp;&nbsp;&nbsp;：
                    <select name="answer" style="height: 30px;width: 135px" id="answer">
                        <option id="sa" value ="a">a</option>
                        <option id="sb" value ="b">b</option>
                        <option id="sc" value ="c">c</option>
                        <option id="sd" value ="d">d</option>
                    </select>
                </td>
                <td><input style="margin-left: 80px" type="button" id="changePasswordFrom" value="修改选择题"></td>
            </tr>
        </table>
    </form>
</div>
<button type="button" id="sub" class="inf-rside" onclick="choiceList(this)">返回</button>

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
            $("#choice_id").val(data.choice_id)

            switch (data.answer) {
                case "a":
                    $("#sa").attr("SELECTED","SELECTED")
                    break;
                case "b":
                    $("#sb").attr("SELECTED","SELECTED")
                    break;
                case "c":
                    $("#sc").attr("SELECTED","SELECTED")
                    break;
                case "d":
                    $("#sd").attr("SELECTED","SELECTED")
                    break;
            }
        }
    })

    $("#changePasswordFrom").click(function () {
        none()
        if(cleck()){
            $.ajax({
                type: "post",
                url: "${pageContext.request.contextPath}/lib/updateChoice.do",
                data:$("#PasswordFrom").serialize(),
                success: function (data) {
                    if(data=="true"){
                        tips("修改成功！")
                        $("#introduce").val("")
                        $("#a").val("")
                        $("#b").val("")
                        $("#c").val("")
                        $("#d").val("")
                        $("#answer").val("")
                        $("#sub").click()
                    }else {
                        error("修改失败您输入的题目已存在！")
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

        if($("#a").val()==""){
            error("请输入选项！")
            return false;
        }

        if($("#b").val()==""){
            error("请输入选项！")
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
