package com.company;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        String n0, n1, n2, n3, n4;
        System.out.print("Введіть перше слово: ");
        if (src.hasNextLine()) {
            n0 = src.nextLine();
            System.out.print("Введіть друге слово: ");
            if (src.hasNextLine()) {
                n1 = src.nextLine();
                System.out.print("Введіть третє слово: ");
                if (src.hasNextLine()) {
                    n2 = src.nextLine();
                    System.out.print("Введіть четверте слово  : ");
                    if (src.hasNextLine()) {
                        n3 = src.nextLine();
                        System.out.print("Введіть п'яте слово : ");
                        if (src.hasNextLine()) {
                            n4 = src.nextLine();

                            System.out.print(n0 + " " + n1 + " " + n2 + " " + n3 + " " + n4);
                        }
                    }
                }
            }
        }
    }
}



