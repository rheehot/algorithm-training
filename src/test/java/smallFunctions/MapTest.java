package test.java.smallFunctions;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class MapTest {

    @Test
    public void test() {
        Map<Integer, String> map = new HashMap<>();
        map.put(2, "A");
        map.put(1, "B");
        map.put(1, "C");

        for (String value : map.values()) {
            System.out.print(value + " ");
        }
    }

    @Test
    public void method_test() {
        HashMap<Integer, Integer> map = new HashMap<>();
        Integer put = map.put(1, 2);
        // 현재값이 아니라 이전값임
        System.out.println(put);

        // 키 1 이 없는 경우에만  key 1을 생성후 5값 입력한다. 있으면 아무것도 안함
        Integer integer = map.putIfAbsent(1, 5);

        System.out.println("putIfAbsent 1 = " + map.get(1)+","+integer);

        // 키가 없어도 실행됨 키가 없는 경우는 값이 null
        map.compute(10, (k, v) -> {
            System.out.println(k + "," + v);
                    return 1;
        });

        System.out.println("computed 1 = " + map.get(1));

        // key 2가 없는 경우 NPE남
        //map.compute(2, (k, v) -> v+2);

        // key 1이 있으면 함수를 실행한다
        Integer computeIfPresent = map.computeIfPresent(1, (k, v) -> ++v);
        System.out.println("computeIfPresent 1 = "+computeIfPresent);

        // key 2가 없으면 수행하지 않는다.
        map.computeIfPresent(2, (k, v) -> {
            System.out.println("dssfdsf"+v);
            return v;
        });
        System.out.println("computeIfPresent 2 = "+map.get(2));

        // key 3이 없는 경우 메소드를 실행한다. 즉 key 없으면 0 key을 새로 만들고 0을 입력한다.
        map.computeIfAbsent(3, k -> 1);
        System.out.println("computeIfAbsent 3 = "+map.get(3));

        // key 1 이 있기 때문에 key에 아무런 영향을 주지 않는다.
        map.computeIfAbsent(1, k -> 0);
        System.out.println("computeIfAbsent 1 = "+map.get(1));

        // key 1 이 있으면 -> 함수를 실행한다 originalValue key 1의 현재값 3 , isNullValue는 5
        Integer merge = map.merge(1, 5, (originalValue, isNullValue) -> originalValue + 10);
        System.out.println("merge 1 = "+merge);

        // Key 2 가 없으면 설정값 5를 입력한다.
        map.merge(2, 5, (originalValue, isNullValue) -> originalValue+isNullValue);
        System.out.println("merge 2 = "+map.get(2));

    }

    @Test
    public void test2() {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("a", 1);

//        System.out.println(map.keySet().stream().findFirst().get());
//        System.out.println(map.values().stream().findFirst().get());
//        System.out.println(map.keySet().iterator().next());
//        System.out.println(map.values().iterator().next());

        Integer a = map.compute("a", (k, v) -> 10);
        System.out.println(a);

    }
}
