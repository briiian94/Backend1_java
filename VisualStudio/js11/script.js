// Escribir una función que reciba un String y devuelva la palabra más larga.
// String Ejemplo: “Guia de JavaScript”
// Resultado esperado : “JavaScript”


var frase = prompt("Ingrese una frase");
var palabraMasLarga = encontrarPalabraMasLarga(frase);
document.write("La palabra más larga: ", palabraMasLarga);

function encontrarPalabraMasLarga(frase) {
    const palabras = frase.split(" ");

    const palabraMasLarga = palabras.reduce((palabraActual, palabraSiguiente) => {
        return palabraActual.length > palabraSiguiente.length ? palabraActual : palabraSiguiente;
    });

    return palabraMasLarga;
}
