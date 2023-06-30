/*En el paquete Servicios crear PersonaServicio con los siguientes 3 métodos:
a) Método esMayorDeEdad(): indica si la persona es mayor de edad. La función devuelve un booleano.
b) Metodo crearPersona(): el método crear persona, le pide los valores de los atributos al usuario 
y después se le asignan a sus respectivos atributos para llenar el objeto Persona. Además, comprueba que el
sexo introducido sea correcto, es decir, H, M o O. Si no es correcto se deberá mostrar un mensaje
c) Método calcularIMC(): calculara si la persona está en su peso ideal (peso en kg/(altura^2 en mt2)).
Si esta fórmula da por resultado un valor menor que 20, significa que la persona está por debajo de su
peso ideal y la función devuelve un -1. Si la fórmula da por resultado un número entre 20 y 25 (incluidos),
significa que la persona está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado
de la fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la función devuelve un 1.
 */
package servicio;

import entidades.Persona;
import java.util.Scanner;

/**
 *
 * @author brian
 */
public class PersonaServicio {

    Scanner leer = new Scanner(System.in);

   
    
    
    public boolean esMayorDeEdad(Persona datos) {
        boolean may = false;
        if (datos.getEdad() > 18) {
            may = true;
        } else {
        }
        return may;
    }

    public Persona crearPersona() {
        char sexo = 'a';
        Persona datos = new Persona();
        System.out.println();
        System.out.print("Ingrese su nombre : ");
        datos.setNombre(leer.next());
        System.out.print("Ingrese su edad : ");
        datos.setEdad(leer.nextInt());
        do {
            System.out.print("Ingrese su sexo H. hombre | M. mujer | O. otros : ");
            sexo = leer.next().charAt(0);
            if (!(sexo == 'H') &&(sexo == 'M') && (sexo == 'O')) {
                System.out.println("Ingreso un tipo de sexo incorrecto, vuelva a intentar");
            }
        } while (!(sexo == 'H') && (sexo == 'M') && (sexo == 'O'));
        datos.setSexo(sexo);
        System.out.print("Ingrese su altura en metros : ");
        datos.setAltura(leer.nextDouble());
        System.out.print("Ingrese su peso en Kg : ");
        datos.setPeso(leer.nextDouble());
        return datos;
    }

    public int calcularIMC(Persona datos) {
        
        double estadoIMC = datos.getPeso() / (Math.pow(datos.getAltura(), 2));
        if (estadoIMC < 20) {
            return -1;
        } else if (estadoIMC <= 25) {
            return 0;
        } else {
            return 1;
        } 
    }

}
