<%@ include file="/WEB-INF/jsps/templates/header.jsp" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>

     <!-- MAIN CONTAINER -->
	  <div class="container">
	  	<div class="page-header">
	  		<h1>Admin page</h1>
	  		<p>Here you can admin the site</p>
	  	</div>
	  	
	  	<h3><a href= "<c:url value="/admin/productInventory"/>" >Product inventory</a></h3>
		
		<p>Here you can check and modify your products!</p>
		
<%@ include file="/WEB-INF/jsps/templates/footer.jsp" %>	