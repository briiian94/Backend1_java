package backend_poo2_guia8_1_3;

import entidades.Persona;
import java.util.Scanner;
import servicio.PersonaServicio;

/*Inicializar un objeto de la clase Persona ejercicio 3 de la guía 8 Servicios, a null y tratar
de invocar el método esMayorDeEdad() a través de ese objeto. Luego, englobe el código
con una cláusula try-catch para probar la nueva excepción que debe ser controlada.*/
public class BackEnd_POO2_Guia8_1_3 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        PersonaServicio ps = new PersonaServicio();
        // System.out.print("Ingrese la cantidad de personas a registrar  : ");
        // int n = leer.nextInt();

        Persona p = null;

        try {
            ps.esMayorDeEdad(p);
        } catch (Exception e) {
            System.out.println("El objeto no fue creado " + e);
        }

        /*
        int[] imc = new int[n];
        boolean[] mayor = new boolean[n];
        double contSobrePeso = 0;
        double contBajoPeso = 0;
        double contPesoIdeal = 0;
        double esMayor = 0;
        double esMenor = 0;

        for (int i = 0; i < n; i++) {
            System.out.println("Ingresar los datos de la persona " + (i + 1));
            p[i] = ps.crearPersona();
            imc[i] = ps.calcularIMC(p[i]);
            switch (imc[i]) {
                case -1:
                    System.out.println("La persona esta por debajo del peso");
                    contBajoPeso = +1;
                    break;
                case 0:
                    System.out.println("La persona esta en su peso ideal");
                    contPesoIdeal = +1;
                    break;
                default:
                    System.out.println("La persona tiene sobrepeso");
                    contSobrePeso = +1;
                    break;
            }
            mayor[i] = ps.esMayorDeEdad(p[i]);
            if (mayor[i]) {
                esMayor = +1;
            } else {
                esMenor = +1;
            }
        }
        System.out.println("El porcentaje de personas con peso ideal es %" + ((contPesoIdeal / n) * 100));
        System.out.println("El porcentaje de personas con sobrepeso es %" + ((contSobrePeso / n) * 100));
        System.out.println("El porcentaje de personas con bajo peso es %" + ((contBajoPeso / n) * 100));
        System.out.println("El porcentaje de mayores de edad es %" + (esMayor / (esMayor + esMenor) * 100));
        System.out.println("El porcentaje de menores de edad es %" + (esMenor / (esMayor + esMenor) * 100));
    }
         */
    }
