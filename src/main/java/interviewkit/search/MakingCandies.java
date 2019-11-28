package main.java.interviewkit.search;

/**
 * [REMIND]
 * https://www.hackerrank.com/challenges/making-candies
 * 정말 지랄같은 문제
 * 알고리즘 문제인지 의심스러움....
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

        while (true) {

            long remainCandies = n - candies;
            long makeCandies = m * w;
            long remainPass = remainCandies / makeCandies + (remainCandies % makeCandies == 0 ? 0 : 1);
            days = Math.min(days, currentDays + remainPass);

            if (remainPass == 1) {
                break;
            }

            if (candies < p) {
                long remainPurchase = p - candies;
                long extraPass = remainPurchase / makeCandies + (remainPurchase % makeCandies == 0 ? 0 : 1);
                currentDays += extraPass;
                candies += extraPass * m * w;

                if (candies >= n) {
                    days = Math.min(days, currentDays);
                    break;
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
