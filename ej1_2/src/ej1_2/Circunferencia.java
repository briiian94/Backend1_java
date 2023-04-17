
package ej1_2;

import java.util.Scanner;

/**
 *
 * @author brian
 */
public class Circunferencia {

    private double radio;

    public Circunferencia(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public void crearCIrcunferencia() {
        Scanner leer = new Scanner(System.in);

        System.out.print("Ingrese el radio");
        double radio = leer.nextDouble();
        this.radio = radio;

    }

    
    public double calculaArea() {
        return Math.PI * Math.pow(radio, 2);

    }

    public double calculaPerimetro() {
        return 2 * Math.PI * radio;

    }

}
