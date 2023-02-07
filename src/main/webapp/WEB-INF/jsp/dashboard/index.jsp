<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<html>

<head>
<title>Todo Management</title>
<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css"
 rel="stylesheet">
</head>
<body>

<%@ include file="../common/navigation.jsp"%>


<div class="container">

 <div class="panel panel-primary">
     <div class="panel-heading">Home Page</div>
        <div class="panel-body">
        <a href="/staff/new"> click to regester account</a>
        </div>
     </div>
 </div>
 
 
 
<%@ include file="../common/footer.jsp"%>


</body>

</html>