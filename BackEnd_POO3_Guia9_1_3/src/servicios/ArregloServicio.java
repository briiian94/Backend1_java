/*Crear la clase ArregloService, en el
paquete servicio, con los siguientes métodos:
1) Método inicializarA recibe un arreglo por parámetro y lo inicializa con
números aleatorios.
2) Método mostrar recibe un arreglo por parámetro y lo muestra por
pantalla.
3) Método ordenar recibe un arreglo por parámetro y lo ordena de
mayor a menor.
4) Método inicializarB copia los primeros 10 números del arreglo A en el
arreglo B. Luego llenar las últimas 10 posiciones del arreglo B con 0.5.*/
package servicios;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author brian
 */
public class ArregloServicio {

    //1) Método inicializarA recibe un arreglo por parámetro y lo inicializa con
    //números aleatorios.
    public double[] inicializarA(double[] a) {

        for (int i = 0; i < a.length; i++) {
            a[i] = Math.random();
        }
        return a;
    }

    //4) Método inicializarB copia los primeros 10 números del arreglo A en el
    //arreglo B. Luego llenar las últimas 10 posiciones del arreglo B con 0.5.*/
    public double[] inicializarB(double[] a, double[] b) {

        for (int i = 0; i < b.length; i++) {
            if (i < 10) {
                b[i] = a[i];
            } else {
                b[i] = 0.5;
            }

        }
        return a;
    }

    //2) Método mostrar recibe un arreglo por parámetro y lo muestra por
    //pantalla.
    public void mostrar(double[] a, double[] b) {
        System.out.println("Arreglo A");
        for (int i = 0; i < a.length; i++) {
            System.out.println("[" + (i + 1) + "] = " + a[i]);
        }
        System.out.println("");
        System.out.println("Arreglo B");
        for (int i = 0; i < b.length; i++) {
            System.out.println("[" + (i + 1) + "] = " + b[i]);
        }
    }

    //3) Método ordenar recibe un arreglo por parámetro y lo ordena de
    //mayor a menor.
    public void ordenar(double[] a, double[] b) {
        Arrays.sort(a);
        System.out.println("Arreglo A ordenados de menor a mayor");
        System.out.println(Arrays.toString(a));
        Arrays.sort(b);
        System.out.println("Arreglo B ordenados de menor a mayor");
        System.out.println(Arrays.toString(b));

    }

}
