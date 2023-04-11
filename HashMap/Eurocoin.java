import java.rmi.ConnectIOException;
import java.util.ArrayList;

public class Eurocoin {
  public static void main(String[] args) {
    ArrayList<Moneda> coin = new ArrayList<Moneda>();

    Moneda monedaAux = new Moneda();
    coin.add(monedaAux);

    String ultimaPosicion = monedaAux.getPosicion();
    String ultimaCantidad = monedaAux.getCantidad();

    for (int i = 0; i < 5; i++) {
      do {
        monedaAux = new Moneda();
      } while (!(monedaAux.getPosicion().equals(ultimaPosicion) && !(monedaAux.getCantidad().equals(ultimaCantidad))));
      
      coin.add(monedaAux);

      ultimaPosicion = monedaAux.getPosicion();
      ultimaCantidad = monedaAux.getCantidad();

      for (Moneda moneda : coin) {
        System.out.println(moneda);
      }


    }
  }
  
}
