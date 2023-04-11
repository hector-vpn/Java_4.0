package Integrador;

public class Calculadora {
    public double sumar(double unNumero, double otroNumero) {
        return unNumero + otroNumero;
    }

    public double restar(double unNumero, double otroNumero) {
        return unNumero - otroNumero;
    }

    public double multiplicar(double unNumero, double otroNumero) {
        return unNumero * otroNumero;
    }

    public double dividir(double unNumero, double otroNumero) {
        if (otroNumero == 0) {
            System.out.println("Error: No se puede dividir por cero.");
            return 0;
        } else {
            return unNumero / otroNumero;
        }
    }

}
