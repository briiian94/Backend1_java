

package Clase9_11;

import java.util.Scanner;

/**
 *
 * @author Brian
 */
public class ej3_4 {
    
    /*Los profesores del curso de programación de Egg necesitan llevar un registro de las notas
    adquiridas por sus 10 alumnos para luego obtener una cantidad de aprobados y desaprobados. 
    Durante el período de cursado cada alumno obtiene 4 notas, 
    2 por trabajos prácticos evaluativos y 2 por parciales. 
    Las ponderaciones de cada nota son:
            Primer trabajo práctico evaluativo 10%
            Segundo trabajo práctico evaluativo 15%
            Primer Integrador 25%
            Segundo integrador 50%
    Una vez cargadas las notas, se calcula el promedio y se guarda en el arreglo. 
    Al final del programa los profesores necesitan obtener por pantalla la cantidad de aprobados
    y desaprobados, teniendo en cuenta que solo aprueban los alumnos con promedio mayor o igual al 7
    de sus notas del curso.
    */
    
            public static void main(String[] args) {
                int cant = 10;
                int not = 5;
                double[][] notas=llenarMatriz(cant,not);
                
            }
            
            public static double[][] llenarMatriz(int cant, int not){
                Scanner leer = new Scanner(System.in);
                double[][] notas= new double[cant][not];
                
                int desaprobados =0;
                int aprobados =0;
                
                for (int i=0 ; i<cant ; i++){
                    double prom=0;
                    System.out.println("Completar las 4 notas del alumno "+(i+1));
                    for (int j=0 ; j<not ; j++){
                       if (j<4){
                        System.out.print("Ingrese la nota ");
                        notas [i][j] = leer.nextInt();
                        
                            switch (j){
                                case 0:
                                    notas [i][j] = notas [i][j]*0.1;
                                    break;
                                case 1:
                                    notas [i][j] = notas [i][j]*0.15;
                                    break;
                                case 2:
                                    notas [i][j] = notas [i][j]*0.25;
                                    break;
                                case 3:
                                    notas [i][j] = notas [i][j]*0.5;
                                    break;
                            }
                        prom += notas [i][j];
                            
                       } else {
                        notas [i][j] = prom;
                       }
                    }
                        if (notas [i][4]<7){
                            desaprobados++;
                        } else {
                            aprobados++;
                        }
                }
                System.out.println("Cantidad de aprobados "+aprobados);
                System.out.println("Cantidad de desaprobados "+desaprobados);
                return notas;
            }
            
            
}

                
