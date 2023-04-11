package Colecciones;

import java.util.ArrayList;
import java.util.Collections;

public class Ejercicio3 {
  public static void main(String[] args) {
    ArrayList<Integer> numeros = new ArrayList<Integer>();

    for (int i = 0; i < 10; i++) {
      int entrada = Integer.parseInt(System.console().readLine("Introduzca 10 numeros: "));
      numeros.add(entrada);
    }
    for (int i = 0; i < numeros.size(); i++) {
      Collections.sort(numeros);
    }
    for (Integer numerosPrint : numeros) {
      System.out.println(numerosPrint);  
    }      
  } 
}
