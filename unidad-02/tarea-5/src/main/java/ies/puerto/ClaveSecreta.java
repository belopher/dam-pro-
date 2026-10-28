package ies.puerto;

/**
 * @author  belopher
 * @version 1.0.0
 */
public class ClaveSecreta {
    static void main() {
    //o O = 0
    //i I = 2
    //u U = 3
    //e E = *
    //a A = ?
    }
    static String generarClaveSEgura (String sPalabra) {
        String clave = "";

        if (sPalabra == null || sPalabra.isEmpty()){

        }
        sPalabra = sPalabra.replace("a","?");
        sPalabra = sPalabra.replace("A","?");
        sPalabra = sPalabra.replace("e","?");
        sPalabra = sPalabra.replace("E","?");
        sPalabra = sPalabra.replace("u","?");
        sPalabra = sPalabra.replace("U","?");
        sPalabra = sPalabra.replace("o","?");
        sPalabra = sPalabra.replace("O","?");
        sPalabra = sPalabra.replace("i","?");
        sPalabra = sPalabra.replace("I","?");

        return clave;
    }
}
