<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Client info</title>
</head>
<body>
<h1>Information about client with ID: ${client.id}</h1><br>
<table border="1">
    <tr>
        <th>Parameter</th>
        <th>Value</th>
    </tr>

    <tr>
        <th>ID</th>
        <td>${client.id}</td>
    </tr>

    <tr>
        <th>Name</th>
        <td>${client.name}</td>
    </tr>

    <tr>
        <th>Age</th>
        <td>${client.age}</td>
    </tr>

    <tr>
        <th>Email</th>
        <td>${client.email}</td>
    </tr>

    <tr>
        <th>Password</th>
        <td>${client.password}</td>
    </tr>

</table>
<a href="/clients">Go back</a>
</body>
</html>