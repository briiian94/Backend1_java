/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend_poo3_guia9_1_1;

import entidades.Cadena;
import java.util.Scanner;
import servicios.CadenaServicio;

/**
 *
 * @author brian
 */
public class BackEnd_POO3_Guia9_1_1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        CadenaServicio cs = new CadenaServicio();
        Cadena c1 = cs.llenarFrase();
        int salir = 0;
        do {
            System.out.println("");
            System.out.println("");
            System.out.println("Ingrese con un numero la opcion deseada");
            System.out.println("1. Mostrar Vocales");
            System.out.println("2. Invertir la frase");
            System.out.println("3. Buscar letra repetida");
            System.out.println("4. Comparar longitudes de frases");
            System.out.println("5. Unir frases");
            System.out.println("6. Reemplazar letra");
            System.out.println("7. Contiene");
            System.out.println("8. Salir");
            int opc = leer.nextInt();

            switch (opc) {
                case 1:
                    cs.mostrarVocales(c1);
                    break;
                case 2:
                    cs.invertirFrase(c1);
                    break;
                case 3:
                    cs.vecesRepetido(c1);
                    break;
                case 4:
                    cs.compararLongitud(c1);
                    break;
                case 5:
                    cs.unirFrases(c1);
                    break;
                case 6:
                    cs.reemplazar(c1);
                    break;
                case 7:
                    cs.contiene(c1);
                    break;
                case 8:
                    salir = 1;
            }
        } while (salir == 0);

    }

}
