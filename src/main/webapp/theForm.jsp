<%@page import="org.leleuj.WebUtils"%>
<%@page import="io.buji.pac4j.*"%>
<%@page import="org.pac4j.http.client.*"%>
<%
	FormClient formClient = WebUtils.getObject(pageContext, FormClient.class, "formClient");
%>
<form action="<%=formClient.getCallbackUrl()%>" method="POST">
	<input type="text" name="username" value="" />
	<p />
	<input type="password" name="password" value="" />
	<p />
	<input type="submit" name="submit" value="Submit" />
</form>
