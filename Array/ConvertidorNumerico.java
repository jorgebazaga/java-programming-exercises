/**
 * Ejercicios 35
 * 
 * Esta función convierte el número n al sistema de 
 * palotes y lo devuelve en una cadena de caracteres.
 * Ejemplo: 1234 Resultado |-||-|||-|||
 * 
 * @param Usamos la variable n para introducir un dato a convertir al sistema de palotes.
 * @return Devuelve el numero transformado a palotes
 * @author Jorge Bazaga Sarmiento
 *         24/11/2022
 */
public class ConvertidorNumerico {
  public static void main(String[] args) {
    //Desde este print llamamos a la función.
    System.out.println(convierteEnPalotes(1234));
  }
  
  public static String convierteEnPalotes(int n) {
    String[] palotes = { "", "|", "||", "|||", "||||", "|||||", "||||||", "|||||||", "||||||||", "|||||||||" };
    String entrada = Integer.toString(Math.abs(n));
    String asignacion = "";

    for (int i = 0; i < entrada.length(); i++) {
      char dig = entrada.charAt(i);
      int valor = Character.getNumericValue(dig);
      if (i < entrada.length() - 1)
        asignacion = asignacion.concat(palotes[valor] + "-");
      else {
        asignacion = asignacion.concat(palotes[valor]);
      }
    }
    return asignacion;
  }
}
