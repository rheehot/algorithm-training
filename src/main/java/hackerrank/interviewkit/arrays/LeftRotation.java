package main.java.hackerrank.interviewkit.arrays;


/**
 * https://www.hackerrank.com/challenges/ctci-array-left-rotation
 * <p>
 * 1 뒤로 보낼 요소의 인덱스는 = 현재 인덱스  + 요소 총 개수 - 뒤로보낼 요소 개수
 * 2 앞으로 당겨온 요소의 인덱스는 = 현재 인덱스 - 뒤로 보낼 요소 개수
 */
public class LeftRotation {

    public static int[] leftRotation(int[] a, int d) {
        int elementLength = a.length;
        int rightNum = elementLength - d;

        int[] result = new int[elementLength];

        for (int i = 0; i < elementLength; i++) {
            int index = d > i ? i + rightNum : i - d;
            result[index] = a[i];
        }

        return result;
    }
}

