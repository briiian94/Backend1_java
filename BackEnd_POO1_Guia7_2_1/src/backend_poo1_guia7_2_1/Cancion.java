

package backend_poo1_guia7_2_1;
import java.util.Scanner;

/**
 *
 * @author brian
 */
public class Cancion {
            private String titulo;
            private String autor;

    public Cancion() {
        String titulo = "";
        String autor = "";
        
    }

    public Cancion(String titulo, String autor) {

        this.titulo = titulo;
        this.autor = autor;
    }

    public void completaDato(){
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingresar el titulo de la cancion ");
        titulo = leer.nextLine();
        System.out.print("Ingresar el autor de la cancion ");
        autor = leer.nextLine();
        
    }
    
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
            
            

}
