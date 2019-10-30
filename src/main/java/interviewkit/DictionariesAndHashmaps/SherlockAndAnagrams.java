package main.java.interviewkit.DictionariesAndHashmaps;

import java.util.HashMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * https://www.hackerrank.com/challenges/sherlock-and-anagrams
 *
 * abba 가 있다 개별 문자열이 쌍으로 있는 케이스가 몇개 인지 찾는 문제
 *
 * 1. 문자열의 순서는 변경되지 않는다
 * 2. 케이스는 [a,a] [ab, ba] [b,b] [abb, bba]  => 4가지
 *
 * 3. ifailuhkqq => [i,i] [g,g] [ifa, fai] => 처럼 3가지다 ifa, fai 처럼 같은 문자열포함
 *    쌍인데 ifa = fia 이렇게 순서를 변경한 케이스는 없다
 * 4. kkkk => [k,k] [k,k] [k,k] [k,k]
 *            [1,2] [2,3] [3,4] [1,4] 처럼 개별 자리의 문자로 인식한다
 *    즉 [k,k]가 있다고 [k,k] 케이스가 또있네 라고 햇갈릴수 있는데
 *    각각 개별 자리의 문자를 독립적으로 본다
 * 5. aaa을 때 각각 a, aa, aaa의 조합 케이스를 map에 key = 문자, value = 조합 회수를 저장 해놓는다.
 *
 * 6  aaaa a가 4개인 경우 케이스가 각각
 *    a =   6개
 *    aa =  3개
 *    aaa = 1개
 *    나온는데 가만보면
 *
 *    2 3 4 => n차
 *    1 3 6 => 수열(가만보면 일반항이 자연수의 합이다)
 *     2 3 => 공차가 1인 등차수열을 가지는 계차 수열임을 볼수 있다
 *
 *    더 자세히 보면 1, 3, 6 개별 일반항이 자연수 n의 합이다
 *
 *    공식은 n(n+1)/2 이고 원래 자연수합의  n이 1 => 1, 2 => 3 되는데 지금은 2 => 1, 3 => 3
 *    이므로 n-1을 n대신 대입해주면 공식은
 *
 *    n(n-1)/2 이 되는 것을 볼 수 있다.
 *
 *
 * 7. n(n-1)/2 공식을 적용하여 aaa 3일때 각 조합
 *    a 는 3개 이고 공식 적용하면 = 3
 *    aa 는 2개 이고 공식적용 = 1
 *    aaa 는 1개라 공식적용 = 0
 *    1+3 = 모두 더하면 4가 된다.
 *
 *
 */

public class SherlockAndAnagrams {
    public static int sherlockAndAnagrams(String s) {

        HashMap<String, Integer> dic = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            for (int j = i+1; j < s.length()+1; j++) {
                String str = Stream.of(s.substring(i, j)
                        .split(""))
                        .sorted()
                        .collect(Collectors.joining());
                Integer strCount = dic.get(str);

                dic.put(str, strCount != null ? strCount + 1 : 1);
            }
        }

        return dic.values()
                .stream().map(n -> n * (n - 1) / 2)
                .mapToInt(Integer::intValue)
                .sum();
    }
}
