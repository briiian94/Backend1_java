// Conocido el número en matemática PI π, pedir al usuario que ingrese el valor del radio
// de una circunferencia y calcular y mostrar por pantalla el área y perímetro. Recuerde que
// para calcular el área y el perímetro se utilizan las siguientes fórmulas:
// area = PI * radio2
// perimetro = 2 * PI * radio

var radio = prompt("Ingrese el valor del radio de una circunferencia");

if(radio) {
var area = Math.PI * radio * radio;
var perimetro = 2 * Math.PI * radio;

document.write("El area del circulo es: "+ area + " y el perimetro es: "+perimetro);


}


