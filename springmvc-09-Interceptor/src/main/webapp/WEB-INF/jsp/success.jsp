<%--
  Created by IntelliJ IDEA.
  User: gemini
  Date: 2021/5/12
  Time: 19:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8"%>
<html>
<head>
    <title>Title</title>
</head>
<body>

<h1>登录成功页面</h1>

${user}
<a href="${pageContext.request.contextPath}/user/logout">注销</a>
</body>
</html>
