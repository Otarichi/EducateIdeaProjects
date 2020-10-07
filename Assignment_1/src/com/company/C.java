package com.company;

import java.util.Scanner;

public class C {
    int a;
    int b;
    int c;
    void method_1(){
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
    }

    int method_2(){
        String a_string;
        a_string = Integer.toString(a);
        return Integer.parseInt(a_string.substring(a_string.length()-1));
    }

    int method_3(){
        String b_string;
        b_string = Integer.toString(b);
        return Integer.parseInt(b_string.substring(0, 1));
    }

    int method_4(){
        String c_string;
        c_string = Integer.toString(c);
        int c_sum = 0;
        for(int i=0; i<c_string.length(); i++){
            c_sum += Integer.parseInt(c_string.substring(i, i+1));
        }
        return c_sum;
    }

    int method_5(){
        int ans = method_2()*method_3();
        System.out.println(ans);
        return ans;
    };

    void method_6(){
        System.out.println(method_3()+method_5());
    }

}
