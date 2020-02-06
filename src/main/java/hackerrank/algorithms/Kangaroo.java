package hackerrank.algorithms;

/**
 * 당신은 여러 동물들과 써커스 쑈를 안무하고 있습니다. 한번의 행동으로, 당신은 양수 방향으로 점프할 준비가 되어 있는 두 줄의 캥거루가 주어 집니다.
 * - 첫번째 캥커루는 x1위치에서 출발하고, 점프 당 v1 비율로 이동 합니다.
 * - 첫번째 캥커루는 x2위치에서 출발하고, 점프 당 v2 비율로 이동 합니다.
 * <p>
 * 당신은 두마리 캥거루를 얻을 방법을 알아내야 합니다. / 같은 위치에서 / 동시에 / 쇼의 한부분으로 써 / 가능하면 yes 반환 그렇지 않으면 no 반환
 * <p>
 * 예를 들면, 캥거루1은 x1 = 2에서 출발 하여  v1 = 1만큼 점프 합니다. 그리고 캥거루2는 x2 = 1 에서 출발 v2 = 1 만큼 점프 합니다.
 * 한번 점프 이후, 그들 둘다 x = 3 (x1 + v1 = 2 + 1, x2 + v2 = 1 + 2), 그래서 우리의 대답은 YES
 * <p>
 * 기능설명
 * 동시에 같은 위치면 YES, 아니면  NO
 * <p>
 * 입력형식
 * 각각 x1,v1,x2 그리고 v2 값을 나타내는 공백으로 구분된 4개의 숫자의 하나의 라인
 * <p>
 * 출력형식
 * 동시에 같은 위치에 안착 하면 YES, 그렇지 않으면 NO 표시
 * 주의 : 두마리 캥커루는 같은 수의 점프 후 같은 위치에 안착 해야 합니다.
 * <p>
 * 설명 0
 * 두마리 캥커루는 위치 순서에 따라 뛰어 넘습니다.
 * <p>
 * 그림에서, 캥거루는 같은 횟수(4번)로 점프 후 같은 위치(12)에서 만나는 것이 분명합니다, 그리고 YES 표시
 * <p>
 * 설명 1
 * 두번째 캥거루는 첫번째 캥거루의 시작 위치 보다 오른쪽으로 더 앞 쪽입니다.
 * 두번째 캥거루는 더빨리 움직이며 이미 첫번째 캥거루 보다 앞서 있기 때문에 첫번째 캥거루가 절대로 따라 잡을 수 없습니다. 그래서 NO 표
 */
public class Kangaroo {
    public static String kangaroo(int x1, int v1, int x2, int v2) {
        float same = (float) (x1 - x2) % (float)(v1 - v2);

        return (same % 1 == 0  && same >= 0) ? "YES" : "NO";

    }
}
