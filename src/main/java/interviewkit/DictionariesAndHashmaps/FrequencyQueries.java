package main.java.interviewkit.DictionariesAndHashmaps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/**
 * https://www.hackerrank.com/challenges/frequency-queries
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

                dataFreq.put(data, dataFreq.getOrDefault(data, 0) + 1);
                Integer freq = dataFreq.getOrDefault(data, 0);

                freqCount.put(freq, freqCount.getOrDefault(freq, 0) + 1);
                freqCount.put(freq - 1, freqCount.getOrDefault(freq - 1, 0) - 1);

            }

            if (op == 2 && dataFreq.getOrDefault(data, 0) > 0) {

                dataFreq.put(data, dataFreq.getOrDefault(data, 0) - 1);
                Integer freq = dataFreq.getOrDefault(data, 0);

                freqCount.put(freq, freqCount.getOrDefault(freq, 0) + 1);
                freqCount.put(freq + 1, freqCount.getOrDefault(freq + 1, 0) - 1);

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
