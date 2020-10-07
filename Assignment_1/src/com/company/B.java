package com.company;

import java.util.Scanner;

public class B extends A {
    int y;

    void method_1(){
        Scanner scanner = new Scanner(System.in);
        y = scanner.nextInt();
    }

    int method_2_2(){
        return x + y;
    }
}
