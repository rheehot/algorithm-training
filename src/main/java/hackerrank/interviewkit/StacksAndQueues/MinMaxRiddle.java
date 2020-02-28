package hackerrank.interviewkit.StacksAndQueues;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.stream.Collectors;
import java.util.stream.LongStream;

/**
 * https://www.hackerrank.com/challenges/min-max-riddle
 * [Min Max Riddle]
 * [MEDIUM]
 * [REMIND]
 *
 * 결국 이해 못함
 * 어렵다.....
 */
public class MinMaxRiddle {
    public static long[] riddle(long[] arr) {
        Stack<Integer> stack = new Stack<>();
        int[] left = new int[arr.length];
        int[] right = new int[arr.length];
        long[] ret = new long[arr.length+1];

        Arrays.stream(arr).forEach(v -> System.out.printf(v+" "));
        System.out.println();

        for (int i = 0; i < arr.length ; i++) {

            while (!stack.isEmpty() && arr[stack.peek()] >= arr[i]) {
                System.out.println("stack top index = " + stack.peek() + ", stack val = " + arr[stack.peek()] + ", arr = " + arr[i]);
                stack.pop();
            }

            left[i] = stack.isEmpty() ? -1 : stack.peek();
            System.out.print("left = "+left[i]+", stack = ");
            stack.push(i);
            stack.forEach(v -> System.out.printf(v +"("+arr[v]+") "));
            System.out.println();
        }

        System.out.print("left = ");
        Arrays.stream(left).forEach(v -> System.out.print(v+" "));
        System.out.println();

        stack = new Stack<>();

        for (int i = arr.length-1; i >=0 ; i--) {
            while (!stack.isEmpty() && arr[stack.peek()] >= arr[i]) {
                stack.pop();
            }

            right[i] = stack.isEmpty() ? arr.length : stack.peek();
            stack.push(i);
        }

        System.out.print("right = ");
        Arrays.stream(right).forEach(v -> System.out.print(v+" "));
        System.out.println();

        for (int i = 0; i < arr.length ; i++) {
            int index = right[i] - left[i] -1;
            System.out.println("right = "+right[i]+", left = "+left[i]+", index = "+index+", ret = "+ret[index]+", arr = "+arr[i]);
            ret[index] = Math.max(ret[index], arr[i]);
        }

        System.out.print("ret = ");
        Arrays.stream(ret).forEach(v -> System.out.print(v+" "));
        System.out.println();

        for (int i = arr.length - 1; i >= 1; i--) {
            System.out.println(i+", "+Math.max(ret[i], ret[i + 1]));
            ret[i] = Math.max(ret[i], ret[i + 1]);
        }

        Arrays.stream(ret).forEach(v -> System.out.printf(v+" "));
        return Arrays.copyOfRange(ret, 1, ret.length);

    }

    /**
     * timeout 버전
     * @param arr
     * @return
     */
    public static long[] riddle2(long[] arr) {
        Queue<Long> queue = new LinkedList(LongStream.of(arr).boxed().collect(Collectors.toList()));
        Queue<Long> temp = new LinkedList<>();
        long[] result = new long[arr.length];
        Long max = 0L;
        int i = 0;

        while (!queue.isEmpty()) {
            Long el = queue.poll();

            if (queue.peek() == null) {
                queue.addAll(temp);
                temp = new LinkedList<>();
                result[i] = max == 0L ? el : max;
                max = 0L;
                i++;
            } else {
                temp.offer(Math.min(el, queue.peek()));
                max = Math.max(max, Math.max(el, queue.peek()));
            }
        }

        return result;
    }
}
