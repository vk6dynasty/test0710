<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/7/10
  Time: 21:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <script type="text/javascript">
        $(function(){
            $("form").submit(function(){
                //验证信息
                var str=$("[name='cid']").val();
                if(str=='请选择'){
                    alert("请选择分类");
                    return false;
                }
                var title=$("[name='title']").val();
                if($.trim(title).length==0){
                    alert("请填写标题");
                    return false;
                }
                var content=$("[name='content']").val();
                if($.trim(content).length==0){
                    alert("请填写内容");
                    return false;
                }
                return true;
            });
        })
    </script>
</head>
<body>
<form action="addknow" method="post">
    分类:
    <select name="classid" >
        <option>请选择</option>
        <c:forEach items="${clazz}" var="c">
            <option value="${c.id}">${c.cname}</option>
        </c:forEach>
    </select><br>
    标题:<input type="text" name="title"><br>
    内容:<textarea rows="5" cols="20" name="content"></textarea> <br>
    <input type="submit" value="add">
</form>
</body>
</html>
