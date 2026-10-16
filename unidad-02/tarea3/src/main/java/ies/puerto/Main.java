package ies.puerto;
import java.util.Scanner;
/**
 * @author belopher
 * @version 1.0.0
 */
public class Main {
    static void main() {
Scanner teclado = new Scanner(System.in);
boolean salir = false;
float ahorroTotal = 0;
float aporteTotal = 0;
float aporte = 0;
System.out.println("Introduce tu nombre: ");
String nombre = teclado.nextLine();
System.out.println("¿Cuanto dinero has ahorrado? ");
float ahorroInicial = teclado.nextFloat();
System.out.println("Hola, " + nombre);
do {
    System.out.println("Introduce una cantidad para ahorrar: ");
    aporte = teclado.nextFloat();
} while (aporte < 0);
int contador = 0;
aporteTotal = aporteTotal + aporte;
ahorroTotal = ahorroInicial + aporte;
System.out.println("Aportación registrada. Ahorro actual: " +ahorroTotal);

do {
    teclado.nextLine();
    System.out.println("¿Deseas realizar otra aportación? (Y/N): ");
    String opcion = teclado.nextLine();
    switch (opcion) {
        case "y", "Y":
            do {
                System.out.println("Introduce una cantidad para ahorrar: ");
                aporte = teclado.nextFloat();
            } while (aporte < 0);
            ahorroTotal = ahorroTotal + aporte;
            aporteTotal = aporteTotal + aporte;
            System.out.println("Aportación registrada. Ahorro actual: " +ahorroTotal);
            contador ++;
            break;
            case "N", "n":

                System.out.println("RESUMEN DEL AHORRO");

                System.out.println("Ahorro inicial: " +ahorroInicial);
                System.out.println("Aportaciones realizadas: "+contador);
                System.out.println("Total aportado: " +aporteTotal);
                System.out.println("Ahorro final: " +ahorroTotal);
                return;
    }
} while (!salir);

                teclado.close();

    }
}
