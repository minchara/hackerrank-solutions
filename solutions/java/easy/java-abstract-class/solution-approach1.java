// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/java-abstract-class/problem?isFullScreen=true
// Problem     Java Abstract Class
// Difficulty  Easy
// Subdomain   Object Oriented Programming
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-09-06, 06:56 p.m.
// ──────────────────────────────────────────────────



//Write MyBook class here
class MyBook extends Book {
    @Override
    void setTitle(String s) {
        this.title = s;
    }
}

