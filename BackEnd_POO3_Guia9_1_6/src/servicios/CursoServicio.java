/*A continuación, se implementarán los siguientes métodos:
a. Método cargarAlumnos(): este método le permitirá al usuario ingresar los 
alumnos que asisten a las clases. Nosotros nos encargaremos de almacenar esta 
información en un arreglo e iterar con un bucle, solicitando en cada repetición 
que se ingrese el nombre de cada alumno
b. Método crearCurso(): el método crear curso, le pide los valores de los atributos 
al usuario y después se le asignan a sus respectivos atributos para llenar el objeto Curso.
En este método invocamos al método cargarAlumnos() para asignarle valor al atributo alumnos
c. Método calcularGananciaSemanal(): este método se encarga de calcular la ganancia 
en una semana por curso. Para ello, se deben multiplicar la cantidad de horas por día, 
el precio por hora, la cantidad de alumnos y la cantidad de días a la semana que se repite el encuentro.
 */
package servicios;

import entidades.Curso;
import java.util.Scanner;

/**
 *
 * @author brian
 */
public class CursoServicio {

    Scanner leer = new Scanner(System.in);

    /*a. Método cargarAlumnos(): este método le permitirá al usuario ingresar los 
alumnos que asisten a las clases. Nosotros nos encargaremos de almacenar esta 
información en un arreglo e iterar con un bucle, solicitando en cada repetición 
que se ingrese el nombre de cada alumno*/
    public String[] cargarAlumnos(Curso datos) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Cargar los alumnos que asisten a clase");
        for (int i = 0; i < datos.getAlumnos().length; i++) {
            System.out.println("Ingresar nombre de alumno");
            datos.getAlumnos()[i] = leer.nextLine();
        }
        return datos.getAlumnos();
    }

    // muestra los nombres del arreglo
    public void mostrar(Curso datos) {

        System.out.println("Nombres de los alumnos");
        for (int i = 0; i < 5; i++) {
            System.out.println(datos.getAlumnos()[i]);
        }
        System.out.println("Nombre del curso : " + datos.getNombreCurso());
        System.out.println("cantidad de horas por dia del curso : " + datos.getCantidadHorasPorDia());
        System.out.println("cantidad de Dias por semana : " + datos.getCantidadDiasPorSemana());
        System.out.println("Turno : " + datos.getTurno());
        System.out.println("Precio por hora : " + datos.getPrecioPorHora());
        System.out.println("");
    }

    /*b. Método crearCurso(): el método crear curso, le pide los valores de los atributos 
al usuario y después se le asignan a sus respectivos atributos para llenar el objeto Curso.
En este método invocamos al método cargarAlumnos() para asignarle valor al atributo alumnos*/
    public Curso crearCurso() {
        Scanner leer1 = new Scanner(System.in);
        Curso datos = new Curso();

        System.out.println("Ingresar el Nombre del Curso");
        datos.setNombreCurso(leer1.nextLine());
        System.out.println("Ingresar la cantidad de horas por dia del curso");
        datos.setCantidadHorasPorDia(leer1.nextDouble());
        System.out.println("Ingresar la cantidad de Dias por semana");
        datos.setCantidadDiasPorSemana(leer1.nextInt());
        System.out.println("Ingresar el turno (M. Mañana o T.Tarde)");
        datos.setTurno(leer1.next());
        System.out.println("Ingresar el precio por hora");
        datos.setPrecioPorHora(leer1.nextDouble());
        cargarAlumnos(datos);

        return datos;

    }

    /*c. Método calcularGananciaSemanal(): este método se encarga de calcular la ganancia 
en una semana por curso. Para ello, se deben multiplicar la cantidad de horas por día, 
el precio por hora, la cantidad de alumnos y la cantidad de días a la semana que se repite el encuentro.
     */
    public void calcularGananciaSemanal(Curso datos) {
        double ganancia;
        ganancia = datos.getCantidadHorasPorDia() * datos.getPrecioPorHora() * (datos.getAlumnos().length) * datos.getCantidadDiasPorSemana();
        System.out.println("La ganancia es $" + ganancia);
        System.out.println("");
    }

}
