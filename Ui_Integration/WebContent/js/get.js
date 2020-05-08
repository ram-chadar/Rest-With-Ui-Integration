$(document).ready(function() {

    var roll=prompt("Enter Roll No.");
    $.ajax({
    	type:"Get",
        url: "http://localhost:8085/student/"+roll
    }).then(function(data) {

       $('.rollNo').append(data.rollNo);
       $('.name').append(data.name);
       $('.age').append(data.age);
       $('.marks').append(data.marks);
      
    });
});