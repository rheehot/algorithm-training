package main.java.hackerrank.interviewkit.GreedyAlgorithms;

import java.util.Arrays;

/**
 * https://www.hackerrank.com/challenges/greedy-florist
 * 이것도 마찬가지로 문제 설명이 햇갈린다.
 *
 * 1,2,3,4,5 라는 숫자가 있다
 * 그리고 k = 3 이라는 숫자가 있다
 * 3개를 먼저 사고 그다음 부터는 (1+1) * 가격 된 값으로 산다
 * 만약에 1,2,3,4,5,6 이고 k = 2 라면
 * 2개를 원래 가격으로 사고
 * 다시 두개를 (1+1) * 가격 사고 2까지 구매하고
 * 다음 구매할 때 (2+1) * 가격에 산다 즉 k값의 만큼 사면
 * 다음 구매시 (3 + 1) * 가격이다
 * 최소 구매 금액으로 사야하는데
 * 비싼것 부터 차례대로 구매
 * 5, 6 구매
 * 3 *(1+1), 4*(1+1)
 * 1 *(2+1), 2*(2+1)
 * 곱하기니
 * 결국은 이렇게 된다
 * 5 * (1), 6 * (1)
 * 3 * (2), 4 * (2)
 * 1 * (3), 2 * (3)
 *
 * 해결책
 * 1. 일단 꽃가격을 정렬한다(오름차순인경우 역순으로 계산)
 * 2. 높음 가격부터 k만큼 더한다 괄호 값은 1 곱하기 꽃가격
 * 3. k 만큼 더해졌으면 괄호값에 1더한다 2가 되고 2 곱하기 꽃가격, k갑 많큼 구매 카운트를 다시 0으로 하고
 * 4. k 값 만큼 구매했으면 괄호값을 2에서 1 더하여 계산을 반복한다.
 */
public class GreedyFlorist {
    public static int getMinimumCost(int k, int[] c) {
        int eachBuyCount = 1;
        int groupBuyCount = 0;
        int total = 0;
        Arrays.sort(c);

        for (int i = c.length-1; i >= 0; i--) {
            total += eachBuyCount * c[i];
            groupBuyCount++;

            if (groupBuyCount >= k) {
                eachBuyCount++;
                groupBuyCount = 0;
            }
        }

        return total;
    }
}
