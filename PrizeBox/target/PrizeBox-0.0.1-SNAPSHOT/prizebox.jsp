<%@taglib uri="http://www.springframework.org/tags/form" prefix="myForm" %>

Welcome To Prize Box<br>
Enter The Amount<br>

<myForm:form action="showPrize.form" method="get" modelAttribute="inputCmd"> 
 <table>
<tr> <td> Enter Number: </td> <td> <myForm:input path="number"/></td>  </tr>

<tr> <td colspan="3"  align="center"><input type="submit" value="login"/></td></tr>
</table>
</myForm:form> 
