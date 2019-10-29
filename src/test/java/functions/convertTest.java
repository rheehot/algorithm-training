package test.java.functions;

import org.junit.Test;

import java.util.stream.Collectors;

public class convertTest {

    @Test
    public void STRING을_아스키로_변환_STRING으로_다시합치기() {
        String collect = "ABCD".chars().mapToObj(s -> String.valueOf((int) s)).collect(Collectors.joining());

        System.out.println(collect);
    }
}
