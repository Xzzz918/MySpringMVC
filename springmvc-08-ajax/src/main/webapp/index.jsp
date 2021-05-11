<html>
<body>
<script src="${pageContext.request.contextPath}statics/js/jquery-3.6.0.js"></script>
<script>
    function a1(){
        $.post({
            url:"${pageContext.request.contextPath}/a1",
            data:{'name':$("#txtName").val()},
            success:function (data,status) {
                alert(data);
                alert(status);
            }
        });
    }
</script>
<%--onblur：失去焦点触发事件--%>
<label for="txtName">用户名:</label><input type="text" id="txtName" onblur="a1()"/>
</body>
</html>
