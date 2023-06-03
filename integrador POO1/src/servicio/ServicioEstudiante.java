/*Una vez creado los estudiantes deberemos guardar los estudiantes en un arreglo de objetos tipo Estudiante, usando ese arreglo tenemos que realizar las dos tareas que nos ha pedido la escuela.
Calcular y mostrar el promedio de notas de todo el curso
Retornar otro arreglo con los nombre de los alumnos que recibieron una nota mayor al promedio del curso
Por último, deberemos mostrar todos los estudiantes con una nota mayor al promedio.
Nota: para crear un vector de objetos la definición es la siguiente:
Objeto[] nombreVector = new Objeto[];
 */
package servicio;

import entidades.Estudiante;
import java.util.Scanner;

/**
 *
 * @author brian
 */
public class ServicioEstudiante {

    Scanner leer = new Scanner(System.in);

    public Estudiante[] llenarNotas() {
        Estudiante[] estudiantes = new Estudiante[8];

        for (int i = 0; i < 8; i++) {
            System.out.println("Ingrese el nombre del estudiante " + (i + 1));
            String nombre = leer.next();
            System.out.println("Ingrese la nota");
            double nota = leer.nextDouble();
            estudiantes[i] = new Estudiante(nombre, nota);

        }
        return estudiantes;
    }

    public String[] promedio(Estudiante[] estudiantes) {
        double sumPromedio = 0;

        for (int i = 0; i < 8; i++) {
            sumPromedio += estudiantes[i].getNota();

        }
        double promedio = sumPromedio / 8;
        System.out.println("El promedio de notas de todos los alumnos es " + promedio);

        String[] notaMayor = new String[8];
        for (int i = 0; i < 8; i++) {

            if (estudiantes[i].getNota() > promedio) {
                notaMayor[i] = estudiantes[i].getNombre();
                System.out.println("El estudiante " + notaMayor[i] + " tiene una nota mayor al promedio");
            } else {
                notaMayor[i] = "";
            }
        }
        return notaMayor;
    }

    public void mostrar(String[] notaMayor) {
        System.out.println("Los estudiantes con nota mayor al promedio son: ");
        for (int i = 0; i < 8; i++) {
            System.out.print(notaMayor[i] + " ");
        }
        System.out.println();
    }

}
