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
<h1><center>Inventory List</center></h1>
	
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
$sql = "SELECT * FROM groceries";
$result = $conn->query($sql);

//<div align="center">


if ($result->num_rows > 0) {
    // output data of each row
    while($row = $result->fetch_assoc()) {
		echo "vegetables: " . $row["vegetables"]. " - flour:" . $row["flour"]. " - rice: " . $row["rice"]. " - jaggery: " . $row["jaggery"]. " - utensils: " . $row["utensils"]. "<br>";
}
}
else{
	echo "0 results";}
echo "</table>";

$sql2 = "SELECT * FROM house";
$result2 = $conn->query($sql2);
//<div align="center">

if ($result2->num_rows > 0) {
    while($row = $result2->fetch_assoc()) {
		
echo "floor cleaner: " . $row["floor cleaner"]. " - flour:" . $row["washing powder"]. " - washing powder: " . $row["broom"]. " - broom: " . $row["mug"]. " - mug: ";

echo "<tr width=20%>";
echo "<td height=15%><h2>" . $row['floor cleaner'] . "</h2></td>";
echo "<td height=15%><h2>" . $row['washing powder'] . "</td></h2>";
echo "<td height=15%><h2>" . $row['broom'] . "</td></h2>";
echo "<td height=15%><h2>" . $row['mug'] . "</td></h2>";
echo "</tr>";
}
}
else {
    echo "0 results";
}
echo "</table>";

mysqli_close($conn);
?> 
</center>
</div>
</body>
</html>