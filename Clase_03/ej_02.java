package Clase_03;

public class ej_02 {
    public static void main(String[] args) {
        int[] numeros = new int[15];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = i + 6;
            // numeros[i] = i + 5;
            System.out.println(numeros[i]);
        }
    }
}
