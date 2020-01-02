package main.java.hackerrank.interviewkit.strings;

import java.util.ArrayList;
import java.util.List;

/**
 * https://www.hackerrank.com/challenges/special-palindrome-again
 * aabaa 인경우 회문(앞으로, 뒤로 읽어도 같은) 케이스의 개수를 찾는다(홀수 인경우 중간 문자를 빼고 회문인 케이도 포함)
 * <p>
 * 각 개별 a, a, b, a, a 문자는 회문 5개
 * aa , aba, aa , aabaa 회문4개 (중간문째 빼고 회문경우 포함)
 * <p>
 * 총 9개
 * 해결책
 * 1. aa b aa 를 보면 연속된 문자 인경우 회문케이스가 자연수 합 개수다 n(n+1)/2
 * 2. 일단 전체 문자열을 순회 하면서 연속된 문자 개수를 저장한다. 그런데 aabaa => a = 4, b=1개 아니고
 * 즉 같은 문자열의 개수가 아니라 연속적일  문자개수 aa = 2, b = 1, aa = 2를 저장한다.
 * key가 중복 되므로 map을 사용할 수는 없으므로 문자, 개수를 가진 클래스를 리스트에 넣는 형식으로 처리
 * 3. aa = 2, b = 1, aa = 2 는 각 개별 자연수 합공식을 적용하면 3, 1 ,3  => 7
 * 4. 그리고 aa b aa 이런 케이스 즉 중간 이 1개 이고 양쪽이 같은 케이스를 찾는다.
 * 이 케이스의 경우 aba, aabaa ,2개가 된다. 즉 aa, b, aa, 둘중 a =2 개일때 자연수 합과 같은 회문 개수 와 같다
 * aabaaa => 경우도 aa = 3 , aaa = 6 이지만 aabaaa 중간 aba, aabaa 케이스만 보기 때문에
 * a=2,a=3 둘중 적은 수를 더해준다.
 */
class Pair {
    char s;
    long count;

    public Pair(char s, long count) {
        this.s = s;
        this.count = count;
    }
}

public class SpecialStringAgain {
    public static long substrCount(int n, String s) {
        long count = 1;
        s = s + "1";
        List<Pair> strFreq = new ArrayList<>();

        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                count++;
            } else {
                strFreq.add(new Pair(s.charAt(i), count));
                count = 1;
            }
        }


        long sum = strFreq.stream().mapToLong(v -> v.count * (v.count + 1) / 2).sum();

        for (int i = 1; i < strFreq.size() - 1; i++) {
            if (strFreq.get(i).count == 1 && strFreq.get(i - 1).s == strFreq.get(i + 1).s) {
                sum += Math.min(strFreq.get(i - 1).count, strFreq.get(i + 1).count);
            }
        }

        System.out.println("sum = " + sum);
        return sum;
    }
}
