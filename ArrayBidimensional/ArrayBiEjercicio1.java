
public class ArrayBiEjercicio1 {
    public static void main(String[] args) {
        int fila, columna;
        String [][] num = {{"0", "30", "2"," " ," " ,"5"}, {"75", "0", "0"}, {"-2", "9", "11"}};

        for (fila = 0; fila < 3; fila++){
            System.out.print("Fila: " + fila);

            for(columna = 0; columna < 3; columna++){
                //System.out.print("Columna");
                System.out.printf("%10s", num[fila][columna]);
            }
            System.out.println();
        }
    }     
}
