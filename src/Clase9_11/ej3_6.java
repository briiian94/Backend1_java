

package Clase9_11;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Brian
 */
public class ej3_6 {

    /*Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres y, 
    a medida que el usuario las va ingresando, construya una “sopa de letras para niños” 
    de tamaño de 20 x 20 caracteres. Las palabras se ubicarán todas en orden horizontal en 
    una fila que será seleccionada de manera aleatoria. Una vez concluida la ubicación de las palabras,
    rellene los espacios no utilizados con un número aleatorio del 0 al 9. Finalmente imprima 
    por pantalla la sopa de letras creada.
Nota: Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes funciones de Java
    substring(), Length() y Math.random().
     */

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Random random = new Random();

        String[] palabra = new String[5];
        String[][] sopaLetras = new String[20][20];
        int[] fila = new int[5];
        int[] columna = new int[5];

        int largo = 0;

        //Se ingresan por teclado palabras guardadas en el vector "palabra"
        for (int i = 0; i < palabra.length; i++) {
            do {
                System.out.println("Ingrese la palabra " + i + "(minimo 3 y hasta 5 caracteres)");
                palabra[i] = leer.next();
                largo = palabra[i].length();

            } while (largo < 3 || largo > 5);


        }

        //Bucle para asignar posición de palabra en fila y columna
        for (int i = 0; i < palabra.length; i++) {
            int k = 0;

            while (k < fila.length) { // mientras no se hayan generado todos los números
                int numero = random.nextInt(20); // generar un número aleatorio entre 0 y 20

                if (!Arrays.stream(fila).anyMatch(x -> x == numero)) { // si el número no existe en el arreglo
                    fila[i] = numero; // agregar el número al arreglo
                    k++; // incrementar el índice
                }
            }

            int lar = palabra[i].length();
            columna[i] = random.nextInt((20 - lar));
            int cont =0;
            for (int f = columna[i]; f < (columna[i]+lar); f++) {

                sopaLetras[fila[i]][f] = palabra[i].substring(cont,cont+1);
                cont++;
            }
        }

        
            // Imprime la sopa de letras
        for (int i = 0; i < 20 ; i++) {
            for (int j = 0; j < 20 ; j++) {
                if (sopaLetras[i][j] != null) {
                    System.out.print(" " + sopaLetras[i][j]);
                } else {
                    System.out.print(" "+random.nextInt(10));
                }
            }
            System.out.println();
        }
    }
}


