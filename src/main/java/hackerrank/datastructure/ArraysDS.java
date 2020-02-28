package hackerrank.datastructure;

/**
 * https://www.hackerrank.com/challenges/arrays-ds/
 * [Arrays - DS]
 * [EASY]
 */
public class ArraysDS {
    public static int[] reverseArray(int[] a) {

        int result[] = new int[a.length];

        for (int i = 0; i < a.length; i++) {
            result[i] = a[a.length - i - 1];
        }

        return result;
    }
}
