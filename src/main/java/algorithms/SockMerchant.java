package main.java.algorithms;

/**
 * 임의의 숫자들 중에 쌍으로 존재 하는 수가 몇개인지 찾는 다
 *
 * 1,2,1,2,1,3,2,2
 *
 * 1 = 3, 이므로 1 쌍
 * 2 = 4, 이므로 2 쌍
 * 3 = 1, 이므로 없음
 *
 */
public class SockMerchant {
    public static int sockMerchant(int n, int[] ar) {
        int[] pairItemCount = new int[100+1];
        int pairCount = 0;

        for (int i = 0; i < n ; i++) {
            pairItemCount[ar[i]]++;
            if (pairItemCount[ar[i]] % 2 == 0 ) {
                pairCount++;
            }
        }

        System.out.println(pairCount);
        return pairCount;
    }
}
