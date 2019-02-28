<%@ include file="/WEB-INF/jsps/templates/header.jsp" %>
        
        <div class="container-wrapper">
        	<div class="container"  ng-app="cartApp">
        		<div class="page-header">
        			<h2>Product</h2>
        			<p>Here you can check the products</p>
        		</div>
        		
        		<div class="col-md-5" >
        			<img src="${pageContext.request.contextPath}/resources/imgs/${product.productId}.png" 
			             style="width:100%; height:100%"/>
        		</div>
        		
        		<div class="col-md-5">
        		 	<h2>Product:<b>${product.productName}</b></h2>
        		 	<p>Description:${product.productDescription}</p>
        		 	<p>Manufacturer:${product.productManufacturer}</p>
        		 	<p><b>Price:${product.productPrice}</b></p>
        		 	<br/>
	  		   		
					<c:set var="role" scope="page" value="${param.role}"/>
					<c:set var="url" scope="page" value="/product/productList"/>
					<c:if test="${role=='admin'}">
						<c:set var="url" scope="page" value="/admin/productInventory"/>
					</c:if>
						
					<p ng-controller="cartCtrl">
						 <a href="#" ng-click="testCart()" class="btn btn-warning">Test Angular</a>
						 <a href="<c:url value="${url}"/>" class="btn btn-primary">Back</a>
						 <a href="#" ng-click="addToCart('${product.productId}')" class="btn btn-success">Order Now</a>
						<a href= "<spring:url value="/customer/cart" />" class="btn btn-default" >View Cart</a>
					</p> 
        		</div>
		        
	      </div>
        </div> 
<%@ include file="/WEB-INF/jsps/templates/footer.jsp" %> 