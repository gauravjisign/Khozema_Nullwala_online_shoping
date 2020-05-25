<div class="container">
	<div class="row">
	<!-- Would be display sidebar -->
		<div class="col-md-3">
        	<%@include file="./shared/category-left-sidebar.jsp" %>
        </div>
	<!-- To Display the actual products --> 
        <div class="col-md-9">
        <!-- Added bootstrap component of breadcrumb -->
			<div class="row carousel-holder">			
				<div class="col-lg-12">
					<c:if test="${userClickAllProducts == true}">
						<script>
							window.categoryId = '';
						</script>
						<ol class="breadcrumb">
							<li><a href="${contextRoot}/home">Home</a></li>
							<li class="active">All Products</li>
						</ol>
					</c:if>
					<c:if test="${userClickCategoryProduct == true}">
						<script>
							window.categoryId = '${category.id}';
						</script>
						<ol class="breadcrumb">
							<li><a href="${contextRoot}/home">Home</a></li>
							<li class="active">Category</li>
							<li class="active">${category.name}</li>
						</ol>
					</c:if>
				</div>
        	</div>
        </div>
                
	</div>
</div>