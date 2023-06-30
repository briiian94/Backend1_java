/*De Cine nos interesa conocer la película que se está reproduciendo, la
sala con los espectadores y el precio de la entrada.*/
package entidades;


public class Cine {

    private Pelicula pelicula;
    private Sala sala;
    private double precioEntrada;

    public Cine() {
    }

    public Cine(Pelicula pelicula, Sala sala, double precioEntrada) {
        this.pelicula = pelicula;
        this.sala = sala;
        this.precioEntrada = precioEntrada;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    public double getPrecioEntrada() {
        return precioEntrada;
    }

    public void setPrecioEntrada(double precioEntrada) {
        this.precioEntrada = precioEntrada;
    }

    

}
