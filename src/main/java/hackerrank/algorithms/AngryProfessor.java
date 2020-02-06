package hackerrank.algorithms;

import java.util.Arrays;

public class AngryProfessor {
    public static String angryProfessor(int k, int[] a) {
        return Arrays.stream(a).filter(v -> v <= 0).count() < k ? "YES" : "NO";
    }
}
