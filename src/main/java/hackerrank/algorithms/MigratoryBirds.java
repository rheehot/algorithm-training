package hackerrank.algorithms;

import java.util.List;

/**
 * https://www.hackerrank.com/challenges/migratory-birds
 * [Migratory Birds]
 * [EASY]
 *
 * 1, 2, 2 ,3, 3, 3, 4, 4, 4
 * 이런 형태의 숫자가 있다면
 * 중복된 숫자중에(1개만 있는 숫자는 제외) 회수가 많은 숫자 중에 가장 작은 수
 * 즉 3 = 3번 4= 3 번 으로 2 = 2번 보다 중복 회수가 많은 3, 4 중에 3이 작은 수 이므로 3을 리
 */
public class MigratoryBirds {
    public static int migratoryBirds(List<Integer> arr) {

        int[] types = new int[arr.size() + 1];
        int lessThenType = arr.size();

        for (Integer bird : arr) {
            types[bird]++;

            if (types[lessThenType] == types[bird] && lessThenType > bird || types[lessThenType] < types[bird]) {
                lessThenType = bird ;
            }
        }

        return lessThenType;
    }

}
