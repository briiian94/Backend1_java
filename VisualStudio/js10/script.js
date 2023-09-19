// Escribir una función flecha que reciba una palabra y la devuelva al revés.


var palabra = prompt("Ingrese una palabra");


const inversa = palabra => {
    return palabra.split('').reverse().join('');l
}

var invertida = inversa(palabra);

document.write("Palabra original ", palabra, "<br>");
document.write("Palabra invertida ", invertida);

