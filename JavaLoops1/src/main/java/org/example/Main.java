package org.example;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Bir sayı giriniz : ");
        int N = Integer.parseInt(bufferedReader.readLine().trim());
        int result = 0;
        int i ;

        for(i=1; i<=10; i++){

            result = N * i;
            System.out.println(N + " * " + i + " = " + result);
            result = 0;
        }
        bufferedReader.close();
    }
}
