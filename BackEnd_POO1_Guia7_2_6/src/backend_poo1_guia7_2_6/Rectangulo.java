

package backend_poo1_guia7_2_6;
import java.util.Scanner;

/**
 *
 * @author brian
 */
public class Rectangulo {
           
    private double lado1;
    private double lado2;
    public double area;

    public Rectangulo(double lado1, double lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public Rectangulo() {
    }

    public double getLado1() {
        return lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }
    
    
    public double calcularArea(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresar el valor del lado 1 y del lado 2");
        this.lado1 = leer.nextDouble();
        this.lado2 = leer.nextDouble();
        
        return area = this.lado1 * this.lado2;
    }
    
       public double rectangulo1(){
        this.lado1 = 4;
        this.lado2 = 6;
        
        return area = this.lado1 * this.lado2;
    }
}
