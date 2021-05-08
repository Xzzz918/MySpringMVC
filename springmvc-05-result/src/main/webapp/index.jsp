<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<body>
<h2>Hello World!</h2>
<%--在首页编写一个提交的表单--%>
<form action="<c:url value="/e/t"/>" method="post">
    <label>
        <input type="text" name="name">
    </label>
    <input type="submit">
</form>
</body>
</html>
