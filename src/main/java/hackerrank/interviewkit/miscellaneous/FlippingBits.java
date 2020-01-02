package main.java.hackerrank.interviewkit.miscellaneous;

/**
 * https://www.hackerrank.com/challenges/flipping-bits/problem
 * 1 라는 숫자를 32bit 2진수로 표현하면
 * 00000000000000000000000000000001
 * 되고 이것을 뒤집으면
 * 11111111111111111111111111111110
 * 되고 10진수로 변환하면
 * 4294967294
 * 된다
 * 부호없는 정수 최대값이 4294967295 이고
 * 4294967295
 * 과 정수 n 값을
 * n ^ 4294967295L (32비트 2진수로 서로 XOR 하게 되면 원래 값이 뒤집어 지는 2진수가 된다)
 * 을 출력하면 뒤집어진 32비트 2진수의 10진수 값을 리턴한다.
 */
public class FlippingBits {

    public static long flippingBits(long n) {
        return n ^ 4294967295L;
    }
}
