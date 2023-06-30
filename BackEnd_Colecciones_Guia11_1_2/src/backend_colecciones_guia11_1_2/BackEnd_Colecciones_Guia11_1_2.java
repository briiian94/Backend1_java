/*
Realizar el juego de la ruleta rusa de agua en Java. Como muchos saben, el juego se trata de
un número de jugadores, que, con un revolver de agua, el cual posee una sola carga de agua,
se dispara y se moja. Las clases por hacer del juego son las siguientes:
Clase Revolver de agua: esta clase posee los siguientes atributos: posición actual (posición
del tambor que se dispara, puede que esté el agua o no) y posición agua (la posición del
tambor donde se encuentra el agua). Estas dos posiciones, se generarán aleatoriamente.



 */
package backend_colecciones_guia11_1_2;

import entidades.Juego;
import java.util.HashMap;

public class BackEnd_Colecciones_Guia11_1_2 {

    public static void main(String[] args) {

        Juego juego = new Juego();
        juego.llenarJuego();
        juego.ronda();
    }

}
