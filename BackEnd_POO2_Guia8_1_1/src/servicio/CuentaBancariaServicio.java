/*
Agregar la clase CuentaBancariaServicio en el paquete Servicios que contenga:

a) Método para crear cuenta pidiéndole los datos al usuario.
b) Método ingresar(double): recibe una cantidad de dinero a ingresar y se le sumará al saldo actual.
c) Método retirar(double): recibe una cantidad de dinero a retirar y se le restara al saldo actual. 
Si la cuenta no tiene la cantidad de dinero a retirar se retirará el máximo posible hasta dejar la cuenta en 0.
d) Método extraccionRapida: le permitirá sacar solo un 20% de su saldo. Validar que el usuario no saque más del 20%.
e) Método consultarSaldo: permitirá consultar el saldo disponible en la cuenta.
f) Método consultarDatos: permitirá mostrar todos los datos de la cuenta.
 */
package servicio;

import entidad.CuentaBancaria;
import java.util.Scanner;

/**
 *
 * @author brian
 */
public class CuentaBancariaServicio {

    private Scanner leer = new Scanner(System.in);

    public CuentaBancaria crearCuenta() {

        CuentaBancaria cuenta = new CuentaBancaria();

        System.out.println("Ingresar numero de cuenta");
        cuenta.setNumeroCuenta(leer.nextInt());
        System.out.println("Ingrese su DNI");
        cuenta.setDniCliente(leer.nextLong());
        System.out.println("Ingrese su saldo actual");
        cuenta.setSaldoActual(leer.nextDouble());

        return cuenta;
    }

    public void ingresar(CuentaBancaria cuenta) {
        System.out.println("Ingresar el monto de dinero a depositar");
        cuenta.setSaldoActual(leer.nextDouble() + cuenta.getSaldoActual());
    }

    public void retirar(CuentaBancaria cuenta) {
        System.out.println("Ingrese el monto a retirar de la cuenta");
        double retiro = leer.nextDouble();
        if (retiro > cuenta.getSaldoActual()) {
            System.out.println("No cuenta con la cantidad de dinero, por lo que se retirara el total del saldo = $"+cuenta.getSaldoActual());
            cuenta.setSaldoActual(0);
        } else {
            System.out.println("Se retiro  $"+retiro);
            cuenta.setSaldoActual(cuenta.getSaldoActual() - retiro);
        }
    }
    
    public void extraccionRapida(CuentaBancaria cuenta){
        double extracRap = cuenta.getSaldoActual()*0.2;
        System.out.println("Se realizara una extraccion rapida, la cual corresponde al 20% del saldo = $"+extracRap);
        cuenta.setSaldoActual(cuenta.getSaldoActual()*0.8);
    }
    
    public void consultarSaldo(CuentaBancaria cuenta){
        System.out.println("Su saldo actual es $"+cuenta.getSaldoActual());
    }

    public void consultarDatos(CuentaBancaria cuenta){
        System.out.println("A continuacion se mostraran los datos de la cuenta");
        System.out.println("DNI : "+cuenta.getDniCliente());
        System.out.println("Numero de Cuenta : "+cuenta.getNumeroCuenta());
        System.out.println("Saldo actual : "+cuenta.getSaldoActual());
    }
}
