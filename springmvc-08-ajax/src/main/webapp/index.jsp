<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE HTML>
<html>
<body>
<script src="${pageContext.request.contextPath}/statics/js/jquery-3.6.0.js"></script>
<script>
    function a1(){
        jQuery.post({
            url:"${pageContext.request.contextPath}/a1",
            data:{'name':$("#txtName").val()},
            success:function (data,status) {
                // alert(data);
                // alert(status);
                console.log("data="+data);
                console.log("status="+status);
            },
            error:function () {
                
            }
        });
    }
</script>
<%--onblur：失去焦点触发事件--%>
<label for="txtName">用户名:</label><input type="text" id="txtName" onblur="a1()"/>
</body>
</html>
