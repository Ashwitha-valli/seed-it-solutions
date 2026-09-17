/**
 * Problem: Q0.143 - Basic_Level_0_Arrays_1
 * Category: General
 * Difficulty: Medium
 * Platform: SEED-IT Platform (https://seed-it.com)
 * Date Solved: 2026-09-17
 * Language: java
 * Test Cases: 30 / 30 Passed (100%)
 */

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // your code goes here
        
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        int[] arr =new int[c];
        for(int i=0;i<c;i++){
            arr[i]=sc.nextInt();
        }
        for(int num:arr){
            System.out.print(num+" ");
        }

    }
}
