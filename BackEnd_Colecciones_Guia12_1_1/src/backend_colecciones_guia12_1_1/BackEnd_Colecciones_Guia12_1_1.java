/*
Tenemos una clase padre Animal junto con sus 3 clases hijas Perro, Gato, Caballo.
La clase Animal tendrá como atributos el nombre, alimento, edad y raza del Animal.
Crear un método en la clase Animal a través del cual cada clase hija deberá mostrar luego un
mensaje por pantalla informando de que se alimenta. Generar una clase Main que realice lo
siguiente:


 */
package backend_colecciones_guia12_1_1;

import entidades.Animal;
import entidades.Caballo;
import entidades.Gato;
import entidades.Perro;
import java.util.ArrayList;

public class BackEnd_Colecciones_Guia12_1_1 {

    public static void main(String[] args) {
        ArrayList<Animal> animales = new ArrayList();

        //Declaracion del objeto Perro
        Animal perro1 = new Perro("Stich", "Carne", 15, "Doberman");
        animales.add(perro1);

        //Declaracion de otro objeto Perro
        Animal perro2 = new Perro("Teddy", "Croquetas", 10, "Chihuahua");
        animales.add(perro2);

        //Declaracion del objeto Gato
        Animal gato1 = new Gato("Pelusa", "Galletas", 15, "Siames");
        animales.add(gato1);

        //Declaracion del objeto Caballo
        Animal caballo1 = new Caballo("Spark", "Pasto", 25, "Fino");
        animales.add(caballo1);

        for (Animal animal : animales) {
            animal.Alimentarse();
        }
    }

}
