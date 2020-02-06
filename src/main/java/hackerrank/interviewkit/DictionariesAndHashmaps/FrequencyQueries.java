package hackerrank.interviewkit.DictionariesAndHashmaps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * https://www.hackerrank.com/challenges/frequency-queries
 *
 * 배열 아래와 같이 주어지는 경우 첫번째 요소는 명령타입 두번째 요소는 데이터 이다.
 *
 * 1 3 => [3]
 * 2 4 => [3] 4는 없으므로
 * 1 3 => [3,3]
 * 3 2 => 빈도수 2인 숫자 있니? 3이 두개네 그럼 있다.
 *
 * 즉 첫번째 요소는 1 = 데이터 입력, 2 = 데이터 삭제, 3 = 빈도수( 2 인데 즉 3이라는 숫자가 만약 두개 존재한다면 빈도수가 2인 숫자가 있다는 이야기가됨)
 * 빈도수에 일치하는 숫자가 있으면 1 없으면 0
 *
 * 해결책
 * 1. 입력된 각 숫자를 키로하고 빈도수를 저장하는 map을 운영 => 3, 2번 | 4 3번 이런식으로
 * 2. 빈도수 체크 시에 위 각 숫자의 빈도수를 모두 확인하면 타임아웃 나니 따로 빈도수를 키로 하고 같은 빈도수의 숫자 개수를 값으로 가지는 map 운
 *    => 3, 2번 | 5, 3번 | 2 2번 이라면
 *    => 2번, 2개 | 3번 1개 빈도수를 키로 하고 2번 짜리 숫자가 2개 이니 개수를 값으로 한다.
 *    => 추후 명령 3에서 빈도수 2개 짜리를 찾을 때 2를 키로 해서 맵에서 찾으면 2개가 나오고 출력은 1개 이상이면 1, 0개 이면 0 출력
 * 3. 배열을 순회 하면서  명령에 따라 삽입 삭제 빈도수확인 3가지를 수행
 * 4. 입력 처리
 *    => 데이터를 키로 하고 횟수를 1을 더한, 기존 값에 더해야하는 적절한 map 메소드 사용
 *    => 1 이라는 빈도수가 1개 되었으로 기존값에 1을 더하는 적절한 map 메소드 사용
 *    => 현재 빈도수 이전 값은 대신 기존 값에 -1을 하는 처리를 한다.
 *    ex) 만약 3이라는 숫자가 1개 => 빈도수 1 이 1개 => 3이 추가 되어 빈도수 2가 되면 빈도수 2는 1개가 되었고 대신 빈도수 1은 1개 있다가 사라지니 -1 0 이 되어야함
 *    => 기존 빈도수에서 -1 할때는 빈도수 키가 있는 경우만 처리하도록한다, 빈도수 1이 1이 되었는데 0은 애초에 없었으니 0 빈도수 0 -1 = -1 이라는 숫자를 구지 입력 할 필요 없다.
 * 4. 삭제 처리
 *    => 삭제 처리는 키가 있고 값이 0 보다 클때만 처리한다 0 이면 숫자가 없는데 처리로직이 수행되면 꼬인다. 계속 마이너스 값이 쌓이면 입력처리할때 값이 맞지 않다.
 *    => 데이터를 키로하는 map에 빈도수를 기존 값에 -1 한다. 입력과 달리 데이터가 없으면 처리하지 않는 map 메소드 사용해야한다.
 *    => 빈도수는 2 -> 1로 데이터 삭제 했으니 1빈도수에 1더해주고 2빈도수에 -1 해준다.
 *    => 빈도수 더하기는 기존값에서 1더하기 map 메소드사용하고, 빈도수 빼기는 키가 있는경우만 빼도록 처리
 *
 * 5. 출력 처리
 *    빈도수를 키로하는 map 에서 해당 빈도수를 찾아 개수가 1이상이면 1, 아니면 0 값을 리스트에 더해준다.
 *
 *
 */
public class FrequencyQueries {
    public static List<Integer> freqQuery(List<int[]> queries) {
        List<Integer> result = new ArrayList<>();
        HashMap<Integer, Integer> dataFreq = new HashMap<>();
        HashMap<Integer, Integer> freqCount = new HashMap<>();

        for (int[] query : queries) {
            Integer op = query[0];
            Integer data = query[1];

            if (op == 1) {

                Integer freq = dataFreq.merge(data, 1, (c, i) -> c + 1);
                freqCount.merge(freq, 1, (c, i) -> c + 1);
                freqCount.computeIfPresent(freq - 1, (k, v) -> v - 1);

                //dataFreq.put(data, dataFreq.getOrDefault(data, 0) + 1);
                //Integer freq = dataFreq.getOrDefault(data, 0);
                // freqCount.put(freq, freqCount.getOrDefault(freq, 0) + 1);
                // freqCount.put(freq - 1, freqCount.getOrDefault(freq - 1, 0) - 1);

            }

            if (op == 2 && dataFreq.getOrDefault(data, 0) > 0) {

                Integer freq = dataFreq.computeIfPresent(data, (k, v) -> v - 1);
                freqCount.merge(freq, 1, (c, i) -> c + 1);
                freqCount.computeIfPresent(freq + 1, (k, v) -> v - 1);

                //dataFreq.put(data, dataFreq.getOrDefault(data, 0) - 1);
                //Integer freq = dataFreq.getOrDefault(data, 0);
                //freqCount.put(freq, freqCount.getOrDefault(freq, 0) + 1);
                // freqCount.put(freq + 1, freqCount.getOrDefault(freq + 1, 0) - 1);

            }

            if (op == 3) {
                result.add(freqCount.getOrDefault(data, 0) == 0 ? 0 : 1);
            }

        }

        return result;

    }

/** 상용구를 코드를 페이지에서 테스트 돌릴때 아래 것으로 변경해야함
 public static void main(String[] args) throws IOException {
 try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
 int q = Integer.parseInt(bufferedReader.readLine().trim());
 List<int[]> queries = new ArrayList<>(q);
 Pattern p  = Pattern.compile("^(\\d+)\\s+(\\d+)\\s*$");
 for (int i = 0; i < q; i++) {
 int[] query = new int[2];
 Matcher m = p.matcher(bufferedReader.readLine());
 if (m.matches()) {
 query[0] = Integer.parseInt(m.group(1));
 query[1] = Integer.parseInt(m.group(2));
 queries.add(query);
 }
 }
 List<Integer> ans = freqQuery(queries);
 try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")))) {
 bufferedWriter.write(
 ans.stream()
 .map(Object::toString)
 .collect(joining("\n"))
 + "\n");
 }
 }
 }
 **/
}
