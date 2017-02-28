package uits.jv1614.basictypes2;

import java.util.Arrays;



public class Test4 {
    public static void main(String[] args){
        int[] array = new int[14];
    RandomArr(array);
    System.out.println("\n");
    invert(array);
    System.out.println("\n");
    type(array);
    System.out.println("\n");
    type1(array);
    System.out.println("\n");
    type2(array);

}

    public static void RandomArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 30) + 3;
                System.out.print(arr[i] + " ; ");
    }
}

    public static void invert(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
                System.out.print(arr[i] + " ; ");
    }
}
      
    public static void  type(int[]arr){
        for(int i = 0; i < arr.length; i++){
            if (arr[i]%2 == 0){
                System.out.print("index " + i + ", ");
                System.out.print("a[" + i + "] = " + arr[i] + " четное число ");
                System.out.print("\n");
            }else {
                System.out.print("index " + i + ", ");
                System.out.print("a[" + i + "] = " + arr[i] + " нечетное" );
                System.out.println("\n");
                }
                    
            }
        }
    public static void  type1(int[]arr){
        int sum = 0; 
        for(int i = 0; i < arr.length; i++){
           if(arr[i]%7 == 0){
                sum += arr[i];
                
            }
              
          }
                System.out.println("summa= "+ sum);
        }
    
    public static void  type2(int[]arr){
        int mult = 1; 
        for(int i = 0; i < arr.length; i++){
           if (arr[i]%3 == 0){
                mult *= arr[i];
                
                }
            }
            System.out.println("multiply = " + mult);
          }
   
}
