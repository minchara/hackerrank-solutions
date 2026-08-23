// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/java-loops/problem?isFullScreen=true
// Problem     Java Loops II
// Difficulty  Easy
// Subdomain   Introduction
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-08-23, 08:49 p.m.
// ──────────────────────────────────────────────────

import java.util.Scanner;

public class Solution {
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        
        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            
            int currentSum = a;
            for (int j = 0; j < n; j++) {
                currentSum += (1 << j) * b; // (1 << j) computes 2^j using bitwise left shift
                System.out.print(currentSum + " ");
            }
            System.out.println();
        }
        
        in.close();
    }
}
