/**
* Calcula el total de la factura a partir de la base imponible
*@author Bazaga Sarmiento Jorge
* 29/09/2022
*/
public class Factura {
  public static void main(String[] args) {
    
    String texto;
    
    System.out.print("Por favor, introduce un importe:");
    texto = System.console().readLine();
    double numero1;
    numero1 = Double.parseDouble(texto);
    
    System.out.print("Por favor, introduce el % de IVA:");
    texto = System.console().readLine();
    double percent;
    percent = Double.parseDouble(texto);
    double div;
    div = percent / 100;
    
       
    double iva = numero1 * div;
    double totaliva= numero1 + iva;
    System.out.println("El importe más el IVA especificado es:" + totaliva);
    
  
    
  
    
    
 
  }
}
