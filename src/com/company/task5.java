package com.company;
import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        String m = "";
        String a = "";
        Scanner sc = new Scanner(System.in);
        System.out.print("Введіть два слова: ");
        m = sc.nextLine();
        Scanner op = new Scanner(System.in);
        a = op.nextLine();
        System.out.println(m.length());
        if (m.length()>a.length()) {
            System.out.println(m + "це слово довше");
        }
        else System.out.println(a + "це слово довше");
    }
}