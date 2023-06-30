package servicio;

import entidades.Electrodomestico;
import java.util.Scanner;
import javafx.scene.paint.Color;

public class ElectrodomesticoServicio {

    /* • Método comprobarConsumoEnergetico(char letra): comprueba que la letra es correcta,
sino es correcta usara la letra F por defecto. Este método se debe invocar al crear el
objeto y no será visible.*/
    public char comprobarConsumoEnergetico(char consumoEnergetico) {
        if (consumoEnergetico >= 'A' && consumoEnergetico <= 'F') {
            return consumoEnergetico;
        } else {
            return consumoEnergetico = 'F';
        }
    }

    /*• Método comprobarColor(String color): comprueba que el color es correcto, y si no lo es,
usa el color blanco por defecto. Los colores disponibles para los electrodomésticos son
blanco, negro, rojo, azul y gris. No importa si el nombre está en mayúsculas o en
minúsculas. Este método se invocará al crear el objeto y no será visible.*/
    public String comprobarColor(String color) {
        if (color.equalsIgnoreCase("blanco") || color.equalsIgnoreCase("negro") || color.equalsIgnoreCase("rojo") || color.equalsIgnoreCase("azul") || color.equalsIgnoreCase("gris")) {
            return color;
        } else {
            return "Blanco";
        }
    }

    /*• Metodo crearElectrodomestico(): le pide la información al usuario y llena el
electrodoméstico, también llama los métodos para comprobar el color y el consumo. Al
precio se le da un valor base de $1000.*/
    public Electrodomestico crearElectrodomestico() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Electrodomestico electro = new Electrodomestico();
        System.out.println("Ingrese el color (blanco, negro, rojo, azul o gris)");
        String color = leer.next().toLowerCase();
        electro.setColor(comprobarColor(color));
        System.out.println("Ingrese el consumo (Desde A a F)");
        char consumo = leer.next().charAt(0);
        electro.setConsumoEnergetico(comprobarConsumoEnergetico(consumo));
        System.out.println("Ingresar peso del producto");
        electro.setPeso(leer.nextDouble());
        electro.setPrecio(1000);

        return electro;
    }

    /* • Método precioFinal(): según el consumo energético y su tamaño, aumentará el valor del
precio. Esta es la lista de precios:
LETRA PRECIO
A $1000
B $800
C $600
D $500
E $300
F $100

PESO PRECIO
Entre 1 y 19 kg $100
Entre 20 y 49 kg $500
Entre 50 y 79 kg $800
Mayor que 80 kg $1000*/
    public void precioFinal(Electrodomestico electro) {

        switch (electro.getConsumoEnergetico()) {
            case 'A':
                electro.setPrecio(electro.getPrecio() + 1000);
                break;
            case 'B':
                electro.setPrecio(electro.getPrecio() + 800);
                break;
            case 'C':
                electro.setPrecio(electro.getPrecio() + 600);
                break;
            case 'D':
                electro.setPrecio(electro.getPrecio() + 500);
                break;
            case 'E':
                electro.setPrecio(electro.getPrecio() + 300);
                break;
            case 'F':
                electro.setPrecio(electro.getPrecio() + 100);
                break;

        }

        if (electro.getPeso() >= 1 && electro.getPeso() <= 19) {
            electro.setPrecio(electro.getPrecio() + 100);
        } else if (electro.getPeso() >= 20 && electro.getPeso() <= 49) {
            electro.setPrecio(electro.getPrecio() + 500);
        } else if (electro.getPeso() >= 50 && electro.getPeso() <= 79) {
            electro.setPrecio(electro.getPrecio() + 800);
        } else if (electro.getPeso() >= 80) {
            electro.setPrecio(electro.getPrecio() + 1000);
        }


    }
}
