package main.java.hackerrank.datastructure;

/**
 * 쿼리 a , b , k 가 주어 진다.
 * a시작 값이고, b는 종료 값이다, k는 더해줄 값이다
 * 즉 배열 a 부터 b 까지 범위의 각요소에 k를 더해 준다는말
 * <p>
 * 그리고 n은 이런 각 배열의 종 길이다 5개의 요소가 있는 배열이라는 이야기.
 * 그리고 m은 이런 query의 개수이다.
 * <p>
 * 예를 들면
 * <p>
 * 5(n) 3(m)
 * <p>
 * 1 2 100 // 각각의 query들
 * 2 5 100
 * 3 4 100
 * <p>
 * 2 5 100 를 보자면 총 5개의 길이의 배열에서 2번째 부터 5번째 까지 2, 3, 4 ,5 의 각 배열의 요소에 100을 더하라는 이야기임
 * <p>
 * 그리고 이런 각각의 자리 수에 해당하는 값의 합산한다 표로 보자면
 * <p>
 * 1    2    3    4    5
 * <p>
 * 100  100  0    0    0        <=  1 2 100
 * 0    100  100  100  100      <=  2 5 100
 * 0    0    100  100  0        <=  3 4 100
 * <p>
 * 각각의 배열 요소의 자리수(세로)의 합산을 보자면
 * <p>
 * 1   2     3    4    5
 * <p>
 * 100  100  0    0    0        <=  1 2 100
 * 0    100  100  100  100      <=  2 5 100
 * 0    0    100  100  0        <=  3 4 100
 * <p>
 * 100  200  200  200  100  이 된다
 * <p>
 * hackerrank 설명에서는 합산의 중간 과정을 예를 들었기 때문에
 * <p>
 * 1             2             3            4            5
 * <p>
 * 100           100           0            0            0        <=  1 2 100
 * 0             100           100          100          100      <=  2 5 100
 * <p>
 * 100           200           100          100          100      <=  첫번째와 두번째 배열의 각요소의 합산 결과
 * 0             0             100          100          0        <=  3 4 100
 * <p>
 * 100           200           200          200          100      <=  첫번째 + 두번째  합산에 세번째를 합산한 결과
 * <p>
 * 여기서 합산한 결과의 누적합이 되는 수를 확인 해본다면
 * <p>
 * 100          100            0            0          -100
 * ||           ||           ||           ||
 * 100(100)     200(100+100)  200(200+0)   200(200+0)   100(200-100)
 * <p>
 * 누적합은 바로전 값과 현재값을 계속 더해 가는 수를 말한다
 * arr[1]          = 값을   arr[1]
 * arr[1] + arr[2] = 합산합 값을 arr[2] 집어 넣고
 * arr[2] + arr[3] = 합산한 값을 arr[3] 넣는다.
 * <p>
 * 이런식으로 두수의 합에 다시 다음 수를 계속 더해 나간다.
 * <p>
 * 그렇다면 결론적으로 누적합이 되는 수를 만들어야 되는데....
 * 여기 부터는 원리가 이해가 잘 안간다 그냥 암기
 * <p>
 * 각각의 쿼리 arr[a]에 해당하는 시작 값에 k를 더해 나간다
 * 각각의 쿼리 arr[b] + 1 에 해당하는 종료값에 1을 더한 인덱스의 값에 k 을 빼나간다.
 * <p>
 * <p>
 * 1             2             3            4            5        6
 * <p>
 * 100           0             -100         0            0                  <=  1 2 100
 * 0             100           0            0            0        -100      <=  2 5 100
 * 0             0             100          0            -100               <=  3 4 100
 * <p>
 * 100           100           0            0            -100     -100      <= 이렇게 결과가 누적합을 구성하기위한 값들이 되고
 * <p>
 * 이 값들을 가지고 누적합을 해나간다
 * <p>
 * 100          100            0            0          -100
 * ||           ||           ||           ||
 * 100(100)     200(100+100)  200(200+0)   200(200+0)   100(200-100)        <= 결론적으로 누적합 배열을 만든다음
 * <p>
 * 이 누적합 배열 내에서 가장 큰수를 찾아 낸다.
 */
public class ArrayManipulation {
    public static long arrayManipulation(int n, int[][] queries) {

        long[] prefixSum = new long[n + 1];
        long accumulateSum = 0;
        long maxValue = 0;

        for (int i = 0; i < queries.length; i++) {
            int a = queries[i][0];
            int b = queries[i][1];
            int k = queries[i][2];
            // 여기서 배열의 자리수가 1 2 3 .... 나가면 실제 인덱스는 0부터 시작이기 때문에
            // a-1, b 를 계산하거나 a, b+1 해도 된다 우야튼 자리수만 맞으면 됩
            prefixSum[a - 1] += k;    // query 의 시작 인덱스에 k값을 더해간다. a-1 이지만 실제 인덱스는 0부터라서 시작값이 되고
            prefixSum[b] -= k;      // query 의 종료 값에 k 값을 빼간다. b 이지만 실제 인덱스가 0부터라서 종료값 +1 번째 인덱스가 되는 것임

        }

        /**
         * 누적합을 계산 해 나가기 위한 배열을 순환하면서 각각 누적값이 최대 값인지 확인 하여 최종적으로 최대값을 반환한다.
         */
        for (long item : prefixSum) {
            accumulateSum += item;
            if (maxValue < accumulateSum) maxValue = accumulateSum;
        }

        return maxValue;
    }

}