package main.java.interviewkit.warmup;


/**
 * https://www.hackerrank.com/challenges/repeated-string
 *
 * 특정 스트링에 a몇개 있는지 찾는
 * "aab" 라는 스트링이 있다
 * n = 10 이라면
 * aab를 10개 까지 채운다 => aabaabaaba 이렇게 됨
 * 최종 스트링 aabaabaaba 에서 "a"가 몇개 있는지 찾는다
 *
 * 솔루션
 * aab 에서 a가 몇개 인지 찾는다 => 2개
 * n 개에서 aab 길이가 3이고 나눈다 = 3번이고 3 * 2 하면 총 6개 이고
 * 여기에서 나머지 스트링이 a다 1개 이므로 6 + 1은 7개가 된다
 *
 * 즉 n개에서 나머지를 제외한 수를 나눈 값에 2개를 곱하고
 * 나머지에서 a가 몇개인지 확인후 더한다.
 */
public class RepeatedString {

    public static long repeatedString(String s, long n) {
        long count = s.chars().filter(v -> v == 'a').count();
        long count1 = s.substring(0, (int) (n % s.length())).chars().filter(v -> v == 'a').count();

        return (n / s.length()) * count + count1;
    }
}
