package backend_poo1_guia7_2_3;

import java.util.Scanner;

/**
 *
 * @author brian
 */
public class Juego {

    private int numero1;
    private int numero2;
    public int contNum1;
    public int contNum2;

    public Juego(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public Juego() {
    }

    public int getNumero1() {
        return numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

    /*public int iniciarJuego() {
        Scanner leer = new Scanner(System.in);
        System.out.print("Jugador 1, ingrese un numero del 1 al 10 : ");
        return numero1 = leer.nextInt();
    }*/

    public void adivinar() {
        Scanner leer1 = new Scanner(System.in);
        
        boolean continuar = true;
        while (continuar) {
            System.out.print("Jugador 1, ingrese un numero del 1 al 10 : ");
            numero1 = leer1.nextInt();
            System.out.println("Jugador 2, intente adivinar el numero (del 1 al 10) ingresado por el jugador 1");
            int cont = 5;
            do {
                System.out.println("Ingrese un numero");
                numero2 = leer1.nextInt();
                if (numero2 < numero1) {
                    cont--;
                    System.out.println("Numero incorrecto. pista: Mas alto. le quedan " + (cont) + " intentos");
                } else if (numero2 > numero1) {
                    cont--;
                    System.out.println("Numero incorrecto. pista: Mas bajo. le quedan " + (cont) + " intentos");
                } else {
                    System.out.println("Correcto! Adivino el numero");
                    contNum2++;
                    break;
                }

            } while (cont > 0);
            if (cont == 0) {
                contNum1++;
            }
            System.out.println("Desea continuar jugando? (s/n)");
            String respuesta = leer1.next();
            if (!respuesta.equalsIgnoreCase("s")){
                continuar = false;
            }
        }
        System.out.println("Jugador 1 gano " + this.contNum1 + " veces");
        System.out.println("Jugador 2 gano " + this.contNum2 + " veces");
    }
}
