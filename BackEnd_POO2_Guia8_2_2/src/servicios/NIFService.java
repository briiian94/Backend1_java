package servicios;

import entidades.NIF;
import java.util.Scanner;

/**
 *
 * @author brian
 */
public class NIFService {

    Scanner leer = new Scanner(System.in);
    //Método crearNif(): le pide al usuario el DNI y con ese DNI calcula la letra que le corresponderá. 
    //Una vez calculado, le asigna la letra que le corresponde según

    public NIF crearNif() {
        NIF datos = new NIF();

        System.out.println("Ingrese su numero de DNI");
        datos.setNumDNI(leer.nextLong());

        return datos;
    }

    
    //Método calcular caracter de letra
    public void calcularLetra(NIF datos) {
        int numLet = Math.round((datos.getNumDNI() % 23));

        char[] letra = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

        datos.setLetra(letra[numLet]);
    }

    //Método mostrar(): que nos permita mostrar el NIF (ocho dígitos, un guion y la letra en mayúscula; por ejemplo: 00395469-F).
    public void mostrar(NIF datos) {
        System.out.println("NIF = " + datos.getNumDNI() + " - " + datos.getLetra());

    }
}
