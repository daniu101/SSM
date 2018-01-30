<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page import="java.util.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>庆余资本首页</title>
<style type="text/css">
table {
    border-collapse: collapse;
    border: 1px solid black;
}
 
td, th {
    border: 1px solid black;
}
 
tr:nth-child(even) {
    background: #eee;
}
</style>
</head>
 
<body>
<center>
<table>
    <tr>
        <th>机构名称</th>
        <th>产品名称</th>
        <th>tag1</th>
        <th>tag2</th>
        <th>tag3</th>
        <th>认购起点</th>
        <th>投资期限</th>
        <th>前端佣金</th>
        <th>后端佣金</th>
        <th>投资进度</th>
        <th>收藏</th>
        <th>查看</th>
        
    </tr>
<c:forEach var="product" items="${productList}">
<tr>
<td><c:out value="${product.issuer}"/></td>
<td><c:out value="${product.tittle}"/></td>
<td><c:out value="${product.tag1}"/></td>
<td><c:out value="${product.tag1}"/></td>
<td><c:out value="${product.tag1}"/></td>
<td><c:out value="${product.substart}"/></td>
<td><c:out value="${product.investterm}"/></td>
<td><c:out value="${product.fundfront}"/></td>
<td><c:out value="${product.fundblack}"/></td>
<td><c:out value="${product.process}"/></td>
<td><c:out value="${product.collection}"/></td>
<td><c:out value="${product.see}"/></td>
</tr>
</c:forEach>
</table>
 
</center>
</body>
</html>