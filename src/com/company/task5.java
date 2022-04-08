package com.company;

public class task5 {
    public static void main(String[] args) {
        int zero = 0;
            int a1[] = new  int[15];
            for (int i = 0; i < 15; i++){
                a1[i] = (int)
                        Math.round(Math.random() * 10);
                System.out.println(a1[i]);

                if (a1[i] % 2 == 0) {
                    zero++;
                }
            }
        System.out.print("Кількість парних чисел: "+zero);
            }


    }

