package main.java.hackerrank.interviewkit.DynamincPrograming;

import java.util.Arrays;
import java.util.Vector;

/**
 * [REMIND]
 * https://www.hackerrank.com/challenges/max-array-sum/
 * 너무 어렵다.... ㅠㅠ
 * 3,7,4,6,5
 * 인접 하지 않은 부분 수열의 최대값
 *
 * 점화식을 세우면
 *
 * max0 = max(a0, 0)
 * max1 = max(max0, a1)
 * max2 = max(max0 + a2, a2, max1)
 * max3 = max(max1 + a3, a3, max2)
 * ....
 * maxN = max(max(N-2) + aN, max(N-1))
 */
public class MaxArraySum {
    public static int maxSubsetSum(int[] arr) {

        int[] currentMax = new int[arr.length];
        currentMax[0] = Math.max(0, arr[0]);
        currentMax[1] = Math.max(currentMax[0], arr[1]);

        for (int i = 2; i < arr.length; i++) {
            currentMax[i] = Math.max(Math.max(arr[i], currentMax[i - 2] + arr[i]), currentMax[i - 1]);
        }

        return currentMax[arr.length - 1];
    }

    public static int maxSubsetSum2(int[] arr) {
        System.out.println("Arrays = " + Arrays.toString(arr));
        System.out.println();
        int[] currentMax = new int[arr.length];
        currentMax[0] = Math.max(0, arr[0]);
        currentMax[1] = Math.max(currentMax[0], arr[1]);

        Vector<Integer> temp = new Vector<>();
        temp.add(currentMax[0]);

        Vector<Integer> temp2 = new Vector<>();
        temp2.add(0);
        temp2.add(arr[1]);

        System.out.println("0 = "+0+", 1 = "+currentMax[1]);
        System.out.printf(1+") %3d%-" + arr.length * 3 + "s", currentMax[0], Arrays.toString(temp.toArray()));
        System.out.printf(", %3d%-" + arr.length * 3 + "s",  currentMax[1],  Arrays.toString(temp2.toArray()) );
        System.out.printf(", %2d %-5s", arr[1], "[" + arr[1] + "]");
        System.out.println(", max = " + currentMax[1]);



        for (int i = 2; i < arr.length; i++) {

            int currSum = currentMax[i - 2] + arr[i];

            temp2 = new Vector<>();
            temp2.add(currentMax[i - 2]);
            temp2.add(arr[i]);

            System.out.printf(i+") %3d%-" + arr.length * 3 + "s", currentMax[i - 1], Arrays.toString(temp.toArray()));
            System.out.printf(", %3d%-" + arr.length * 3 + "s", currSum,  Arrays.toString(temp2.toArray()) );
            System.out.printf(", %2d %-5s", arr[i], "[" + arr[i] + "]");


            currentMax[i] = Math.max(Math.max(arr[i], currentMax[i - 2] + arr[i]), currentMax[i - 1]);
            System.out.println(", max = " + currentMax[i]);

            temp = new Vector<>();
            if (arr[i] > currentMax[i - 1]) {
                if (arr[i] > (currentMax[i - 2] + arr[i])) {
                    temp.add(arr[i]);
                } else {
                    temp = temp2;
                }
            } else if (currentMax[i - 1] < (currentMax[i - 2] + arr[i])) {
                temp = temp2;
            } else {
                temp.add(currentMax[i - 1]);
            }
        }


        System.out.println("\nmax = " + currentMax[arr.length - 1] + "\n");
        return currentMax[arr.length - 1];
    }


    /**
     * -2, 1, -3, 4, -1, 2, 1, -5, 4
     * 4, -1, 2, 1
     *
     * @param arr
     * @return
     */
    public static int maxSum(int[] arr) {
        System.out.println("-2, 1, -3, 4, -1, 2, 1, -5, 4");
        System.out.println("4, -1, 2, 1");
        int maxSum = 0;
        int currentMaxSum = 0;
        Vector<Integer> temp = new Vector<>();

        for (int i = 0; i < arr.length; i++) {
            int currSum = currentMaxSum + arr[i];

            //System.out.printf("%d) (%3d(cSum)   + %3d(cNum)) %3d%3s%3d%s%3d\n",i, currentMaxSum, arr[i], currSum, (currSum > arr[i] ? ">": "<"),arr[i], " = ", Math.max(currSum, arr[i]));
            if (currSum > arr[i]) {
                temp.add(arr[i]);
                System.out.printf("%" + arr.length * 3 + "s, %3s", Arrays.toString(temp.toArray()), currSum);
                System.out.printf(" > %2d", arr[i]);
                System.out.printf(" %-5s, %3d(max)\n", "[" + arr[i] + "]", Math.max(currSum, arr[i]));
            } else {
                temp.add(arr[i]);
                System.out.printf("%" + arr.length * 3 + "s, %3s", Arrays.toString(temp.toArray()), currSum);
                System.out.printf(" < %2d", arr[i]);
                temp = new Vector<>();
                temp.add(arr[i]);
                System.out.printf(" %-5s, %3d(max)\n", Arrays.toString(temp.toArray()), Math.max(currSum, arr[i]));
            }


            currentMaxSum = Math.max(currentMaxSum + arr[i], arr[i]);
            maxSum = Math.max(maxSum, currentMaxSum);
        }

        return maxSum;
    }
}
