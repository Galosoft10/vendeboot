<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ include file="/WEB-INF/jsps/templates/header.jsp" %>

	<div class="container-wrapper">
		<div class="container">
			
			<div class="page-header">
				<h1>Register customer Success</h1>
				<p class="leader">Register successfully</p>
			</div>
			
			<div class="container-warpper">
				<p>
				  <a href= "<spring:url value="/product/productList" />" >Products</a>
			    </p>
			</div>
			
			
		</div>
    </div>

<%@ include file="/WEB-INF/jsps/templates/footer.jsp" %>