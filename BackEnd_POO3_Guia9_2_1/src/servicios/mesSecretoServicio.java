package servicios;

import entidades.mesSecreto;
import java.util.Scanner;

/**
 *
 * @author brian
 */
public class mesSecretoServicio {

    Scanner leer = new Scanner(System.in);

    public mesSecreto inicializarMeses() {
        mesSecreto mes = new mesSecreto();
        mes.getMes()[0] = "enero";
        mes.getMes()[1] = "febrero";
        mes.getMes()[2] = "marzo";
        mes.getMes()[3] = "abril";
        mes.getMes()[4] = "mayo";
        mes.getMes()[5] = "junio";
        mes.getMes()[6] = "julio";
        mes.getMes()[7] = "agosto";
        mes.getMes()[8] = "septiembre";
        mes.getMes()[9] = "octubre";
        mes.getMes()[10] = "noviembre";
        mes.getMes()[11] = "diciembre";

        mes.setMesAdivina(mes.getMes()[5]);

        return mes;
    }

    public void adivinarMes(mesSecreto mes) {

        boolean o = false;
        do {
            System.out.println("Ingrese un mes");
            String ingreso = leer.nextLine().toLowerCase();
            if (ingreso.equals(mes.getMesAdivina())) {
                System.out.println("Usted acerto el mes secreto!");
                o = true;
            } else {
                System.out.println("No acerto el mes secreto, siga intentando");
            }
        } while (!o);
    }

}
