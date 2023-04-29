/*Crear una clase PersonaService, en el paquete servicio, con los siguientes métodos:
Método crearPersona que pida al usuario Nombre y fecha de nacimiento de la persona a crear. 
Retornar el objeto Persona creado. 
Método calcularEdad que calcule la edad del usuario utilizando el atributo de fecha de nacimiento y la fecha actual.
Método menorQue recibe como parámetro una Persona y una edad. 
Retorna true si la persona es menor que la edad consultada o false en caso contrario.
Método mostrarPersona que muestra la información de la persona deseada.
 */
package servicios;

import entidades.Persona;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author brian
 */
public class PersonaServicio {

    Scanner leer = new Scanner(System.in);
    //Método crearPersona que pida al usuario Nombre y fecha de nacimiento de la persona a crear.

    public Persona crearPersona() {

        Persona datos = new Persona();
        System.out.println("Ingrese su nombre");
        datos.setNombre(leer.nextLine());
        System.out.println("Ingrese su fecha de nacimiento (dia, mes, año");
        int dd = leer.nextInt();
        int mm = leer.nextInt();
        int aa = leer.nextInt();
        Date fecha = new Date(aa - 1900, mm - 1, dd);
        datos.setNacimiento(fecha);

        return datos;
    }

    //Método calcularEdad que calcule la edad del usuario utilizando el atributo de fecha de nacimiento y la fecha actual.
    public int calcularEdad(Date fechaNacimiento) {
        Date fechaActual = new Date();
        int edad = fechaActual.getYear() - fechaNacimiento.getYear();

        return edad;

    }

    //Método menorQue recibe como parámetro una Persona y una edad. 
    //Retorna true si la persona es menor que la edad consultada o false en caso contrario.
    public boolean menorQue(int edad, String nombre) {

        boolean menor;
        System.out.println("Ingresar la edad");
        int aa = leer.nextInt();

        if (edad < aa) {
            menor = true;
        } else {
            menor = false;
        }

        return menor;

    }

    //Método mostrarPersona que muestra la información de la persona deseada.
    public void mostrarPersona(String nombre, Date nacimiento, int edad) {
        System.out.println("Nombre: " + nombre);
        System.out.println("Fecha de nacimiento: " + nacimiento);
        System.out.println("Edad: " + edad);
    }

}
