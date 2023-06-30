package servicio;

import entidades.Perro;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PerroServicio {

    public List<Perro> crearPerro() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        List<Perro> perros = new ArrayList<>();

        String opc = "s";

        do {
            Perro perrox = new Perro();
            System.out.println("Cargando perro al sistema");
            System.out.println("Ingrese el nombre");
            perrox.setNombre(leer.next());
            System.out.println("Ingrese la raza");
            perrox.setRaza(leer.next());
            System.out.println("Ingrese la edad");
            perrox.setEdad(leer.nextInt());
            System.out.println("Ingrese el tamaño del perro (chico, mediano, grande)");
            perrox.setTamano(leer.next());
            perros.add(perrox);
            System.out.println("desea agregar mas perros? S/N");
            opc = leer.next().toLowerCase();
        } while (opc.equals("s"));

        return perros;
    }

    public void mostrarNombrePerros(List<Perro> perros) {

        System.out.println("Perros cargadas en el sistema");
        for (Perro perro : perros) {
            System.out.println("Nombre: " + perro.getNombre());
        }
    }

}
