<?php
require_once("db.php");
$Name=$_POST['Name'];
$intime=$_POST['datetime1'];
$outtime=$_POST['datetime2'];
$query=mysql_query("INSERT INTO sattend (Name,intime,outtime) VALUES ('$Name','$intime','$outtime')");
echo "<p>Record inserted</p>";
?>
<a href="attend2.php">GO BACK</a>