/*
 Definir una clase llamada Puntos que contendrá las coordenadas de dos puntos,
sus atributos serán, x1, y1, x2, y2, siendo cada x e y un punto. Generar un objeto 
puntos usando un método crearPuntos() que le pide al usuario los dos números y los 
ingresa en los atributos del objeto. Después, a través de otro método calcular y devolver 
la distancia que existe entre los dos puntos que existen en la clase Puntos.
Para conocer como calcular la distancia entre dos puntos consulte el siguiente link:
http://www.matematicatuya.com/GRAFICAecuaciones/S1a.html

 */
package backend_poo1_guia7_2_2;

/**
 *
 * @author brian
 */
public class BackEnd_POO1_Guia7_2_2 {

    public static void main(String[] args) {
        
        Puntos p = new Puntos();
        p.crearPuntos();
        System.out.println("La distancia entre los puntos ("+p.getX1()+","+p.getY1()+") y ("+p.getX2()+","+p.getY2()+") es "+p.calcularDistancia());
    }
    
}
