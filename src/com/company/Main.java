package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner a1= new Scanner(System.in);
        Scanner a2= new Scanner(System.in);
        Scanner a3= new Scanner(System.in);
        Scanner a4= new Scanner(System.in);
        Scanner a5= new Scanner(System.in);

        System.out.println("Введіть речення з п'яти слів (вводити потрібно по одному слову): ");
        System.out.print(a1.nextLine().concat(a2.nextLine()).concat(a3.nextLine()).concat(a4.nextLine()).concat(a5.nextLine()));
    }
}
