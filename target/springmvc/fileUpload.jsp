<%--
  Created by IntelliJ IDEA.
  User: lanter
  Date: 2017/9/21
  Time: 18:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <fieldset>
        <legend>文件上传</legend>
        <form action="/upload" method="post" enctype="multipart/form-data">
            <input type="file" name="file"></br>
            <input type="submit" value="提交"/>
        </form>
    </fieldset>
</body>
</html>
