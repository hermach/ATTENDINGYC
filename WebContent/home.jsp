<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!doctype html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

    <title>ATTENDINGYC!</title>
  </head>
  <body>
      <div class="container h-80">
       <div class="row">
      <% if(session.getAttribute("enter") == null){
    		response.sendRedirect("login.html");
 }%>
                    <div class="col-12"><a href="loginServ"><input type="submit" name="logout" class="btn btn-outline-warning float-right" value="LOGOUT"></a></div>
                </div>
          <div class="row align-items-center h-100">
              <div class="col-3 mx-auto">
           <h1>welcome ${ enter.userName }</h1>
           
              </div>
          </div>
          </div>
          
    <style>
        body,html {
            background-image: url('https://i.imgur.com/xhiRfL6.jpg');
            height: 100%;
        }
        
        #profile-img {
            height:180px;
        }
        .h-80 {
            height: 80% !important;
        }
            </style>

      
    <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
  </body>
</html>
