/**
* Muestra la tabla de multiplicar (del 1 al 10) de un número entero introducido 
* @author Bazaga Sarmiento Jorge
* 06/10/2022
*/
public class MultiplicacionEntera {
  public static void main(String[] args) {
   int i = 0;
   System.out.print("Introduce un número a multiplicar:");
   int numeromultiplicado = Integer.parseInt(System.console().readLine());
   int maxmultiplicacion = numeromultiplicado * 10;
   
   while (i <= maxmultiplicacion) {
     System.out.println(i);
     i += numeromultiplicado;
   } 
    
  }
}
