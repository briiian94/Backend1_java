// Crear un objeto persona, con las propiedades nombre, edad, sexo ('H' hombre, 'M' mujer,
// 'O' otro), peso y altura. A continuación, muestre las propiedades del objeto JavaScript.


const persona = new Object();

persona.nombre = "Brian";
persona.edad = 33;
persona.sexo = "H";
persona.peso = 78;
persona.altura = 1.69;


for (const propiedad in persona) {
    document.write(propiedad + ": " + persona[propiedad] + "<br>");
  }


