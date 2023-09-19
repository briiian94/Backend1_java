// Escribir un algoritmo en el cual se consulte al usuario que ingrese ¿cómo está el día de
// hoy? (soleado, nublado, lloviendo). A continuación, mostrar por pantalla un mensaje que
// indique “El día de hoy está ...”, completando el mensaje con el dato que ingresó el usuario.
        
        // Solicitar al usuario ingresar el estado del clima
        var clima = prompt("¿Cómo está el día de hoy? (soleado, nublado, lloviendo)");

        // Mostrar el mensaje con el estado del clima ingresado por el usuario
        if (clima) {
            var mensaje = "El día de hoy está " + clima;
            document.write(mensaje);
        } else {
            document.write("No ingresaste ningún dato.");
        }
