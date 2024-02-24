<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html lang="es">
    <!--Incluimos el head -->
    <%@include file="../plantilla/head.jsp" %>
    <body>
        
        <!--Cuerpo de la página -->
            <div class="login-container">
                <div class="login-form text-center">
                    <div class="login-logo">
                        <img src="../../assets/images/LOGO.PNG.png" alt="Logo StyleFlow">
                    </div>
                    <h1 class="h3 mb-3 fw-normal">Iniciar sesión</h1>
                    <form>
                        <div class="form-floating mb-3">
                            <input type="email" class="form-control" id="floatingInput" placeholder="correo@ejemplo.com">
                            <label for="floatingInput">Correo electrónico</label>
                        </div>
                        <div class="form-floating mb-3">
                            <input type="password" class="form-control" id="floatingPassword" placeholder="ContraseÃ±a">
                            <label for="floatingPassword">Contraseña</label>
                        </div>
                        <button class="w-100 btn btn-lg btn-primary" type="submit">Ingresar</button>
                        <p class="mt-3 mb-3 text-muted">&copy; StyleFlow 2023</p>
                    </form>
                </div>
            </div>
        <!--Incluimos el footer -->
        <%@include file="../plantilla/footer.jsp" %>
    </body>
</html>
