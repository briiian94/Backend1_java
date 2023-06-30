/*
Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de dos
clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase Persona con
atributos: nombre, apellido, edad, documento y Perro.
Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener que
pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo, mostrar desde
la clase Persona, la información del Perro y de la Persona.
 */
package backend_colecciones_guia11_1_1;

import entidades.Perro;
import entidades.Persona;

public class BackEnd_Colecciones_Guia11_1_1 {

    public static void main(String[] args) {
        Persona[] personas = new Persona[2];
        personas[0] = new Persona("Brian", "Michel", 33, 35069243, null);
        personas[1] = new Persona("Ivan", "Gillig", 33, 33745688, null);

        Perro[] perros = new Perro[2];

        perros[0] = new Perro("Quiron", "BullTerrier", 10, "Mediano");
        perros[1] = new Perro("Canela", "Caniche", 10, "Pequeño");

        for (int i = 0; i < personas.length; i++) {
            personas[i].setPerro(perros[i]);
        }

        for (Persona persona : personas) {
            System.out.println(persona.toString());
        }

    }

}
