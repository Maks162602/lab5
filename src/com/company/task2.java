package com.company;
import java.util.Scanner;

public class task2 {
    public static void main(String[] args){
        Scanner a1 = new Scanner(System.in);
        Scanner a2 = new Scanner(System.in);
        Scanner a3 = new Scanner(System.in);
        Scanner a4 = new Scanner(System.in);
        Scanner a5 = new Scanner(System.in);

        System.out.println("Введіть назву абревіатури з п'яти слів");
        System.out.print(a1.nextLine().substring(0,1) + a2.nextLine().substring(0,1)+a3.nextLine().substring(0,1)+a4.nextLine().substring(0,1)+a5.nextLine().substring(0,1));
    }
}
