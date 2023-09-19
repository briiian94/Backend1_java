// Realizar un programa que, dado un número entero, visualice en pantalla si es par o impar.
// En caso de que el valor ingresado sea 0, se debe mostrar “el número no es par ni impar”.


var num1 = prompt("Ingrese un numero");

if (num1 != 0 && num1 % 2 === 0) {
     document.write("El numero es par");
} else if (num1 != 0)  {
     document.write("El numero es IMPAR");
} else {
     document.write("El numero no es IMPAR ni PAR");
}


