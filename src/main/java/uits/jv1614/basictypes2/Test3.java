package uits.jv1614.basictypes2;

import java.util.Scanner;
import java.util.Random;


public class Test3 {
     public static void main(String[] argv) {
         String [][] a = new String [10][3];
        //Для хранения значений произведения элементов строк, создадим простой массив размером равным количеству строк двумерного массива
         String [] a1 = new String [a.length];
        //Заполним двухмерный массив
          for(int i =0; i < a.length; i++){
            a1[0] = "реализация намеченных плановых заданий";
            a1[1] = "рамки и место обучения кадров ";
            a1[2] = "постоянный количественный рост и сфера нашей активности \n" 
                   + "сложившаяся структура организации";
            a1[3] = "новая модель ";
            a1[4] = "организационной деятельности";
            a1[5] = "sдальнейшее развитие различных форм деятельности";
            a1[6] = "постоянное информационно-пропагандистское обеспечение нашей деятельности ";
            a1[7] = "укрепления и развития структуры ";
            a1[8] = "консультация с широким активом";
            a1[9] = "начало повседневной работы по формированию позиции";
              
              System.out.print("Строка №"+i+" ");
              for(int j=0; j < a[i].length; j++){
            a1[0] = "играет важную роль в формировании";
            a1[1] = "требуют от нас анализа ";
            a1[2] = "требуют определения и уточнения ";
            a1[3] = "способствует подготовке и реализации ";
            a1[4] = "обеспечивает широкому кругу специалистов участие в формировании";
            a1[5] = "позволяет выполнить";
            a1[6] = "важнейшие задания по разработке ";
            a1[7] = "в значительной степени обуславливает создание ";
            a1[8] = "позволяет оценить значение";
            a1[9] = "представляет собой интересный эксперимент проверки";
            a1[10] = "влечет за собой процесс внедрения и модернизации ";
                 
                int length = a1.length;
                int rand = (int) (Math.random() * length);
                  System.out.print(a1[rand]);
                  System.out.println(" ");
                }
            }
        }
                
}
