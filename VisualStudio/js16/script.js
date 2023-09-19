// Realizar un programa que rellene dos vectores al mismo tiempo, con 5 valores aleatorios
// y los muestre por pantalla.


function numAleatorio(min,max) {
    return Math.floor(Math.random() * (max - min + 1)) + min;
}


const vector1 = [];
const vector2 = [];

for (let i = 0; i < 5; i++) {
    vector1.push(numAleatorio(1,50));
    vector2.push(numAleatorio(1,50));
}

document.write("Vector 1 = "+vector1+"<br>");
document.write("Vector 2 = "+vector2);