package org.example;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++)
        {
            String s1=sc.next();
            int x=sc.nextInt();
            System.out.printf("%-15s%03d\n", s1, x);

            //%03d için ;
            /* "%" karakteri, bir format belirteci başlangıcını belirtir.
               "0" karakteri, sayının önünde sıfır dolgusu yapılmasını belirtir
               "3" sayısı, sayının toplam genişliğini belirtir. Eğer sayı üç haneli değilse,
               eksik haneler sıfır ile doldurulur.
               "d" karakteri, bir tamsayı değerini temsil eder.
            */

            //%-15s bir String değerini 15 karakterlik bir alana sola yaslayarak

        }
        System.out.println("================================");

    }
}



