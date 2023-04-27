/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend_poo3_guia9_1_4;

import servicio.FechaService;

/**
 *
 * @author brian
 */
public class main {

    public static void main(String[] args) {

        FechaService fc = new FechaService();
        fc.diferencia(fc.fechaNacimiento(), fc.fechaActual());

    }

}
