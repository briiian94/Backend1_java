// A partir del siguiente array: var valores = [true, 5, false, "hola", "adios", 2]:
// a) Determinar cual de los dos elementos de texto es mayor
// b) Utilizando exclusivamente los dos valores booleanos del array, determinar los
// operadores necesarios para obtener un resultado true y otro resultado false
// c) Determinar el resultado de las cinco operaciones matemáticas realizadas con los
// dos elementos numéricos

var valores = [true, 5, false, "hola", "adios", 2];


// a) Determinar cual de los dos elementos de texto es mayor

const elementosDeTexto = valores.filter(item => typeof item === "string"); // filtrar solo strings del arreglo

const string1 = elementosDeTexto[0];
const string2 = elementosDeTexto[1];

if (string1 > string2) {
    document.write(`El texto '${string1}' es mas largo que el '${string2}'.`);
} else if (string2 > string1){
    document.write(`El texto '${string2}' es mas largo que el '${string1}'.`);
} else {
    document.write("Ambos textos tienen el mismo largo");
}

