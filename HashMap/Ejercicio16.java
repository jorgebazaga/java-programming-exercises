
import java.util.HashMap;

/* 
 * Realiza un programa que sepa decir la capital de un país (en caso de conocer
 * la respuesta) y que, además, sea capaz de aprender nuevas capitales. En
 * principio, el programa solo conoce las capitales de España, Portugal y Francia.
 * Estos datos deberán estar almacenados en un diccionario. Los datos sobre
 * capitales que vaya aprendiendo el programa se deben almacenar en el mismo
 * diccionario. El usuario sale del programa escribiendo la palabra “salir”.
 */
public class Ejercicio16 {
    public static void main(String[] args) {
        HashMap<String, String> countries = new HashMap<String, String>();
        countries.put("España", "Madrid");

        String entradaPais="";
        do {
            entradaPais = System.console().readLine("Escribe el nombre de un país y te diré su capital: ");
            if (!entradaPais.equals("salir")) {
                if (countries.containsKey(entradaPais)) {
                    System.out.println(countries.get(entradaPais));
                } else {
                    String entradaCapital = System.console().readLine("No conozco la respuesta ¿cuál es la capital de " + entradaPais + "?: ");
                    countries.put(entradaPais, entradaCapital);
                    System.out.println("Gracias por enseñarme nuevas capitales");
                }
            }
        } while (!entradaPais.equals("salir"));
        

    }
}
