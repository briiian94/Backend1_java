// Escribe un programa JavaScript para calcular el área y el perímetro de un objeto Círculo
// con la propiedad radio. Nota: Cree dos métodos para calcular el área y el perímetro. El
// radio del círculo lo proporcionará el usuario.

const radio = parseFloat(prompt("Ingrese el radio de un circulo"));




function calcularArea(radio){   //Funcion tradicional
    return area = Math.PI*radio*radio;
}

const calcularPerimetro = radio => 2 * Math.PI * radio; // funcion flecha

var area = calcularArea(radio);
var perimetro = calcularPerimetro(radio);

document.write("El area es: "+area+"<br>");
document.write("El perimetro es: "+perimetro+"<br>");


