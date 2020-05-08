
$(document).ready(function() {
    $.ajax({
    	type:"Get",
        url: "http://localhost:8085/student/getAllStudent"
    }).then(function(records) {

       $.each(records,function(i,record)

        {
        $(".cls").append('<tr><td>'+record.rollNo+'</td>  <td>'+record.name+'</td> <td>'+record.age+'</td>  <td>'+record.marks+'</td></tr>');
        }
        )

    });
});