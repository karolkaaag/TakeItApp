<!DOCTYPE html>
<html>
    <head>
        <title>Cities</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        </head>
    <body>
        <h2>List of users</h2>
        <br>
        <a href="/addUserForm">Add user</a>
		<a href="/deleteUser">Delete user by id</a>
		<br>
        <table>
            <tr>
                <th>Id</th>
                <th>Firstname</th>
                <th>Lastname</th>
                <th>Email</th>
                <th>Address</th>
            </tr>

            <#list users as user>
                <tr>
                    <td>${user.id}</td>
                    <td>${user.firstName}</td>
                    <td>${user.lastName}</td>
                    <td>${user.email}</td>
                    <td>${user.addressDto.toString()}</td>
                </tr>
            </#list>
        </table>
    </body>
</html>