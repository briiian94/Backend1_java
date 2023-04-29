/*
Un profesor particular está dando cursos para grupos de cinco alumnos y necesita un programa para organizar la información de cada curso. 
 */
package backend_poo3_guia9_1_6;

import entidades.Curso;
import servicios.CursoServicio;

/**
 *
 * @author brian
 */
public class BackEnd_POO3_Guia9_1_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        CursoServicio cs = new CursoServicio();
        System.out.println("Curso 1");
        Curso c1 = cs.crearCurso();
        cs.mostrar(c1);
        cs.calcularGananciaSemanal(c1);
        System.out.println("Curso 2");
        Curso c2 = cs.crearCurso();
        cs.mostrar(c2);
        cs.calcularGananciaSemanal(c2);

    }

}
