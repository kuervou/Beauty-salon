<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html lang="es">
    <!--Incluimos el head -->
    <%@include file="../plantilla/head.jsp" %>
    <body>
        <!--Incluimos el header -->
        <%@include file="../plantilla/header.jsp" %>
        
        <!-- Cuerpo de la página -->
        <div class="homepage-container">
            <div class="overlay"></div>
            
            <div id="carouselExampleControls" class="carousel slide" data-bs-ride="carousel">
                <div class="carousel-inner">
                    <div class="carousel-item active">
                        <div class="card glass mx-auto" style="width: 75%; height: 80vh;">
                            <div class="card-inner">
                                <div class="card-body">
                                    <img src="../../assets/images/agenda.jpeg" alt="Imagen de la card" class="card-image">
                                    <h5 class="card-title"><a href="#">Agenda</a></h5>
                                    <p class="card-text">Te merecés verte bien, reservá ahora.</p>
                                </div>
                            </div>
                        </div>
                    </div>
                    
                    <div class="carousel-item">
                        <div class="card glass mx-auto" style="width: 75%; height: 80vh;">
                            <div class="card-inner">
                                <div class="card-body">
                                    <img src="../../assets/images/servicios.jpeg" alt="Imagen de la card" class="card-image">
                                    <h5 class="card-title"><a href="#">Servicios</a></h5>
                                    <p class="card-text">Pensando en cambiar de look? Mirá todas las opciones.</p>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="carousel-item">
                        <div class="card glass mx-auto" style="width: 75%; height: 80vh;">
                            <div class="card-inner">
                                <div class="card-body">
                                    <img src="../../assets/images/productos.jpg" alt="Imagen de la card" class="card-image">
                                    <h5 class="card-title"><a href="#">Productos</a></h5>
                                    <p class="card-text">Mirá todo lo que tenemos para vos en nuestro local.</p>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="carousel-item">
                        <div class="card glass mx-auto" style="width: 75%; height: 80vh;">
                            <div class="card-inner">
                                <div class="card-body">
                                    <img src="../../assets/images/nosotros.jpg" alt="Imagen de la card" class="card-image">
                                    <h5 class="card-title"><a href="#">Acerca de nosotros</a></h5>
                                    <p class="card-text">Todo acerca de StyleFlow</p>
                                </div>
                            </div>
                        </div>
                    </div>
                     <div class="carousel-item">
                        <div class="card glass mx-auto" style="width: 75%; height: 80vh;">
                          <div class="card-inner">
                            <div class="card-body">
                              <img src="../../assets/images/styleflow.PNG" alt="Imagen de la card" class="card-image">
                              <h5 class="card-title">
                                <a href="../users/registrarse.jsp">Registrate</a> | <a href="../users/login.jsp">Inicia Sesión</a>
                              </h5>
                              <p class="card-text">¿Qué estás esperando?</p>
                            </div>
                          </div>
                        </div>
                      </div>
                </div>
                <button class="carousel-control-prev" type="button" data-bs-target="#carouselExampleControls" data-bs-slide="prev">
                    <span class="carousel-control-prev-icon" aria-hidden="true"></span>
                    <span class="visually-hidden">Previous</span>
                </button>
                <button class="carousel-control-next" type="button" data-bs-target="#carouselExampleControls" data-bs-slide="next">
                    <span class="carousel-control-next-icon" aria-hidden="true"></span>
                    <span class="visually-hidden">Next</span>
                </button>
            </div>
        </div>
        
        <!--Incluimos el footer -->
        <%@include file="../plantilla/footer.jsp" %>
    </body>
</html>
