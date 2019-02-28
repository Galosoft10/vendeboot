<%@ include file="/WEB-INF/jsps/templates/header.jsp" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

     <!-- MAIN CONTAINER -->
	  <div class="container">
	  	<div class="page-header">
	  		<h1>Register Customer</h1>
	  		<p>Please fill all fields</p>
	  	</div>
	  	
	  	<form action="${pageContext.request.contextPath}/register" method="post">
	  	        <h3>Basic Info</h3>
		  		<div class="form-group">
		  		  <label forName="name">Name</label>
		  		  <input type="text" name="customerName" id="name" class="form-control"/>
		  		</div>
	  		
	  		    <div class="form-group">
					<label for="email">Email</label>
					<input type="text" name="customerEmail" id="customerEmail" class="form-control"></input>
				</div>
				
				<div class="form-group">
		  		  <label forName="phone">Phone</label>
		  		  <input type="text" name="customerPhone" id="customerPhone" class="form-control"/>
		  		</div>
				
				<div class="form-group">
						<label for="username">User Name</label>
						<input type="text" name="username" id="username" class="form-control"/>
				</div>
					
				<div class="form-group">
					<label for="password">Password</label>
					<input type="password" name="password" id="password" class="form-control"/>
				</div>
					
				<h2>Billig Address</h2>
				
					
				<div class="form-group">
					<label for="billingStreet">Street Name</label>
					<input type="text" name="billingAddress.streetName" id="billingStreet" class="form-control"/>
				</div>
					
				<div class="form-group">
					<label for="billingApartmentNumber">Apartment Number</label>
					<input type="text" name="billingAddress.apartmentNumber" id="billingApartmentNumber" class="form-control"/>
				</div>
					
				<div class="form-group">
					<label for="billingCity">City</label>
					<input type="text" name="billingAddress.city" id="billingCity" class="form-control"/>
				</div>
					
				<div class="form-group">
					<label for="billingState">State</label>
					<input type="text" name="billingAddress.state" id="billingState" class="form-control"/>
				</div>
					
				<div class="form-group">
					<label for="billingCountry">Country</label>
					<input type="text" name="billingAddress.country" id="billingCountry" class="form-control"/>
				</div>
					
				<div class="form-group">
					<label for="billingZipcode">ZipCode</label>
					<input type="text" name="billingAddress.zipCode" id="billingZipCode" class="form-control"/>
				</div>
					
				<h2>Shipping Address</h2>
					
				<div class="form-group">
					<label for="shippingStreet">Street Name</label>
					<input type="text" name="shippingAddress.streetName" id="shippingStreet" class="form-control"/>
				</div>
					
				<div class="form-group">
					<label for="shippingApartmentNumber">Apartment Number</label>
					<input type="text" name="shippingAddress.apartmentNumber" id="shippingApartmentNumber" class="form-control"/>
				</div>
					
				<div class="form-group">
					<label for="shippingCity">City</label>
					<input type="text" name="shippingAddress.city" id="shippingCity" class="form-control"/>
				</div>
					
				<div class="form-group">
					<label for="shippingState">State</label>
					<input type="text" name="shippingAddress.state" id="shippingState" class="form-control"/>
				</div>
					
				<div class="form-group">
					<label for="shippingCountry">Country</label>
					<input type="text" name="shippingAddress.country" id="shippingCountry" class="form-control"/>
				</div>
					
				<div class="form-group">
					<label for="shippingZipcode">ZipCode</label>
					<input type="text" name="shippingAddress.zipCode" id="shippingZipCode" class="form-control"/>
				</div>
					 
				<input type="submit" value="submit" class="btn btn-default" />
                <a href= "<c:url value="/" />" class="btn btn-default">Cancel</a>
			    <br><br>
	  	</form>
		
<%@ include file="/WEB-INF/jsps/templates/footer.jsp" %>	  
