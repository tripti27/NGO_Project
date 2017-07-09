<!DOCTYPE html>
<html>
<head>
	<title></title>
	<style>
	.bg-1 { 
      background-color: #1abc9c; /* Green */
      color: #ffffff;
  }
   .bg-2 { 
      background-color: #474e5d; /* Dark Blue */
      color: #ffffff;
      height: 2500px;
  }
  </style>
</head>
<body>
<center>
<div class="container-fluid bg-1 text-center">
<img src="ReachingHand.jpg" class="img-responsive">
</div>
<div class="container-fluid bg-2 text-center">
<h1><center>Inventory List</center></h1>
	
	<?php
$servername = "localhost";
$username = "root";
$password = "root";
$dbname = "jpm";

// Create connection
$conn = new mysqli($servername, $username, $password, $dbname);
// Check connection
if ($conn->connect_error) {
    die("Connection failed: " . $conn->connect_error);
} 

$sql = "SELECT * FROM request";
$result = $conn->query($sql);

if ($result->num_rows > 0) {
    // output data of each row
    while($row = $result->fetch_assoc()) {
        echo "<br/><br/>Name: " . $row["Name"]. "<br/><br/> - Item:" . $row["Item"]. " <br/><br/>- Quantity: " . $row["Quantity"]. " <br/><br/>- Amount: " . $row["Amount"]. " <br/><br/>- Comments: " . $row["Comments"]. "<br>";
    }
} else {
    echo "0 results";
}
$conn->close();
?>