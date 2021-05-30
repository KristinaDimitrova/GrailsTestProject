<%--
  Created by IntelliJ IDEA.
  User: stani
  Date: 5/25/2021
  Time: 2:43 PM
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta name="layout" content="main" />
</head>
<body>
<div id="create-user" class="content scaffold-create" role="main">
    <g:form resource="${this.user}" method="POST">
        <fieldset class="form">
            <f:all bean="user"/>
        </fieldset>
        <fieldset class="buttons">
            <g:submitButton name="create" class="save" value="Create" />
        </fieldset>
    </g:form>
</div>
</body>
</html>