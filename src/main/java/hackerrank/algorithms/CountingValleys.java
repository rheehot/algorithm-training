package hackerrank.algorithms;

/**
 * 설명이 애매하
 * U, D 업다운 스텝을 문자로 제공하고
 *
 *  _/\    _
 *     \  /
 *      \/
 *
 *  지표면에서 위로 올라갔다가 다시 지표면이 되면 계곡의 개수가 1이되고 이 계곡이 몇개 이냐가 문제임
 *
 *  _/\/\_ 이건 개곡이 2개임 결국은 일단 위로 갔던 내 갔던 다시 지표면 = 0 이 되는 시점에서 올라 간다면 1개 카운트 한다
 *
 *
 *  내려가는 경우는 는 1개 이지 0개 인지 애매함....
 *
 *  _/\
 *     \
 *      \
 *
 */
public class CountingValleys {
    public static int countingValleys(int n, String s) {
        int count = 0;
        int level = 0;

        for (int i = 0; i < n; i++) {
            char step = s.charAt(i);
            level = (step == 'U') ? ++level : --level;

            if (level == 0 && step == 'U') count++;

        }

        return count;
    }

}
