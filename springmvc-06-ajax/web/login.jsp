<%--
  Created by IntelliJ IDEA.
  User: zyq
  Date: 2020/3/18
  Time: 下午4:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="${pageContext.request.contextPath}/statics/js/jquery-3.4.1.js"></script>
    <script>
        function a1() {
          $.post("${pageContext.request.contextPath}/a3", {"name": $("#name").val()}, function (data) {
            $("#userInfo").html(data)
            if (data.toString() === 'ok')
              $("#userInfo").css("color", "green")
            else
              $("#userInfo").css("color", "red")
          })
        }
        function a2() {
          $.post("${pageContext.request.contextPath}/a3", {"pwd": $("#pwd").val()}, function (data) {
            $("#pwdInfo").html(data)
            if (data.toString() === 'ok')
              $("#pwdInfo").css("color", "green")
            else
              $("#pwdInfo").css("color", "green")
          })
        }
    </script>
</head>
<body>
<p>
    用户名: <input type="text" id="name" onblur="a1()">
    <span id="userInfo"></span>
</p>
<p>
    密码: <input type="text" id="pwd" onblur="a2()">
    <span id="pwdInfo"></span>
</p>
</body>
</html>
