import java.util.ArrayList;
import java.util.Collections;
/* 
 * @author Jorge Bazaga Sarmiento
 * Fecha de creación: 13/03/22
 */
public class Ejercicio4 {
  public static void main(String[] args) {   
  
  ArrayList<String> numeros = new ArrayList<String>();  

  for (int i = 0; i < 10; i++) {
    String entrada = System.console().readLine("Introduzca 10 numeros: ");
    numeros.add(entrada);
  }
  for (int i = 0; i < numeros.size(); i++) {
    Collections.sort(numeros);
  }
  for (String nombrePrint : numeros) {
    System.out.println(nombrePrint);
    
  } 
}
}
