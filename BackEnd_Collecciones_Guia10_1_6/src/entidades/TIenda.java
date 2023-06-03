package entidades;

import java.util.Scanner;

public class TIenda {

    private String nombreProd;
    private Double precioProd;

    public TIenda() {
    }

    public TIenda(String nombreProd, Double precioProd) {
        this.nombreProd = nombreProd;
        this.precioProd = precioProd;
    }

    public String getNombreProd() {
        return nombreProd;
    }

    public Double getPrecioProd() {
        return precioProd;
    }

    public void setNombreProd(String nombreProd) {
        this.nombreProd = nombreProd;
    }

    public void setPrecioProd(Double precioProd) {
        this.precioProd = precioProd;
    }

}
