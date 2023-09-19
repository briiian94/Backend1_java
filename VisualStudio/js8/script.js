// 8. Escribir un programa que lea números enteros hasta teclear 0 (cero). Al finalizar el
// programa se debe mostrar el máximo número ingresado, el mínimo, y el promedio de
// todos ellos.

var numeros = [];

do {
    var num = parseFloat(prompt("Ingrese un numero"));
    numeros.push(num);

} while (num !=0);

var mayor = numeros[0];
for (var i = 1; i < numeros.length; i++) {
  if (numeros[i] > mayor) {
    mayor = numeros[i];
  }
}

var minimo = numeros[0];
for (var i = 1; i < numeros.length-1; i++) {
  if (numeros[i] < minimo) {
    minimo = numeros[i];
  }
}


var sum=0;
for (var i = 1; i < numeros.length; i++) {
    sum = sum + numeros[i];
}

document.write("El número más grande ingresado es: ", mayor, "<br>");
document.write("El número más chico ingresado es: ", minimo, "<br>");
document.write("Promedio es: ", sum/numeros.length, "<br>");