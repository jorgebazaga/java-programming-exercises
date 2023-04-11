import java.util.ArrayList;
/*
 * Ejercicio1
 * @author Jorge Bazaga Sarmiento
 * Fecha de creación: 13/03/22
 */
public class Ejercicio1 {

  public static void main(String[] args) {
    ArrayList<String> nombre = new ArrayList<String>();
    
    nombre.add("Barbara");
    nombre.add("Julia");
    nombre.add("Diego");
    nombre.add("Jorge");
    nombre.add("Jose");
    nombre.add("Ana");

    for (int i = 0; i < nombre.size(); i++) {
      System.out.println(nombre.get(i));
    }
  }
}