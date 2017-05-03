package uits.jv1614.basictypes2;

import java.util.Arrays;


public class Test5 {
 public static void main(String[] args) { 
        int[][] a = new int[6][6];
       invert(a);
       System.out.println("\n");
       invert1(a);
       System.out.println("\n");
       invert2(a);
       System.out.println("\n");
       invert3(a);
       System.out.println("\n");
       invert4(a);
       System.out.println("\n");
       invert5 (a);
       System.out.println("\n");
       invert6 (a);
       
  }
        public static void invert(int[][] arr) {
         for(int i=0;i<5;i++){
          for(int j=0;j<5;j++){
           arr[i][j] = (int)Math.round(Math.random()*(double)10)+10;
        }
    }
        }
        public static void invert1(int[][] arr) {
         for(int i=0; i<5; i++){
           for(int j=0; j<5; j++){
             System.out.print(arr[i][j]+" ");
   }
             System.out.println();
        }
        
    }
        
        public static void invert2(int[][] arr) {
         for(int i=5; i>=0; i--){
           for(int j=5; j>=0; j--){
            System.out.print(arr[i][j]+ " ");
          }
            System.out.println();
        }
    
    
    }
        public static void invert3(int[][] arr){
         System.out.print("Четный элементы массива: ");
            for (int i = 0; i < 2; i++) {
              for (int j = 0; j < 5; j++){
                if (i%2 != 0 && arr[i][j]%2 == 0){
                 System.out.print(arr[i][j] + " ");
              
                }
            }
        }
   }
        public static void invert4(int[][] arr){
        System.out.print("Нечетный элементы массива: ");
            for (int i = 0; i < 2; i++) {
              for (int j = 0; j < 5; j++){
                if (i%2 == 0 && arr[i][j]%2 != 0){
                 System.out.print(arr[i][j]+ "  ");
                }
            }
        }
   }
         public static void invert5(int[][] arr){
             System.out.print("Сумма кратных 7: ");
         int sum = 0;
            for (int i = 0; i < 2; i++) {
              for (int j = 0; j < 5; j++){
                if(i%2 != 0 && arr[i][j]%7 == 0 ){
                sum += arr[i][j];
                System.out.println(sum);
          }
        }
     }
   }
   public static void invert6(int[][] arr){
       System.out.print("Произведение кратных 3: ");
       int mult = 1;
       for (int i = 0; i < 2; i++) {
          for (int j = 0; j < 5; j++){
             if(i%2 == 0 && arr[i][j]%3 == 0 ){
                mult *= arr[i][j];
                System.out.print(mult + ", " );
            }
          }
       }
   }
}


           
