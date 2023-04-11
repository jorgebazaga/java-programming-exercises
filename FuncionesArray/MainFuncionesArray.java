/* 
 * Clase Main para probar FuncionesArray
 * Autor: Bazaga Sarmiento, Jorge
 * Fecha de creación: 2/11/2022
 */
import java.util.*;
public class MainFuncionesArray {
    public static void main (String[] args) {
    
    int [] array  = {100, 1, 2, 3, 4, 5};
    int busqueda = 100;
    int rotacion = 3;

    System.out.println("El array generado aleatoriamente es: "+Arrays.toString(FuncionesArray.generaArrayInt(100, 0, 100)));
    System.out.println("Minimo del array: "+FuncionesArray.minimoArrayInt(array));
    System.out.println("Máximo del array: "+FuncionesArray.maximoArrayInt(array));
    System.out.println("Media del array: "+FuncionesArray.mediaArrayInt(array));
    System.out.println("El numero " +busqueda+ " está en array "+FuncionesArray.estaArrayInt(array, busqueda));
    System.out.println("Posición del digito " +busqueda+ " en array: "+FuncionesArray.posicionEnArray(array, busqueda));
    System.out.println("Voltea array: "+Arrays.toString(FuncionesArray.volteaArrayInt(array)));
      FuncionesArray.volteaArrayInt(array); //para que el array vuelva a su estado original
    System.out.println("Rota array a la derecha una vez: "+ Arrays.toString(FuncionesArray.rotaDerechaUno(array)));
      FuncionesArray.rotaIzquierdaUno(array);
    System.out.println("Rota array a la derecha " +rotacion + " posiciones: "+ Arrays.toString(FuncionesArray.rotaDerechaArrayInt(array, rotacion)));
      FuncionesArray.rotaIzquierdaArrayInt(array, rotacion);
    System.out.println("Rota izquierda uno: "+ Arrays.toString(FuncionesArray.rotaIzquierdaUno(array)));
    FuncionesArray.rotaDerechaUno(array);
    System.out.println("Rota array a la izquierda " +rotacion + " posiciones: "+ Arrays.toString(FuncionesArray.rotaIzquierdaArrayInt(array, rotacion)));
    
  }
  
}
