<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/7/18
  Time: 20:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>文件上传</h1>

    <form action="/controller/fileloadTest" method="post" enctype="multipart/form-data">
        选择文件:<input type="file" name="upload" /><br/>
        <input type="submit" name="上传" />
    </form>

</body>
</html>
