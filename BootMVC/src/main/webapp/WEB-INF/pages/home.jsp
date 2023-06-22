<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>choose your options</title>
</head>
<body>
<body>
	<form method="post" action="home1">
		<label for="java_version">java_version:</label>
		<select name="java_version" id="java_version" required>
			<option value="">Select java_version</option>
			<option value="male">8</option>
			<option value="female">11</option>
			<option value="other">17</option>
		</select>
		<label for="entity_name">entity_name:</label>
		<input type="text" name="entity_name" id="entity_name" required><br><br>
		
		<label for="developer_initials">developer_initials:</label>
		<input type="text" name="developer_initials" id="developer_initials" required><br><br>
		
		<label for="server_port_number">server_port_number:</label>
		<input type="text" name="server_port_number" id="server_port_number" required><br><br>
		
		<label for="db_schema_name">db_schema_name:</label>
		<input type="text" name="db_schema_name" id="db_schema_name" required><br><br>
		
		<label for="db_user_name">db_user_name:</label>
		<input type="text" name="db_user_name" id="db_user_name" required><br><br>
		
		<label for="db_user_password">db_user_password:</label>
		<input type="text" name="db_user_password" id="db_user_password" required><br><br>
		
		<input type="submit" value="Submit">
	</form>
</body>
</body>
</html>