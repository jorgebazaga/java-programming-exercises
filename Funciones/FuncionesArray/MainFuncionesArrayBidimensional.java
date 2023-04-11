package Funciones.FuncionesArray;
/* 
 * Clase Main para probar FuncionesArrayBidimensional
 * Autor: Bazaga Sarmiento, Jorge
 * Fecha de creación: 29/11/2022
 */
import java.util.Arrays;
public class MainFuncionesArrayBidimensional {
  public static void main(String[] args) {
    int fila = 2;
    int columna = 2;
    int busqueda = 6;
    int[][] genarr = FuncionesArrayBidimensional.generaArrayBiInt(5, 5, 1, 10);
    for (int[] arr : genarr) {
      for (int v : arr) {
        System.out.printf("%-3s", v);
      }
      System.out.println();
    }

    System.out.println("La fila número "+ fila + " es: "+ Arrays.toString((FuncionesArrayBidimensional.filaDeArrayBiInt(genarr, fila))));
    System.out.println("La columna número "+ columna + " es: "+Arrays.toString((FuncionesArrayBidimensional.columnaDeArrayBiInt(genarr, columna))));
    System.out.println("Las coordenadas de la primera ocurrencia de "+ busqueda + " es: "+Arrays.toString((FuncionesArrayBidimensional.coordenadasEnArrayBiInt(genarr, busqueda))));
    
    
     

  }
}
