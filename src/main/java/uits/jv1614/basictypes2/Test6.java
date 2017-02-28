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
     
         public static void triangle(int[][] arr){ // начальный треугольник
         
             // оператор continue содержит метку, она указывает в каком из циклов мы хотим досрочно прекратить выполнение текущей итерации
         outer: for (int i=0; i<5; i++) { // цикл для строки; 
            for(int j=0; j<5; j++) {  // цикл для столбца
                if(j > i) {
        System.out.println();
            continue outer;  //  прерывает цикл подсчёта значений переменной j и продолжает его со следующей итерации цикла i
        }
        System.out.print(" " + (i * j)); // печатает значение 
        System.out.print(arr[i][j]+ " "); // печатает массив
        }
       }
   
   
          System.out.println(); // печатаем треугольник
        }

         // метод выполняет все тоже, что и придыдущий. Только меняем цикл отображае его симметрично по горизонтали
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
         
         //новый метод в котором по идеи должен был компилироваться треугольник с прямым углом в правом нижнем углу, но увы(((
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
 

