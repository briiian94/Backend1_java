/*Vamos a contar de dos
clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño;*/
package entidades;

import java.util.Scanner;

public class Perro {

    private String nombre;
    private String raza;
    private int edad;
    private String tamano;
    private boolean adoptado = false;

    public Perro() {
    }

    public Perro(String nombre, String raza, int edad, String tamano, boolean adoptado) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.tamano = tamano;
        this.adoptado = adoptado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isAdoptado() {
        return adoptado;
    }

    public void setAdoptado(boolean adoptado) {
        this.adoptado = adoptado;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    @Override
    public String toString() {
        return "Perro: \n {" + "nombre: " + nombre + ", raza: " + raza + ", edad: " + edad + ", tamano: " + tamano + ", adoptado: " + adoptado + "}\n";
    }

}
