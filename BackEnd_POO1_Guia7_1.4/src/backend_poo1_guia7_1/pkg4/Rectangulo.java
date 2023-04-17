package backend_poo1_guia7_1.pkg4;

import java.util.Scanner;

/**
 *
 * @author brian
 */
public class Rectangulo {

    private int base;
    private int altura;

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public Rectangulo() {
    }

    public int getBase() {
        return base;
    }

    public int getAltura() {
        return altura;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public void ingDatos() {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese la base : ");
        int base = leer.nextInt();
        System.out.print("Ingrese la altura : ");
        int altura = leer.nextInt();

        this.base = base;
        this.altura = altura;
    }

    public int superficie() {
        return base * altura;
    }

    public int perimetro() {
        return (base + altura) * 2;

    }

    public void dibujo(int base, int altura) {
        // String n[][] = new String[altura][base];

        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < base; j++) {
                if (i == 0 || i == altura - 1) {
                    System.out.print("* ");
                } else if (j == 0 || j == base - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
