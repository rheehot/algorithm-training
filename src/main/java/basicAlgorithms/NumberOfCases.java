package basicAlgorithms;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by kimchanjung on 2020-01-14 6:29 오후
 */
public class NumberOfCases {
    static char[] arr = {'1', '2', '3', '4'};
    static int r = 4;

    public static void main(String[] args) {

        set = new char[r];
        System.out.println("==조합==");
        nCr(0, 0);
        comb(r, arr.length);
        System.out.println("==중복조합==");
        nHr(0, 0);
        System.out.println("==중복순열==");
        nPir(0);
        setList = new ArrayList<>();
        //subset(0,0);

        visit = new boolean[arr.length];
        // nPr(0);
    }

    static char[] set;

    public static void nCr(int len, int k) { // 조합
        if (len == r) {
            System.out.println(Arrays.toString(set));
            return;
        }

        for (int i = k; i < arr.length; i++) {
            set[len] = arr[i];
            nCr(len + 1, i + 1);
        }
    }

    public static void comb(int depth, int idx) {
        if (depth == 0) {
            System.out.println(Arrays.toString(set));
        } else if (idx < depth) {
            return;
        } else {
            //System.out.println(depth + " " + idx );
            set[depth - 1] = arr[idx - 1];

            comb(depth - 1, idx - 1);
            comb(depth, idx - 1);
        }

    }

    public static void nHr(int len, int k) { // 중복조합
        if (len == r) {
            System.out.println(Arrays.toString(set));
            return;
        }

        for (int i = k; i < arr.length; i++) {
            set[len] = arr[i];
            nHr(len + 1, i);
        }
    }

    static boolean[] visit;

    public static void nPr(int len) {// 순열
        if (len == r) {
            System.out.println(Arrays.toString(set));
            return;
        }

        for (int i = 0; i < arr.length; i++) {
            if (!visit[i]) {
                set[len] = arr[i];
                visit[i] = true;
                nPr(len + 1);
                visit[i] = false;
            }
        }
    }

    public static void nPir(int len) {// 중복순열
        if (len == r) {
            System.out.println(Arrays.toString(set));
            return;
        }

        for (int i = 0; i < arr.length; i++) {
            set[len] = arr[i];
            nPir(len + 1);
        }
    }

    static ArrayList<Character> setList;

    public static void subset(int len, int k) {// 부분집합
        System.out.println(setList);
        if (len == arr.length) {
            return;
        }
        for (int i = k; i < arr.length; i++) {
            setList.add(arr[i]);
            subset(len + 1, i + 1);
            setList.remove(setList.size() - 1);
        }
    }
}
