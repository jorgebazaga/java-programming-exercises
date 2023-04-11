import java.util.HashMap;

public class Ejercicio10 {
  public static void main(String[] args) {
    HashMap<String, String> español_ingles = new HashMap<String, String>();

    español_ingles.put("hola","hello");
    español_ingles.put("adios","bye");
    español_ingles.put("comida","food");
    español_ingles.put("feliz","happy");
    español_ingles.put("triste","sad");
    español_ingles.put("musica","music");
    español_ingles.put("coche","car");
    español_ingles.put("ordenador","computer");
    español_ingles.put("tecnologia","tech");
    español_ingles.put("java","java");

    String entrada="";
    do {
      entrada = System.console().readLine("Escribe una palabra en español: ");
      if (!(entrada.equals("salir") || entrada.equals("exit"))) {
        System.out.println(español_ingles.get(entrada));
      }      
    } while (!(entrada.equals("salir") || entrada.equals("exit")));
  }
}
