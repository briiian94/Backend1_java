package backend_poo1_guia7_1.pkg3;

import java.util.Scanner;

/**
 *
 * @author brian
 */
public class Operacion {

    private double numero1;
    private double numero2;

    public Operacion(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public Operacion() {
    }

    public double getNumero1() {
        return numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }

    public void crearOperacion(){
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese dos numeros");
        double numero1=leer.nextDouble();
        double numero2=leer.nextDouble();
        
        this.numero1=numero1;
        this.numero2=numero2;
        
    }
    
    public double sumar(){
        return numero1+numero2;
        
    }
    
    public double restar(){
        return numero1-numero2;
        
    }
    
    public double multiplicar(){
        if (numero2==0){
            System.out.println("El segundo numero es 0, por lo que el resultado siempre será CERO");
            return 0;
        } else {
            return numero1 * numero2;
        }
    }
    
    public double dividir(){
        if (numero2 == 0){
            System.out.println("El segundo numero es 0, por lo que el resultado siempre será CERO");
            return 0;
        } else {
            return numero1 / numero2;
        }
    }
    
}


