<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.11.2/css/all.css" integrity="sha256-46qynGAkLSFpVbEBog43gvNhfrOj+BmwXdxFgVK/Kvc=" crossorigin="anonymous" />
    <!-- links for the select the year -->
    <link href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.5.0/css/bootstrap-datepicker.css" rel="stylesheet">
    <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.5.0/js/bootstrap-datepicker.js"></script>
    <title>PROMO</title>
</head>
<body>
   
          <nav class="navbar navbar-expand-lg bg-dark navbar-dark">
            <div class="container-fluid">
                
                <a class="navbar-brand" href="#">
                  <img src="https://s3.eu-central-1.amazonaws.com/bootstrapbaymisc/blog/24_days_bootstrap/logo_white.png" width="30" height="30" alt="logo">
                  Gestion Ecole
                </a>

                <button class="navbar-toggler float-right" type="button" data-toggle="collapse" data-target="#navbar9">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <div class="navbar-collapse collapse" id="navbar9">
                    <ul class="navbar-nav ml-auto">
                        <li class="nav-item"><a class="nav-link" href=""><i class="fas fa-bell"></i></a></li>
                        <li class="nav-item"><a class="nav-link" href=""><i class="fas fa-envelope"></i></a></li>
                        <li class="nav-item dropdown">
                            <a class="nav-link dropdown-toggle" href="#" id="navbarDropdownMenuLink" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                <img src="https://s3.eu-central-1.amazonaws.com/bootstrapbaymisc/blog/24_days_bootstrap/fox.jpg" width="25" height="25" class="rounded-circle">
                            </a>
                            <div class="dropdown-menu" aria-labelledby="navbarDropdownMenuLink">
                                <a class="dropdown-item" href="#">Dashboard</a>
                                <a class="dropdown-item" href="#">Edit Profile</a>
                                <a class="dropdown-item" href="#">Log Out</a>
                            </div>
                        </li> 
                    </ul>
                </div>
            </div>
        </nav>
        <div class="container-fluid">
          <div class="row">
            <div class="col-2 bg-dark navbar-dark">
              <ul class="nav flex-column">
                <li class="nav-item">
                  <a class="nav-link active" href="#">Active</a>
                </li>
                <li class="nav-item dropdown">
                  <a class="nav-link dropdown-toggle" data-toggle="dropdown" href="#" role="button" aria-haspopup="true" aria-expanded="false">Dropdown</a>
                  <div class="dropdown-menu">
                    <a class="dropdown-item" href="#">Action</a>
                    <a class="dropdown-item" href="#">Another action</a>
                    <a class="dropdown-item" href="#">Something else here</a>
                    <div class="dropdown-divider"></div>
                    <a class="dropdown-item" href="#">Separated link</a>
                  </div>
                </li>
                <li class="nav-item">
                  <a class="nav-link" href="#">Link</a>
                </li>
                <li class="nav-item">
                  <a class="nav-link disabled" href="#">Disabled</a>
                </li>
              </ul>
            </div>
            <div class="col-10 p-4">
              <!-- start section statistiques -->
              <div class="row">
                <div class="col-6">
                    <div class="card text-white bg-success mb-3">
                        <div class="card-header">Header</div>
                        <div class="card-body">
                          <h4 class="card-title">Success card title</h4>
                          <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
                        </div>
                      </div>
                  </div>
                  <div class="col-6">
                      <div class="card text-white bg-warning mb-3">
                          <div class="card-header">Header</div>
                          <div class="card-body">
                            <h4 class="card-title">Warning card title</h4>
                            <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
                          </div>
                      </div>
                    </div>
                    <div class="col-6">
                        <div class="card text-white bg-danger mb-3">
                            <div class="card-header">Header</div>
                            <div class="card-body">
                              <h4 class="card-title">Danger card title</h4>
                              <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
                            </div>
                        </div>
                    </div>
                    <div class="col-6">
                        <div class="card text-white bg-info mb-3">
                            <div class="card-header">Header</div>
                            <div class="card-body">
                              <h4 class="card-title">Info card title</h4>
                              <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
                            </div>
                        </div>
                    </div>
              </div>
             

               
                  
              <!-- End section statistiques -->
              <!-- Start Section Search -->
              <div class="row p-4 alert alert-dismissible alert-warning">
                <div class="col-12">
                    
                    <form>
                        <div class="row">
                          <div class="col">
                            <input type="text" class="form-control" placeholder="Search">
                          </div>
                          <div class="col">
                              <label class="mr-sm-2 sr-only" for="inlineFormCustomSelect">Preference</label>
                              <select class="custom-select mr-sm-2" id="inlineFormCustomSelect">
                                <option selected>Choose Promo</option>
                                <option value="1">Promo One</option>
                                <option value="2">Promo Two</option>
                                <option value="3">Promo Three</option>
                              </select>
                          </div>
                          <div class="col">
                              <label class="mr-sm-2 sr-only" for="inlineFormCustomSelect">Preference</label>
                              <select class="custom-select mr-sm-2" id="inlineFormCustomSelect">
                                <option selected>Choose Class</option>
                                <option value="1">Class One</option>
                                <option value="2">Class Two</option>
                                <option value="3">Class Three</option>
                              </select>
                          </div>
                              <button type="submit" class="btn btn-success">Search <i class="fas fa-search"></i></button>
                        </div>
                        
                      </form>
                    </div>
                </div>    
<!--f innna generation -->
               <div class="row p-4 alert alert-dismissible alert-primary">
                        <div class="col-12">
                                            <label>nom de Generation :</label>
          
                        </div>
                    </div>
<!--end innna generation -->

 <!-- add a classe --> 
               <div class="row p-4 alert alert-dismissible alert-success">
                        <div class="col-12">
                      <form action="addAndViewClasse" method="post">
                            <div class="row">
                          <input type="hidden" value="${ promo.id }" name="id">
                            
                              <div class="col">
                                  <label>nom de classe :</label>
                                </div>
                                  <div class="col">
                                    <input class="date-own form-control" name="nameClasse" type="text">
                                </div>
                                 <div class="col">
                                  <label>surnom de classe :</label>
                                </div>
                                 <div class="col">
                                    <input class="date-own form-control" name="nickName" type="text">
                                </div>
                                <div class="col">

                            
                                  <button type="submit" class="btn btn-success">add a classe <i class="fas"></i></button>
                            </div>
                        </div>
                          </form>
                        </div>
                    </div>
<!--  end section add a classe-->  
             <!-- Start Section table -->




              <!-- End Section table -->
              <!-- start pagination -->
              <div class="row">
                  <div class="col-lg-6 offset-lg-3 py-5 d-flex">
                      <ul class="pagination mx-auto">
                          <li class="page-item disabled">
                              <a class="page-link" href="#" aria-label="Previous">
                                  <span aria-hidden="true">«</span>
                                  <span class="sr-only">Previous</span>
                              </a>
                          </li>
                          <li class="page-item active">
                              <a class="page-link" href="#">1</a>
                          </li>
                          <li class="page-item"><a class="page-link" href="#">2</a></li>
                          <li class="page-item"><a class="page-link" href="#">3</a></li>
                          <li class="page-item"><a class="page-link" href="#">4</a></li>
                          <li class="page-item">
                              <a class="page-link" href="#" aria-label="Next">
                                  <span aria-hidden="true">»</span>
                                  <span class="sr-only">Next</span>
                              </a>
                          </li>
                      </ul>
                  </div>
              <!-- End pagination -->
            </div>
          </div>
        </div>
     

<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
</body>
</html>