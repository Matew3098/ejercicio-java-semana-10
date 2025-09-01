import java.util.Arrays;

public class Programa2_Ordenacion2D {

    public static void main(String[] args) {
        int[][] matriz = {
            {1, 2, 3},
            {4, 16, 9},
            {7, 5, 6}
        };

        System.out.println("Matriz original:");
        for (int[] fila : matriz) {
            System.out.println(Arrays.toString(fila));
        }

        ordenar(1, matriz);

        System.out.println("\nMatriz con fila ordenada:");
        for (int[] fila : matriz) {
            System.out.println(Arrays.toString(fila));
        }
    }

    public static void ordenar(int n, int[][] matriz) {
        if (n < matriz.length) {
            Arrays.sort(matriz[n]);
        } else {
            System.out.println("Fila inválida");
        }
    }
}

