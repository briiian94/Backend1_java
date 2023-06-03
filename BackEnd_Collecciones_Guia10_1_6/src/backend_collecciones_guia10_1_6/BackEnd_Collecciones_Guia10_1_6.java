/*
Se necesita una aplicación para una tienda en la cual queremos almacenar los distintos
productos que venderemos y el precio que tendrán. Además, se necesita que la
aplicación cuente con las funciones básicas.
Estas las realizaremos en el servicio. Como, introducir un elemento, modificar su precio,
eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar
Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio.
Realizar un menú para lograr todas las acciones previamente mencionadas.
 */
package backend_collecciones_guia10_1_6;

import java.util.HashMap;
import java.util.Scanner;
import servicios.TiendaServicio;

public class BackEnd_Collecciones_Guia10_1_6 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Boolean opc = false;
        TiendaServicio ts = new TiendaServicio();
        HashMap<String, Double> prod = new HashMap();

        do {
            System.out.println("Menu de la Tienda");
            System.out.println("1. Ingresar producto");
            System.out.println("2. Modificar precio de un producto");
            System.out.println("3. Eliminar un producto");
            System.out.println("4. Mostrar productos y precio de la tienda");
            System.out.println("5. Salir");
            System.out.println();
            int menu = leer.nextInt();

            switch (menu) {

                case 1:
                    ts.ingresarElemento(prod);
                    break;
                case 2:
                    ts.modificarPrecio(prod);
                    break;
                case 3:
                    ts.eliminarProducto(prod);
                    break;
                case 4:
                    ts.mostrarProductos(prod);
                    break;
                case 5:
                    opc = true;

            }

        } while (!opc);
    }

}
