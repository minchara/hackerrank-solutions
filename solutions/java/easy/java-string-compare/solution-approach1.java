// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/java-string-compare/problem?isFullScreen=true
// Problem     Java Substring Comparisons
// Difficulty  Easy
// Subdomain   Strings
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-08-23, 08:54 p.m.
// ──────────────────────────────────────────────────


    public static String getSmallestAndLargest(String s, int k) {
        // Initialize smallest and largest with the first substring of length k
        String smallest = s.substring(0, k);
        String largest = s.substring(0, k);
        
        // Loop through all remaining substrings of length k
        for (int i = 1; i <= s.length() - k; i++) {
            String current = s.substring(i, i + k);
            
            // Compare current substring with smallest
            if (current.compareTo(smallest) < 0) {
                smallest = current;
            }
            
            // Compare current substring with largest
            if (current.compareTo(largest) > 0) {
                largest = current;
            }
        }
        return smallest + "\n" + largest;
    }
