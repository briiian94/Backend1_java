// Realiza un programa que sólo permita introducir los caracteres ‘S’ y ‘N’. Si el usuario
// ingresa alguno de esos dos caracteres se deberá de imprimir un mensaje por pantalla
// que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”.

var caracter = prompt("Ingrese algun caracter solo S o N ");
caracter = caracter.toLowerCase();

if (caracter === 's' || caracter === 'n') {
    document.write("CORRECTO")
    
} else{
    document.write("INCORRECTO");
}
