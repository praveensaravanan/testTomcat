Congrats!!!<br>

You are successfully logged in.</br>
<form action="<%=request.getContextPath()%>/signout" method="get" name="signoutForm">
<a onclick="document.forms['signoutForm'].submit();" href="#"> signout </a>
</form><br>

<a href="<%=request.getContextPath()%>/successfullyLoggedIn" target="_blank" >successfullyLoggedIn Page </a>On clicking this link you will not be restricted by servlet as you have a login session.<br>
It is handled in the filter.