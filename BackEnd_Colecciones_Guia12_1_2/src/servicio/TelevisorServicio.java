/*• Método crearTelevisor(): este método llama a crearElectrodomestico() de la clase
padre, lo utilizamos para llenar los atributos heredados del padre y después llenamos
los atributos del televisor.
• Método precioFinal(): este método será heredado y se le sumará la siguiente
funcionalidad. Si el televisor tiene una resolución mayor de 40 pulgadas, se
incrementará el precio un 30% y si tiene un sintonizador TDT incorporado, aumentará
$500. Recuerda que las condiciones que hemos visto en la clase Electrodomestico
también deben afectar al precio.
 */
package servicio;

import entidades.Electrodomestico;
import entidades.Televisor;
import java.util.Scanner;

public class TelevisorServicio extends ElectrodomesticoServicio {

    public Televisor crearTelevisor() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Electrodomestico electro = crearElectrodomestico();
        Televisor televisor = new Televisor();

        televisor.setColor(electro.getColor());
        televisor.setConsumoEnergetico(electro.getConsumoEnergetico());
        televisor.setPeso(electro.getPeso());

        System.out.println("Ingrese la resolucion (En pulgadas)");
        televisor.setPulgadas(leer.nextInt());
        System.out.println("Ingrese si el televisor cuenta con sintonizador S/N");
        String opc = leer.next().toLowerCase();
        if (opc.equals("s")) {
            televisor.setSintonizador(true);
        } else {
            televisor.setSintonizador(false);
        }

      //  precioFinal(televisor);

        return televisor;
    }

    public void precioFinal(Televisor televisor) {
        super.precioFinal(televisor);

        if (televisor.getPulgadas() > 40) {
            televisor.setPrecio(televisor.getPrecio() * 1.3);

        }
        if (televisor.isSintonizador()) {
            televisor.setPrecio(televisor.getPrecio() + 500);
        }
        System.out.println("Precio final " + televisor.getPrecio());

    }

}
