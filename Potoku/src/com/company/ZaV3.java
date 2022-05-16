package com.company;

import java.util.Scanner;

public class ZaV3 {
    public ZaV3(){
    }
    public static  void main(String[] args){
        Scanner src = new Scanner(System.in);
        double n1, n2, n3, max;
        System.out.print("Введіть перше число: ");
        if (src.hasNextDouble()) {
            n1 = src.nextDouble();
            System.out.print("Введіть друге число: ");
            if (src.hasNextDouble()) {
                n2 = src.nextDouble();
                System.out.print("Введіть третє число: ");
                if (src.hasNextDouble()) {
                    n3 = src.nextDouble();
                    if  (n2 > n1 && n2 > n3) {
                        max = n2;
                        System.out.println("Максимальне число: " + max );
                    } else if (n1 > n3 && n1 > n2) {
                        max = n1;
                        System.out.println("Максимальне число: " + max );
                    } else {
                        max = n3;
                        System.out.println("Максимальне число: " + max );
                    }
                } else {
                    System.out.println("Ввели не дробове число");
                }
            } else {
                System.out.println("Ввели не дробове число");
            }
        } else {
            System.out.println("Ввели не дробове число");
        }
    }
}
