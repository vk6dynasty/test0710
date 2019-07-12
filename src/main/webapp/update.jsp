<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/7/10
  Time: 22:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<script type="text/javascript" src="js/jquery.js"></script>
<script type="text/javascript">
    $(function(){
        $("[value='删除']").click(function(){
            var kid=$("[name='id']").val();
            location.href="delete?id="+kid;
        });
    });
</script>
<html>
<head>
    <script type="text/javascript">
        $(function(){
            $("[value='删除']").click(function(){
                var kid=$("[name='id']").val();
                location.href="delete?id="+kid;
            });
        });
    </script>
</head>
<body>
<form action="update" method="post">
    <input type="hidden" name="id" value="${know.id}">
    分类:
    <select name="classid" >
        <c:forEach items="${clist}" var="c">
            <option value="${c.id}"  ${c.id==know.classes.id?"selected":""}>${c.cname}</option>
        </c:forEach>
    </select><br>
    标题:<input type="text" name="title" value="${know.title}"><br>
    内容:<textarea rows="5" cols="20" name="content">${know.content}</textarea> <br>
    最后修改时间:<fmt:formatDate value="${know.lastmodified}" pattern="yyyy-MM-dd hh:mm:ss"></fmt:formatDate> <br>
    <input type="submit" value="更新">
    <input type="button" value="删除">
</form>
</body>
</body>
</html>
