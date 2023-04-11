
import java.util.HashMap;

/**
 * Implementa el control de acceso al área restringida de un programa. Se debe
 * pedir un nombre de usuario y una contraseña. Si el usuario introduce los
 * datos correctamente, el programa dirá “Ha accedido al área restringida”. El
 * usuario tendrá un máximo de 3 oportunidades. Si se agotan las oportunidades
 * el programa dirá “Lo siento, no tiene acceso al área restringida”. Los nombres
 * de usuario con sus correspondientes contraseñas deben estar almacenados en
 * una estructura de la clase HashMap.
 */

public class Ejercicio6 {
    public static void main(String[] args) {

        HashMap<Integer, String> usuario = new HashMap<Integer, String>();
        HashMap<Integer, String> contraseña = new HashMap<Integer, String>();
        String username = System.console().readLine("Nombre de usuario: ");
        String password = System.console().readLine("Contraseña: ");

        usuario.put(1,"usuario");
        contraseña.put(1, "usuario123");

        for (int j = 0; j < 2; j++) {
            if (usuario.containsValue(username) && contraseña.containsValue(password)) {
                System.out.println("Ha accedido al área restringida");
                j = 2;
            } else {
                username = System.console().readLine("Nombre de usuario: ");
                password = System.console().readLine("Contraseña: ");
            } 
            if (j==1) {System.out.println("Lo siento, no tiene acceso al área restringida.");}
        }        
    }
}