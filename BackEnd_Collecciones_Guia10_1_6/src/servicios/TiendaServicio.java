/*Estas las realizaremos en el servicio. Como, introducir un elemento, modificar su precio,
eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar
Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio.
Realizar un menú para lograr todas las acciones previamente mencionadas.
 */
package servicios;

import java.util.HashMap;
import java.util.Scanner;

public class TiendaServicio {

    public void ingresarElemento(HashMap<String, Double> producto) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        String opc = "n";
        do {
            System.out.println("Ingrese el nombre del producto");
            String nombre = leer.next().toLowerCase();
            System.out.println("Ingrese el precio del producto");
            Double precio = leer.nextDouble();
            producto.put(nombre, precio);
            System.out.println("Desea ingresar otro producto? S/N");
            opc = leer.next().toLowerCase();
        } while (opc.equals("s"));

    }

    //modificar su precio
    public void modificarPrecio(HashMap<String, Double> producto) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Boolean opc = false;
        do {
            System.out.println("Ingrese el producto del cual desea modificar el precio");
            String modif = leer.next().toLowerCase();
            if (producto.containsKey(modif)) {
                opc = true;
                System.out.println("Ingrese el nuevo precio del producto");
                Double nuevoPrecio = leer.nextDouble();
                producto.put(modif, nuevoPrecio);
            }
        } while (opc = false);

    }

    //eliminar un producto 
    public void eliminarProducto(HashMap<String, Double> producto) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el nombre del producto que desea eliminar");
        String nombreEliminar = leer.next();
        producto.remove(nombreEliminar);

    }

    //mostrar los productos que tenemos con su precio
    public void mostrarProductos(HashMap<String, Double> producto) {
        System.out.println("Productos actuales en la tienda:");
        for (String productos : producto.keySet()) {
            double precio = producto.get(productos);
            System.out.println("Producto: " + productos + " | $" + precio);
        }
        System.out.println();

    }

}
