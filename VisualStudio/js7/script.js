// Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación
// solicite números al usuario hasta que la suma de los números introducidos supere el
// límite inicial.

const limite = 245;

var num = 0;

while (num <= limite) {
    var num2 = parseFloat(prompt("Ingrese un numero"));
    num = num + num2;
    if (num > limite) {
        document.write("La suma de los numeros ingresados supero el limite definido");
        break;
    }
}



