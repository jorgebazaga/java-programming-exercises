/*
 * Examen Ejercicio 3
 * Dias de la semana
 * @author Jorge Bazaga Sarmiento
 * @date 16/02/2023
 */
import java.util.ArrayList;
import java.util.Collections;

public class Ejercicio3 {
  public static void main(String[] args) {
    //Crea una lista llamada listDias que contenga los días de la semana. 
    ArrayList<String> listDias = new ArrayList<String>();

    listDias.add("Lunes");
    listDias.add("Martes");
    listDias.add("Miercoles");
    listDias.add("Jueves");
    listDias.add("Viernes");
    listDias.add("Sabado");
    listDias.add("Domingo");

    //Inserta en la posición 4 el elemento «Juernes». 
    listDias.add(4, "Juernes");
    ArrayList<String> listaDos = new ArrayList<String>();
    //Copia esa lista a otra llamada listaDos.
    listaDos.addAll(listDias);
    //Añade a listDias el contenido de listaDos.
    listDias.addAll(listaDos);

    //Muestra el contenido de las posiciones 3 y 4 de la lista original.
    System.out.println("Posicion 3: "+listDias.get(3));
    System.out.println("Posicion 4: "+listDias.get(4));    

    //Muestra el primer elemento y el último de la lista original.
    System.out.println("Primer elemento: "+listDias.get(0));
    System.out.println("Último elemento: "+listDias.get(listDias.size()-1));

    //Muestra la lista listDias.
    for (String printSemana : listDias) {
      System.out.println(printSemana);
    }


    for (String printSemana : listDias) {
      if (printSemana.contains("juernes")) {
        System.out.println(listDias.remove(printSemana));        
      }
    }

    //Ordena la lista y muestra su contenido.
    Collections.sort(listDias);
    for (String printSemana : listDias) {
      System.out.println(printSemana);
    }

    //Borra todos los elementos de la lista.
    listDias.removeAll(listDias);

    
  }
}
