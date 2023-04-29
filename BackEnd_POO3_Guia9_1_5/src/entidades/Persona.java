/*Implemente la clase Persona en el paquete entidades. 
Una persona tiene un nombre y una fecha de nacimiento (Tipo Date), constructor vacío, 
constructor parametrizado, get y set. */
package entidades;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author brian
 */
public class Persona {

    private String nombre;
    private Date nacimiento;

    public Persona() {
    }

    public Persona(String nombre, Date nacimiento) {
        this.nombre = nombre;
        this.nacimiento = nacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public Date getNacimiento() {
        return nacimiento;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNacimiento(Date nacimiento) {
        this.nacimiento = nacimiento;
    }

}
