<!DOCTYPE html>
<html>
<head>
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<style>
.bg-2 { 
      background-color: #474e5d; /* Dark Blue */
      color: black;
  }
</style>

</head>
<body>
<div class="container-fluid bg-2 text-center">
  <center>

<tr>
  <td>
    <br>
  <img src="reachinghand.jpg" class="img-responsive">
</td>
</tr>
<h2>Record Entry </h2>


    <form class="well form-horizontal" action=" addStud.php" method="post"  id="contact_form">
<fieldset>


<div class="form-group">
  <label class="col-md-4 control-label">Name</label>
  <div class="col-md-4 inputGroupContainer">
  <div class="input-group">
  <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
  <input  name="Name" placeholder="Name" class="form-control"  type="text">
    </div>
  </div>
</div>

<!-- Text input-->

<div class="form-group">
  <label class="col-md-4 control-label" >Father Name</label>
    <div class="col-md-4 inputGroupContainer">
    <div class="input-group">
  <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
  <input name="Father" placeholder="Father Name" class="form-control"  type="text">
    </div>
  </div>
</div>

<div class="form-group">
  <label class="col-md-4 control-label" >Mother Name</label>
    <div class="col-md-4 inputGroupContainer">
    <div class="input-group">
  <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
  <input name="Mother" placeholder="Mother Name" class="form-control"  type="text">
    </div>
  </div>
</div>




<!-- Text input-->

<div class="form-group">
  <label class="col-md-4 control-label">Date Of Joining</label>
    <div class="col-md-4 inputGroupContainer">
    <div class="input-group">
        <span class="input-group-addon"><i class="glyphicon glyphicon-calendar"></i></span>
  <input name="doj" placeholder="Enter Date in format dd/mm/yyyy" class="form-control" type="text">
    </div>
  </div>
</div>

<!-- Text input-->

<div class="form-group">
  <label class="col-md-4 control-label">Date Of Birth</label>
    <div class="col-md-4 inputGroupContainer">
    <div class="input-group">
        <span class="input-group-addon"><i class="glyphicon glyphicon-calendar"></i></span>
  <input name="dob" placeholder="Enter Date in format dd/mm/yyyy" class="form-control" type="text">
    </div>
  </div>
</div>


<!-- Text input-->

<div class="form-group">
  <label class="col-md-4 control-label">Blood Group</label>
    <div class="col-md-4 inputGroupContainer">
    <div class="input-group">
        <span class="input-group-addon"><i class="glyphicon glyphicon-tint"></i></span>
  <input name="Blood" placeholder="Blood Group" class="form-control"  type="text">
    </div>
  </div>
</div>


<!-- Text input-->

<div class="form-group">
  <label class="col-md-4 control-label">Height</label>
    <div class="col-md-4 inputGroupContainer">
    <div class="input-group">
        <span class="input-group-addon"><i class="glyphicon glyphicon-tree-deciduous"></i></span>
  <input name="Height" placeholder="Height" class="form-control"  type="text">
    </div>
</div>
</div>

<!-- Text input-->

<div class="form-group">
  <label class="col-md-4 control-label">Weight</label>
    <div class="col-md-4 inputGroupContainer">
    <div class="input-group">
        <span class="input-group-addon"><i class="glyphicon glyphicon-tree-deciduous"></i></span>
  <input name="Weight" placeholder="Weight" class="form-control"  type="text">
    </div>
</div>
</div>

<!-- Text input-->

<div class="form-group">
  <label class="col-md-4 control-label">Grade</label>
    <div class="col-md-4 inputGroupContainer">
    <div class="input-group">
        <span class="input-group-addon"><i class="glyphicon glyphicon-book"></i></span>
  <input name="Grade" placeholder="Grade" class="form-control"  type="text">
    </div>
</div>
</div>

<div class="form-group">
  <label class="col-md-4 control-label"></label>
  <div class="col-md-4">
    <button type="submit" value="submit" class="btn btn-warning" >Store <span class="glyphicon glyphicon-send"></span></button>
  </div>
</div>

</fieldset>
</form>
</div>
    </div><!-- /.container -->
  </center></div>
</body>
</html>
