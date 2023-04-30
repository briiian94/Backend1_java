/*uego Ahorcado: Crear una clase Ahorcado (como el juego), la cual deberá contener como atributos, 
un vector con la palabra a buscar, la cantidad de letras encontradas y la cantidad jugadas máximas que puede realizar el usuario*/
package entidades;

import java.util.Scanner;

/**
 *
 * @author brian
 */
public class Ahorcado {

    private String[] palabra;
    private int cantLetras;
    private int cantJugadasMax;
    

    public Ahorcado() {
    }

    public Ahorcado(String[] palabra, int cantLetras, int cantJugadasMax) {
        this.palabra = palabra;
        this.cantLetras = cantLetras;
        this.cantJugadasMax = cantJugadasMax;
    }

    public void setPalabra(String[] palabra) {
        this.palabra = palabra;
    }

    public void setCantLetras(int cantLetras) {
        this.cantLetras = cantLetras;
    }

    public void setCantJugadasMax(int cantJugadasMax) {
        this.cantJugadasMax = cantJugadasMax;
    }

    public String[] getPalabra() {
        return palabra;
    }

    public int getCantLetras() {
        return cantLetras;
    }

    public int getCantJugadasMax() {
        return cantJugadasMax;
    }

}
