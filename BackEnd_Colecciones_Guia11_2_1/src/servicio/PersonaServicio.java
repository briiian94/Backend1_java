package servicio;

import entidades.Perro;
import entidades.Persona;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PersonaServicio {

    public List<Persona> crearPersona() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        List<Persona> personas = new ArrayList<>();
        String opc = "s";

        do {
            Persona persona = new Persona();
            System.out.println("Cargando persona al sistema");
            System.out.println("Ingrese el nombre");
            persona.setNombre(leer.next());
            System.out.println("Ingrese el apellido");
            persona.setApellido(leer.next());
            System.out.println("Ingrese la edad");
            persona.setEdad(leer.nextInt());
            System.out.println("Ingrese el DNI");
            persona.setDni(leer.nextInt());
            personas.add(persona);
            System.out.println("desea agregar mas personas? S/N");
            opc = leer.next().toLowerCase();
        } while (opc.equals("s"));

        return personas;
    }

    public void mostrarNombrePersonas(List<Persona> personas) {
        System.out.println("Personas cargadas en el sistema");
        for (Persona persona : personas) {

            System.out.println("Nombre: " + persona.getNombre());
        }
    }

    public void adoptarPerro(List<Persona> personas, List<Perro> perros) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Ingrese el nombre de la persona en el sistema");
        String nombrePersona = leer.next();
        for (Persona persona : personas) {
            if (persona.getNombre().equals(nombrePersona)) {
                System.out.println("Ingrese el nombre del perro que desea adoptar");
                String nombrePerro = leer.next();
                for (Perro perro : perros) {
                    if (perro.getNombre().equals(nombrePerro)) {
                        if (!perro.isAdoptado()) {
                            persona.setPerro(perro);
                            perro.setAdoptado(true);
                            break;
                        } else {
                            System.out.println("El perro ya se encuentra adoptado");
                            break;
                        }
                    } else {
                        System.out.println("El perro no se encuentra en el sistema");
                        break;
                    }

                }
                break;
            } else {
                System.out.println("La persona no se encuentra cargada en sistema");
            }
        }
    }

}
