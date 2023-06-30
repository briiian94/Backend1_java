/*
Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de dos
clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase Persona con
atributos: nombre, apellido, edad, documento y Perro.
Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener que
pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo, mostrar desde
la clase Persona, la información del Perro y de la Persona.
 */

 /*Ahora se debe realizar unas mejoras al ejercicio de Perro y Persona. Nuestro programa va a
tener que contar con muchas personas y muchos perros. El programa deberá preguntarle a
cada persona, que perro según su nombre, quiere adoptar. Dos personas no pueden adoptar
al mismo perro, si la persona eligió un perro que ya estaba adoptado, se le debe informar a la
persona.
Una vez que la Persona elige el Perro se le asigna, al final deberemos mostrar todas las
personas con sus respectivos perros.*/
package backend_colecciones_guia11_1_1;

import entidades.Perro;
import entidades.Persona;
import java.util.List;
import java.util.Scanner;
import servicio.PerroServicio;
import servicio.PersonaServicio;

public class BackEnd_Colecciones_Guia11_1_1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        PersonaServicio ps = new PersonaServicio();
        PerroServicio perroServicio = new PerroServicio();

        int opcion;
        boolean op = true;

        List<Persona> personas = ps.crearPersona();
        List<Perro> perros = perroServicio.crearPerro();

        do {

            System.out.println("Menu");
            System.out.println("1. Mostrar nombre de perros cargados");
            System.out.println("2. Mostrar nombre de personas cargados");
            System.out.println("3. Adoptar un perro");
            System.out.println("4. Mostrar datos personas cargadas");
            System.out.println("5. Mostrar datos perros cargadas");
            System.out.println("6. Salir");
            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    perroServicio.mostrarNombrePerros(perros);
                    break;
                case 2:
                    ps.mostrarNombrePersonas(personas);
                    break;
                case 3:
                    ps.adoptarPerro(personas, perros);
                    break;
                case 4:
                    System.out.println(personas);
                    break;
                case 5:
                    System.out.println(perros);
                    break;
                case 6:
                    op = false;
                    break;
            }
        } while (op);

    }

}
