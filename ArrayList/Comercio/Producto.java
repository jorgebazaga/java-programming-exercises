 /*
 * Crear un paquete Comercio y en ese paquete crear la clase Producto con:
 * Dos atributos: nombre (String) y cantidad (int). 
 * Un constructor con parámetros.
 * Un constructor sin parámetros.
 * Métodos get y set asociados a los atributos.
 * @author Jorge Bazaga Sarmiento
 * @date 16/02/2023
 */
package Comercio;

public class Producto {
  private String nombre;
  private int cantidad;

  public Producto(String nombre, int cantidad) {
    this.nombre = nombre;
    this.cantidad = cantidad;
  }

  public Producto() {

  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public int getCantidad() {
    return cantidad;
  }

  public void setCantidad(int cantidad) {
    this.cantidad = cantidad;
  }

}
