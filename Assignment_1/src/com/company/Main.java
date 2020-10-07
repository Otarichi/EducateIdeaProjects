package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("EX#1");
        test_C();
        System.out.println("__________________________");
        System.out.println("EX#2");
        test_A();
        System.out.println("_____________");
        test_B();
        System.out.println("__________________________");
        System.out.println("EX#3");
        test_randomEx();
    }

    public static void test_C(){
        C c_object = new C();
        c_object.method_1();
        System.out.println(c_object.method_2());
        System.out.println(c_object.method_3());
        System.out.println(c_object.method_4());
        c_object.method_5();
        c_object.method_6();
    }

    public static void test_A(){
        A a_object = new A();
        a_object.method_1();
        a_object.method_2();
        a_object.method_3();
    }

    public static void test_B(){
        B b_object = new B();
        b_object.method_1();
        System.out.println(b_object.method_2_2());
    }

    public static void test_randomEx(){
        randomEx randomEx_object = new randomEx();
        randomEx_object.method_1();
        randomEx_object.method_2();
    }
}
