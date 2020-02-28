package hackerrank.algorithms;

/**
 * https://www.hackerrank.com/challenges/drawing-book/problem
 * [Drawing Book]
 * [EASY]
 */
public class DrawingBook {
    public static int pageCount(int n, int p) {

        int totalPage = n / 2;
        int rightPage = p / 2;
        int leftPage = totalPage - rightPage;

        return (rightPage < leftPage) ? rightPage : leftPage;
    }
}
