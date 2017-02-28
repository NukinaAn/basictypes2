package uits.jv1614.basictypes2;


public class Test6 {
    public static void main(String[] args){
                  
         final  int IMAX = 4;
         
         int [][] s  = new int [IMAX +1][];
         for (int i=0; i <= IMAX; i++)
         s [i] = new int [i+1];
            triangle(s);
            System.out.println("\n");
            triangle1(s);
            System.out.println("\n");
            triangle2(s);
     }
     
         public static void triangle(int[][] arr){
             
         outer: for (int i=0; i<5; i++) {
            for(int j=0; j<5; j++) {
                if(j > i) {
        System.out.println();
            continue outer;
        }
        System.out.print(" " + (i * j));
        System.out.print(arr[i][j]+ " ");
        }
       }
   
   
          System.out.println();
        }

 
         public static void triangle1(int[][] arr){
          outer: for (int i=4; i>=0; i--) {
            for(int j=0; j<6; j++) {
               if(j > i) {
        System.out.println();
            continue outer;
        }
        System.out.print(" " + (i * j));
        System.out.print(arr[i][j]+ " ");
        }
       }
   
   
          System.out.println();
        }
             public static void triangle2(int[][] arr){
          for (int i=0; i<arr.length; i++) {
          int x = arr[arr.length - 1].length - arr[i].length;
            for(int j=0; j< x; j++) {
              System.out.println(" ");
            
        }
          
          
         for(int j=0; j < arr[i].length; j++) {
        System.out.print(" " + (i * j));
        System.out.print(arr[i][j]+ " ");
        }
             
          System.out.println();
        }
             
         }
}
 

