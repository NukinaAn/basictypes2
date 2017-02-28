package uits.jv1614.basictypes2;


        public class Test1 {
    public static void main (String[] args){
                        
      printArray();
      System.out.println();
      printArray1();
      System.out.println();
      printArray2();
      System.out.println();
      printArray3();
      System.out.println();
      average();
      System.out.println();
      average2();
      System.out.println();
      
            
    }  
            static void printArray(){
                
               for(int i = 0; i<=100; i++){
                   
                    if(i%2 == 0){
                 System.out.print(i + " ");
                 
           }
           
        }
                 int sum1 = 0; 
                 for (int i = 2; i <= 100; i=i+2) {
                sum1 = sum1 + i;
       }
               System.out.println("summa = " + sum1);
    }
            static void printArray1(){
               for(int i = 0; i<=100; i++){
                    if(i%3 == 0){
                 System.out.print(i + " ");
            }
        }
                 int sum2 = 0; 
                 for (int i = 3; i <= 100; i=i+3) {
                 sum2 = sum2 + i;
       }
                System.out.println("summa = " + sum2);
          
    }
            static void printArray2(){
                for(int i = 0; i<=100; i++){
                     if(i%5 == 0){
                 System.out.print(i + " ");
            }
        }
                 int sum3 = 0; 
                 for (int i = 5; i <= 100; i=i+5) {
                 sum3 = sum3 + i;
       }
                System.out.println("summa = " + sum3);
    }
            static void printArray3(){
                for(int i = 0; i<=100; i++){
                     if(i%7 == 0){
                 System.out.print(i + " ");
            }
        }
                int sum4 = 0; 
                for (int i = 7; i <= 100; i=i+7) {
                sum4 = sum4 + i;
       }
                System.out.println("summa = " + sum4);
               
            }
        
           public static void  average(){
               int sum4 = 0; 
                for (int i = 7; i <= 100; i=i+7) {
                sum4 = sum4 + i;
                
           }
             int sum1 = 0; 
                 for (int i = 2; i <= 100; i=i+2) {
                sum1 = sum1 + i;   
        }    
                 
             System.out.println(" Pазность сумм последовательности чисел, кратных 7 и 2 = " + (sum4 - sum1));
        }
           public static void  average2(){
              double r;
               int sum2 = 0; 
                 for (int i = 3; i <= 100; i=i+3) {
                 sum2 = sum2 + i;
           }
                int sum3 = 0; 
                 for (int i = 5; i <= 100; i=i+5) {
                 sum3 = sum3 + i; 
        }
               r = (sum3/sum2);
            System.out.println("Oтношение последовательности чисел, кратных 5 к кратным 3 = " + r);
        }
                     

        }    
           
      
