/*
 Una escuela ha terminado su ciclo lectivo y todos sus alumnos ya rindieron el examen final. 
La escuela nos ha pedido que calculemos el promedio de notas final de todos sus alumnos y saber 
qué alumnos han recibido una nota por encima de ese promedio.
 */
package integrador.poo1;

import entidades.Estudiante;
import servicio.ServicioEstudiante;

/**
 *
 * @author brian
 */
public class IntegradorPOO1 {

    public static void main(String[] args) {

        ServicioEstudiante sc = new ServicioEstudiante();
        Estudiante[] e1 = sc.llenarNotas();
        sc.promedio(e1);
        sc.mostrar(sc.promedio(e1));

    }

}
