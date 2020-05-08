<!DOCTYPE html>
 <%@include file="index.html" %>

<html>
    <head>
        <title>GetByRollNo</title>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"></script>
        <script src="js/get.js"></script>

         <style type="text/css">
            

            table{

                width: 30%;
                border-collapse: collapse;
            }
            table,th,td{
                border: 1px solid black;
            }

            th,td{
               
                text-align: center;
            }

            tr:nth-child(even){
                background-color: #f2f2f2;
            }

            .header{
                color: red;
                padding-top: 10px; 
                font-family: cursive;
            }

        </style>
    </head>

    <body>
        <center>
            
            <div class="header">
           <h3>Student</h3> 
            </div>

        </center>
        <div>

            <table align="center">
                <tr><td>Roll No</td><td class="rollNo"></td></tr>
                <tr><td>Name</td><td><p class="name"> </p></td></tr>
                <tr><td>Age</td><td><p class="age"></p></td></tr>
                <tr><td>Marks</td><td><p class="marks"></p></td></tr>
                
            </table>

           
           
        </div>
    </body>
</html>