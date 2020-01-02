package main.java.hackerrank.algorithms;

/**
 * https://www.hackerrank.com/challenges/designer-pdf-viewer/
 *
 * 특정 배열 a~z 까지 순서대로 각 알파펫의 높이가 주어짐
 * 1, 3, 1, 3, 1, 4, 1, 3, 2, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 7
 * a  b ..                                                                    z
 *
 * 그리고 문자를 줌 zaba
 * 그러면 z, a, b, a의 각 높이 7, 1, 3, 1 중 가장 높은 높이 * 각 개별 문자의 넢이를 계산 한 사각형의 넓이를 구한다
 *
 * 해결책
 * 각 개별문자의 아스키 코드를 구한다 소문자 a의 아스키 코드는 97 임 97 - 97 = 0 이 되고 주어진 높이 배열의 0번째가 a의 높이가 됨
 *
 * 주어진 문자열을 루프 돌아서 97 - 문자의 아스키코드 = 인덱스, 높이[인덱스] =  해당문자의 높이값 이됨
 *
 * 그중 제일 큰 높이와 문자열 개수를 곱한 것이 정답
 */
public class DesignerPDFViewer {
    public static int designerPdfViewer(int[] h, String word) {
        return word.length() * word.chars()
                .map(v -> h[v - 97]).max()
                .orElse(0);
    }
}
