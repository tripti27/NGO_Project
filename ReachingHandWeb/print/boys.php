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
<h1><center>Boys Clothing</center></h1>
    
<?php
$con=mysqli_connect("localhost","root","","jpm");
// Check connection
if (mysqli_connect_errno())
{
echo "Failed to connect to MySQL: " . mysqli_connect_error();
}

$result = mysqli_query($con,"SELECT * FROM student");

//<div align="center">
echo "<table border='1'  >
<tr>
<th><h3>  NAME  </h3></th>
<th><h3>  FATHER NAME  </h3></th>
<th><h3>  MOTHER NAME  </h3></th>
<th><h3>  DOB  </h3></th>
<th><h3> DOJ  </h3></th>;
<th><h3> BLOOD GROUP  </h3></th>;
<th><h3> HEIGHT  </h3></th>;
<th><h3> WEIGHT  </h3></th>;
<th><h3> GRADE  </h3></th>;
</tr>";

while($row = mysqli_fetch_array($result))
{
echo "<tr width=20%>";
echo "<td height=15%><h2>" . $row['Name'] . "</h2></td>";
echo "<td height=15%><h2>" . $row['Father'] . "</td></h2>";
echo "<td height=15%><h2>" . $row['Mother'] . "</td></h2>";
echo "<td height=15%><h2>" . $row['doj'] . "</td></h2>";
echo "<td height=15%><h2>" . $row['dob'] . "</td></h2>";
echo "<td height=15%><h2>" . $row['Blood'] . "</td></h2>";
echo "<td height=15%><h2>" . $row['Height'] . "</td></h2>";
echo "<td height=15%><h2>" . $row['Weight'] . "</td></h2>";
echo "<td height=15%><h2>" . $row['Grade'] . "</td></h2>";
echo "</tr>";
}
echo "</table>";

mysqli_close($con);
?> 
</center>
</div>
</body>
</html>