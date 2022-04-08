package com.company;

public class task3 {
    public static void main(String[] args) {
        int a1[] = new int[5];
        int a2[] = new int[5];
        int a3[] = new int[5];
        double c1 = 0, c2 = 0, c3 = 0;
        for (int i = 0; i < 5; i++) {
            a1[i] = (int) Math.round(Math.random() * 5);
            c1 = c1 + a1[i];
            System.out.print(a1[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < 5; i++) {
            a2[i] = (int) Math.round(Math.random() * 5);
            c2 = c2 + a2[i];
            System.out.print(a2[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < 5; i++) {
            a3[i] = (int) Math.round(Math.random() * 5);
            c3 = c3 + a3[i];
            System.out.print(a3[i] + " ");
        }
        System.out.println();
        System.out.println(c1 = c1 / 5);
        System.out.println(c2 = c2 / 5);
        System.out.println(c3 = c3 / 5);
        if (c1 < c2)
            System.out.println("mid1<mid2");
        else if (c1 > c2)
            System.out.println("mid1>mid2");
        else if (c1 == c2)
            System.out.println("mid1==mid2");
            // 1 2

        else if (c1 > c3)
            System.out.println("mid1>mid3");
        else if (c1 == c3)
            System.out.println("mid1==mid3");
        else if (c1 < c3)
            System.out.println("mid1<mid3");
            //1 3

        else if (c2 > c3)
            System.out.println("mid2>mid3");
        else if (c2 == c3)
            System.out.println("mid2==mid3");
        else if (c2 < c3)
            System.out.println("mid2<mid3");
        //2 3
    }
}


