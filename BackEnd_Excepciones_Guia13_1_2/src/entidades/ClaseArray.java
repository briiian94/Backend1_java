package entidades;

import java.util.ArrayList;
import java.util.Scanner;

public class ClaseArray {

    private String[] lista = new String[1];

    public ClaseArray() {
    }

    public String[] getLista() {
        return lista;
    }

    public void setLista(String[] lista) {
        this.lista = lista;
    }

    public void llenar() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        try {
            lista[0] = "asd";
            lista[2] = "aaa";
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Datos ingresados fuera de rango " + e);
        }
    }

}
