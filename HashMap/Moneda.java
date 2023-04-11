
public class Moneda {
  private static String posiciones[] = {"cara", "cruz"};
  private static String cantidades[] = {"1 cent", "2 cent", "5 cent", "10 cent", "20 cent", "50 cent", "1 euro", "2 euro"};
  private String cantidad;
  private String posicion;

  public Moneda(){
    this.posicion = posiciones[(int) (Math.random()*2)];
    this.cantidad = cantidades[(int) (Math.random()*8)];
  }

  public String getPosicion(){
    return this.posicion;
  }

  public String getCantidad(){
    return this.cantidad;
  }

  public String toString(){
    return this.cantidad + " - " + this.posicion;
  }
}

