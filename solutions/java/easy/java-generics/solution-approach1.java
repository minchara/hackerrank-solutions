// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/java-generics/problem?isFullScreen=true
// Problem     Java Generics
// Difficulty  Easy
// Subdomain   Data Structures
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-09-21, 12:54 p.m.
// ──────────────────────────────────────────────────



class Printer
{
    public <T> void printArray(T[] array) {
    for (T element : array) {
        System.out.println(element);
    }
}
   //Write your code here
 
}

