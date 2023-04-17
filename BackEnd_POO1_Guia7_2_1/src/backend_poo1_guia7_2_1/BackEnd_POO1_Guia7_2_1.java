/*
 Desarrollar una clase Cancion con los siguientes atributos: título y autor. Se deberá definir además 
dos constructores: uno vacío que inicializa el título y el autor a cadenas vacías y otro que reciba
como parámetros el título y el autor de la canción. Se deberán además definir los métodos getters y setters correspondientes.

 */
package backend_poo1_guia7_2_1;

/**
 *
 * @author brian
 */
public class BackEnd_POO1_Guia7_2_1 {

    
    public static void main(String[] args) {
        
        Cancion c1 = new Cancion();
        c1.completaDato();
        
        
        System.out.println("titulo : "+c1.getTitulo());
        System.out.println("autor : "+c1.getAutor());
    }
    
}
