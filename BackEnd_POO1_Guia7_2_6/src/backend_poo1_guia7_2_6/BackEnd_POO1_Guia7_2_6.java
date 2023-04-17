/*
 Crea una clase "Rectángulo" que tenga atributos "lado1" y "lado2" y un método "calcular_area" 
que calcule y devuelva el área del rectángulo. Luego crea un objeto "rectangulo1" de la clase "Rectángulo" 
con lados de 4 y 6 y imprime el área del rectángulo.
 */
package backend_poo1_guia7_2_6;

/**
 *
 * @author brian
 */
public class BackEnd_POO1_Guia7_2_6 {

    public static void main(String[] args) {
        
        Rectangulo r1 = new Rectangulo();
        System.out.println("EL area del rectangulo 1 es "+r1.calcularArea());
        
        Rectangulo r2 = new Rectangulo();
        System.out.println("El area del rectangulo 2 es "+r2.rectangulo1());
    }
    
}
