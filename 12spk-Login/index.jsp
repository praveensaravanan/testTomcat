<html><body>

<form action="login" method="get">
Enter user name<input type="text" name="userName"><br>
Enter password<input type="text" name="userPwd"><br>
same userName and password is considered as valid credentials.

<input type="submit" value="login"><br><br>

<a href="<%=request.getContextPath()%>/successfullyLoggedIn" target="_blank">successfullyLoggedIn Page </a> On clicking this link you will be redirected to login page as you dont have a login session created.<br>
It is not default behaviour of tomcat.It is handled in the filter.
