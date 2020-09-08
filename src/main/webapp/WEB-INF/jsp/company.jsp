<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE HTML>
<html>
    <head>
        <meta charset="UTF-8" />
        <title>Company</title>
        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/style.css" />
    </head>
    <body>
        <h1>Company</h1>

        <br />
        <br />
        <div>
            <table border="1">
                <tr>
                    <th>Id</th>
                    <th>Name</th>
                    <th>Age</th>
                    <th>Address</th>
                    <th>Salary</th>
                </tr>

                <c:forEach items="${companies}" var="company">
                    <tr>
                        <td>${company.id}</td>
                        <td>${company.name}</td>
                        <td>${company.age}</td>
                        <td>${company.address}</td>
                        <td>${company.salary}</td>
                    </tr>
                </c:forEach>
            </table>
        </div>

        <form method="post">
            <input type="number" name="id" placeholder="Enter ID" />
            <input type="text" name="text" placeholder="Enter Name">
            <button type="submit"></button>
        </form>
    </body>

</html>
