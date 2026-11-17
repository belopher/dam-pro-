package es.educacion.arrays;

/**
 * @author belopher
 * @version 1.0.0
 */
public final class Ejercicio17Diagonal {
    private Ejercicio17Diagonal() { }

    // Contrato: Suma diagonal principal de una matriz cuadrada, incluida la matriz 0x0. Si matriz es nula o no cuadrada: IllegalArgumentException.
    public static int sumarDiagonal(int[][] matriz) {
        if(matriz == null) {
            throw new IllegalArgumentException();
        }
        int filas = matriz.length;
        //
        //0|1
        //1|2
        for (int i = 0; i < filas; i++){
            //int [] fila = matriz[i]
            if (matriz[i] == null || matriz[i].length!=filas);
                throw new IllegalArgumentException();

                }
                    for (int j = 0; j < matriz[i].length; j++) {
                        if (i == j) {
                            resultado += matriz[i][j];
                            break;
                        }
                    }
                    return resultado;
    }
}
