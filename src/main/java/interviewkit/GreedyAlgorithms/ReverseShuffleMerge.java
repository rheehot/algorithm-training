package main.java.interviewkit.GreedyAlgorithms;

import java.util.Arrays;

/**
 * abcdefg abcdefg
 * gfedcba
 * gfedcvagfedcba
 * agfedcb
 */
public class ReverseShuffleMerge {

    public static String reverseShuffleMerge(String s) {

        int a = 'a';
        int m = 'z' - a + 1;
        int[] frequency = new int[m];
        s.chars().forEach(c -> frequency[c - a]++);

        int[] count = Arrays.stream(frequency).map(f -> f / 2).toArray();


        int top = -1;
        int[] stack = new int[s.length()];
        for (int n = s.length(); --n >= 0; ) {
            int c = s.charAt(n) - a;
            frequency[c]--;

            if (count[c] < 1) continue;

            count[c]--;

            while (top >= 0 && stack[top] > c && frequency[stack[top]] > count[stack[top]]) {
                count[stack[top--]]++;
            }

            stack[++top] = c;

        }

        return java.util.stream.IntStream.rangeClosed(0, top)
                .mapToObj(c -> Character.toString((char) (stack[c] + a)))
                .collect(java.util.stream.Collectors.joining(""));
    }
}
