<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <title>Form</title>
        <link href="/css/main.css" rel="stylesheet">
    </head>
    <body>
    <div
        <h2>Add user</h2>
        <br><br>
      
        <form action="/addUser" method="post">
            Firstname:<br>
            <input type="text" name="firstName">
            <br><br>
            Lastname:<br>
            <input type="text" name="lastName">
            <br><br>
             Email:<br>
            <input type="text" name="email">
            <br><br>
             Password:<br>
            <input type="text" name="password">
            <br><br>
            <input type="submit" value="Add user">
        </form>
        <script src="/js/main.js"></script>
    </body>
</html>