package com.company;
import java.util.Scanner;

public class task4 {
    public static void main(String[] args){
        int i = 0;
        String m = "";
        String a = "";
        Scanner sc = new Scanner(System.in);
        System.out.print("Введіть перше ім'я: ");
        if (sc.hasNext()) ; {
            m = sc.nextLine();
            System.out.print("Введіть друге ім'я: ");
        }
        if (sc.hasNext()) {
            a = sc.nextLine();
        }
        if (m.equalsIgnoreCase(a)) {
            System.out.print("Ви ввели однакові імена");
        }else {System.out.println("ви ввели неоднакові імена");}

    }
}



