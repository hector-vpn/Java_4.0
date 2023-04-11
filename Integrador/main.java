package Integrador;

import java.util.*;

public class main {
    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("==== Tabla de Opciones ====");
            System.out.println("1. Suma 1");
            System.out.println("2. Resta 2");
            System.out.println("3. Multiplicacion 3");
            System.out.println("4. Division");
            System.out.println("5. Salir");
            System.out.print("Ingresa tu opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el primer número: ");
                    double num1 = sc.nextDouble();
                    System.out.print("Ingrese el segundo número: ");
                    double num2 = sc.nextDouble();
                    System.out.println("Suma: " + calculadora.sumar(num1, num2));
                    break;
                case 2:
                    System.out.print("Ingrese el primer número: ");
                    double num3 = sc.nextDouble();
                    System.out.print("Ingrese el segundo número: ");
                    double num4 = sc.nextDouble();
                    System.out.println("Resta: " + calculadora.restar(num3, num4));
                    break;
                case 3:
                    System.out.print("Ingrese el primer número: ");
                    double num5 = sc.nextDouble();
                    System.out.print("Ingrese el segundo número: ");
                    double num6 = sc.nextDouble();
                    System.out.println("Multiplicación: " + calculadora.multiplicar(num5, num6));
                    break;
                case 4:
                    System.out.print("Ingrese el primer número: ");
                    double num7 = sc.nextDouble();
                    System.out.print("Ingrese el segundo número: ");
                    double num8 = sc.nextDouble();
                    System.out.println("División: " + calculadora.dividir(num7, num8));
                    break;
                case 5:
                    System.out.println("¡Adiós!");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, selecciona una opción válida.");
                    break;
            }
        } while (opcion != 5);

        sc.close();
    }

}
