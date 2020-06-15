<%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 2020/6/10
  Time: 14:45
  To change this template use File | Settings | File Templates.
--%>
<%
    String path=request.getContextPath();
    String basePath=request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
    pageContext.setAttribute("basePath",basePath);
%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户管理</title>
    <style>
        .first{
            width: 50%;
            float:left;
            height: 100px;
            border: 1px ;
        }
        .second {
            width: 50%;
            float:left;
            height: 100px;
            border: 1px ;
        }
    </style>
</head>
<body>
<div style="text-align: center">
    <form action="${basePath}user/saveUser" method="post">
        <span>姓名：</span><input type="text" name="name" value="${user.name}"><br>
        <span>年龄：</span><input type="text" name="age" value="${user.age}"><br>
        <span>地址：</span><input type="text" name="address" value="${user.address}"><br>
        <input type="submit" value="提交">
    </form>
</div>
<div style="text-align: center">
    <form action="${basePath}user/deleteUser" method="post">
        <span>用户id：</span><input type="text" name="id" value="${user.id}">
        <input type="submit" value="删除">
    </form>
</div>
<div>
    <form action="${basePath}user/selectUserByName" method="post">
        <span>用户名：</span><input type="text" name="name" value="${user.name}">
        <input type="submit" value="搜索">
    </form>
    <!--<form action="${basePath}user/selectUserById" method="post">
        <span>用户名：</span><input type="text" name="id" value="${user.id}">
        <input type="submit" value="搜索">
    </form>-->

    <form action="${basePath}user/updateUser" method="post">
        <span>用 户 名：</span><input type="text" name="name" value="${user.name}"><br>
        <span>修改地址为：</span><input type="text" name="address" value="${user.address}">
        <input type="submit" value="修改">
    </form>
</div>
</body>
</html>
