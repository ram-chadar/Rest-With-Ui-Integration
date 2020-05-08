$(document).ready(function() {
  
  // SUBMIT FORM
    $("#customerForm").submit(function(event) {
    // Prevent the form from submitting via the browser.
    ajaxPost();
  });
    
    
    function ajaxPost(){
      
      // PREPARE FORM DATA
      var formData = {
        rollNo : $("#rollNo").val(),
        name :  $("#name").val(),
        age : $("#age").val(),
        marks : $("#marks").val(),
      }
      
      // DO POST
      $.ajax({
      type : "POST",
      contentType : "application/json",
      url :"http://localhost:8085/student/save",
      data : JSON.stringify(formData),
      dataType : 'json',
      success : function() {
                console.log("succccc: ", result);

      },
      error : function(e) {
        console.log("ERROR: ", e);
      }
    });
      
    
 
    }
    
    
})