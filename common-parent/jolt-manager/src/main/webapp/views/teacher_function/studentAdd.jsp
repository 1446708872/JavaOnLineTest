<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!-- information -->
<div class="inf-lside">
    <table>
        <%--onclick="studentAdd(this,添加班级)"--%>
        <tr>
            <td><span>班级信息添加：</span><input type="button" onclick='studentAdd(this,"添加班级","studentAdd")' id="addClass" value="添加班级"></td>
        </tr>
        <tr>
            <td><span>班级信息修改：</span><input type="button" onclick='studentAdd(this,"修改班级信息","studentAdd")' id="updateClass" value="修改班级信息"></td>
        </tr>
        <tr>
            <td>
                <form id="itemsFrom" method="post"  enctype="multipart/form-data">
                    <span>导入学生表格：<input type="file"style="padding-top: 7px" onchange="change()" name="excel" id="file"></span><br/>
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
            <td><span>添加单个学生：</span><input type="button" onclick='studentAdd(this,"添加学生","studentAdd")' id="addStudent" value="添加学生"></td>
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
                    if(data=="插入成功！"){
                        tips(data)
                        $("#file").val("")
                        return;
                    }
                    error(data)
                    $("#file").val("")
                }
            });
        }
    }

</script>