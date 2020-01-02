package main.java.hackerrank.interviewkit.DictionariesAndHashmaps;

/**
 * https://www.hackerrank.com/challenges/ctci-ransom-note
 *
 * magazine 에 있는 문자 배열에
 * note 의 각 문자 배열 요소가 모두 일치하는게 들어 있으면 YES 하나라도 일치가 없다면 NO
 *
 */
public class RansomNote {
    public static void checkMagazine(String[] magazine, String[] note) {

        String result = "No";

        for (int i = 0; i < note.length; i++) {

            result = "No";

            for (int j = 0; j < magazine.length; j++) {
                if (note[i].equals(magazine[j])) {
                    magazine[j] = "";
                    result = "Yes";
                    break;
                }
            }

            if (result == "No") break;
        }

        System.out.println(result);

    }
}
