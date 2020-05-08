 <!DOCTYPE html>
 <%@include file="index.html" %>
 
<html>
  <head>

  <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="https://fonts.googleapis.com/css?family=Fahkwang" rel="stylesheet">
    <link rel="stylesheet" type="text/css" href="css/branchSubDetail.css">
    <link rel="icon" type="image/png" href="img/logo.ico"/>
            <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"></script>

        <script src="js/postrequest.js"></script>

  </head>
  <body>

<div class="container">
      <div class="row">
          <div class="col-md-4 offset-md-4">
             <form name="userData" class="form-data" id="customerForm" method="post">
            
                
                  <div class="form-resp">
                    <H4 class="text-center">Student Data</H4>
                    
                   

                    <div class="form-group">
                     <label for="name">Roll No</label> 
                       <input type="text" class="form-control" id="rollNo" placeholder="Enter Roll No" name="rollNo">
                    </div>

                    <div class="form-group">
                     <label for="uphn">Name</label> 
                       <input type="text" class="form-control" id="name" placeholder="Enter Name" name="name">
                    </div>


                    <div class="form-group">
                     <label for="status">Age</label> 
                       <input type="text" class="form-control" id="age" placeholder="Enter Age" name="age">
                    </div>

                    <div class="form-group">
                     <label for="created_date">Marks</label> 
                       <input type="text" class="form-control" id="marks" placeholder="Enter Marks" name="marks">
                    </div>

                   

                    <div class="button-group">
                        <button type="submit" class="btn btn-primary btn-block" value="ADD" name="action">ADD</button>
                    </div>

                    <div class="col-sm-7" id="postResultDiv"></div>
                    
                  </div>
                  
              
            </form>
        </div>
      </div>
    </div>

   
  </body>
</html>
