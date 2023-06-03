package servicios;

import entidades.Alumno;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author brian
 */
public class AlumnoServicios {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    /*En el servicio de Alumno deberemos tener un bucle que crea un objeto Alumno. Se pide
toda la información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le
pregunta al usuario si quiere crear otro Alumno o no.
Después de ese bucle tendremos el siguiente método en el servicio de Alumno:*/
    public ArrayList<Alumno> cargarAlumno() {
        ArrayList<Alumno> alumnos = new ArrayList();
        boolean confirmacion = true;
        do {
            Alumno alumno = new Alumno();
            System.out.println("Ingrese el nombre del alumno");
            alumno.setNombre(leer.next());
            ArrayList<Integer> notas = new ArrayList();
            System.out.println("Ingrese las 3 notas del alumno");
            for (int i = 0; i < 3; i++) {

                notas.add(leer.nextInt());
            }
            alumno.setNotas(notas);
            alumnos.add(alumno);
            System.out.println("Desea ingresar otro alumno? S/N");
            if (leer.next().equalsIgnoreCase("n")) {
                confirmacion = false;
            }
        } while (confirmacion);

        return alumnos;

    }

    /*Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su nota
final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método. Dentro
del método se usará la lista notas para calcular el promedio final de alumno. Siendo este
promedio final, devuelto por el método y mostrado en el main.*/
    public double buscarAlumno(ArrayList<Alumno> alumnos) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el nombre del alumno que desea calcular la nota final");
        String alumnoABuscar = leer.next();
        Iterator<Alumno> it = alumnos.iterator();

        while (it.hasNext()) {
            Alumno alumnoAux = it.next();
            if (alumnoAux.getNombre().equalsIgnoreCase(alumnoABuscar)) {
                return promedio(alumnoAux);
            }
        }
        System.out.println("No se encontro el alumno");
        return 0;
    }

    public double promedio(Alumno alumno) {
        double sumaNotas = 0;

        for (Integer nota : alumno.getNotas()) {
            sumaNotas += nota;
        }

        return sumaNotas / alumno.getNotas().size();

    }

}
