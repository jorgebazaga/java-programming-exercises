public class ArrayEjercicio9 {
    public static void main(String[] args) {

        int [] num = new int [8];

        System.out.println("Introduce 8 números (Intro):");

        for(int i = 0; i < 8; i++){
            num[i] = Integer.parseInt(System.console().readLine());
        
        }

        for(int i = 0; i < 8; i++){
            System.out.print("Numero " + i + ":" + num[i]);
            if (num[i] % 2 == 0){
                System.out.print(" Par");
            } else{
                System.out.print(" Impar");
            }
        System.out.println();
        }

    }
}
