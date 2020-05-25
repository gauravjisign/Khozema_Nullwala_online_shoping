<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="spr" uri="http://www.springframework.org/tags" %>

<spr:url var="css" value="/resources/css" />
<spr:url var="js" value="/resources/js" />
<spr:url var="images" value="/resources/images" />

<c:set var="contextRoot" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Online Shopping - ${title}</title>

    <!-- Bootstrap Core CSS -->
    <link href="${css}/bootstrap.min.css" rel="stylesheet">
    
    <!-- Bootstrap Readable Theme -->
    <link href="${css}/bootstrap-readable-theme.css" rel="stylesheet">

    <!-- Custom CSS -->
    <link href="${css}/custom.css" rel="stylesheet">

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
	<script type="text/javascript">
		window.menu = '${title}';
	</script>
</head>

<body>
	<div class="wrapper">
		<%-- ${contextRoot} say's	${greeting} --%>
	    <!-- Navigation -->
	   <%@include file="./shared/navbar.jsp" %>
	
	    <!-- Page Content -->
	    <div class="content">
		    <!-- Load only when user click home -->
		    <c:if test="${userClickHome == true}" >
		    	<%@include file="home.jsp" %>
		    </c:if>
		    
		    <!-- Load only when user click about -->
		    <c:if test="${userClickAbout == true}" >
		    	<%@include file="about.jsp" %>
		    </c:if>
		    <!-- Load only when user click view product -->
		    <c:if test="${userClickAllProducts == true or userClickCategoryProduct == true}" >
		    	<%@include file="product-list.jsp" %>
		    </c:if>
		    
		    
		    <!-- Load only when user click contact -->
		    <c:if test="${userClickContact == true}" >
		    	<%@include file="contact.jsp" %>
		    </c:if>
		    
	    </div>
	    <!-- /.container -->
		<!-- Footer comes here -->
		<%@include file="./shared/footer.jsp" %>
		    
	    <!-- jQuery -->
	    <script src="${js}/jquery.js"></script>
	
	    <!-- Bootstrap Core JavaScript -->
	    <script src="${js}/bootstrap.min.js"></script>
	
		<!-- Bootstrap Core JavaScript -->
	    <script src="${js}/custom.js"></script>
	</div>
</body>

</html>
