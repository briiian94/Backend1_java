/*
Crear una clase Rectángulo que modele rectángulos por medio de un atributo privado base y un atributo privado altura. La clase incluirá un método para crear el rectángulo con los datos del Rectángulo dados por el usuario. También incluirá un método para calcular la superficie del rectángulo y un método para calcular el perímetro del rectángulo. Por último, tendremos un método que dibujará el rectángulo mediante asteriscos usando la base y la altura. Se deberán además definir los métodos getters, setters y constructores correspondientes.
Superficie = base * altura / Perímetro = (base + altura) * 2.
 */
package backend_poo1_guia7_1.pkg4;

/**
 *
 * @author brian
 */
public class BackEnd_POO1_Guia7_14 {

    public static void main(String[] args) {
        
        Rectangulo r1 = new Rectangulo();
        r1.ingDatos();
        
        System.out.println("La superficie es "+r1.superficie());
        System.out.println("El perimetro es "+r1.perimetro());
        r1.dibujo(r1.getBase(),r1.getAltura());
        
        
    }
    
}
