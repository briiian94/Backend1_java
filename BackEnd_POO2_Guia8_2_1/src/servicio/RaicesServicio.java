/*Luego, en RaicesServicio las operaciones que se podrán realizar son las siguientes:
-Método getDiscriminante(): devuelve el valor del discriminante (double). El discriminante tiene la siguiente fórmula: (b^2)-4*a*c
-Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, para que esto ocurra, 
el discriminante debe ser mayor o igual que 0.
-Método tieneRaiz(): devuelve un booleano indicando si tiene una única solución, para que esto ocurra, 
el discriminante debe ser igual que 0.
-Método obtenerRaices(): llama a tieneRaíces() y si devolvió́ true, imprime las 2 posibles soluciones.
-Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́ true imprime una única raíz. 
Es en el caso en que se tenga una única solución posible.
-Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(), y mostrará por pantalla las posibles soluciones 
que tiene nuestra ecuación con los métodos obtenerRaices() o obtenerRaiz(), según lo que devuelvan nuestros métodos y en caso de
no existir solución, se mostrará un mensaje.
Nota: Fórmula ecuación 2o grado: (-b±√((b^2)-(4*a*c)))/(2*a) Solo varía el signo delante de -b 
 */
package servicio;

import java.util.Scanner;
import entidades.Raices;

/**
 *
 * @author brian
 */
public class RaicesServicio {

    Scanner leer = new Scanner(System.in);

    public Raices llenarCoeficiente() {

        Raices coeficientes = new Raices();

        System.out.print("Ingrese el valor de a : ");
        coeficientes.setA(leer.nextDouble());
        System.out.print("Ingrese el valor de b : ");
        coeficientes.setB(leer.nextDouble());
        System.out.print("Ingrese el valor de c : ");
        coeficientes.setC(leer.nextDouble());

        return coeficientes;
    }

    //Método getDiscriminante(): devuelve el valor del discriminante (double). El discriminante tiene la siguiente fórmula: (b^2)-4*a*c
    public double getDiscriminante(Raices coeficientes) {
        double discriminante = (Math.pow(coeficientes.getB(), 2)) - 4 * coeficientes.getA() * coeficientes.getC();
        return discriminante;
    }

    //-Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, para que esto ocurra, 
    //el discriminante debe ser mayor o igual que 0.
    public boolean tieneRaices(double getDiscriminante) {
        boolean tieneRaices = false;
        if (getDiscriminante >= 0) {
            tieneRaices = true;
        }
        return tieneRaices;
    }

    //-Método tieneRaiz(): devuelve un booleano indicando si tiene una única solución, para que esto ocurra, 
    //el discriminante debe ser igual que 0.
    public boolean tieneRaiz(double getDiscriminante) {
        boolean tieneRaiz = false;
        if (getDiscriminante == 0) {
            tieneRaiz = true;
        }
        return tieneRaiz;
    }

    //-Método obtenerRaices(): llama a tieneRaíces() y si devolvió́ true, imprime las 2 posibles soluciones.
    //Nota: Fórmula ecuación 2o grado: (-b±√((b^2)-(4*a*c)))/(2*a) Solo varía el signo delante de -b
    public void obtenerRaices(Raices coeficientes, boolean tieneRaices) {
        double soluc1 = 0;
        double soluc2 = 0;
        if (tieneRaices) {
            soluc1 = (-coeficientes.getB() + Math.sqrt((Math.pow(coeficientes.getB(), 2)) - (4 * coeficientes.getA() * coeficientes.getC()))) / (2 * coeficientes.getA());
            soluc2 = (-coeficientes.getB() - Math.sqrt((Math.pow(coeficientes.getB(), 2)) - (4 * coeficientes.getA() * coeficientes.getC()))) / (2 * coeficientes.getA());
            System.out.println("Las raices son : " + soluc1 + " y " + soluc2);
        } else {
            System.out.println("No tiene soluciones reales");
        }
    }

    //-Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́ true imprime una única raíz. 
    //Es en el caso en que se tenga una única solución posible.
    public void obtenerRaiz(Raices coeficientes, boolean tieneRaiz) {
        double soluc1 = 0;
        if (tieneRaiz) {
            soluc1 = (-coeficientes.getB() / (2 * coeficientes.getA()));
            System.out.println("La raiz es : " + soluc1);
        } else {
            System.out.println("No tiene solucion unica");
        }
    }

    //-Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(), y mostrará por pantalla las posibles soluciones 
    //que tiene nuestra ecuación con los métodos obtenerRaices() o obtenerRaiz(), según lo que devuelvan nuestros métodos y en caso de
    //no existir solución, se mostrará un mensaje.
    public void calcular(Raices coeficientes) {
        double discriminante = getDiscriminante(coeficientes);
        if (tieneRaices(discriminante)) {
            obtenerRaices(coeficientes, true);
        } else if (tieneRaiz(discriminante)) {
            obtenerRaiz(coeficientes, true);
        } else {
            System.out.println("No tiene soluciones reales");
        }
    }
}
