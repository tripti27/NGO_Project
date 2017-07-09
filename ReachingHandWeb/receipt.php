<html>
<head>
<style>
.form-style-4{
    width: 450px;
    font-size: 16px;
    background: #495C70;
    padding: 30px 30px 15px 30px;
    border: 5px solid #53687E;
}
.form-style-4 input[type=submit],
.form-style-4 input[type=button],
.form-style-4 input[type=text],
.form-style-4 input[type=email],
.form-style-4 textarea,
.form-style-4 label
{
    font-family: Georgia, "Times New Roman", Times, serif;
    font-size: 16px;
    color: #fff;

}
.form-style-4 label {
    display:block;
    margin-bottom: 10px;
}
.form-style-4 label > span{
    display: inline-block;
    float: left;
    width: 150px;
}
.form-style-4 input[type=text],
.form-style-4 input[type=email] 
{
    background: transparent;
    border: none;
    border-bottom: 1px dashed #83A4C5;
    width: 275px;
    outline: none;
    padding: 0px 0px 0px 0px;
    font-style: italic;
}
.form-style-4 textarea{
    font-style: italic;
    padding: 0px 0px 0px 0px;
    background: transparent;
    outline: none;
    border: none;
    border-bottom: 1px dashed #83A4C5;
    width: 275px;
    overflow: hidden;
    resize:none;
    height:20px;
}

.form-style-4 textarea:focus, 
.form-style-4 input[type=text]:focus,
.form-style-4 input[type=email]:focus,
.form-style-4 input[type=email] :focus
{
    border-bottom: 1px dashed #D9FFA9;
}

.form-style-4 input[type=submit],
.form-style-4 input[type=button]{
    background: #576E86;
    border: none;
    padding: 8px 10px 8px 10px;
    border-radius: 5px;
    color: #A8BACE;
}
.form-style-4 input[type=submit]:hover,
.form-style-4 input[type=button]:hover{
background: #394D61;
}
.bg-1 { 
      background-color: #1abc9c; /* Green */
      color: #ffffff;
  }
</style>
</head>
<center>
<body>
<div class="container-fluid bg-1 text-center">
<center>
<tr>
  <td>
    <br><br>
  <img src="reachinghand.jpg" class="img-responsive">
</td>
</tr><hr>

</div><center>

<h1> Upload receipt </h1><br><br><br><br>
<form class="form-style-4" action="***" method="post">
<label for="field1">
<span>Enter Your Name</span><input type="text" name="field1" required="true" />
</label>
<label for="field2">
<span>Contact Number</span><input type="text" name="field2" required="true" />
</label>
<label for="field3">
<span>Comment</span><input type="text" name="field3" required="true" />
</label><br>
<input type="hidden" name="MAX_FILE_SIZE" value="4194304" />
<input type="file" />
<label>
<span>&nbsp;</span><input type="submit" value="Upload Image" />
</label>
</form>
</body>
</center>
</html>