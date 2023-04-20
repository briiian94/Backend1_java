/*Crear clase CafeteraServicio en el paquete Servicios con los siguiente:
a) Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad máxima.
b) Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el tamaño de la taza y simula 
la acción de servir la taza con la capacidad indicada. Si la cantidad actual de café “no alcanza” para llenar la taza, 
se sirve lo que quede. El método le informará al usuario si se llenó o no la taza, y de no haberse llenado en cuanto 
quedó la taza.
c) Método vaciarCafetera(): pone la cantidad de café actual en cero.
d) Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo recibe y se añade a la cafetera
la cantidad de café indicada.
 */
package servicio;

import entidades.Cafetera;
import java.util.Scanner;

public class CafeteraServicio {

    Scanner leer = new Scanner(System.in);

    public Cafetera ingresarCantidadMaxima() {
        Cafetera cant = new Cafetera();
        System.out.println("Ingrese la cantidad maxima de cafe");
        cant.setCapacidadMaxima(leer.nextInt());

        return cant;
    }

    public void llenarCafetera(Cafetera cant) {
        cant.setCantidadActual(cant.getCapacidadMaxima());
        System.out.println("Se ha llenado la cafetera con "+cant.getCantidadActual());
    }

    public void servirTaza(Cafetera cant) {
        System.out.println("Ingrese el tamaño de la taza vacia");
        int taza = leer.nextInt();
        if (cant.getCantidadActual() < taza) {
            System.out.println("La cantidad de cafe en la cafetera, no es suficiente para llenar la taza");
            System.out.println("La taza fue llenada con " + cant.getCantidadActual() + " ml de cafe");
            cant.setCantidadActual(0);
        } else {
            System.out.println("La taza fue llenada correctamente");
            cant.setCantidadActual(cant.getCantidadActual() - taza);
            System.out.println("El cafe restante en la cafetera es "+cant.getCantidadActual());
        }
    }

    public void vaciarCafetera(Cafetera cant) {
        cant.setCantidadActual(0);
        System.out.println("La cafetera se vacio correctamente");
    }

    public void agregarCafe(Cafetera cant) {
        System.out.println("Ingrese la cantidad de cafe a agregar en la cafetera");
        cant.setCantidadActual(leer.nextInt());
        System.out.println("Se agregó " + cant.getCantidadActual() + "ml de cafe a la cafetera");
    }

}
