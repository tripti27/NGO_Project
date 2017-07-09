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
      height: 500px;
  }
  </style>
</head>
<body>
<center>
<div class="container-fluid bg-1 text-center">
<img src="ReachingHand.jpg" class="img-responsive">
</div>
<div class="container-fluid bg-2 text-center">

<?php
error_reporting(E_ERROR | E_PARSE);
$servername = "localhost";
$username = "root";
$password = "root";
$dbname="jpm";
// Create connection
$conn = new mysqli($servername, $username, $password, $dbname);
if ($conn->connect_error) {
    die("Connection failed: " . $conn->connect_error);
} 
 $name=$_POST['name'];
			$sel="select *from student where Name='$name'";
			$result = mysqli_query($con,$sel);
			echo '<table style="width:50%;">';
			echo '<th>NAME</th><th>Father</th><th>Mother</th><th>DOJ</th><th>DOB</th><th>DOB</th><th>Blood</th><th>Height</th><th>Weight</th><th>Grade</th>';
			
			while($row = mysqli_fetch_array($result))
			{
			
			echo '<tr><td>'.$row['Name'].'</td><td>'.$row['Father'].'</td><td>'.$row['Mother'].'</td><td>'.$row['doj'].'</td><td>'.$row['dob'].'</td><td>'.$row['Blood'].'</td><td>'.$row['Height'].'</td><td>'.$row['Weight'].'</td><td>'.$row['Grade'].'</td></tr>';
			 
			}
			echo '</table>';

mysqli_close($con);
?>