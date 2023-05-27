<%-- 
    Document   : home
    Created on : May 24, 2023, 1:16:14 AM
    Author     : ASUS
--%>

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
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.0/css/all.min.css">
    <link rel="stylesheet" href="css/style.css">


</head>

<body>
    <!-- ======= Top Bar ======= -->
    <div id="topbar" class="d-flex align-items-center fixed-top">
        <div class="container d-flex justify-content-between">
            <div class="contact-info d-flex align-items-center">
                <i class="bi bi-envelope"></i> <a href="mailto:contact@example.com">contact@example.com</a>
                <i class="bi bi-phone"></i> +1 5589 55488 55
            </div>
            <div class="d-none d-lg-flex social-links align-items-center">
                <a href="#" class="twitter"><i class="bi bi-twitter"></i></a>
                <a href="#" class="facebook"><i class="bi bi-facebook"></i></a>
                <a href="#" class="instagram"><i class="bi bi-instagram"></i></a>
                <a href="#" class="linkedin"><i class="bi bi-linkedin"></i></i></a>
            </div>
        </div>
    </div>

    <!-- ======= Header ======= -->
    <header id="header" class="fixed-top">
        <div class="container d-flex align-items-center">

            <h1 class="logo me-auto"><a href="index.html">Medilab</a></h1>
            <nav id="navbar" class="navbar order-last order-lg-0 ms-5" style="padding-left: 50px;">
                <ul>
                    <li><a class="nav-link scrollto active" href="#hero">Trang chủ</a></li>
                    <li><a class="nav-link scrollto" href="#about">Về chúng tôi</a></li>
                    <li><a class="nav-link scrollto" href="#services">Giá trị</a></li>
                    <li><a class="nav-link scrollto" href="#doctors">Bác sĩ</a></li>
                   
                </ul>
                <!-- <i class="bi bi-list mobile-nav-toggle"></i> -->
            </nav>
            <!-- .navbar -->

            <a href="#appointment" class="appointment-btn scrollto"><span class="d-none d-md-inline">Đặt Lịch </span>Hẹn</a>
            <li class="nav-item dropdown" style="list-style: none; padding-left: 130px;">
                <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-bs-toggle="dropdown" aria-expanded="false" >
                
                </a>
                <ul class="dropdown-menu" aria-labelledby="navbarDropdown">
                    <li><a class="dropdown-item" href="#">Tài Khoản</a></li>
                    <li><a class="dropdown-item" href="index.jsp">Đăng xuất</a></li>
                </ul>
            </li>
        </div>
    </header>
    <!-- ======= Hero Section ======= -->
    <section id="hero" class="d-flex align-items-center">
        <div class="container">
            <h1>Welcome to Medilab</h1>
            <h5>Mỗi ngày bận rộn trôi qua, chúng ta lại vô tình lãng quên tài sản quý<br> giá nhất của mình: Sức khỏe. Hãy để Medilab trở thành một cánh<br> tay đắc lực chăm sóc và gìn giữ tài sản đó cho bạn và cả gia đình.</h5>
            <a href="#about.html" class="btn-get-started scrollto">Bắt Đầu</a>
        </div>
    </section>

    <main id="main">

        <!-- ======= Why Us Section ======= -->
        <section id="why-us" class="why-us">
            <div class="container">

                <div class="row">
                    <div class="col-lg-4 d-flex align-items-stretch">
                        <div class="content">
                            <h3>Tại sao nên lựa chọn Medilab?</h3>
                            <p>
                                Medilab là một phòng khám hiện đại, thân thiện với đội ngũ chuyên gia được đào tạo tại Mỹ, tận tâm cung cấp cho gia đình bạn mọi dịch vụ khám chữa bệnh cần thiết để chăm sóc toàn diện. Nhân viên Medilab tự tin rằng bạn sẽ thấy phòng khám của chúng tôi
                                luôn thân thiện và chuyên nghiệp mỗi khi bạn ghé thăm. Thành công của chúng tôi được đo bằng từng bệnh nhân và từng nụ cười.

                            </p>
                            <div class="text-center">
                                <a href="#" class="more-btn">Xem thêm <i class="bx bx-chevron-right"></i></a>
                            </div>
                        </div>
                    </div>
                    <div class="col-lg-8 d-flex align-items-stretch">
                        <div class="icon-boxes d-flex flex-column justify-content-center">
                            <div class="row">
                                <div class="col-xl-4 d-flex align-items-stretch">
                                    <div class="icon-box mt-4 mt-xl-0">
                                        <i class="fa-solid fa-hospital"></i>
                                        <h4>Phòng Khám Chất Lượng</h4>
                                        <p>Bác sĩ học tập và làm việc tại Mỹ nhiều năm kinh nghiệm. Trang thiết bị, máy chụp x-quang hiện đại chẩn đoán thích hợp</p>
                                    </div>
                                </div>
                                <div class="col-xl-4 d-flex align-items-stretch">
                                    <div class="icon-box mt-4 mt-xl-0">
                                        <i class="fa-solid fa-briefcase-medical"></i>
                                        <h4>Dễ Tìm Hiểu</h4>
                                        <p>Nhận tất cả thông tin về Medilab trên trang web của chúng tôi</p>
                                    </div>
                                </div>
                                <div class="col-xl-4 d-flex align-items-stretch">
                                    <div class="icon-box mt-4 mt-xl-0">
                                        <i class="fa-solid fa-capsules"></i>
                                        <h4>Lịch Trình Tài Chính Thuận Tiện</h4>
                                        <p>
                                            Báo giá nhanh, chính xác qua email hoặc điện thoại</p>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <!-- End .content-->
                    </div>
                </div>

            </div>
        </section>
        <!-- End Why Us Section -->
        <!-- ======= About Section ======= -->
        <section id="about" class="about">
            <div class="container-fluid">

                <div class="row">
                    <div class="col-xl-5 col-lg-6 video-box d-flex justify-content-center align-items-stretch position-relative">
                        <a href="https://www.youtube.com/watch?v=wQ2TN_gI3sE" class="glightbox play-btn mb-4"></a>
                    </div>

                    <div class="col-xl-7 col-lg-6 icon-boxes d-flex flex-column align-items-stretch justify-content-center py-5 px-lg-5">
                        <h3>Phòng khám chăm sóc sức khỏe tư nhân hàng đầu tại Việt Nam.</h3>
                        <p>Medilab cam kết hướng tới sự xuất sắc trong hoạt động thăm khám lâm sàng, đào tạo và nghiên cứu nhằm cung cấp dịch vụ chăm sóc tốt nhất. Medilab đã tạo dựng được uy tín vững chắc trong việc cung cấp dịch vụ chăm sóc sức khỏe lấy
                            bệnh nhân làm trung tâm, với chi phí hợp lý và chất lượng cao. Chúng tôi tự hào trong việc nỗ lực cải thiện chất lượng dịch vụ chăm sóc sức khỏe ở Việt Nam, góp phần vào sự phồn vinh và an sinh của đất nước. </p>

                        <div class="icon-box">
                            <div class="icon"><i class="fa-solid fa-fingerprint"></i></div>
                            <h4 class="title"><a href="">Mục đích</a></h4>
                            <p class="description">Vì mục tiêu nâng cao sức khỏe và hạnh phúc của mọi người dân Việt Nam</p>
                        </div>

                        <div class="icon-box">
                            <div class="icon"><i class="fa-solid fa-street-view"></i></div>
                            <h4 class="title"><a href="">Tầm nhìn</a></h4>
                            <p class="description">Trở thành đơn vị dẫn đầu toàn quốc về lĩnh vực chăm sóc sức khỏe và là thương hiệu chăm sóc sức khỏe đáng tin cậy nhất ở Việt Nam.</p>
                        </div>

                        <div class="icon-box">
                            <div class="icon"><i class="fa-solid fa-flask"></i></div>
                            <h4 class="title"><a href="">Sứ mệnh</a></h4>
                            <p class="description">Sứ mệnh của chúng tôi là nâng cao sức khỏe và đời sống của người dân Việt Nam, thông qua một hệ thống bao gồm các cơ sở chăm sóc sức khỏe tại các thành phố lớn với phương châm sáng tạo, tích hợp và lấy bệnh nhân làm trung tâm.</p>
                        </div>

                    </div>
                </div>

            </div>
        </section>
        <!-- End About Section -->
        <!-- ======= Services Section ======= -->
        <section id="services" class="services">
            <div class="container">

                <div class="section-title">
                    <h2>Giá trị của chúng tôi</h2>
                    <p>Công việc của chúng tôi được định hình chủ yếu bởi các giá trị cốt lõi của chúng tôi
                    </p>
                </div>

                <div class="row">
                    <div class="col-lg-4 col-md-6 d-flex align-items-stretch">
                        <div class="icon-box">
                            <div class="icon"><i class="fas fa-heartbeat"></i></div>
                            <h4><a href="">Lòng Trắc Ẩn</a></h4>
                            <p>Chúng tôi mong muốn thấu hiểu và quan tâm đến những lo lắng và nhu cầu của bệnh nhân bằng cách lắng nghe chăm chú và đặt mình vào vị trí của họ.
                            </p>
                        </div>
                    </div>

                    <div class="col-lg-4 col-md-6 d-flex align-items-stretch mt-4 mt-md-0">
                        <div class="icon-box">
                            <div class="icon"><i class="fas fa-pills"></i></div>
                            <h4><a href="">Phát Triển</a></h4>
                            <p>
                                Chúng tôi cố gắng thích nghi với các tình huống khác nhau, với mong muốn học hỏi và phấn đấu để trở nên tốt hơn. Học hỏi các xu hướng và công nghệ mới trong ngành.</p>
                        </div>
                    </div>

                    <div class="col-lg-4 col-md-6 d-flex align-items-stretch mt-4 mt-lg-0">
                        <div class="icon-box">
                            <div class="icon"><i class="fas fa-hospital-user"></i></div>
                            <h4><a href="">Sự Tôn Trọng</a></h4>
                            <p>Tôn trọng mọi người chúng ta gặp và đối xử với họ như cách chúng ta muốn được đối xử. Cho dù đó là đồng nghiệp hay bệnh nhân, sự hiểu biết và tôn trọng đều quan trọng.</p>
                        </div>
                    </div>
                </div>

            </div>
        </section>
        <!-- End Services Section -->
        <!-- ======= Appointment Section ======= -->
        
        <!-- End Appointment Section -->

        <!-- ======= Doctors Section ======= -->
        <section id="doctors" class="doctors">
            <div class="container">

                <div class="section-title">
                    <h2>Bác Sĩ</h2>
                    <p>Chúng tôi làm việc không chỉ bằng trí óc mà còn bằng trái tim. </p>
                </div>

                <div class="row">

                    <div class="col-lg-6">
                        <div class="member d-flex align-items-start">
                            <div class="pic"><img src="assets/img/doctors/doctors-1.jpg" class="img-fluid" alt=""></div>
                            <div class="member-info">
                                <h4>Walter White</h4>
                                <span>Chief Medical Officer</span>
                                <p>Explicabo voluptatem mollitia et repellat qui dolorum quasi</p>
                                <div class="social">
                                    <a href=""><i class="ri-twitter-fill"></i></a>
                                    <a href=""><i class="ri-facebook-fill"></i></a>
                                    <a href=""><i class="ri-instagram-fill"></i></a>
                                    <a href=""> <i class="ri-linkedin-box-fill"></i> </a>
                                </div>
                            </div>
                        </div>
                    </div>

                    <div class="col-lg-6 mt-4 mt-lg-0">
                        <div class="member d-flex align-items-start">
                            <div class="pic"><img src="assets/img/doctors/doctors-2.jpg" class="img-fluid" alt=""></div>
                            <div class="member-info">
                                <h4>Sarah Jhonson</h4>
                                <span>Anesthesiologist</span>
                                <p>Aut maiores voluptates amet et quis praesentium qui senda para</p>
                                <div class="social">
                                    <a href=""><i class="ri-twitter-fill"></i></a>
                                    <a href=""><i class="ri-facebook-fill"></i></a>
                                    <a href=""><i class="ri-instagram-fill"></i></a>
                                    <a href=""> <i class="ri-linkedin-box-fill"></i> </a>
                                </div>
                            </div>
                        </div>
                    </div>

                    <div class="col-lg-6 mt-4">
                        <div class="member d-flex align-items-start">
                            <div class="pic"><img src="assets/img/doctors/doctors-3.jpg" class="img-fluid" alt=""></div>
                            <div class="member-info">
                                <h4>William Anderson</h4>
                                <span>Cardiology</span>
                                <p>Quisquam facilis cum velit laborum corrupti fuga rerum quia</p>
                                <div class="social">
                                    <a href=""><i class="ri-twitter-fill"></i></a>
                                    <a href=""><i class="ri-facebook-fill"></i></a>
                                    <a href=""><i class="ri-instagram-fill"></i></a>
                                    <a href=""> <i class="ri-linkedin-box-fill"></i> </a>
                                </div>
                            </div>
                        </div>
                    </div>

                    <div class="col-lg-6 mt-4">
                        <div class="member d-flex align-items-start">
                            <div class="pic"><img src="assets/img/doctors/doctors-4.jpg" class="img-fluid" alt=""></div>
                            <div class="member-info">
                                <h4>Amanda Jepson</h4>
                                <span>Neurosurgeon</span>
                                <p>Dolorum tempora officiis odit laborum officiis et et accusamus</p>
                                <div class="social">
                                    <a href=""><i class="ri-twitter-fill"></i></a>
                                    <a href=""><i class="ri-facebook-fill"></i></a>
                                    <a href=""><i class="ri-instagram-fill"></i></a>
                                    <a href=""> <i class="ri-linkedin-box-fill"></i> </a>
                                </div>
                            </div>
                        </div>
                    </div>

                </div>

            </div>
        </section>
        <!-- End Doctors Section -->

        <!-- ======= Testimonials Section ======= -->
        <section id="testimonials" class="testimonials">
            <div class="section-title">
                <h2>Lời Chứng Thực</h2>
                <p>Khách hàng của chúng tôi nói gì.</p>
            </div>
            <div class="container">

                <div class="testimonials-slider swiper" data-aos="fade-up" data-aos-delay="100">
                    <div class="swiper-wrapper">

                        <div class="swiper-slide">
                            <div class="testimonial-wrap">
                                <div class="testimonial-item">
                                    <img src="image\f95fc16481403664909ffe5931524be5.jpg" class="testimonial-img" alt="">
                                    <h3>Nguyễn Kỳ Duyên</h3>
                                    <h4>Ceo &amp; Founder</h4>
                                    <p>
                                        <i class="bx bxs-quote-alt-left quote-icon-left"></i>Xin chào tất cả các nhân viên đáng yêu, tôi không thể cảm ơn đủ tất cả vì sự kiên nhẫn và cách đối xử chuyên nghiệp mà tôi nhận được từ tất cả các bạn. Tất cả
                                        các bạn đã vượt lên trên và vượt ra ngoài nhiệm vụ chuyên môn của mình. Tôi đã thấy sức khỏe của mình tốt hơn nhiều. Cảm ơn bạn một lần nữa, tôi sẽ giữ liên lạc. Thương mến với những lời chúc tốt đẹp nhất.
                                        <i class="bx bxs-quote-alt-right quote-icon-right"></i>
                                    </p>
                                </div>
                            </div>
                        </div>
                        <!-- End testimonial item -->

                        <div class="swiper-slide">
                            <div class="testimonial-wrap">
                                <div class="testimonial-item">
                                    <img src="image\043e5001a060c202b4c9b3574720cb87.jpg" class="testimonial-img" alt="">
                                    <h3>Sara Wilsson</h3>
                                    <h4>Designer</h4>
                                    <p>
                                        <i class="bx bxs-quote-alt-left quote-icon-left"></i> Export tempor illum tamen malis malis eram quae irure esse labore quem cillum quid cillum eram malis quorum velit fore eram velit sunt aliqua noster fugiat irure
                                        amet legam anim culpa.
                                        <i class="bx bxs-quote-alt-right quote-icon-right"></i>
                                    </p>
                                </div>
                            </div>
                        </div>
                        <!-- End testimonial item -->

                        <div class="swiper-slide">
                            <div class="testimonial-wrap">
                                <div class="testimonial-item">
                                    <img src="image\f7e17565a2b75309bd9906959d53de41.jpg" class="testimonial-img" alt="">
                                    <h3>Jena Karlis</h3>
                                    <h4>Store Owner</h4>
                                    <p>
                                        <i class="bx bxs-quote-alt-left quote-icon-left"></i> Enim nisi quem export duis labore cillum quae magna enim sint quorum nulla quem veniam duis minim tempor labore quem eram duis noster aute amet eram fore quis
                                        sint minim.
                                        <i class="bx bxs-quote-alt-right quote-icon-right"></i>
                                    </p>
                                </div>
                            </div>
                        </div>
                        <!-- End testimonial item -->



                    </div>
                    <div class="swiper-pagination"></div>
                </div>

            </div>
        </section>
        <!-- End Testimonials Section -->
        <!-- ======= Gallery Section ======= -->
        <section id="gallery" class="gallery">
            <div class="container">

                <div class="section-title">
                    <h2>Hình Ảnh</h2>
                    <p>Thành công không bao giờ là của riêng một ai. Nó là sản phẩm của cả một tập thể làm việc, phối hợp thông qua sự chia sẻ, tin tưởng và tôn trọng lẫn nhau.</p>
                </div>
            </div>

            <div class="container-fluid">
                <div class="row g-0">

                    <div class="col-lg-3 col-md-4">
                        <div class="gallery-item">
                            <a href="image/gallery/gallery-1.jpg" class="galelry-lightbox">
                                <img src="image/gallery/gallery-1.jpg" alt="" class="img-fluid">
                            </a>
                        </div>
                    </div>

                    <div class="col-lg-3 col-md-4">
                        <div class="gallery-item">
                            <a href="image/gallery/gallery-2.jpg" class="galelry-lightbox">
                                <img src="image/gallery/gallery-2.jpg" alt="" class="img-fluid">
                            </a>
                        </div>
                    </div>

                    <div class="col-lg-3 col-md-4">
                        <div class="gallery-item">
                            <a href="image/gallery/gallery-3.jpg" class="galelry-lightbox">
                                <img src="image/gallery/gallery-3.jpg" alt="" class="img-fluid">
                            </a>
                        </div>
                    </div>

                    <div class="col-lg-3 col-md-4">
                        <div class="gallery-item">
                            <a href="image/gallery/gallery-4.jpg" class="galelry-lightbox">
                                <img src="image/gallery/gallery-4.jpg" alt="" class="img-fluid">
                            </a>
                        </div>
                    </div>

                    <div class="col-lg-3 col-md-4">
                        <div class="gallery-item">
                            <a href="image/gallery/gallery-5.jpg" class="galelry-lightbox">
                                <img src="image/gallery/gallery-5.jpg" alt="" class="img-fluid">
                            </a>
                        </div>
                    </div>

                    <div class="col-lg-3 col-md-4">
                        <div class="gallery-item">
                            <a href="image/gallery/gallery-6.jpg" class="galelry-lightbox">
                                <img src="image/gallery/gallery-6.jpg" alt="" class="img-fluid">
                            </a>
                        </div>
                    </div>

                    <div class="col-lg-3 col-md-4">
                        <div class="gallery-item">
                            <a href="image/gallery/gallery-7.jpg" class="galelry-lightbox">
                                <img src="image/gallery/gallery-7.jpg" alt="" class="img-fluid">
                            </a>
                        </div>
                    </div>

                    <div class="col-lg-3 col-md-4">
                        <div class="gallery-item">
                            <a href="image/gallery/gallery-8.jpg" class="galelry-lightbox">
                                <img src="image/gallery/gallery-8.jpg" alt="" class="img-fluid">
                            </a>
                        </div>
                    </div>

                </div>

            </div>
        </section>
        <!-- End Gallery Section -->
    </main>
    <!-- End #main -->

    <!-- ======= Footer ======= -->
    <footer id="footer">

        <div class="footer-top">
            <div class="container">
                <div class="row">

                    <div class="col-lg-3 col-md-6 footer-contact">
                        <h3>Medilab</h3>
                        <p>
                            Đà Nẵng<br>Việt Nam<br>
                            <strong>Phone:</strong> +84 587 633 469<br>
                            <strong>Email:</strong> medilab@gmail.com<br>
                        </p>
                    </div>

                    <div class="col-lg-2 col-md-6 footer-links">
                        <h4>Useful Links</h4>
                        <ul>
                            <li><i class="bx bx-chevron-right"></i> <a href="#hero">Trang chủ</a></li>
                            <li><i class="bx bx-chevron-right"></i> <a href="#about">Về chúng tôi</a></li>
                            <li><i class="bx bx-chevron-right"></i> <a href="#service">Giá trị</a></li>
                            <li><i class="bx bx-chevron-right"></i> <a href="#">Bác sĩ</a></li>
                        </ul>
                    </div>

                    <div class="col-lg-3 col-md-6 footer-links">
                        <h4>Giờ Hoạt Động</h4>
                        <ul>
                            <li><i class="bx bx-chevron-right"></i>Thứ hai : 08.00 – 18.00</li>
                            <li><i class="bx bx-chevron-right"></i>Thứ ba : 08.00 – 18.00</li>
                            <li><i class="bx bx-chevron-right"></i>Thứ tư : 08.00 – 18.00</li>
                            <li><i class="bx bx-chevron-right"></i>Thứ năm : 08.00 – 18.00</li>
                            <li><i class="bx bx-chevron-right"></i>Thứ sáu : 08.00 – 18.00</li>
                            <li><i class="bx bx-chevron-right"></i>Thứ bảy : 08.00 – 18.00</li>
                            <li><i class="bx bx-chevron-right"></i>Chủ nhật : Đóng cửa</li>


                        </ul>
                    </div>

                    <div class="col-lg-4 col-md-6 footer-newsletter">
                        <h4>Kết Nối Với Chúng Tôi</h4>
                        <p>Theo dõi bản tin của chúng tôi</p>
                        <form action="" method="post">
                            <input type="email" name="email" placeholder="&nbsp;Enter your email">><input type="submit" value="Subscribe">
                        </form>
                    </div>

                </div>
            </div>
        </div>

    </footer>
    <!-- End Footer -->

</body>

</html>