package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int a, b ;
        Scanner unos = new Scanner (System.in);
        System.out.println ("Unesi prvi broj a: ");
        a = unos.nextInt();
        System.out.println("Unesi drugi broj b: ");
        b = unos.nextInt();
        System.out.println("Zbir brojeva: " + (a + b));
    }
}