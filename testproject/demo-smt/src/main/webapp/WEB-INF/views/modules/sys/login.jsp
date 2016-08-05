<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/WEB-INF/views/include/taglib.jsp" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<html lang="zh-CN">
<head>
    <base href="<%=basePath %>"/>
    <%@include file="/WEB-INF/views/include/head.jsp" %>
    <title>登录</title>
    <style type="text/css">
        <%@include file="/WEB-INF/views/include/loginstyle.css"%>
    </style>
    <script type="text/javascript">
        $(document).ready(function () {
            $("#loginForm").validate({
                messages: {
                    username: {required: "请填写用户名."},
                    password: {required: "请填写密码."}
                },
                errorLabelContainer: "#messageBox",
                errorPlacement: function (error, element) {
                    error.appendTo($("#loginError").parent());
                }
            });
        });
    </script>
</head>
<body>
<div class="container">
    <div class="row">
        <div class="col-md-12" style="margin-top: 150px">
            <form id="loginForm" class="form-signin" action="${ctx}/login" method="post">
                <h2 align="center">欢迎登陆后台</h2>

                <div class="form-group">
                    <label class="input-lable" for="userName">
                        登录名
                    </label>
                    <input type="text" id="userName" name="userName" value="${userName}"
                           class="input-block-level required"/>
                </div>
                <div class="form-group">
                    <label class="input-lable" for="password">
                        密码
                    </label>
                    <input type="password" id="password" name="password" value="${password}"
                           class="input-block-level required"/>
                </div>
                <div class="form-group">
                    <label for="rememberMe" title="下次不需要再登录">
                        <input type="checkbox" id="rememberMe" name="rememberMe" ${rememberMe ? 'checked' : ''}/>
                        记住我（公共场所慎用）</label>
                    <input class="btn btn-large btn-primary" type="submit" value="登 录"/>&nbsp;&nbsp;
                </div>
                <p>没有账号? &nbsp;<a href="${ctx}/register">点击注册</a></p>

            </form>
        </div>
    </div>
</div>
</body>
</html>
