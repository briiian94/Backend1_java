/*Definir los siguientes métodos en AhorcadoService:

Metodo crearJuego(): le pide la palabra al usuario y cantidad de jugadas máxima. 
Con la palabra del usuario, pone la longitud de la palabra, como la longitud del vector. 
Después ingresa la palabra en el vector, letra por letra, quedando cada letra de la palabra en un índice del vector. 
Y también, guarda la cantidad de jugadas máximas y el valor que ingresó el usuario.

Método longitud(): muestra la longitud de la palabra que se debe encontrar. Nota: buscar como se usa el vector.length.

Método buscar(letra):  este método recibe una letra dada por el usuario y busca si la letra ingresada es parte de la palabra o no.
También informará si la letra estaba o no.

Método encontradas(letra):  que reciba una letra ingresada por el usuario y muestre cuantas letras han sido encontradas
y cuántas le faltan. Este método además deberá devolver true si la letra estaba y false si la letra no estaba,
ya que, cada vez que se busque una letra que no esté, se le restará uno a sus oportunidades.

Método intentos(): para mostrar cuántas oportunidades le queda al jugador.

Método juego(): el método juego se encargará de llamar todos los métodos previamente mencionados e informará cuando el usuario 
descubra toda la palabra o se quede sin intentos. Este método se llamará en el main.
 */
package servicios;

import entidades.Ahorcado;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author brian
 */
public class AhorcadoServicio {

    Scanner leer = new Scanner(System.in);

    /*Metodo crearJuego(): le pide la palabra al usuario y cantidad de jugadas máxima. 
Con la palabra del usuario, pone la longitud de la palabra, como la longitud del vector. 
Después ingresa la palabra en el vector, letra por letra, quedando cada letra de la palabra en un índice del vector. 
Y también, guarda la cantidad de jugadas máximas y el valor que ingresó el usuario.*/
    public Ahorcado crearJuego() {
        Ahorcado datos = new Ahorcado();

        System.out.println("Ingrese la palabra");
        String pal = leer.nextLine();

        System.out.println("Ingrese la cantidad de jugadas maximas");
        datos.setCantJugadasMax(leer.nextInt());

        int largo = pal.length();
        datos.setPalabra(new String[largo]);

        for (int i = 0; i < pal.length(); i++) {
            datos.getPalabra()[i] = pal.substring(i, i + 1);
        }

        return datos;
    }
//Método longitud(): muestra la longitud de la palabra que se debe encontrar. 
//Nota: buscar como se usa el vector.length.

    public void longitud(Ahorcado datos) {
        System.out.println("La palabra a encontrar tiene " + datos.getPalabra().length + " letras");
    }

//Método buscar(letra):  este método recibe una letra dada por el usuario y busca si la letra ingresada 
//es parte de la palabra o no. También informará si la letra estaba o no.
    public void buscarLetra(Ahorcado datos) {

        int cont = datos.getPalabra().length;
        do {
            boolean result = false;
            System.out.println("Ingresar una letra de la palabra a adivinar");
            String letra = leer.next();
            for (int i = 0; i < datos.getPalabra().length; i++) {
                if (datos.getPalabra()[i].equals(letra)) {
                    System.out.println("La letra ingresada se encuentra en la posición (" + (i + 1) + ")");
                    result = true;
                    cont--;
                }
            }
            if (cont == 0) {
                System.out.println("Felicitaciones, adivinaste la palabra!");
                System.out.println(Arrays.toString(datos.getPalabra()));
                break;
            }
            encontradas(cont, datos, result); // llama a funcion encontradas
        } while (datos.getCantJugadasMax() > 0);

    }

    /*Método encontradas(letra):  que reciba una letra ingresada por el usuario y muestre cuantas letras han 
sido encontradas y cuántas le faltan. Este método además deberá devolver true si la letra estaba y false 
si la letra no estaba, ya que, cada vez que se busque una letra que no esté, se le restará uno a sus oportunidades.*/
    public void encontradas(int cont, Ahorcado datos, boolean result) {
        if (result) {
            System.out.println("Han sido encontradas " + (datos.getPalabra().length - cont) + " letras");
            System.out.println("Faltan encontrar " + cont + " letras");
        } else if (!result) {
            System.out.println("La palabra a adivinar, no tiene esa letra!");
            datos.setCantJugadasMax(datos.getCantJugadasMax() - 1);
            intentos(datos); // llama a funcion intentos
            System.out.println();
        }
    }

//Método intentos(): para mostrar cuántas oportunidades le queda al jugador.
    public void intentos(Ahorcado datos) {
        if (datos.getCantJugadasMax() == 0) {
            System.out.println("No te quedan intentos! el juego ha finalizado");
        } else {
            System.out.println("Te quedan " + datos.getCantJugadasMax() + " intentos");
        }
    }

    /*Método juego(): el método juego se encargará de llamar todos los métodos previamente mencionados e informará 
cuando el usuario descubra toda la palabra o se quede sin intentos. Este método se llamará en el main.*/
    public void juego(Ahorcado datos) {
        longitud(datos); // llama a funcion longitud de palabra
        buscarLetra(datos); // llama a funcion de buscar letra

    }
}
