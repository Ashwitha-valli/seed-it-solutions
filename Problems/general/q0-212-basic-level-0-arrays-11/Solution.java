/**
 * Problem: Q0.212 - Basic_Level_0_Arrays_11
 * Category: General
 * Difficulty: Medium
 * Platform: SEED-IT Platform (https://seed-it.com)
 * Date Solved: 2026-09-24
 * Language: java
 * Test Cases: 30 / 30 Passed (100%)
 */

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // your code goes here
        int s;
        Scanner sc = new Scanner(System.in);
        s=sc.nextInt();
        int[] arr = new int[s]; 
        for(int i=0;i<s;i++){
            arr[i]=sc.nextInt();
        }
        int count=0; int v=0;
        for(int num:arr){
            if(num==0){
                count++;
            }else{
                v++;
            }
        }
        System.out.println("0:"+count);
        System.out.println("1:"+v);
        
    }
}
