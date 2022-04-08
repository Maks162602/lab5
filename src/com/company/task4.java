package com.company;

public class task4 {
    public static void main(String[] args) {
        int a1[] = new int[10];
        int b2[] = new int[10];
        int c3[] = new int[10];

        for (int i = 0; i < 10; i++) {

            a1[i] = (int) Math.round(Math.random() * 10);

            System.out.println("Перший елемент: "+a1[i]);

            b2[i] = (int) Math.round(Math.random() * 10);
            System.out.println("Другий елемент: " + b2[i]);
            c3[i] = b2[i] + a1[i];

            System.out.println("Сума: " + c3[i]);
        }
    }
}

