package es.dampro.unidad2.tarea6;
/**
 * @author belopher
 * @version 1.0.0
 */

public class Main {
/**
 * Programa principal que ejecuta los diez algoritmos con ejemplos.
 */
    /**
     * Muestra una línea por algoritmo, con su etiqueta y el resultado.
     *
     * @param args argumentos de línea de comandos (no se utilizan)
     */
    public static void main(String[] args) {
        System.out.println("InvertirCadena: " + new InvertirCadena().invertir("Hola"));
        System.out.println("Palindromo: " + new Palindromo().esPalindromo("Ana"));
        System.out.println("ContadorVocales: " + new ContadorVocales().contarVocales("Murciélago"));
        System.out.println("SumaDigitos: " + new SumaDigitos().sumarDigitos("5832"));
        System.out.println("MayorNumero: " + new MayorNumero().obtenerMayor("12,-5,89"));
        System.out.println("BinarioDecimal: " + new BinarioDecimal().convertirBinario("1011"));
        System.out.println("Factorial: " + new Factorial().calcularFactorial("5"));
        System.out.println("NumeroPrimo: " + new NumeroPrimo().esPrimo("17"));
        System.out.println("EcuacionCuadratica: " + new EcuacionCuadratica().calcularDiscriminante("1", "-5", "6"));
        System.out.println("MediaNumeros: " + new MediaNumeros().calcularMedia("10,20,30,40"));
    }
}