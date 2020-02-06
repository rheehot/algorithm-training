package smallFunctions;

import org.junit.Test;

public class StringTest {
    @Test
    public void STRING을_CHAR_루프_처리() {
        String str = "abcde";
        int[] arr = new int[26];
        str.chars().forEach(v -> arr[v - 'a']++);
    }
}
