/**
 * Problem: Q0.148 - Basic_Level_0_Arrays_6
 * Category: General
 * Difficulty: Medium
 * Platform: SEED-IT Platform (https://seed-it.com)
 * Date Solved: 2026-09-21
 * Language: java
 * Test Cases: 30 / 30 Passed (100%)
 */

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int sum=0;
        for(int num:arr){
            sum+=num;
        }
        for(int i=0;i<n;i++){
            arr[i]=sum-arr[i];
        }
        for(int num:arr){
            System.out.print(num+" ");
        }
   }
}
