/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend_poo3_guia9_1_2;

import entidades.ParDeNumeros;
import java.util.Scanner;
import servicios.ParDeNumerosServicio;

/**
 *
 * @author brian
 */
public class BackEnd_POO3_Guia9_1_2 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        ParDeNumerosServicio ps = new ParDeNumerosServicio();
        ParDeNumeros p1 = ps.llenarValores();
        int opc = 0;
        do {
            System.out.println("");
            System.out.println("Seleccione una opcion");
            System.out.println("1. Mostrar valores");
            System.out.println("2. Devolver numero mayor");
            System.out.println("3. Calcular potencia");
            System.out.println("4. Calcular raiz");
            System.out.println("5. Salir");
            opc = leer.nextInt();
            switch (opc) {
                case 1:
                    ps.mostrarValores(p1);
                    break;
                case 2:
                    ps.devolverMayor(p1);
                    break;
                case 3:
                    ps.calcularPotencia(p1);
                    break;
                case 4:
                    ps.calcularRaiz(p1);
                    break;
                case 5:
                    opc = 5;

            }
            System.out.println("");
        } while (opc != 5);

    }

}
