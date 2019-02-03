<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Add new client</title>
</head>
<body>
    <form action="/saveClient" method="post">
        <input type="text" name="name" placeholder="Name"><br><br>
        <input type="number" min="14" max="100" name="age" placeholder="Age"><br><br>
        <input type="email" name="email" placeholder="Email"><br><br>
        <input type="password" name="password" placeholder="Password"><br><br>
        <input type="submit" name="btnAdd" value="Add">
        <input type="reset" name="btnReset" value="Clear">
    </form>
</body>
</html>