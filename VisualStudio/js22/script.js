// Escribir un programa de JavaScript que al clickear un botón muestre un mensaje a
// elección.



const boton = document.getElementById("boton");


boton.addEventListener("click", function() {
  alert("El boton ha sido clickeado correctamente!"); // Agregar un event listener para el clic en el botón
});