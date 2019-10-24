package main.java.algorithms;

/**
 * https://www.hackerrank.com/challenges/utopian-tree
 */
public class UtopianTree {
    public static int utopianTree(int n) {

        if(n == 0) return 1;

        if (n % 2 != 0) {
            return (int) Math.pow(2, (n + 3) / 2) - 2;
        } else {
            return (int) Math.pow(2, (n + 2) / 2) - 1;
        }
    }

}
