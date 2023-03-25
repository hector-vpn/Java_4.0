
/*1.- Crear un método que muestre los datos (nombre, apellido y la edad) de un usuario, ingresado
por teclado. */
import java.util.*;

public class persona {

    private String nombre;
    private String apellido;
    private int edad;

    public persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public void mostrarDatos() {

        System.out.println(">>Nombre: " + nombre + "\n>>Apellido: " + apellido + "\n>>Edad: " + edad);

    }

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese su nombre: ");
        String nombre = teclado.nextLine();

        System.out.print("Ingrese su apellido: ");
        String apellido = teclado.nextLine();

        System.out.print("Ingrese su edad: ");
        int edad = teclado.nextInt();

        persona p1 = new persona(nombre, apellido, edad);

        p1.mostrarDatos();
    }
}
