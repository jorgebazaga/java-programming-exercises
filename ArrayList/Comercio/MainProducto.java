/*
 * Examen Ejercicio 1
 * Crear una lista de la compra con un ArrayList.
 * @author Jorge Bazaga Sarmiento
 * @date 16/02/2023
 */
package Comercio;

import java.util.ArrayList;

public class MainProducto {
  public static void main(String[] args) {
    //Creamos las instancias de productos
    Producto Pan = new Producto("Pan", 6);
    Producto Leche = new Producto("Leche", 2);
    Producto Manzanas = new Producto("Manzanas", 5);
    Producto Brócoli = new Producto("Brócoli", 2);
    Producto Carne = new Producto("Carne", 2);
    ArrayList<Producto> lista = new ArrayList<Producto>();
    
    //Las añadimos al ArrayList
    lista.add(Pan);
    lista.add(Leche);
    lista.add(Manzanas);
    lista.add(Brócoli);
    lista.add(Carne);

    //Iteramos para imprimir todas las ocurrencias.
    for (Producto producto : lista) {
      System.out.println(producto.getNombre() + ", " + producto.getCantidad());
    }
    //Imprimimos el tamaño de la lista
    System.out.println("La lista está formada por " + lista.size() + " productos");
    
    lista.add(1, Carne);

    for (Producto producto : lista) {
      System.out.println(producto.getNombre() + ", " + producto.getCantidad());
    }
    System.out.println("La lista está formada por " + lista.size() + " productos");

    lista.add(Carne);

    for (Producto producto : lista) {
      System.out.println(producto.getNombre() + ", " + producto.getCantidad());
    }
    System.out.println("La lista está formada por " + lista.size() + " productos");
    
    //Borramos según un índice
    lista.remove(2);

    for (Producto producto : lista) {
      System.out.println(producto.getNombre() + ", " + producto.getCantidad());
    }
    System.out.println("La lista está formada por " + lista.size() + " productos");
    
    //Borramos toda la lista
    lista.removeAll(lista);

    for (Producto producto : lista) {
      System.out.println(producto.getNombre() + ", " + producto.getCantidad());
    }
    System.out.println("La lista está formada por " + lista.size() + " productos");
  }

}
