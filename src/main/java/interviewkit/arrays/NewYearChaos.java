package main.java.interviewkit.arrays;

/**
 * https://www.hackerrank.com/challenges/new-year-chaos
 */
public class NewYearChaos {
    public static void minimumBribes(int[] q) {
        String result = "";
        int count = 0;
        int min = q.length;

        for (int i = q.length-1; i >= 0; i--){
            if (q[i] - i > 3) {
                result = "Too chaotic";
                break;
            }

            if (q[i] > i+1) {
                count += q[i] - (i+1);
            } else {

                if (min > q[i]) {
                    min = q[i];
                } else if (q[i] != min) {
                    count++;

                }

            }
        }

        System.out.println(result != "" ? result : count);

    }

}
