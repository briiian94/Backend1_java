/*Crear una clase ParDeNumerosService, en el paquete
Servicios, que deberá además implementar los siguientes métodos:
a) Método mostrarValores que muestra cuáles son los dos números
guardados.
b) Método devolverMayor para retornar cuál de los dos atributos tiene
el mayor valor
c) Método calcularPotencia para calcular la potencia del mayor valor de
la clase elevado al menor número. Previamente se deben redondear
ambos valores.
d) Método calculaRaiz, para calcular la raíz cuadrada del menor de los
dos valores. Antes de calcular la raíz cuadrada se debe obtener el
valor absoluto del número. */
package servicios;

import entidades.ParDeNumeros;
import java.util.Scanner;

/**
 *
 * @author brian
 */
public class ParDeNumerosServicio {

    Scanner leer = new Scanner(System.in);

    public ParDeNumeros llenarValores() {
        ParDeNumeros datos = new ParDeNumeros();
        datos.setNum1(Math.random());
        datos.setNum2(Math.random());
        return datos;
    }

    /*a) Método mostrarValores que muestra cuáles son los dos números
guardados.*/
    public void mostrarValores(ParDeNumeros datos) {
        System.out.println("numero 1 = " + datos.getNum1());
        System.out.println("numero 2 = " + datos.getNum2());
    }

    /*b) Método devolverMayor para retornar cuál de los dos atributos tiene
el mayor valor*/
    public void devolverMayor(ParDeNumeros datos) {
        if (datos.getNum1() > datos.getNum2()) {
            System.out.println("El numero 1 (" + datos.getNum1() + ") es mayor al numero 2 (" + datos.getNum2() + ")");
        } else {
            System.out.println("El numero 2 (" + datos.getNum2() + ") es mayor al numero 1 (" + datos.getNum1() + ")");
        }
    }

    /*c) Método calcularPotencia para calcular la potencia del mayor valor de
la clase elevado al menor número. Previamente se deben redondear
ambos valores.*/
    public void calcularPotencia(ParDeNumeros datos) {
        double potencia = 0;
        if (datos.getNum1() > datos.getNum2()) {
            potencia = Math.pow(datos.getNum1(), datos.getNum2());
            System.out.println("la potencia del numero 1 elevado al numero 2 es " + potencia);
        } else {
            potencia = Math.pow(datos.getNum2(), datos.getNum1());
            System.out.println("la potencia del numero 2 elevado al numero 1 es " + potencia);
        }
    }

    /*d) Método calculaRaiz, para calcular la raíz cuadrada del menor de los
dos valores. Antes de calcular la raíz cuadrada se debe obtener el
valor absoluto del número. */
    public void calcularRaiz(ParDeNumeros datos) {
        double raiz = 0;
        if (datos.getNum1() > datos.getNum2()) {
            raiz = Math.sqrt(datos.getNum2());
            System.out.println("la raiz cuadrada del numero menor (Numero 2) es " + raiz);
        } else {
            raiz = Math.sqrt(datos.getNum1());
            System.out.println("la raiz cuadrada del numero menor (Numero 1) es " + raiz);
        }
    }

}
