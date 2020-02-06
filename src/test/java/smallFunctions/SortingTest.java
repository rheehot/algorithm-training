package smallFunctions;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * https://www.baeldung.com/java-sorting-arrays
 */
public class SortingTest {

    @Test
    public void LIST_SORT() {
        List<Integer> list = Arrays.asList(2, 5, 3, 2, 1);
        Collections.sort(list);
        list.stream().forEach(v -> System.out.println(v));

        List<Integer> list2 = Arrays.asList(4, 2, 4, 2, 1);
        list2 = list2.stream().sorted().collect(Collectors.toList());
        list2.stream().forEach(v -> System.out.println(v));
    }

    @Test
    public void LIST_REVERSE_SORT() {
        List<Integer> list = Arrays.asList(6, 5, 3, 2, 1);
        Collections.sort(list, Collections.reverseOrder());
        list.stream().forEach(v -> System.out.println(v));

        List<Integer> list2 = Arrays.asList(4, 2, 4, 2, 1);
        list2 = list2.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
        list2.stream().forEach(v -> System.out.println(v));

    }

    @Test
    public void ARRAY_SORT() {
        int[] arr = {2, 5, 3, 2, 1};
        Arrays.sort(arr);
        Arrays.stream(arr).forEach(v -> System.out.println(v));
    }

    @Test
    public void ARRAY_REVERSE_SORT() {
        int[] arr = {2, 5, 3, 2, 1};
        arr = IntStream.of(arr).boxed().sorted(Comparator.reverseOrder()).mapToInt(i -> i).toArray();
        Arrays.stream(arr).forEach(v -> System.out.println(v));

        Integer[] arr2 = {2, 5, 3, 2, 1};
        Arrays.sort(arr2, Collections.reverseOrder());
    }
}
