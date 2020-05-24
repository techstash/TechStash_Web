<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>

<html>

<head>
	<title>Event Page</title>
	
	<!-- reference our style sheet -->

	<link type="text/css"
		  rel="stylesheet"
		  href="${pageContext.request.contextPath}/resources/css/style.css" />

</head>

<body>
		<input type="button" value="Add New Event" onclick="window.location.href='addnewevent';return false;" class="add-button" />
			<table>
				<tr>
					<th>Name</th>
					<th>Email</th>
					<th>Message</th>
				</tr>
				<!-- loop over and print our customers -->
				<c:forEach var="tempContactUs" items="${contactus}">
				
					<c:url var="updateLink" value="/admineventupdate" >
					
						<c:param name="eventId" value="${tempContactUs.id}" />
					</c:url>
					
					<c:url var="deleteLink" value="/admineventdelete" >
					
						<c:param name="eventId" value="${tempContactUs.id}" />
					</c:url>
				
					<tr>
						<td> ${tempContactUs.fullname} </td>
						<td> ${tempContactUs.email} </td>
						<td> ${tempContactUs.message} </td>
						
						<td> <a href="${updateLink}"> Update </a> 
						| 
						<a href="${deleteLink}" onclick="if(!(confirm('Are you sure you want to delete this customer ?'))) return false"> Delete </a>  </td>
					</tr>
				
				</c:forEach>
						
			</table>
				
	
	

</body>

</html>









