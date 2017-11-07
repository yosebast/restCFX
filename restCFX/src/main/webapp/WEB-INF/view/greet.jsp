<%@include file="/Commons/Header.jsp" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

...
<c:out value="${message}"/>

<form:form method="post" action="greet" enctype="multipart/form-data" commandName="fileFormBean">
    <table>
        <tr>
           <td>Selecciona fichero: </td>
           <td><input type="file" name="fichero" /></td>
        </tr>
        <tr>
    
        </tr>
        <tr><td colspan="2" align="center">
    	<input type="submit" value="Subir fichero"></td>
        </tr>
     </table>
</form:form>
