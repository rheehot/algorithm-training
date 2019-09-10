package main.java.datastructure;

/**
 * 1 뒤로 보낼 요소의 인덱스는 = 현재 인덱스  + 요소 총 개수 - 뒤로보낼 요소 개수
 * 2 앞으로 당겨온 요소의 인덱스는 = 현재 인덱스 - 뒤로 보낼 요소 개수
 */
public class LeftRotation {

    public static int[] leftRotation(int shiftNumber, int[] elements) {

        int elementLength = elements.length;
        int rightNum = elementLength - shiftNumber;

        int[] result = new int[elementLength];

        for (int i = 0; i < elementLength; i++) {
            int index = shiftNumber > i ? i + rightNum : i - shiftNumber;
            result[index] = elements[i];
        }

        System.out.println();

        return result;
    }
}
