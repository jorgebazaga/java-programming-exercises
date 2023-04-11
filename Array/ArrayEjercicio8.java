public class ArrayEjercicio8 {
    public static void main(String[] args) {
        
        int [] num = new int [12];
        System.out.println("Escribe la temperatura media de cada mes (enero a diciembre)");

        for(int i = 0; i < 12; i++){
            num[i] = (int)(Math.random()*45 +1 );
            //Integer.parseInt(System.console().readLine());
        }
        

        int i = 1;
        for(int x = 0; x < 12; x++){
        i = 0;    
        do{
            System.out.print("■");
            i++;
        } while (i < num[x]);
            System.out.println(" "+i);
            System.out.println();
        }
    }
}