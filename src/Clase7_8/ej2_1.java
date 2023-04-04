

package Clase7_8;

import java.util.Scanner;

/**
 *
 * @author Brian
 */
public class ej2_1 {
    
    /*Crea una aplicación que le pida dos números al usuario y este pueda elegir entre sumar,
    restar, multiplicar y dividir. La aplicación debe tener una función para cada operación 
    matemática y deben devolver sus resultados para imprimirlos en el main. */
    
            public static void main(String[] args) {
                 Scanner leer = new Scanner(System.in);
                 System.out.println("Ingrese dos numeros");
                 int num1=leer.nextInt();
                 int num2=leer.nextInt(); 
                 
                 String s = "n";
                 
                    
                 System.out.println("Ingrese una opcion");
                 System.out.println("1.Sumar");
                 System.out.println("2.Restar");
                 System.out.println("3.Multiplicar");
                 System.out.println("4.Dividir");
                 
                 int opcion=leer.nextInt();
                     System.out.println();
                 
                 switch (opcion){
                     case 1:
                         int sum=suma(num1,num2);
                         System.out.println(num1+" + "+num2+" = "+sum);
                         break;
                     case 2:
                         int res=resta(num1,num2);
                         System.out.println(num1+" - "+num2+" = "+res);
                         break;
                     case 3:
                         int mul=multip(num1,num2);
                         System.out.println(num1+" * "+num2+" = "+mul);
                         break;
                     case 4:
                         double div=divid(num1,num2);
                         System.out.println(num1+" / "+num2+" = "+div);
                         break;
                     default:
                         System.out.println("Opcion incorrecta");
                         break;
                    }
                     System.out.println();

                 
                 
            }
            
            public static int suma(int num1, int num2){
                
                int resultadoSuma=num1+num2;
                               
                return resultadoSuma;
            }
            
            public static int resta(int num1, int num2){
                int resultadoResta=num1-num2;
                return resultadoResta;
            }
            
            public static int multip(int num1, int num2){
                int resultadoMult=num1*num2;
                return resultadoMult;
            }
            
            public static double divid(int num1, int num2){
                double resultadoDiv=num1/num2;
                return resultadoDiv;
            }

}
