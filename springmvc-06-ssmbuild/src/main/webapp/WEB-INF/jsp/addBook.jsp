<%--
  Created by IntelliJ IDEA.
  User: gemini
  Date: 2021/5/9
  Time: 16:34
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8"%>

<html>
<head>
    <title>新增书籍</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!-- 引入 Bootstrap -->
    <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container">

    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    <small>新增书籍</small>
                </h1>
            </div>
        </div>
    </div>
    <form action="${pageContext.request.contextPath}/book/addBook" method="post">
        <label>
            书籍名称：
            <input type="text" name="bookName">
        </label><br><br><br>
        <label>
            书籍数量：
            <input type="text" name="bookCounts">
        </label><br><br><br>
        <label>
            书籍详情：
            <input type="text" name="detail">
        </label><br><br><br>
        <input type="submit" value="添加">
    </form>

</div>
</body>
</html>
