package uits.jv1614.basictypes2;

import java.util.Scanner;

public class Test2 {
    public static void main (String[] args){
        System.out.println("Введите x ");
         Scanner in = new Scanner(System.in);
         int x = in.nextInt();  
         
         if (x <= 10){
             
             switch1(x);
            
        }else 
         if (x <= 19){
           switch2(x);
      
        }else
         if (x > 19){
             x = (x/10)%10;
             x = x%10;
            switch3(x); switch1(x);
             
         }
    }
    
        static void switch1(int x) {
         
        switch(x){
         case 0:{
             System.out.println("ноль"); 

        }break;
         case 1:{
             System.out.println("один"); 

        }break;
        case 2:{
             System.out.println("два"); 

        }break;
        case 3:{
             System.out.println("три"); 

        }break;
        case 4:{
             System.out.println("четыри"); 

        }break;
        case 5:{
             System.out.println("пять"); 

        }break;
        case 6:{
             System.out.println("шесть"); 

        }break;
        case 7:{
             System.out.println("семь"); 

        }break;
        case 8:{
             System.out.println("восемь"); 

        }break;
        case 9:{
             System.out.println("девять"); 
             
        }
        }
        }
             static void switch2(int x) {
         
        switch(x){        
        case 10:{
             System.out.println("десять"); 

        }break;
        case 11:{
             System.out.println("одиннадцать"); 

        }break;
        case 12:{
             System.out.println("двенадцать"); 

        }break;
        case 13:{
             System.out.println("тринадцать"); 

        }break;
        case 14:{
             System.out.println("четырнадцать"); 

        }break;
        case 15:{
             System.out.println("пятнадцать"); 

        }break;
        case 16:{
             System.out.println("шестнадцать"); 

        }break;
        case 17:{
             System.out.println("семнадцать"); 

        }break;
        case 18:{
             System.out.println("восемнадцать"); 

        }break;
        case 19:{
             System.out.println("девятнадцать"); 

        }break;
    
      }        
    }
        
        static void switch3(int x) {
            
         switch(x){
             
        case 2:{
            System.out.println("двадцать"); 

        }break;
        case 3:{
             System.out.println("тридцать"); 

        }break;
        case 4:{
             System.out.println("сорок"); 

        }break;
        case 5:{
             System.out.println("пятдесят"); 

        }break;
        case 6:{
             System.out.println("шестьдеся"); 

        }break;
        case 7:{
             System.out.println("семьдесят"); 

        }break;
        case 8:{
             System.out.println("восемьдесят"); 

        }break;
        case 9:{
             System.out.println("девяносто"); 

        }break;
        
            }
     
                
        }
    }
   

    