<%-- <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> --%>
	<p class="lead">Shop Name</p>
    <div class="list-group">
    	<!-- <a href="#" class="list-group-item">Category 1</a>
        <a href="#" class="list-group-item">Category 2</a>
        <a href="#" class="list-group-item">Category 3</a> -->
        <c:forEach items="${categoryList}" var="category">
        	<a href="${contextRoot}/show/category/${category.id}/products" class="list-group-item" id="${category.name}_category_active">${category.name}</a>
        </c:forEach>
	</div>