/*Vamos a usar la clase Date que ya existe en Java. Crearemos la clase
FechaService, en paquete Servicios, que tenga los siguientes métodos:
a) Método fechaNacimiento que pregunte al usuario día, mes y año de
su nacimiento. Luego los pase por parámetro a un nuevo objeto Date.
El método debe retornar el objeto Date. Ejemplo fecha: Date fecha =
new Date(anio, mes, dia);
b) Método fechaActual que cree un objeto fecha con el día actual. Para
esto usaremos el constructor vacío de la clase Date. Ejemplo: Date
fechaActual = new Date();
El método debe retornar el objeto Date.
c) Método diferencia que reciba las dos fechas por parámetro y retorna
la diferencia de años entre una y otra (edad del usuario).*/
package servicio;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author brian
 */
public class FechaService {


    /*a) Método fechaNacimiento que pregunte al usuario día, mes y año de
su nacimiento. Luego los pase por parámetro a un nuevo objeto Date.
El método debe retornar el objeto Date. Ejemplo fecha: Date fecha =
new Date(anio, mes, dia);*/
    public Date fechaNacimiento() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresando fecha de nacimiento");
        System.out.println("Ingrese el dia");
        int dd = leer.nextInt();
        System.out.println("Ingrese el mes");
        int mm = leer.nextInt();
        System.out.println("Ingrese el año");
        int aa = leer.nextInt();

        Date fecha = new Date(aa - 1900, mm - 1, dd);

        return fecha;
    }

    /*b) Método fechaActual que cree un objeto fecha con el día actual. Para
esto usaremos el constructor vacío de la clase Date. Ejemplo: Date
fechaActual = new Date();
El método debe retornar el objeto Date.*/
    public Date fechaActual() {
        Date fechaActual = new Date();

        return fechaActual;
    }

    /*c) Método diferencia que reciba las dos fechas por parámetro y retorna
la diferencia de años entre una y otra (edad del usuario).*/
    public int diferencia(Date fechaNacimiento, Date fechaActual) {
        int edad = fechaActual.getYear() - fechaNacimiento.getYear();
        /*if (fechaActual.getMonth() < fechaNacimiento.getMonth() || (fechaActual.getMonth() == fechaNacimiento.getMonth() && fechaActual.getMonth() < fechaNacimiento.getMonth())) {
            edad--;
        }*/
        System.out.println("Su edad es = " + edad);
        return edad;

    }

}
