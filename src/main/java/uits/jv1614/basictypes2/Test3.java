
package uits.jv1614.basictypes2;

import java.util.Arrays;
import java.util.Random;


public class Test3 {
     public static void main(String[] args) {
         String [][] a = new String [10][3];
         StringBuffer();
   
            for(int i =0; i < a.length; i++){
           String [] a1 = new String [a.length];
            a1[0] = "Дорогие друзья!";
            a1[1] = "C другой стороны ";
            a1[2] = "Pавным образом ";
            a1[3] = "Не следует, однако, забывать о том, что ";
            a1[4] = "Таким образом, ";
            a1[5] = "Повседневная практика показывает, что ";
            a1[6] = "Значимость этих проблем настолько очевидна, что ";
            a1[7] = "Разнообразный и богатый опыт";
            a1[8] = "Задача организации, в особенности же ";
            a1[9] = "Соображения высшего порядка, а также ";
              
             String [] a2 = new String [a.length];
            a2[0] = "реализация намеченных плановых заданий";
            a2[1] = "рамки и место обучения кадров ";
            a2[2] = "постоянный количественный рост и сфера нашей активности \n" 
                   + "сложившаяся структура организации";
            a2[3] = "новая модель ";
            a2[4] = "организационной деятельности";
            a2[5] = "sдальнейшее развитие различных форм деятельности";
            a2[6] = "постоянное информационно-пропагандистское обеспечение нашей деятельности ";
            a2[7] = "укрепления и развития структуры ";
            a2[8] = "консультация с широким активом";
            a2[9] = "начало повседневной работы по формированию позиции";
            
              String [] a3 = new String [a.length];
            a3[0] = "играет важную роль в формировании";
            a3[1] = "требуют от нас анализа ";
            a3[2] = "требуют определения и уточнения ";
            a3[3] = "способствует подготовке и реализации ";
            a3[4] = "обеспечивает широкому кругу специалистов участие в формировании";
            a3[5] = "позволяет выполнить";
            a3[6] = "важнейшие задания по разработке ";
            a3[7] = "в значительной степени обуславливает создание ";
            a3[8] = "позволяет оценить значение";
            a3[9] = "представляет собой интересный эксперимент проверки";
             String [] a4 = new String [a.length];
            a4[0] = "существующих финансовых и административных условий.";
            a4[1] = "дальнейших направлений развитая.";
            a4[2] = "системы массового участия.";
            a4[3] = "позиций, занимаемых участниками в отношении поставленных задач. ";
            a4[4] = "новых предложений. ";
            a4[5] = "направлений прогрессивного развития.";
            a4[6] = "системы обучения кадров \n" 
                   + "соответствующей насущным потребностям. ";
            a4[7] = "соответствующих условий активизации.";
            a4[8] = "модели развития.";
            a4[9] = "форм воздействия. ";
           
               int length = a.length;
               int rand = (int) (Math.random() * length);
             String b = a1[rand] + " " + a2[rand]+ " " + a3[rand]+ " " + a4[rand];
                System.out.print(b);
                System.out.println(" ");  
                }
               
            }
             public static String StringBuffer(){
                int i;
            StringBuffer contents = new StringBuffer();
                 for(i = 0; i < 10; i++) {
            String [] a1 = new String [10];
            a1[0] = "Дорогие друзья!";
            a1[1] = "C другой стороны ";
            a1[2] = "Pавным образом ";
            a1[3] = "Не следует, однако, забывать о том, что ";
            a1[4] = "Таким образом, ";
            a1[5] = "Повседневная практика показывает, что ";
            a1[6] = "Значимость этих проблем настолько очевидна, что ";
            a1[7] = "Разнообразный и богатый опыт";
            a1[8] = "Задача организации, в особенности же ";
            a1[9] = "Соображения высшего порядка, а также ";
              
             String [] a2 = new String [10];
            a2[0] = "реализация намеченных плановых заданий";
            a2[1] = "рамки и место обучения кадров ";
            a2[2] = "постоянный количественный рост и сфера нашей активности \n" 
                   + "сложившаяся структура организации";
            a2[3] = "новая модель ";
            a2[4] = "организационной деятельности";
            a2[5] = "sдальнейшее развитие различных форм деятельности";
            a2[6] = "постоянное информационно-пропагандистское обеспечение нашей деятельности ";
            a2[7] = "укрепления и развития структуры ";
            a2[8] = "консультация с широким активом";
            a2[9] = "начало повседневной работы по формированию позиции";
            
              String [] a3 = new String [10];
            a3[0] = "играет важную роль в формировании";
            a3[1] = "требуют от нас анализа ";
            a3[2] = "требуют определения и уточнения ";
            a3[3] = "способствует подготовке и реализации ";
            a3[4] = "обеспечивает широкому кругу специалистов участие в формировании";
            a3[5] = "позволяет выполнить";
            a3[6] = "важнейшие задания по разработке ";
            a3[7] = "в значительной степени обуславливает создание ";
            a3[8] = "позволяет оценить значение";
            a3[9] = "представляет собой интересный эксперимент проверки";
             String [] a4 = new String [10];
            a4[0] = "существующих финансовых и административных условий.";
            a4[1] = "дальнейших направлений развитая.";
            a4[2] = "системы массового участия.";
            a4[3] = "позиций, занимаемых участниками в отношении поставленных задач. ";
            a4[4] = "новых предложений. ";
            a4[5] = "направлений прогрессивного развития.";
            a4[6] = "системы обучения кадров \n" 
                   + "соответствующей насущным потребностям. ";
            a4[7] = "соответствующих условий активизации.";
            a4[8] = "модели развития.";
            a4[9] = "форм воздействия. ";
           
               int length = 10;
               int rand = (int) (Math.random() * length);
               String b = a1[rand] + " " + a2[rand]+ " " + a3[rand]+ " " + a4[rand];
                  contents.append(b);
                   System.out.println(" ");
        }
        System.out.println(contents.toString());
         return null;
       }
    }
