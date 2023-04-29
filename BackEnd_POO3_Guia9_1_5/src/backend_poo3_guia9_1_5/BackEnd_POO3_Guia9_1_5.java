/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend_poo3_guia9_1_5;

import entidades.Persona;
import servicios.PersonaServicio;

/**
 *
 * @author brian
 */
public class BackEnd_POO3_Guia9_1_5 {

    public static void main(String[] args) {

        PersonaServicio ps = new PersonaServicio();
        Persona p1 = ps.crearPersona();

        System.out.println("Su edad es = " + ps.calcularEdad(p1.getNacimiento()));

        System.out.println(p1.getNombre() + " es menor que la edad ingresada? : " + ps.menorQue(ps.calcularEdad(p1.getNacimiento()), p1.getNombre()));

        ps.mostrarPersona(p1.getNombre(), p1.getNacimiento(), ps.calcularEdad(p1.getNacimiento()));

    }

}
