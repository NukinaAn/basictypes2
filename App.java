package uits.jv1614.oop4;


public class App {
    public static void main(String[] args) {
       Abiturient[] abitur = new Abiturient[6];
       int [] interval = {1, 9};
         abitur [0] = new Abiturient(1, "Петр" , "Петров", "Петрович",  "Барабашова 32", 3356423, 9 );
         abitur [1] = new Abiturient(2, "Артур" , "Герасимов", "Герасимович",  "Холодная гора 4", 3326579, 6 );
         abitur [2] = new Abiturient(3, "Иван" , "Иванов", "Иванович",  "Советская 67", 3364398,  7);
         abitur [3] = new Abiturient(4, "Евгений" , "Жмуркин", "Андреевич",  "Герое Труда 7", 3367498,  10);
         abitur [4] = new Abiturient(5, "Николай" , "Кукушкин", "Адольфович",  "Блюхера 13", 3364398, 11);
         abitur [5] = new Abiturient(6, "Василий" , "Мышкин", "Олегович", "Академика Павлова 9", 3364398,  12);
         
          for(Abiturient elem : abitur) {
            System.out.println(elem.toString());
         }
          MarkInInterval( interval, abitur );
          MarkInInterval2( 7, abitur );
          MarkInInterval3(7, 3, abitur);
          MarkInInterval4(10, 3, abitur);
    }
    public static void MarkInInterval(int [] interval, Abiturient[] abitur){
         System.out.println("Cписок абитуриентов, имеющих неудовлетворительные оценки:");
            for(Abiturient elem : abitur) {
                if (elem.getmark() >= interval[0] && elem.getmark() <= interval[1]) {
                System.out.println(elem.toString());
                }
            }
    }
     public static void MarkInInterval2(int i, Abiturient[] abitur){
         System.out.println("Cписок абитуриентов, у которых сумма баллов выше заданной;:");
         for(Abiturient elem : abitur) {
             if (elem.getmark() > i){
             System.out.println(elem.toString());  
             }
         }
     }
      public static void MarkInInterval3(int i, int a, Abiturient[] abitur){
          System.out.println("Число nабитуриентов, имеющих самую высокую\n" 
                             + "сумму баллов:");
           for(Abiturient elem : abitur) {
              if (elem.getmark() > i && elem.getid()> a) {
                  System.out.println(elem.toString());
              }
           }
      }
       public static void MarkInInterval4(int i, int a, Abiturient[] abitur){
          System.out.println("Число nабитуриентов, имеющих полупроходную\n" 
                             + "сумму баллов:");
           for(Abiturient elem : abitur) {
              if (elem.getmark() < i ) {
                    System.out.println(elem.toString());
              }
           }
      }
    
}
