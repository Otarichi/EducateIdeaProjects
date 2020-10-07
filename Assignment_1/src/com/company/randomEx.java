package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class randomEx {
    int a, b;
    void method_1(){
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        b = scanner.nextInt();
        if (a > b){
            int c;
            c = a;
            a = b;
            b = c;
        } else if(a==b) {
            System.out.println("please input numbers with different meanings");
            method_1();
        }
    };

    void method_2(){
        int odd_count = 0, even_count = 0, odd_sum = 0, even_sum = 0;
        int[] array = new int[40];
        for(int i = 0; i<40; i++){
            array[i] = (int)(Math.random() * (b - a + 1) + a);
            if (array[i]%2==0){
                even_count+=1;
                even_sum+=array[i];
            } else {
                odd_count += 1;
                odd_sum += array[i];
            }
        }
        System.out.println(a+ " da " + b + " ricxvebis shualedidan migebuli shemtxveviti 40 ricxvi:");
        System.out.println(Arrays.toString(array));
        System.out.println("am ricxvebs shoris aris "+even_count+" luwi ricxvi da "+odd_count+" kenti ricxvi/" +
                "\nluwi ricxvebis jamia: "+even_sum+" da kenti ricxvebis jamia: "+odd_sum);

        int[] array2 = new int[5];
        int max_ev_sum_od_sum;
        int min_ev_sum_od_sum;
        if(even_sum>odd_sum){
            max_ev_sum_od_sum = even_sum;
            min_ev_sum_od_sum = odd_sum;
        } else {
            max_ev_sum_od_sum = odd_sum;
            min_ev_sum_od_sum = even_sum;
        }
        for(int i=0; i<5; i++){
            array2[i] = (int)(Math.random() * (max_ev_sum_od_sum - min_ev_sum_od_sum + 1) + min_ev_sum_od_sum);
        }

        System.out.println(min_ev_sum_od_sum+ " da " + max_ev_sum_od_sum + " ricxvebis shualedidan migebuli shemtxveviti 5 ricxvi:");
        System.out.println(Arrays.toString(array2));
    }
}
