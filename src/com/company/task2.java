package com.company;

public class task2 {
    public static void main(String[] args) {
        int a1[] = new int[20];
        int b2[] = new int[20];
        for (int i = 0; i < 20; i++) {
            a1[i] = (int) Math.round(Math.random() * 9);
            System.out.print("1)" + a1[i] + " ");
            b2[i] = a1[i];


            if (a1[i] % 2 != 0) {
                b2[i] = b2[i] * 0;
            }
            System.out.println("2)" + b2[i] + " ");

        }
    }
}