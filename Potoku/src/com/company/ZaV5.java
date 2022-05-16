package com.company;

import java.util.Scanner;

public class ZaV5 {
    public ZaV5() {
    }

    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        String n1, n2;
        System.out.print("Введіть перше слово: ");
        if (src.hasNextLine()) {
            n1 = src.nextLine();
            System.out.print("Введіть друге слово: ");
            if (src.hasNextLine()) {
                n2 = src.nextLine();
                if (n1.length() > n2.length()) {
                    System.out.println(n1 + "\n" + "Довжина рядка: " + n1.length());
                } else {
                    System.out.println(n2 + "\n" + "Довжина рядка: " + n2.length());
                }
            }
        }
    }
}


