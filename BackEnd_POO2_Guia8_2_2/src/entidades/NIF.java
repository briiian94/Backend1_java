/*Crear una clase NIF que se usará para mantener DNIs con su correspondiente letra (NIF). 
Los atributos serán el número de DNI (entero largo) y la letra (String o char) que le corresponde.*/
package entidades;

import java.util.Scanner;

/**
 *
 * @author brian
 */
public class NIF {

    private long numDNI;
    private char letra;

    public NIF(long numDNI, char letra) {
        this.numDNI = numDNI;
        this.letra = letra;
    }

    public NIF() {
    }

    public long getNumDNI() {
        return numDNI;
    }

    public char getLetra() {
        return letra;
    }

    public void setNumDNI(long numDNI) {
        this.numDNI = numDNI;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }

}
