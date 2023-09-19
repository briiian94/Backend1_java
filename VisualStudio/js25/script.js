// Escriba una función de JavaScript para obtener los valores de Nombre y Apellido del
// siguiente formulario


function getFormValores() {
    const valor = document.getElementById("form1");

    const nombre = valor.nombre.value;
    const apellido = valor.apellido.value;

    console.log("Nombre: "+nombre);
    console.log("Apellido: "+apellido);

    return false;
}


