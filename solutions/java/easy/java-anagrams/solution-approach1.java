// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/java-anagrams/problem?isFullScreen=true
// Problem     Java Anagrams
// Difficulty  Easy
// Subdomain   Strings
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-08-23, 08:55 p.m.
// ──────────────────────────────────────────────────



    static boolean isAnagram(String a, String b) {
         if (a.length() != b.length()) {
            return false;
        }

        // Convert both strings to lowercase for case-insensitivity
        a = a.toLowerCase();
        b = b.toLowerCase();

        // Frequency array for 26 English letters
        int[] counts = new int[26];

        for (int i = 0; i < a.length(); i++) {
            counts[a.charAt(i) - 'a']++;
            counts[b.charAt(i) - 'a']--;
        }

        // If all frequencies return to 0, they are anagrams
        for (int count : counts) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }

