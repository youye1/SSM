<%--
  Created by IntelliJ IDEA.
  User: pc
  Date: 2016/7/11
  Time: 16:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/WEB-INF/views/includes/taglibs.jsp" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<html lang="zh-CN">
<head>
    <base href="<%=basePath %>"/>
    <title>Title</title>
</head>
<body>
<h3>hhhhhhhhh</h3>
${msg}
<p></p>
</body>
</html>
