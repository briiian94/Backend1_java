/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend_poo2_guia8_2_2;

import entidades.NIF;
import servicios.NIFService;

/**
 *
 * @author brian
 */
public class BackEnd_POO2_Guia8_2_2 {
    
    public static void main(String[] args) {
        
        NIFService ns = new NIFService();
        NIF nif1 = ns.crearNif();
        ns.calcularLetra(nif1);
        ns.mostrar(nif1);
        
    }
    
}
