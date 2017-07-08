<!DOCTYPE html>
<html lang="en">
<head>
 
  
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <link href="https://fonts.googleapis.com/css?family=Montserrat" rel="stylesheet">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <style>

.inv {
	-moz-box-shadow:inset 0px 1px 0px 0px #fce2c1;
	-webkit-box-shadow:inset 0px 1px 0px 0px #fce2c1;
	box-shadow:inset 0px 1px 0px 0px #fce2c1;
	background:-webkit-gradient( linear, left top, left bottom, color-stop(0.05, #ffc477), color-stop(1, #fb9e25) );
	background:-moz-linear-gradient( center top, #ffc477 5%, #fb9e25 100% );
	filter:progid:DXImageTransform.Microsoft.gradient(startColorstr='#ffc477', endColorstr='#fb9e25');
	background-color:#ffc477;
	-webkit-border-top-left-radius:20px;
	-moz-border-radius-topleft:20px;
	border-top-left-radius:20px;
	-webkit-border-top-right-radius:20px;
	-moz-border-radius-topright:20px;
	border-top-right-radius:20px;
	-webkit-border-bottom-right-radius:20px;
	-moz-border-radius-bottomright:20px;
	border-bottom-right-radius:20px;
	-webkit-border-bottom-left-radius:20px;
	-moz-border-radius-bottomleft:20px;
	border-bottom-left-radius:20px;
	text-indent:0;
	border:1px solid #eeb44f;
	display:inline-block;
	color:#0f010f;
	font-family:Arial;
	font-size:15px;
	font-weight:bold;
	font-style:normal;
	height:50px;
	line-height:50px;
	text-decoration:none;
	text-align:center;
	text-shadow:1px 1px 0px #cc9f52;
}
.inv:hover {
	background:-webkit-gradient( linear, left top, left bottom, color-stop(0.05, #fb9e25), color-stop(1, #ffc477) );
	background:-moz-linear-gradient( center top, #fb9e25 5%, #ffc477 100% );
	filter:progid:DXImageTransform.Microsoft.gradient(startColorstr='#fb9e25', endColorstr='#ffc477');
	background-color:#fb9e25;
}.inv:active {
	position:relative;
	top:1px;
}


  body {
      font: 20px Montserrat, sans-serif;
      line-height: 1.8;
      color: #f5f6f7;
  }
  p {font-size: 16px;}
  .margin {margin-bottom: 45px;}
  .bg-1 { 
      background-color: #1abc9c; /* Green */
      color: #ffffff;
  }
  .bg-2 { 
      background-color: #474e5d; /* Dark Blue */
      color: #ffffff;
  }
  .bg-3 { 
      background-color: #ffffff; /* White */
      color: #555555;
  }
  .bg-4 { 
      background-color: #2f2f2f; /* Black Gray */
      color: #fff;
  }
  .container-fluid {
      padding-top: 70px;
      padding-bottom: 70px;
  }
  .navbar {
      padding-top: 15px;
      padding-bottom: 15px;
      border: 0;
      border-radius: 0;
      margin-bottom: 0;
      font-size: 12px;
      letter-spacing: 5px;
  }
  .navbar-nav  li a:hover {
      color: #1abc9c !important;
  }
  </style>
</head>
<body>

<!-- Navbar -->
<nav class="navbar navbar-default">
  <div class="container">
    <div class="navbar-header">
      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>                        
      </button>
      <a class="navbar-brand" href="inv.php">Check Inventory</a>
    </div>
    <div class="collapse navbar-collapse" id="myNavbar">
      <ul class="nav navbar-nav navbar-right">
        <li><a href="req.php">Make Purchase Request</a></li>
        <li><a href="rec.php">Check Student Record</a></li>
        <li><a href="receipt.php">Upload Receipt</a></li>
      </ul>
    </div>
  </div>
</nav>

<!-- First Container -->
<div class="container-fluid bg-1 text-center">
  <h3 class="margin">Staff Dashboard</h3>
  <img src="reachinghand.jpg" class="img-responsive" style="display:inline" alt="Bird" width="350" height="350">
  <h3>Helping the under-priviledged</h3>
</div>

<!-- Second Container -->
<div class="container-fluid bg-2 text-center">
  <ul>
<li>
<form action="student.php">
<button type="submit" value="submit" class="inv">Enter Student Record</button></form></li><br>
<li>
<form action="attend2.php">
<button type="submit" value="submit" class="inv">Take Attendence</button></form></li>
</ul>
	
  </a>
</div>

</body>
</html>
