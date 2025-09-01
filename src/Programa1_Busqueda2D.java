

public class Programa1_Busqueda2D {
    public static void main(String[] args) {
        int [][] matriz = {{1, 2, 3}, 
                           {4, 16, 4},
                           {7, 5, 6}};
        int[] resultado = buscar(4, matriz);
        System.out.println("Posición: [" + resultado[0] + ", " + resultado[1] + "]");
    }
    public static int[] buscar(int n, int[][] matriz){
        int[] pos = new int[] {-1, -1};  
        for(int i=0; i<matriz.length;i++){
                for(int j=0; j<matriz[i].length;j++){
                    if (matriz[i][j] == n) {
                        pos = new int[] {i, j};
                            return pos;
                    }
            }
        }
        return pos;                   
        };
}
