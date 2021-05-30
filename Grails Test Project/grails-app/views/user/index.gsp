<%--
  Created by IntelliJ IDEA.
  User: krisi
  Date: 5/25/2021
  Time: 2:41 PM
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
  <meta name="layout" content="main" />
</head>
<body>
<div class="nav" role="navigation">
  <ul>
    <li><g:link class="create" action="create">Create</g:link></li>
  </ul>
</div>
<div id="list-student" class="content scaffold-list" role="main">
  <f:table collection="${userList}"
           properties="['username']" />
</div>
</body>
</html>