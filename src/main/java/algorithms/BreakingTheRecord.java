package main.java.algorithms;

/**
 * 마리아는 대학 농구를 하며 프로가 되길 원한다. 매시 그녀는 그녀의 경기를 기록 한다.
 * 그녀는 게임에서 가장높은 점수와 가장 낮은 점수의 시즌기록을 깨는 횟수를 표로 정리한다.
 * 첫 경기에서 득점한 점수로 시즌기록을 세우며 거기에 카운팅합니다.
 * <p>
 * 예를 들면 그녀의 시즌 점수가 배열 score = [12, 24, 10,24]로 나타낸다고 가정하면, 점수는 경기한 게임과 순서가 같습니다.
 * 그녀는 다음과 같은 그녀의 결과를 표로 작성할 것입니다.
 * <p>
 * 마리아의 시즌 점수가 주어지면, 시즌동안 그녀의 가장높은 점수와 가장낮은 점수 기록을 깨는 횟수를 찾아 표시하세요.
 * <p>
 * 기능설명
 * 그녀의 기록을 깨는 횟수를 정수형 배열로 반환. 0 index는 가장 높은 점수를 , index 1은 가장 낮은 점수를 깬 기록.
 * <p>
 * 입력형식
 * 첫번째 라인은 게임의 횟수를 담고있다.
 * 두번째 라인은 공백으로 구분된 각각 득점 값을 의미하는 정를 담고 있다.
 */
public class BreakingTheRecord {
    public static int[] breakingRecords(int[] scores) {
        int[] breakingRecord = {0, 0};
        int mostPoint = scores[0];
        int leastPoint = scores[0];

        for (int i = 1; i < scores.length; i++) {
            if (mostPoint < scores[i]) {
                mostPoint = scores[i];
                breakingRecord[0]++;
            } else if (leastPoint > scores[i]) {
                leastPoint = scores[i];
                breakingRecord[1]++;
            }
        }

        return breakingRecord;
    }
}
