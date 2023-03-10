<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<html>

<head>
<title>Todo Management</title>
 <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
 <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
 <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js" integrity="sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js" integrity="sha384-cVKIPhGWiC2Al4u+LWgxfKTRIcfu0JTxR+EQDz/bgldoEyl4H0zUF0QKbrJ0EcQF" crossorigin="anonymous"></script>
</head>
<body>

<%@ include file="../common/navigation.jsp"%>


<div class="container">
     <h1>
        List of staff
    </h1>
    <table class="table">
        <c:forEach items="${staffs}" var="staff">
            <tr>
                <td>${staff.id}</td>
                <td>
                    <a href="/staff/detail/${staff.id}">
                        ${staff.fullName}
                    </a>
                </td>
                <td>${staff.katakanaName}</td>
                <td>${staff.email}</td>
                <td>${staff.password}</td>
                <td> <a href="/staff/update/${staff.id}">Update</a></td>
                <td><span onclick="confirmDelete('${staff.id}')">
                    <button class="btn btn-danger">Delete</button>
                </span></td>
            </tr>
              </c:forEach>
    
    </table>  
</div>
 
<script>
    function confirmDelete(staff_id) {
        let action = "/staff/delete/" + staff_id
        let confirmResult =  confirm("Delete can not be undo! Continue? ")
        if(confirmResult) {
            let deleteForm = document.createElement("form");
            deleteForm.action = action;
            deleteForm.setAttribute("method", "post");
            document.body.appendChild(deleteForm);
            deleteForm.submit();
        }
    }
</script>


</body>

</html>
