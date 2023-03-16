public class ej_03 {

    public static void main(String[] args) {
        int[] numeros = new int[10];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = i + 6;
            System.out.println(i + "-" + numeros[i]);
        }
        System.out.println("Division del elemento en la posision 6");
        System.out.println(">>" + numeros[6] / 3);
    }

}
