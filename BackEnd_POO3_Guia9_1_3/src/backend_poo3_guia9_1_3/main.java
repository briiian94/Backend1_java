/*
 Crear en el Main dos arreglos. El arreglo A de 50 números reales y el
arreglo B de 20 números reales.
 */
package backend_poo3_guia9_1_3;

import servicios.ArregloServicio;

/**
 *
 * @author brian
 */
public class main {

    public static void main(String[] args) {
        double[] a = new double[50];
        double[] b = new double[20];

        ArregloServicio as = new ArregloServicio();
        as.inicializarA(a);
        as.inicializarB(a, b);
        as.mostrar(a, b);
        as.ordenar(a, b);
    }

}
