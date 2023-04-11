package POO_Java.Ejercicio10;

public class Ameba {

    //atributo
    int peso;

    //constructor
    Ameba() {
      this.peso = 3;
    }   

    public int getPeso(){
      return peso;
    }
    
    void come(int i){      
      peso += i;
      peso--;        
    }

    void come(Ameba x){
      this.peso += x.peso;
      this.peso--;
      x.peso = 0;
    }    

    @Override
    public String toString() {
      return "Soy una ameba y peso " + peso + " microgramos";
    }

    public static void main(String[] args){
      Ameba a1 = new Ameba();
      a1.come(2);
      System.out.println(a1);
      Ameba a2 = new Ameba();
      a2.come(4);
      System.out.println(a2);
      a1.come(a2);
      System.out.println(a1);
      System.out.println(a2);
      a2.come(3);
      System.out.println(a2);
    }    
}
