package hackerrank.interviewkit.search;

/**
 * https://www.hackerrank.com/challenges/making-candies
 * [Making Candies]
 * [HARD]
 * [REMIND]
 *
 * 이진 탐색을 활용하는 문제인데 너무 복잡
 */
public class MakingCandies {
    public static long minimumPasses(long m, long w, long p, long n) {

        long day = 0;
        long candies = 0;
        long calCandies = 0;
        long count = 0;

        while (count < 1000) {
            candies += m * w;
            long addDays = p / candies;

            System.out.println("count = " + count++);


            if (addDays > 0) {
                candies = (m * w) * addDays;
                day += addDays;
            } else {
                day++;
            }

            if (candies >= n) break;


            long purchaseMW = candies / p;


            if (purchaseMW > 0) {
                candies -= purchaseMW * p;
                calCandies = candies + (m * w);

                if (m > w) {
                    w += purchaseMW;
                } else {
                    m += purchaseMW;
                }
            } else {
                calCandies = candies + (m * w);
            }


        }

        return day;
    }


    public static long minimumPasses2(long m, long w, long p, long n) {
        if ((double) m * w > (double) n) return 1;

        long days = Long.MAX_VALUE;
        long currentDays = 0;
        long candies = 0;
        boolean loop = true;

        while (loop) {

            long remainCandies = n - candies;
            long makeCandies = m * w;
            long remainDays = remainCandies / makeCandies + (remainCandies % makeCandies == 0 ? 0 : 1);
            days = Math.min(days, currentDays + remainDays);

            if (remainDays == 1) loop = false;


            if ( p > candies) {
                long remainPurchase = p - candies;
                long extraDays = remainPurchase / makeCandies + (remainPurchase % makeCandies == 0 ? 0 : 1);
                currentDays += extraDays;
                candies += extraDays * makeCandies;

                if ( n < candies) {
                    days = Math.min(days, currentDays);
                    loop = false;
                }
            }

            if (m < w) {
                m++;
            } else {
                w++;
            }

            candies -= p;
        }

        return days;
    }

}
