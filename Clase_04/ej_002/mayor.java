/*2.- Diseñe un método que imprima los datos de una persona ingresados por teclado e indicar si es
mayor o menor de edad. */
package Clase_04.ej_002;

import java.util.*;

public class mayor {

    private String nombre;
    private String apellido;
    private int edad;

    public mayor(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public void mostrarDatos() {

        System.out.println(">>Nombre: " + nombre + "\n>>Apellido: " + apellido + "\n>>Edad: " + edad);

    }

    public void compruebaEdad() {

        if (edad >= 18) {
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("Es menos de edad");
        }
    }

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese su nombre: ");
        String nombre = teclado.nextLine();

        System.out.print("Ingrese su apellido: ");
        String apellido = teclado.nextLine();

        System.out.print("Ingrese su edad: ");
        int edad = teclado.nextInt();

        mayor p1 = new mayor(nombre, apellido, edad);

        p1.mostrarDatos();
        p1.compruebaEdad();
    }

}
