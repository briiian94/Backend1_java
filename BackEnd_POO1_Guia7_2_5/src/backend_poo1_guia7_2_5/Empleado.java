package backend_poo1_guia7_2_5;

import java.util.Scanner;

/**
 *
 * @author brian
 */
public class Empleado {

    private String nombre;
    private int edad;
    private double salario;

    public Empleado(String nombre, int edad, double salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }

    public Empleado() {
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public double getSalario() {
        return salario;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    /*crea un método "calcular_aumento" que calcule el aumento salarial de un empleado
en función de su edad y salario actual. El aumento salarial debe ser del 10% si el empleado
tiene más de 30 años o del 5% si tiene menos de 30 años*/
    public void calcularAumento() {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese su nombre : ");
        this.nombre = leer.nextLine();
        System.out.print("Ingrese su salario : ");
        this.salario = leer.nextDouble();
        System.out.print("Ingrese su edad : ");
        this.edad = leer.nextInt();

        if (edad < 30) {
            System.out.println("Nombre: " + nombre);
            System.out.println("Edad: " + edad);
            System.out.println("Salario: " + salario);
            this.salario = salario * 1.05;
            System.out.println("Le corresponde un aumento del 5%, por lo tanto su salario sera de : $" + salario);

        } else {
            System.out.println("Nombre: " + nombre);
            System.out.println("Edad: " + edad);
            System.out.println("Salario: " + salario);
            this.salario = salario * 1.1;
            System.out.println("Le corresponde un aumento del 10%, por lo tanto su salario sera de : $" + salario);
        }

    }

}
