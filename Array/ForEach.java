public class ForEach {
    public static void main (String[] args) {
        int[][] array1 = {{1, 2, 3, 4}, {5, 6, 7, 8}};
          
      for (int[] arr : array1) {
        for (int v : arr) {
          System.out.print(" " + v);
        } 
      System.out.println();
      }
   } 
}

