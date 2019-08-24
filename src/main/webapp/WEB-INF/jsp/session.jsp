
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>session的使用</title>
</head>
<body>
    <h1>单个属性</h1>
    <p>${sessionScope.uid}</p>
    <p>${sessionScope.name}</p>
    <h1>对象形式</h1>
    ${sessionScope.user.uid}
    ${sessionScope.user.name}
</body>
</html>
