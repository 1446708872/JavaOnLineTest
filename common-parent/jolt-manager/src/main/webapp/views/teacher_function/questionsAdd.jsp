<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!-- information -->
<div class="inf-lside">
    <table>
        <%--onclick="studentAdd(this,添加班级)"--%>
        <tr>
            <td><span>添加选择题：</span><input type="button" onclick='studentAdd(this,"添加选择题","questionsAdd")' id="choiceAdd" value="添加选择题"></td>
        </tr>
        <tr>
            <td><span>添加编程题：</span><input type="button" onclick='studentAdd(this,"添加编程题","questionsAdd")' id="completionAdd" value="添加编程题"></td>
        </tr>
        <tr>
            <td><span>修改题分类：</span><input type="button" onclick='studentAdd(this,"修改题分类","questionsAdd")' id="updataLibrary" value="修改题分类"></td>
        </tr>
        <tr>
            <td><span>添加题分类：</span><input type="button" onclick='studentAdd(this,"添加题分类","questionsAdd")' id="libraryAdd" value="添加题分类"></td>
        </tr>
    </table>
</div>
