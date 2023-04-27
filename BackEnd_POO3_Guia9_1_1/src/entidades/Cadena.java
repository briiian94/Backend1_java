package entidades;

import java.util.Scanner;


/*Realizar una clase llamada Cadena, en el paquete de entidades, que
tenga como atributos una frase (String) y su longitud. Agregar
constructor vacío y con atributo frase solamente. Agregar getters y
setters. El constructor con frase como atributo debe setear la longitud
de la frase de manera automática*/
/**
 *
 * @author brian
 */
public class Cadena {

    private String frase;
    private int longitud;

    public Cadena() {
    }

    public Cadena(String frase, int longitud) {
        this.frase = frase;
        this.longitud = longitud;
    }

    public String getFrase() {
        return frase;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

}
