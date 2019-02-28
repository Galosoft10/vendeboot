<%@ include file="/WEB-INF/jsps/templates/header.jsp" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
        
        <div class="container-wrapper">
        	<div class="container">
        		<div class="page-header">
        			<h2>All Product</h2>
        			<p>Here you can check the products</p>
        		</div>
		        <table class="table table-striped table-hover">
					<tr>
					    <th>Image</th>
						<th>Name</th>
						<th>Category</th>
						<th>Condition</th>
						<th>Price</th>
						<th></th>
					</tr>
					
					<c:forEach items="${products}"  var="product">
					<tr>
					    <td><img src="${pageContext.request.contextPath}/resources/imgs/${product.productId}.png" 
			             style="width:80px; height:120px"/></td>
						<td>${product.productName}</td>
						<td>${product.productCategory}</td>
						<td>${product.productCondition}</td>
						<td>${product.productPrice}</td>
						<td><a href="<spring:url value="/product/viewProduct/${product.productId}"/>">
					     <span class="glyphicon glyphicon-info-sign"></span></a></td>
					</tr>
					</c:forEach>
			    </table>
	      </div>
        </div> 
<%@ include file="/WEB-INF/jsps/templates/footer.jsp" %>         