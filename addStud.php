<?php
require_once("db.php");

$Name=$_POST['Name'];
$Father=$_POST['Father'];
$Mother=$_POST['Mother'];
$doj=$_POST['doj'];
$dob=$_POST['dob'];
$Blood=$_POST['Blood'];
$Height=$_POST['Height'];
$Weight=$_POST['Weight'];
$Grade=$_POST['Grade'];

//Execute the query
$query=mysql_query("INSERT INTO student (Name,Father,Mother,doj,dob,Blood,Height,Weight,Grade) VALUES ('$Name','$Father','$Mother','$doj','$dob','$Blood','$Height','$Weight','$Grade')");
echo "<p>Record inserted</p>";
//header('Location: http://localhost/jpm/student.php');
?>
<a href="student.php">GO BACK</a>