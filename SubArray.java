package com.hackerrank.java;

import java.util.Scanner;
// https://www.hackerrank.com/challenges/java-negative-subarray/problem?isFullScreen=true

public class SubArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int[] arr = new int[input];
        for(int i = 0; i < input; ++i){
            int number = sc.nextInt();
            arr[i] = number;
        }
//        int input = 5;
//        int[] arr = {1,-2,4,-5,1};
        int checkSum = 0;
        int count = 0;
        for(int i = 0; i < input; ++i){
            checkSum = 0;
            for(int j = i;j < input;++j){
                checkSum += arr[j];
                if(checkSum < 0){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
