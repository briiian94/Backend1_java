/*
Crear una clase llamada Alumno que mantenga información sobre las notas de distintos
alumnos. La clase Alumno tendrá como atributos, su nombre y una lista de tipo Integer
con sus 3 notas.
 */
package backend_colecciones_guia10_1_3;

import entidades.Alumno;
import java.util.ArrayList;
import servicios.AlumnoServicios;

/**
 *
 * @author brian
 */
public class BackEnd_Colecciones_Guia10_1_3 {

    public static void main(String[] args) {
        AlumnoServicios as = new AlumnoServicios();
        ArrayList<Alumno> alumnos = as.cargarAlumno();

        for (Alumno alumno : alumnos) {
            System.out.println(alumno.toString());
        }

        System.out.println("La nota promedio del alumno es " + as.buscarAlumno(alumnos));
    }

}
