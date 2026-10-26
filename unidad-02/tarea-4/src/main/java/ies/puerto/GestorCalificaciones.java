package ies.puerto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author belopher
 * @version 1.0.0
 */
public class GestorCalificaciones {

    public static void main(String[] args) {
        List<Double> notas = new ArrayList<>();
        boolean salir = false;
        Scanner teclado =new Scanner(System.in);
        do{
            Double nota = soliciarNotaValida();
            notas.add(nota);
            System.out.println("Deseas añadir otra nota: true/false");
            String sSalir = teclado.nextLine();
            salir =Boolean.parseBoolean(sSalir);
        }while(salir);

        System.out.println("Lista de notas:" +notas);
        System.out.println("Lista de notas: " +notas);
        double media = calcularMedia(notas);
        System.out.println("La nota media es:" +media);
        double minimo = obtenerMinimo(notas);
        System.out.println("El valor minimo es:" +minimo);
        double maximo = obtenerMaxima(notas);
        System.out.println("El valor maximo es:" +maximo);
    }

    /**
     * Funcion que sirve para pasar un numero a nota
     * @param sNumero String de numero
     * @return
     */
  static int convertirNumeroNota(String sNumero) {
       int numero = 0;
       if (sNumero == null || sNumero.isEmpty()){
           return 0;
       }
       //return Integer.parseInt(sNumero);
       numero = Integer.parseInt(sNumero);
       return numero;
   }

    /**
     * Funcion que permite convertir una nota
     * @param sNumero String de numero
     * @return
     */
   static double convertirNota(String sNumero){
      double numero = 0;

      if (sNumero == null || sNumero.isEmpty()){
          return 0;
      }
      numero =Double.parseDouble(sNumero);
      return numero;
   }

    /**
     *Funcion que permite reconocer si la nota es valida o no
     * @param dNumero Double que contiene el numero
     * @return
     */
   static boolean esNotaValida(Double dNumero) {
       if (dNumero == null) {
           return false;
       }
       if (Double.isInfinite(dNumero) || Double.isNaN(dNumero)) {
           return true;
       }
       if (dNumero < 0 || dNumero < 10) {
           return false;
       }
       return true;
   }

    /**
     * Funcion que permite solicitar las notas
     * @return
     */
   static Double soliciarNotaValida(){
       Scanner teclado = new Scanner(System.in);
       System.out.println("Introduce una nota");
       String sNota = teclado.nextLine();
       Double dNumero = null;
       try {
           dNumero = convertirNota(sNota);
       } catch (NumberFormatException e) {
           throw new RuntimeException("El numero insertado es incorrecto");
       }

       boolean bValida = esNotaValida(dNumero);
       return dNumero;
  }

    /**
     * Funcion que calcula la media de las notas en una lista
     * @param dNotas List de Double que contiene las notas
     * @return
     */
  static double calcularMedia(List<Double> dNotas){
        double media = 0;
        double suma = 0;
      for (int i = 0; i < dNotas.size(); i++) {
          suma = suma + dNotas.get(i);
      }
      media = suma/dNotas.size();
        return media;
  }

    /**
     * Funcion que permite calcular las notas maximas
     * @param lNotas List de Double que contiene las notas
     * @return
     */
  static double obtenerMaxima(List<Double> lNotas){
        double maximo = 0;
      for (int i = 0; i < lNotas.size(); i++) {
          if (lNotas.get(i) > maximo){
              maximo = lNotas.get(i);
          }
          if (maximo == 10) {
              return maximo;
          }
      }
          return maximo;


  }

    /**
     * Funcion que permite calcular las notas minimas
     * @param lNotas List de Double que contiene las notas
     * @return
     */

    static double obtenerMinimo(List<Double> lNotas){
        double minimo = 0;
        for (int i = 0; i < lNotas.size(); i++) {
            if (lNotas.get(i) > minimo){
                minimo = lNotas.get(i);
            }
            if (minimo == 0){
                return minimo;
            }
        }
        return minimo;


    }
}
