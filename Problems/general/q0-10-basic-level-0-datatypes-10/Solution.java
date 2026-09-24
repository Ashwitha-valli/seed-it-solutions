/**
 * Problem: Q0.10 - Basic_level_0_Datatypes_10
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
        int s ;

        Scanner sc = new Scanner(System.in);
        s = sc.nextInt();
        if(s%2==0){
        System.out.println("Even");
        }else{
           System.out.println("Odd");
        }
    }
}
