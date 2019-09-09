package main.java.datastructure;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 문제 설명 자체가 햇갈리고 어렵다
 * N 개의 리스트가 있고 각 요소에는 또 리스트가 있다는 이야기로 2차원 배열 이라는 말
 * <p>
 * N 개 에서
 * 0 번째 다시 [0,1,2]
 * 1 번째 다시 [0,1,2]
 * ..
 * <p>
 * 예를 들어
 * <p>
 * 2 5   ->  2는 N개의 요소의 배열 이고 5는 쿼리의 개수
 * 1 0 5 ->  여기부터 마지막 라인까지는 쿼리를 의미하고 각 쿼리의 첫번째 값은 쿼리 타입을 이야기
 * 1 1 7     x 값과 y 값이 어떤값인지 설명이 없는데... 두번째 값은 x 이고 새번째 값이 y 임
 * 1 0 3
 * 2 1 0
 * 2 1 1
 * <p>
 * 해당 리스트의 인덱스 값은 (x XOR(^) lastAnswer) % N 으로 구한다.
 * <p>
 * 쿼리타입 설명이 참 애매하다.
 * 쿼리 타입 1은 주어진 쿼리에서 첫번째 값이 1 이면 type 1 이고 2면  타입 2라는 이야기임
 * <p>
 * 쿼리타입 1 은 : (x XOR(^) lastAnswer) % N 인덱스를 구해서 해당 인덱스에 있는 하위 배열에 y 값을 추가한다. add 하란 이야기다.
 * 쿼리타입 2 는 : y값에 (x XOR(^) lastAnswer) % N 인덱스에 해당하는 하위 배열의 사이즈를 나눈 나머지 값 즉 y % ((x XOR(^) lastAnswer) % N) 계산으로
 * 나온 값을 lastAnswer 저장한다( lastAnswer의 초기값은 0)
 * <p>
 * 최종 결과 값은 각 lastAnswer 값을 배열로 리턴
 */
public class DynamicArray {

    public static List<Integer> dynamicArray(int n, List<List<Integer>> queries) {

        Integer lastAnswer = 0;
        Integer queryType = 0;
        Integer x = 0, y = 0;
        List<Integer>[] seqList = new ArrayList[n];
        List<Integer> result = new ArrayList();


        for (int i = 0; i < queries.size(); i++) {
            queryType = queries.get(i).get(0); // 쿼리 타입 1은 주어진 쿼리에서 첫번째 값이 1 이면 type 1 이고 2면  타입 2라는 이야기임
            x = queries.get(i).get(1); // x는 쿼리의 2번째 값임
            y = queries.get(i).get(2); // y는 쿼리의 3번째 값임
            int index = (x ^ lastAnswer) % n;

            if (queryType == 1) {

                // (x XOR(^) lastAnswer) % N 인덱스를 구해서 해당 인덱스에 있는 하위 배열에 y 값을 추가한다. add 하란 이야기다.
                if (seqList[index] == null) {
                    seqList[index] = new ArrayList<>(Arrays.asList(y));
                } else {
                    seqList[index].add(y);
                }

            } else {
                // seqList 에서 해당 인덱스((x ^ lastAnswer) % n)의 위치에 하위 배열의 y % (seqList.get(index).size())의 위치에 해당하는 값을 가져와 lastAnswer 에 저장
                lastAnswer = seqList[index].get(y % (seqList[index].size()));
                result.add(lastAnswer);
            }
        }

        return result;

    }
}
