package main.java.interviewkit.RecursionAndBacktracking;

import java.util.HashMap;
import java.util.Map;

/**
 * https://www.hackerrank.com/challenges/ctci-recursive-staircase
 * 계단 문제
 * 조건은 1칸 2칸 3칸 씩만 이동 하는 방법이 있다 1,2 칸 식 문제와 다름
 * a1 = 1 가지
 * a2 = 2 가지 방법
 * a3 = 4 가지 방법이 존재함 데
 * 1,2칸 이동시에는 3개의 계단인경우 3가지 방법이 존재해서 a1+a2로 점화식이 나오는데 이경우는 한번에 3칸 이동이라는
 * 조건이 있어서 4가지 방법이 된다
 * a4 = a1+a2+a3
 * an = a(n-1) + a(n-2) + a(n-3)
 * 점화식이 나온다
 *
 * 이 점화식을 그대로 사용하면 타임아웃이 나오므로 dynamic programing 에서 메모제이션 기법을 활용한다
 * 즉 an 값을 저장 해놓고 점화식 에서 an 값이 저장된게 있으면 가져와서 바로 리턴하고
 * 없으면 점화식으로 계산 한다.
 */
public class DavisStaircase {
    private static Map<Integer, Integer> dp = new HashMap<>();

    public static int stepPerms(int n) {
        if (n < 3){
            return n;
        } else if (n == 3) {
            return 4;
        }

        if (dp.containsKey(n)) return dp.get(n);
        dp.put(n, stepPerms(n - 1) + stepPerms(n - 2) + stepPerms(n - 3));

        return dp.get(n);
    }
}
