package test.java.interviewkit.StacksAndQueues;

import main.java.interviewkit.StacksAndQueues.ATaleOfTwoStacks;
import org.junit.Test;

public class ATaleOfTwoStacksTest {

    @Test
    public void test() {

        ATaleOfTwoStacks.MyQueue<Integer> queue = new ATaleOfTwoStacks.MyQueue<>();
        String[] input = "1,15|1,17|3,0|1,25|2,0|3,0|2,0|3,0".split("\\|");

        // 15 17 25
        for (int i = 0; i < input.length; i++) {

            String[] split = input[i].split(",");

            if (split[0].equals("1")) { // enqueue
                queue.enqueue(Integer.valueOf(split[1]));
            } else if (split[0].equals("2")) { // dequeue
                queue.dequeue();
            } else if (split[0].equals("3")) { // print/peek
                System.out.print(queue.peek()+" ---");
            }
        }


    }
}