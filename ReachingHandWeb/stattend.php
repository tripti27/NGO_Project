<?php
$servername = "localhost";
$username = "root";
$password = "root";
$dbname="jpm";
// Create connection
$conn = new mysqli($servername, $username, $password, $dbname);
if ($conn->connect_error) {
    die("Connection failed: " . $conn->connect_error);
} 

$Name=$_POST['Name'];
$intime=$_POST['datetime1'];
$outtime=$_POST['datetime2'];
$sql="INSERT INTO stattend (name,intime,outtime) VALUES ('$Name','$intime','$outtime')";
if ($conn->query($sql) === TRUE) {
    echo "New record created successfully";
} else {
    echo "Error: " . $sql . "<br>" . $conn->error;
}
$conn->close();
?>
<a href="attend.php">GO BACK</a>