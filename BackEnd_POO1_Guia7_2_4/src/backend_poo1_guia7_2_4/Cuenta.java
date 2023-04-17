package backend_poo1_guia7_2_4;

import java.util.Scanner;

/**
 *
 * @author brian
 */
public class Cuenta {
    
    private double saldos = 423000.15;
    private String titular;

    public Cuenta(double saldos, String titular) {
        this.saldos = saldos;
        this.titular = titular;
    }

    public Cuenta() {
    }

    public double getSaldos() {
        return saldos;
    }

    public String getTitular() {
        return titular;
    }

    public void setSaldos(double saldos) {
        this.saldos = saldos;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double retirarDinero() {
        Scanner leer = new Scanner(System.in);
        boolean continuar = true;
        while (continuar) {
            System.out.println("Ingrese el monto que desea retirar de la cuenta");
            double monto = leer.nextDouble();
            if ((saldos - monto) < 0) {
                System.out.println("Imposible realizar la transaccion debido a que el saldo quedara en negativo");
            } else {
                this.saldos = saldos - monto;
            }
            System.out.println("El saldo restante es $" + saldos);
            System.out.println("Desea continuar operando? (s/n)");
            String respuesta = leer.next();
            if (!respuesta.equalsIgnoreCase("s")) {
                continuar = false;
            }
        }
        return saldos;
    }

}


