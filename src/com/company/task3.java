package com.company;
import java.util.Scanner;
public class task3 {
    public static void main(String[] args) {
            Scanner zero1 = new Scanner(System.in);
            Scanner zero2 = new Scanner(System.in);
            Scanner zero3 = new Scanner(System.in);
            Scanner zero4 = new Scanner(System.in);
            Scanner zero5 = new Scanner(System.in);
            Scanner zero6 = new Scanner(System.in);


            System.out.println("Введіть підмет і присудок першого числа: ");
            int m1 = zero1.nextInt();
            int m2 = zero2.nextInt();
            if (m1 > m2) {
                System.out.println("Перший дріб правильний: ");
            }
            else
                System.out.println("Ви ввели не правильний дріб");


            System.out.println("Введіть підмет і присудок другого числа: ");
            int m3 = zero3.nextInt();
            int m4 = zero4.nextInt();
            if (m3 > m4) {
                System.out.println("Другий дріб правильний: ");
            }
            else
                System.out.println("Ви ввели не правильний дріб");


            System.out.println("Введіть підмет і присудок третьго числа: ");
            int m5 = zero5.nextInt();
            int m6 = zero6.nextInt();
            if (m5 > m6) {
                System.out.println("Третій дріб правильний: ");}

            else
                System.out.println("Ви ввели не правильний дріб");

            int a1, a2, a3;
            a1 = m1/m2;
            a2 = m3/m4;
            a3 = m5/m6;

            if (a1 > a2 && a1 > a3){
                System.out.println("Перший дріб найбільший");
            }
            if (a2 > a1 && a2 > a3){
                System.out.println("Другий дріб найбільший");
            }
            if (a3 > a1 && a3 > a2){
                System.out.println("Третій дріб найбільший");
            }
            else{
                System.out.println("Ви зробили щось не так");
            }
        }
    }

