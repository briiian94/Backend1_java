/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend_poo3_guia9_2_2;

import entidades.Ahorcado;
import servicios.AhorcadoServicio;

/**
 *
 * @author brian
 */
public class BackEnd_POO3_Guia9_2_2 {

    public static void main(String[] args) {
        AhorcadoServicio as = new AhorcadoServicio();
        Ahorcado a1 = as.crearJuego();

        as.juego(a1);

    }

}
