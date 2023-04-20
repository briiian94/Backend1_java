package backend_poo2_guia8_1_1;

import entidad.CuentaBancaria;
import java.util.Scanner;
import servicio.CuentaBancariaServicio;

/**
 * @author brian
 */
public class BackEnd_POO2_Guia8_1_1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        CuentaBancariaServicio cbs = new CuentaBancariaServicio();
        CuentaBancaria cuenta1 = cbs.crearCuenta();

        char respuesta = 'a';

        do {
            System.out.println("1-Ingresar");
            System.out.println("2-Retirar");
            System.out.println("3-Extraccion rapida");
            System.out.println("4-Consultar Saldo");
            System.out.println("5-Consultar datos");
            System.out.println("6-Salir (S/N)");
            int opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    cbs.ingresar(cuenta1);
                    break;
                case 2:
                    cbs.retirar(cuenta1);
                    break;
                case 3:
                    cbs.extraccionRapida(cuenta1);
                    break;
                case 4:
                    cbs.consultarSaldo(cuenta1);
                    break;
                case 5:
                    cbs.consultarDatos(cuenta1);
                    break;
                case 6:
                    System.out.println("Para salir ingrese la S");
                    respuesta = leer.next().charAt(0);
                    break;
                default:
                    System.out.println("No se reconoce ninguna opcion");
            }

        } while (!(respuesta == 'S'));
    }

}
