package main.java.algorithms;

/**
 * 샘의 집에는 풍성한 열매를 맺는 사과나무와 오랜지 나무가 있다. 아래 다이어그램에서, 빨간 지역은 그의 집을 나타낸다.
 * 거기서 s는 시작점이고 t는 종료점이다. 사과나무는 그의 집 왼쪽에 있다, 오랜지나무는 그의 집 오른쪽에 있다.
 * 당신은 나무가 하나의 지점에 있다고 가정할 수 있다. 거기서 사과나무는 a 지점에 있고 오랜지나무는 b 지점에 있다.
 * 나무에서 과일이 떨어질 때, x 축을 따라 원래 나무로 부 d 단위의 거리에 착륙한다.
 * 음수 d는 과일이 d 단위 만큼 나무왼쪽에 떨어 졌음을 의미한다, 그리고 양수 d는 나무 오른쪽에 d 단위만큼 떨어졌음을 의미한다.
 * <p>
 * m개의 사과와 n개의 오랜지가 주어지면, 샘의 집에 몇개의 사과와 오랜지가 떨어지 결정하라.
 * <p>
 * 예를들면, 샘의 집은 s = 7 t = 10 사이다, 사과나무는 a = 4에, 오랜지나무는 b = 10 에 위치한다. 거기서 m = 3 사과, n = 3 오랜지
 * 사과는 a 부터 apples = [2,3, -4] 단위의 거리로 , 오랜지는 [3, -2-, -4] 단위의 거리고 던져 졌다.
 * 각각 사과의 거리를 나무위치로 추가하면 [4+2, 4+3, 4+ -1] = [6,7,0]로 안착 하. 오랜지는 [12 + 3, 12+ -2, 12+ -4] = [15, 10, 8]에 안착 한다.
 * <p>
 * 사과 한개와 오랜지 두개가 7 ~ 10 범위 안에 안착하므로 표시한다.
 * 1
 * 2
 * <p>
 * 기능 설명
 * 샘의 집에 안착한 사과와 오랜지개수를 각각 라인 구분으로 프린트 해야한다.
 */
public class AppleAndOrange {
    public static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
        int appleCount = 0, orangeCount = 0;

        for (int apple : apples) {
            int landDistance = a + apple;
            if ( landDistance >= s && landDistance <= t) appleCount++;
        }

        for (int orange : oranges) {
            int landDistance = b + orange;
            if (landDistance >= s && landDistance <= t) orangeCount++;
        }

        System.out.println(appleCount);
        System.out.println(orangeCount);
    }

}
