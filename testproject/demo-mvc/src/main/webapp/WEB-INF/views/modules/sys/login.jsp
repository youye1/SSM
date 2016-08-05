<%--
  Created by IntelliJ IDEA.
  User: pc
  Date: 2016/7/12
  Time: 15:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/WEB-INF/views/include/taglib.jsp" %>
<html>
<head>
    <title>登录</title>

</head>
<body>
${msg}
<form action="${ctx}/login" method="post">
    <p>账户：<input type="text" id="name" name="name"/></p>
    <p>密码：<input type="password" id="password" name="password"/></p>
    <input type="submit" value="登录"/>
</form>
</body>
</html>
