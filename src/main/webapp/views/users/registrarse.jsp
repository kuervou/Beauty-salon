<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html lang="es">
    <!--Incluimos el head -->
    <%@include file="../plantilla/head.jsp" %>
    <body>
        
        
        <!-- Cuerpo de la página -->
            <div class="register-container">
                <div class="register-form text-center">
                    <div class="login-logo">
                        <img src="../../assets/images/LOGO.PNG.png" alt="Logo StyleFlow">
                    </div>
                    <h1 class="h3 mb-3 fw-normal">Registro de usuario</h1>
                    <form>
                        <div class="row">
                            <div class="col-md-6 mb-3">
                                <div class="form-floating">
                                    <input type="text" class="form-control" id="firstName" placeholder="Nombre" required>
                                    <label for="firstName">Nombre</label>
                                </div>
                            </div>
                            <div class="col-md-6 mb-3">
                                <div class="form-floating">
                                    <input type="text" class="form-control" id="lastName" placeholder="Apellido" required>
                                    <label for="lastName">Apellido</label>
                                </div>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-md-6 mb-3">
                                <div class="form-floating">
                                    <input type="number" class="form-control" id="age" placeholder="Edad">
                                    <label for="age">Edad</label>
                                </div>
                            </div>
                            <div class="col-md-6 mb-3">
                                <div class="form-floating">
                                    <input type="email" class="form-control" id="email" placeholder="correo@ejemplo.com" required>
                                    <label for="email">Correo electrónico</label>
                                </div>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-md-12 mb-3">
                                <div class="form-floating">
                                    <input type="tel" class="form-control" id="phone" placeholder="Teléfono" required>
                                    <label for="phone">Teléfono</label>
                                </div>
                            </div>
                        </div>
                        <button class="w-100 btn btn-lg btn-primary" type="submit">Registrarse</button>
                        <p class="mt-3 mb-3 text-muted">&copy; StyleFlow 2023</p>
                    </form>
                </div>
            </div>

        
        <!--Incluimos el footer -->
        <%@include file="../plantilla/footer.jsp" %>
    </body>
</html>
