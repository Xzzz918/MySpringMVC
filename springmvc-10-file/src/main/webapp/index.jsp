<%@ page contentType="text/html;charset=UTF-8"%>
<html>
<body>
<h2>文件上传</h2>
<form action="${pageContext.request.contextPath}/upload" method="post" enctype="multipart/form-data">
    <label>
        名称
        <input type="text" name="username">
    </label><br/>
    <label>
        文件
        <input type="file" name="uploadedFile"><br/>
    </label>
    <input type="submit" value ="提交">
</form>
</body>
</html>
