<div class="container">
	<div class="row">
		<div class="col-lg-3">
			<%@include file="./shared/sidebar.jsp"%>
		</div>
		<div class="col-lg-9">
			<div class="row">
				<div class="col-lg-12 my-4" >
					<c:if test="${userClickAllProducts == true}">
					<ol class="breadcrumb">
						<li class="breadcrumb-item"><a href="${contextroot}/home">Home</a></li>
						<li class="breadcrumb-item active">All Product</li>
					</ol>
					</c:if>
					
					<c:if test="${userClickCategoryProducts == true}">
					<ol class="breadcrumb">
						<li class="breadcrumb-item"><a href="${contextroot}/home">Home</a></li>
						<li class="breadcrumb-item active">category</li>
						<li class="breadcrumb-item active">${category.name}</li>
					</ol>
					</c:if>
				</div>
			</div>
		</div>
	</div>
</div>