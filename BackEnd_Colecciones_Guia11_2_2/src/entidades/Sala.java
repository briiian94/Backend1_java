package entidades;

public class Sala {

    private String[][] asientos;
    private Boolean[][] ocupado;


    public Sala() {
        this.ocupado = new Boolean[8][6]; // Agregar esta línea
        setOcupado(ocupado); // Agregar esta línea
    }

    public Sala(String[][] asientos) {
        this.asientos = asientos;
    }

    public String[][] getAsientos() {
        return asientos;
    }

    public void setAsientos(String[][] asientos) {
        this.asientos = asientos;
    }

    public Boolean[][] getOcupado() {
        return ocupado;
    }

    public void setOcupado(Boolean[][] ocupado) {
        if (ocupado != null) {
            for (int i = 0; i < ocupado.length; i++) {
                for (int j = 0; j < ocupado[0].length; j++) {
                    ocupado[i][j] = false;
                }
            }
        }
        this.ocupado = ocupado;
    }
}

