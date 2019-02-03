<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Add new client</title>
</head>
<body>
    <form action="/updateClient" method="post">
        <p>ID:</p>
        <input type="text" name="id" readonly value="${client.id}"><br>
        <p>Name:</p>
        <input type="text" name="name" value="${client.name}"><br>
        <p>AGE:</p>
        <input type="number" min="14" max="100" name="age" value="${client.age}"><br>
        <p>Email:</p>
        <input type="email" name="email" value="${client.email}"><br>
        <p>password:</p>
        <input type="text" name="password" value="${client.password}"><br>
        <input type="submit" name="btnUpdate" value="Save changes">
    </form>
</body>
</html>