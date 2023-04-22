/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend_poo2_guia8_2_1;

import entidades.Raices;
import servicio.RaicesServicio;

/**
 *
 * @author brian
 */
public class BackEnd_POO2_Guia8_2_1 {

    public static void main(String[] args) {

        RaicesServicio rs = new RaicesServicio();
        Raices r1 = rs.llenarCoeficiente();
        rs.calcular(r1);

    }

}
