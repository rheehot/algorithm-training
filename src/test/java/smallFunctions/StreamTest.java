package smallFunctions;

import org.junit.Test;

import java.util.Arrays;
import java.util.stream.IntStream;

public class StreamTest {

    @Test
    public void 배열에서_특정개수까지만_따로저장() {
        int[] input = {10, 100, 300, 200, 1000, 20, 30};
        int[] newArr = IntStream.of(input).limit(3).toArray();
        Arrays.stream(newArr).forEach(v -> System.out.println(v));
    }
}
