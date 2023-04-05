/*3.- En un supermercado se hace un 20% de descuento a los clientes cuya compra supere los 1000$
en las áreas de frutas, verduras y gaseosas. ¿ Cual será el total que pagara una persona por su
compra ?, se debe mostrar el nombre del cliente , producto, precio , cantidad , descuento y total a
pagar */

package Clase_04.ej_003;

import java.util.Scanner;

public class Supermercado {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir datos al usuario
        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese el producto: ");
        String producto = scanner.nextLine();
        System.out.print("Ingrese el precio unitario: ");
        double precioUnitario = scanner.nextDouble();
        System.out.print("Ingrese la cantidad: ");
        int cantidad = scanner.nextInt();

        // Calcular el subtotal
        double subtotal = precioUnitario * cantidad;

        // Verificar si aplica el descuento
        boolean aplicaDescuento = (producto.equals("frutas") || producto.equals("verduras")
                || producto.equals("gaseosas")) && subtotal > 1000;
        double descuento = aplicaDescuento ? subtotal * 0.2 : 0;

        // Calcular el total
        double total = subtotal - descuento;

        // Mostrar los resultados
        System.out.println("Nombre: " + nombre);
        System.out.println("Producto: " + producto);
        System.out.println("Precio unitario: " + precioUnitario);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Subtotal: " + subtotal);
        if (aplicaDescuento) {
            System.out.println("Descuento: " + descuento);
        }
        System.out.println("Total a pagar: " + total);

        scanner.close();
    }

}
