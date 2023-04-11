

package Clase9_11;

import java.util.Scanner;

/**
 *
 * @author Brian
 */
public class ej1_1 {
    
    /*
    Crea un vector llamado ‘Equipo’ cuya dimensión sea la cantidad de compañeros de equipo 
    y define su tipo de dato de tal manera que te permita alojar sus nombres más adelante.
    */
            public static void main(String[] args) {
                Scanner leer = new Scanner(System.in);
                System.out.println("Ingrese la cantidad de miembros del equipo");
                int n = leer.nextInt();               

                String[] Equipo = new String[n];
                
                llenarVector(Equipo);
                mostrarVector(Equipo);
                
            }
            
            public static void llenarVector(String[] Equipo){
                Scanner leer1 = new Scanner(System.in);
                
                for (int i=0 ; i<Equipo.length;i++){
                    System.out.println("Ingrese el nombre del integrante "+(i+1)+" del equipo");
                    Equipo[i] = leer1.next();
                    
                }
            }
            
            public static void mostrarVector(String[] Equipo){
                for (int i=0 ; i<Equipo.length ; i++){
                    System.out.println("Integrante "+(i+1)+" del equipo, se llama "+Equipo[i]);
                }
            }

}
