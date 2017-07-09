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
if(isset($_POST['submit'])){
$uname=$_POST['uname'];
$quant=$_POST['quant'];
$comment=$_POST['comment'];
$price=$_POST['price'];
if(isset($_POST['item'])){
$item=$_POST['item'];
//Execute the query
$sql=mysql_query("INSERT INTO request (Name,Item,Quantity,Amount,Comments,status) VALUES ('$uname','$item','$quant','$price','$comment')");
if ($conn->query($sql) === TRUE) {
    echo "New record created successfully";
} else {
    echo "Error: " . $sql . "<br>" . $conn->error;
}}}
$conn->close();
?>
<a href="req.php">GO BACK</a>