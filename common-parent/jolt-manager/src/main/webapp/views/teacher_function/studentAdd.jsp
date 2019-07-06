<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!-- information -->
<div class="inf-lside">
    <table>
        <%--onclick="studentAdd(this,添加班级)"--%>
        <tr>
            <td><span>班级信息添加：</span><input type="button" onclick='studentAdd(this,"添加班级")' id="addClass" value="添加班级&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"></td>
        </tr>
        <tr>
            <td><span>添加单个学生：</span><input type="button" onclick='studentAdd(this,"添加学生")' id="addStudent" value="添加学生&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"></td>
        </tr>
        <tr>
            <td>
                <form id="itemsFrom" method="post"  enctype="multipart/form-data">
                    <span>导入学生表格：<input type="file"style="padding-top: 7px" onchange="change()" name="excel" id="file"></span>
                    <span style="display: none;color: red" id="error">
                            错误提示：<span id="error_val" style="color: red"></span>
                    </span>
                    <span style="display: none" id="tips">
                        友好提示：<span id="tips_val" style="color: blue"></span>
                    </span>
                </form>
            </td>
        </tr>
        <tr>
            <td><span>导出学生表格：</span><input type="button" onclick='studentAdd(this,"导出学生")' id="inportStudent" value="导出学生&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"></td>
        </tr>
    </table>
</div>

<script>
    function onchange() {
        var file = $("#file").val();
        // var strFileName=file.replace(/^.+?\\([^\\]+?)(\.[^\.\\]*?)?$/gi,"$1");  //正则表达式获取文件名，不带后缀
        var FileExt=file.replace(/.+\./,"");
        if(FileExt =="xlsx"||FileExt =="xls") return true;
        $("#file").val("")
        $("#error").show()
        error("您输入的不是EXCEL文件！")
        return false;
    }
    function change() {
        none()
        if(onchange()){
            var formData = new FormData(document.getElementById("itemsFrom"));
            $.ajax({
                url : '${pageContext.request.contextPath}/user/userFile.do',
                type : "post",
                data :formData,
                async : false,
                cache : false,
                dataType : "json",
                contentType : false,
                processData : false,
                success : function(data){
                    if(data=="true"){
                        tips("提交成功")
                    }
                }
            });
        }
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