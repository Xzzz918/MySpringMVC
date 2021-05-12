<%--
  Created by IntelliJ IDEA.
  User: gemini
  Date: 2021/5/12
  Time: 19:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8"%>
<html>
<head>
    <title>Title</title>
</head>

<h1>登录页面</h1>
<hr>

<body>
<form action="${pageContext.request.contextPath}/user/login">
    <label>
        用户名：
        <input type="text" name="username">
    </label> <br>
    <label>
        密码：
        <input type="password" name="pwd">
    </label> <br>
<%--    是submit不是button--%>
    <input type="submit" value="提交">
</form>
</body>
</html>
