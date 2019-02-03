<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Clients</title>
</head>
<body>
    <h1>Search result</h1>
    <table border="1">
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Age</th>
            <th>Email</th>
            <th>Password</th>
        </tr>
        <#list clients as client >
            <tr>
                <td><a href="/client/${client.id}">${client.id}</a></td>
                <td>${client.name}</td>
                <td>${client.age}</td>
                <td>${client.email}</td>
                <td>${client.password}</td>
                <td><a href="/editClient/${client.id}">Edit</a></td>
                <td><a href="/removeClient/${client.id}">Remove</a></td>
            </tr>
        </#list>
    </table>
    <br>
    <a href="/clients">Go back</a>
</body>
</html>