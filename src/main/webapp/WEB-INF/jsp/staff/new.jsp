<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
        <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<html>

    <head>
        <title>Todo Management</title>
        <link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css" rel="stylesheet">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
            integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
            crossorigin="anonymous">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
            crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js"
            integrity="sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p"
            crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js"
            integrity="sha384-cVKIPhGWiC2Al4u+LWgxfKTRIcfu0JTxR+EQDz/bgldoEyl4H0zUF0QKbrJ0EcQF"
            crossorigin="anonymous"></script>

    </head>

    <body>

        <%@ include file="../common/navigation.jsp" %>
            <div class="container">
                <div class="row">
                    <div class="col-md-6 col-md-offset-3 ">
                        <div class="panel panel-primary">
                            <h1>
                                Staff Regestration Form
                            </h1>
                            <div class="panel-body">
                                <form:form method="post" modelAttribute="staff">
                                    <form:hidden path="id" />
                                    <fieldset class="form-group">
                                        <form:label path="fullName">Full Name</form:label>
                                        <form:input path="fullName" type="text" class="form-control" />
                                        <form:errors path="fullName" cssClass="text-danger" />
                                    </fieldset>

                                    <fieldset class="form-group">
                                        <form:label path="katakanaName">User</form:label>
                                        <form:input path="katakanaName" type="text" class="form-control"/>
                                        <form:errors path="katakanaName" cssClass="text-danger" />
                                    </fieldset>
                                    <fieldset class="form-group">
                                        <form:label path="password">PassWord</form:label>
                                        <form:input path="password" type="text" class="form-control"/>
                                        <form:errors path="password" cssClass="text-danger" />
                                    </fieldset>
                                    <fieldset class="form-group">
                                        <form:label path="email">Email</form:label>
                                        <form:input path="email" type="text" class="form-control"/>
                                        <form:errors path="email" cssClass="text-danger" />
                                    </fieldset>
                                    <button type="submit" class="btn btn-success">Register</button>
                                </form:form>
                            </div>
                        </div>
                    </div>
                </div>
            </div>

            <%@ include file="../common/footer.jsp" %>


    </body>

</html>