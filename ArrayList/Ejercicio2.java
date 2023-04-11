import java.util.ArrayList;

public class Ejercicio2 {
  public static void main(String[] args) {
    ArrayList<Integer> valores = new ArrayList<Integer>();
    
    int listsize = (int) (Math.random()*(20 -10 + 1)) + 10;
    
    for (int i = 0; i < listsize; i++) {
      int random = (int) (Math.random() * 100);
      valores.add(random);
      System.out.print(valores.get(i)+" ");     
    }    
  }
}
