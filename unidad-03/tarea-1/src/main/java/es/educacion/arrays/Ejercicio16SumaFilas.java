package es.educacion.arrays;

/**
 * @author belopher
 * @version 1.0.0
 */
public final class Ejercicio16SumaFilas {
    private Ejercicio16SumaFilas() { }
    //length matriz =3
    //i=0 //|7|3|8|
    //       0 1 2
    //i=1 //|5|1|
    //       0 1
    //i=2 //|3|4|
    //       0 1



    // Contrato: Devuelve un array con la suma de cada fila. Admite matriz rectangular o irregular y filas vacías. Matriz o fila nula: IllegalArgumentException.
    public static int[] sumarFilas(int[][] matriz) {
        if (matriz == null){
            throw new IllegalArgumentException();
        }
        int[] resultado = new int[matriz.length];
        // resultado |0|0|0|
        //i
       for (int i = 0; i < matriz.length; i++){
           int sumaFila = 0;

           int[] fila = matriz[i];
           if (fila == null) {
               throw new IllegalArgumentException();
           }
           /**
           for (int j = 0; j < matriz[i].length; j++) {
               sumaFila = sumaFila +j;
           }
            **/
           for (int columna:fila){
               sumaFila += columna;
           }
           resultado [i] = sumaFila;
       }
        return resultado;
    }
}
