<?php
try{
 cfg // Database name
 $host='localhost';
 $username='root';
 $password='root';
 $db = new PDO("mysql:host=$host;dbname=$db_name;charset=utf8", $username, $password);
 //return $db;
} catch (PDOException $e) {
    print "Error!: " . $e->getMessage() . "<br/>";
    die();
}
?>