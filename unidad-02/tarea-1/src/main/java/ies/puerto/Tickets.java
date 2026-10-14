package ies.puerto;

import java.util.Scanner;

public class Tickets {
    /**
     * @author belopher
     * @version 1.0.0
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int productos = 0;
        float suma = 0;
        System.out.println("====================================");
        System.out.println("         TIENDA DAM-PRO");
        System.out.println("====================================");
        System.out.println("Intoduce tu nombre");
        String nombre = teclado.nextLine();
        System.out.println("¿Cuántos productos vas a comprar?");
        productos = teclado.nextInt();

        for (int i = 1; i <=productos; i++) {
            System.out.println("Producto" +i);
            teclado.nextLine();
            System.out.println("Nombre:");
            String nombreProducto = teclado.nextLine();
            System.out.println("Precio:");
            float precioProducto = teclado.nextFloat();
            System.out.println(nombreProducto +"-"+precioProducto+" euros");
            suma = suma + productos;
        }
        System.out.println("====================================");
        System.out.println("            TOTAL DEL TICKET");
        System.out.println("====================================");
        System.out.println("Cliente: " +nombre);
        System.out.println("Total de productos: " +productos);
        System.out.println("Total: " +suma);
        System.out.println("Gracias por su compra: " +nombre);
    }
}
