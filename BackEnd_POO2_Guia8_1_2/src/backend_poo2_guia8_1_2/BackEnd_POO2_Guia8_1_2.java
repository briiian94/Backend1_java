/*
Programa Nespresso. Desarrolle una clase Cafetera en el paquete Entidades.


 */
package backend_poo2_guia8_1_2;

import entidades.Cafetera;
import java.util.Scanner;
import servicio.CafeteraServicio;

/**
 *
 * @author brian
 */
public class BackEnd_POO2_Guia8_1_2 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        CafeteraServicio cs = new CafeteraServicio();
        Cafetera c1 = cs.ingresarCantidadMaxima();

        char respuesta = 'a';

        do {
            System.out.println("1- Llenar Cafetera");
            System.out.println("2- Servir taza");
            System.out.println("3- Vaciar cafetera");
            System.out.println("4- Agregar cafe");
            System.out.println("5- Salir");
            int opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    cs.llenarCafetera(c1);
                    break;
                case 2:
                    cs.servirTaza(c1);
                    break;
                case 3:
                    cs.vaciarCafetera(c1);
                    break;
                case 4:
                    cs.agregarCafe(c1);
                    break;
                case 5:
                    System.out.println("Para salir ingrese S");
                    respuesta = leer.next().charAt(0);
                    break;
                default:
                    System.out.println("La opcion ingresada no es valida");
            }
        } while (!(respuesta == 'S'));
    }

}
