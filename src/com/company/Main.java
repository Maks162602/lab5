package com.company;

public class Main {
    public static void main(String[] args) {
        int m=0;
        for(int i=1;i <=99;i++){
            if(i%2!=0)m++;
        }

        int[] Mas = new int[m];
        for(int i=1,a=0;i<=99;i++){
            if(i%2!=0){
                Mas[a]=i;
                System.out.println(Mas[a]+" ");
                a++;
            }
        }
    }
}