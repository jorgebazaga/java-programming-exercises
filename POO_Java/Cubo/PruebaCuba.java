package POO_Java.Cubo;

public class PruebaCuba {
  public static void main(String[] args) {
    Cubo cubito = new Cubo(2);
    Cubo cubote = new Cubo(4);
    
    System.out.println("Cubito \n");
    cubito.pinta();

    System.out.println("\n Cubote \n");
    cubote.pinta();

    System.out.println("\nLleno el cubito: \n");
    cubito.llena();
    cubito.pinta();

    System.out.println("\n El cubote sigue vacio \n");
    cubote.pinta();
    
    System.out.println("\nLleno el cubote: \n");
    cubote.llena();
    cubote.pinta();
  }  
}
