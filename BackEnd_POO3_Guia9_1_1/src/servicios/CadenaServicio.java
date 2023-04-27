/*Crear una clase CadenaServicio en el paquete servicios que implemente los siguientes métodos:
a) Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la frase ingresada.
b) Método invertirFrase(), deberá invertir la frase ingresada y mostrarla
por pantalla. Por ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
c) Método vecesRepetido(String letra), recibirá un carácter ingresado
por el usuario y contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
d) Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
e) Método compararLongitud(String frase), deberá comparar la longitud
de la frase que compone la clase con otra nueva frase ingresada por el usuario.
f) Método unirFrases(String frase), deberá unir la frase contenida en la
clase Cadena con una nueva frase ingresada por el usuario y mostrar la frase resultante.
g) Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se encuentren en la frase, 
por algún otro carácter seleccionado por el usuario y mostrar la frase resultante.
h) Método contiene(String letra), deberá comprobar si la frase contiene una letra que ingresa el usuario
y devuelve verdadero si la contiene y falso si no.*/
package servicios;

import entidades.Cadena;
import java.util.Scanner;

/**
 *
 * @author brian
 */
public class CadenaServicio {

    Scanner leer = new Scanner(System.in);

    //a) Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la frase ingresada.
    public Cadena llenarFrase() {
        Cadena datos = new Cadena();
        System.out.println("Ingresar la frase");
        datos.setFrase(leer.nextLine().toUpperCase());

        datos.setLongitud(datos.getFrase().length());

        return datos;
    }

    public void mostrarVocales(Cadena datos) {
        int cantVoc = 0;

        for (int i = 0; i < datos.getLongitud(); i++) {
            String letra = datos.getFrase().substring(i, i + 1);
            if ((letra.equals("A") || letra.equals("E") || letra.equals("I") || letra.equals("O") || letra.equals("U"))) {
                cantVoc++;
            }
        }
        System.out.println("Cantidad de vocales = " + cantVoc);
    }
    //b) Método invertirFrase(), deberá invertir la frase ingresada y mostrarla
    //por pantalla. Por ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".

    public void invertirFrase(Cadena datos) {
        String fraseInvertida = "";
        String letras;

        for (int i = datos.getLongitud(); i > 0; i--) {
            letras = datos.getFrase().substring(i - 1, i);
            fraseInvertida = fraseInvertida.concat(letras);

        }
        System.out.println(fraseInvertida);
    }

    /*c) Método vecesRepetido(String letra), recibirá un carácter ingresado
por el usuario y contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
d) Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.*/
    public void vecesRepetido(Cadena datos) {
        System.out.println("Ingresar un caracter");
        String caracter = leer.next().toUpperCase();
        String letra;
        int cont = 0;
        for (int i = 0; i < datos.getLongitud(); i++) {
            letra = datos.getFrase().substring(i, i + 1);
            if (letra.equals(caracter)) {
                cont++;
            }
        }
        System.out.println("El caracter ingresado (" + caracter + ") se repite " + cont + " veces");
    }

    /*e) Método compararLongitud(String frase), deberá comparar la longitud
de la frase que compone la clase con otra nueva frase ingresada por el usuario.*/
    public void compararLongitud(Cadena datos) {
        Scanner leer1 = new Scanner(System.in);
        String frase2;
        System.out.println("Ingrese otra frase para comparar longitud");
        frase2 = leer1.nextLine();
        System.out.println("El largo de la frase original es (" + datos.getLongitud() + ") y la nueva frase ingresada tiene (" + frase2.length() + ") caracteres");
    }

    /*f) Método unirFrases(String frase), deberá unir la frase contenida en la
clase Cadena con una nueva frase ingresada por el usuario y mostrar la frase resultante.*/
    public void unirFrases(Cadena datos) {
        Scanner leer1 = new Scanner(System.in);
        System.out.println("Ingrese una nueva frase");
        String frase3 = leer1.nextLine().toUpperCase();
        String fraseUnida = datos.getFrase() + " " + frase3;
        System.out.println(fraseUnida);
    }

    /*g) Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se encuentren en la frase, 
por algún otro carácter seleccionado por el usuario y mostrar la frase resultante.*/
    public void reemplazar(Cadena datos) {
        Scanner leer1 = new Scanner(System.in);
        System.out.println("Ingresar una letra");
        String letra = leer1.nextLine().toUpperCase();
        String nuevaFrase = "";
        for (int i = 0; i < datos.getLongitud(); i++) {
            if (datos.getFrase().substring(i, i + 1).equals("A")) {
                nuevaFrase = nuevaFrase.concat(letra);
            } else {
                nuevaFrase = nuevaFrase.concat(datos.getFrase().substring(i, i + 1));
            }
        }
        System.out.println("Se reemplazaron todas las letras A por la ingresada");
        System.out.println(nuevaFrase);
    }

    /*h) Método contiene(String letra), deberá comprobar si la frase contiene una letra que ingresa el usuario
    y devuelve verdadero si la contiene y falso si no.*/
    public void contiene(Cadena datos) {
        Scanner leer1 = new Scanner(System.in);
        System.out.println("Ingrese una letra, comprobaremos si se encuentra dentro de la frase");
        String letra = leer1.nextLine().toUpperCase();
        String es = "Falso";
        for (int i = 0; i < datos.getLongitud(); i++) {
            if (datos.getFrase().substring(i, i + 1).equals(letra)) {
                es = "Verdadero";
            }
        }
        System.out.println(es);

    }

}
