/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.poly.hello;

import jdk.nashorn.api.tree.BreakTree;

/**
 *
 * @author ASUS
 */
public class bai1 {
    static void sub(int first,int second) {
        
        System.out.println(first - second);
    }
    
    static void isYoung(int age) {
        if(age < 18) {
            System.out.println("Young");
        }
        System.out.println("Old");
    }
    
    static void printToday(String day) {
//       if (day.equals("Monday")) {
//           System.out.println("Today is MONDAY");
//       } else if (day.equals("Tuesday")) {
//           System.out.println("Today is TUESDAY");
//       } else if (day.equals("Wednesday")) {
//           System.out.println("Today is WEDNESDAY");
//       } else if (day.equals("Thursday")) {
//           System.out.println("Today is THURSDAY");
//       } else if (day.equals("Friday")) {
//           System.out.println("Today is FRIDAY");
//       } else if (day.equals("Statuday")) {
//           System.out.println("Today is STATURDAY");
//       } else if (day.equals("Sunday")) {
//           System.out.println("Today is SUNDAY");
//       }
//        day = day.toLowerCase();
       switch(day) {
           case "monday":
               System.out.println("MONDAY");
           case "tuesday":
               System.out.println("tuesday");
               break;
           case "wednesday":
               System.out.println("wednesday");break;
               default:
                   System.out.println("Unknow");
       }
       
    }
    
    public static void main(String[] args) {
        int countNumber;
//        int age = 22;
//        System.out.println(age);
//        System.out.println(++age);
        int a=1;
        int b=2;
        
        printToday("MONday");
//        System.out.println(young);
    }
}
