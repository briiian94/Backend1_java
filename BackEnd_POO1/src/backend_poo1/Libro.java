

package backend_poo1;
import java.util.Scanner;

/**
 *
 * @author brian
 */
public class Libro {

    public String ISBN;
    public String titulo;
    public String autor;
    public String numPag;
    
    // constructor

    public Libro(String ISBN, String titulo, String autor, String numPag) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.numPag = numPag;
    }

    public Libro() {
    }

}
