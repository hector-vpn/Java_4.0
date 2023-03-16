package Clase_03.ej_05;

public class PromedioCursos {
    public static void main(String[] args) {
        Cursos[] cursos = new Cursos[3];
        cursos[0] = new Cursos("Matemáticas", new double[] { 4.5, 3.2, 4.8, 5.0, 3.9 });
        cursos[1] = new Cursos("Ciencias", new double[] { 3.5, 4.2, 4.8, 4.0, 3.9 });
        cursos[2] = new Cursos("Inglés", new double[] { 5.0, 4.2, 4.8, 4.0, 4.5 });

        // Mostrar el promedio de notas de cada curso
        for (int i = 0; i < cursos.length; i++) {
            System.out.println("Promedio de notas de " + cursos[i].getNombre() + ": " + cursos[i].getPromedio());
        }
    }
}