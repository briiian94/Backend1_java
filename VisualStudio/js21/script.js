// Escribir un programa para obtener un array de las propiedades de un objeto Persona.
// Las propiedades son nombre, edad, sexo ('H' hombre, 'M' mujer, 'O' otro), peso y altura.

const persona = {
    nombre: "brian",
    edad: 33,
    sexo: "H",
    peso: 78,
    altura: 1.69
  };

  const propiedades = Object.keys(persona);

  console.log(propiedades);