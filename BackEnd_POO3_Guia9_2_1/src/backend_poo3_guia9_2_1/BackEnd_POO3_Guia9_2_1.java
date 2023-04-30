/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend_poo3_guia9_2_1;

import servicios.mesSecretoServicio;

/**
 *
 * @author brian
 */
public class BackEnd_POO3_Guia9_2_1 {

   
    public static void main(String[] args) {
       mesSecretoServicio mss = new mesSecretoServicio();
       mss.adivinarMes(mss.inicializarMeses());
    }
    
}
