package main.java.algorithms;

import com.sun.tools.internal.ws.wsdl.document.soap.SOAPUse;

/**
 * https://www.hackerrank.com/challenges/drawing-book/problem
 */
public class DrawingBook {
    public static int pageCount(int n, int p) {

        int totalPage = n / 2;
        int rightPage = p / 2;
        int leftPage = totalPage - rightPage;

        return (rightPage < leftPage) ? rightPage : leftPage;
    }
}
