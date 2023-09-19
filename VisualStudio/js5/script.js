// Construir un programa que simule un menú de opciones para realizar las cuatro
// operaciones aritméticas básicas (suma, resta, multiplicación y división) con dos valores
// numéricos enteros. El usuario, además, debe especificar la operación con el primer
// carácter de la operación que desea realizar: ‘S' o ‘s’ para la suma, ‘R’ o ‘r’ para la resta, ‘M’
// o ‘m’ para la multiplicación y ‘D’ o ‘d’ para la división.



function suma(a,b){
    return a+b;
}

function resta(a,b){
    return a-b;
}

function multip(a,b){
    return a*b;
}

function divi(a,b){
    if (!b== 0) {
        return a/b;
    } else {
        return "No se puede didivir por cero";
    }
}

function menu(){
    const operacion = prompt ("ingrese la operacion que desea realizar 's' para suma / 'r' para resta / 'm' para multiplicacion / 'd' para division");

    const num1 = parseFloat(prompt("Ingrese el primer valor"));
    const num2 = parseFloat(prompt("Ingrese el segundo valor"));

    let resultado;
    
    switch (operacion.toLowerCase()) {
        case 's':
            resultado = suma(num1,num2);
            break;
            case 'r':
                resultado = resta(num1,num2);
                break;
                case 'm':
                    resultado=multip(num1,num2);
                    break;
                    case 'd':
                        resultado=divi(num1,num2);
                        break;
        default:
            resultado = "Opcion no valida";
            break;
    }

    document.write(`El resultado de la operación es: ${resultado}`);
}

menu();
