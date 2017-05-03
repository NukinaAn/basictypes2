package uits.jv1614.basictypes2;

public class Test6 {
    public static void main(String args[]) {
            int[][] s = new int[8][8];
            triangle(s);
            System.out.println("\n");
            triangle1(s);
            System.out.println("\n");
            triangle2(s);
     }
     
    public static void triangle(int[][] arr){
         for (int i=0; i<6; i++) {
            for(int j=0; j<6; j++) {
                if(j < i) {
                System.out.print(" " + (i * j));
                System.out.print(arr[i][j]+ " ");
        }
       }
                System.out.println();
     }

   }
    public static void triangle1(int[][] arr){
           for (int i=5; i>=0; i--) {
            for(int j=0; j<6; j++) {
                if(j < i) {
                System.out.print(" " + (i * j));
                System.out.print(arr[i][j]+ " ");
              }
          }
          System.out.println();
      }
    }
           
     public static void triangle2(int[][] arr){
       
          for (int i=0; i < arr.length; i++) {
          int x = arr[6].length - arr[5].length;
          for(int j=0; j < x; j++) {
          System.out.println("   ");
            
        }
    
      for(int j=0; j < arr[5].length; j++) {
       System.out.print(" " + (i * j));
      System.out.print(arr[i][j]+ " ");
       }
             
         System.out.println();
        }
             
         }
}
 
