// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/java-static-initializer-block/problem?isFullScreen=true
// Problem     Java Static Initializer Block
// Difficulty  Easy
// Subdomain   Introduction
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-08-23, 08:50 p.m.
// ──────────────────────────────────────────────────


    static int B;
    static int H;
    static boolean flag = true;

    static {
        Scanner scan = new Scanner(System.in);
        B = scan.nextInt();
        H = scan.nextInt();
        scan.close();

        if (B <= 0 || H <= 0) {
            flag = false;
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
}

