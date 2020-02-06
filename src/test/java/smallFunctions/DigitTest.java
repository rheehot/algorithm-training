package smallFunctions;

import org.junit.Test;

public class DigitTest {

    @Test
    public void test() {
        System.out.printf("%d\n", 1);
        System.out.printf("%3d\n", 1);
        System.out.printf("%-3d%d\n", 1, 2);
        System.out.printf("%03d\n", 1);

        System.out.printf("%s\n", "A");
        System.out.printf("%3s\n", "A");
        System.out.printf("%-3s%s\n", "A", "B");

        System.out.printf("%7.1f\n", 123.45);
        System.out.printf("%7.3f\n", 123.45);




    }
}
