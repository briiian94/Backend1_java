package entidades;

import java.util.Scanner;

/**
 *
 * @author brian
 */
public class mesSecreto {

    private String[] mes;
    private String mesAdivina;

    public mesSecreto() {
        this.mes = new String[12];
    }

    public mesSecreto(String[] mes, String mesAdivina) {
        this.mes = new String[12];
        this.mes = mes;
        this.mesAdivina = mesAdivina;
    }

    public String[] getMes() {
        return mes;
    }

    public String getMesAdivina() {
        return mesAdivina;
    }

    public void setMes(String[] mes) {
        this.mes = mes;
    }

    public void setMesAdivina(String mesAdivina) {
        this.mesAdivina = mesAdivina;
    }

}
