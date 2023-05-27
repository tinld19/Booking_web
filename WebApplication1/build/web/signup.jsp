
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!-- Latest compiled and minified CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet">

    <!-- Latest compiled JavaScript -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
    <title>Document</title>
</head>

<body>
          <form action="Registration" method="get">
    <section class="h-100 bg-dark">
        <div class="container py-5 h-100">
            <div class="row d-flex justify-content-center align-items-center h-100">
                <div class="col">
                    <div class="card card-registration my-4">
                        <div class="row g-0">
                            
                            <div class="col-xl-6 d-none d-xl-block">
                                <img src="image\ea756da805e6021c358647f2c9aa4af1.jpg" alt="Sample photo" class="img-fluid" style="border-top-left-radius: .25rem; border-bottom-left-radius: .25rem; height: 90%;" />
                            </div>
                      
                            <div class="col-xl-6">
                                <div class="card-body p-md-5 text-black">
                                    <h3 class="mb-4 text-uppercase">Registration Form</h3>
                                    
                                    <div class="row">
                                        <div class="col-md-6 mb-2">
                                            
                                            <div class="form-outline">
                                                <input name="first_name"  type="text" id="form3Example1" class="form-control form-control-lg" />
                                                <label class="form-label" for="form3Example1">First name</label>
                                            </div>
                                        </div>
                                        <div class="col-md-6 mb-2">
                                            <div class="form-outline">
                                                <input  name="last_name" type="text" id="form3Example2" class="form-control form-control-lg" />
                                                <label class="form-label" for="form3Example2">Last name</label>
                                            </div>
                                        </div>
                                    </div>

                                    <div class="d-md-flex justify-content-start align-items-center mb-2 py-2">

                                        <h6 class="mb-0 me-4">Gender: </h6>

                                        <div class="form-check form-check-inline mb-0 me-4">
                                            <input class="form-check-input" type="radio" name="gender" id="femaleGender" value="0" />
                                            <label class="form-check-label" for="femaleGender">Female</label>
                                        </div>

                                        <div class="form-check form-check-inline mb-0 me-4">
                                            <input class="form-check-input" type="radio" name="gender" id="maleGender" value="1" />
                                            <label class="form-check-label" for="maleGender">Male</label>
                                        </div>

                                        <div class="form-check form-check-inline mb-0">
                                            <input class="form-check-input" type="radio" name="gender" id="otherGender" value="option3" />
                                            <label class="form-check-label" for="otherGender">Other</label>
                                        </div>

                                    </div>

                                    <div class="form-outline mb-2">
                                        <input name="dob" type="date" id="form3Example3" class="form-control form-control-lg" />
                                        <label class="form-label" for="form3Example3">DOB</label>
                                    </div>
                                    <div class="form-outline mb-2">
                                        <input name="phone" type="number" id="form3Example4" class="form-control form-control-lg" />
                                        <label class="form-label" for="form3Example4">Phone number</label>
                                    </div>

                                    <div class="form-outline mb-2">
                                        <input name="email" type="email" id="form3Example5" class="form-control form-control-lg" />
                                        <label class="form-label" for="form3Example5">Email</label>
                                    </div>

                                    <div class="form-outline mb-2">
                                        <input name="address" type="text" id="form3Example6" class="form-control form-control-lg" />
                                        <label class="form-label" for="form3Example6">Address</label>
                                    </div>
                                    <div class="form-outline mb-2">
                                        <input name="pass" type="password" id="form3Example7" class="form-control form-control-lg" />
                                        <label class="form-label" for="form3Example7">Password</label>
                                    </div>
                                  


                                    <div class="d-flex justify-content-end pt-3">
                                        <button type="button" class="btn btn-light btn-lg">Reset all</button>
                                        <button type="submit" class="btn btn-warning btn-lg ms-2">Submit form</button>
                                    </div>

                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </section>
             </form>

</body>

</html>
