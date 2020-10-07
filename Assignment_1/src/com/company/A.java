package com.company;

import java.util.Scanner;

public class A {
    public static int x;

    public A(){
        System.out.println("hello");
    }

    void method_1(){
        Scanner scanner = new Scanner(System.in);
        x = scanner.nextInt();
    }

    void method_2(){
        System.out.println(x+12);
    }

    void method_3(){
        if(x%2==0){
            System.out.println("is even");
        } else {
            System.out.println("is odd");
        }
    };

}
