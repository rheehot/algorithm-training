package smallFunctions;

import org.junit.Test;

public class RecursiveFunctionTest {

    int count = 0;

    public int factorial(int n) {
        count++;
        System.out.println("count = " + count +", param-n = "+n);

        if (n <= 1) {
            System.out.println("\nrtn(" + 1 + ") = n("+1+") = " + 1+"\n");
            return 1;
        }

        int rtn = factorial(n - 1);

        System.out.println("\nrtn(" + rtn + ")" + " + n(" + n + ") = " + (rtn + n)+"\n");

        return rtn + n;

    }

    public int factorial2(int n, String name) {
        count++;
        int funCount = count;
       // System.out.println("count = " + count +", param-n = "+n);

        if (n <= 1) {
            System.out.println(name + ".end  " + funCount + " :  (" + n + ") = n(" + n + ") = " + n );
            return n;
        }

        int rtn = factorial2(n - 1, "fn1");
        System.out.println(name+".rtn1 "+funCount+" :  (" + rtn + ") = fn( ["+n+" - "+1+"] = "+(n-1)+" )");

        int rtn2 = factorial2(n - 1, "fn2");
        System.out.println(name+".rtn2 "+funCount+" :  (" + rtn + ") = fn( ["+n+" - "+1+"] = "+(n-1)+" )");

        System.out.println("\n---> "+name+") "+funCount+" : sum = rtn1(" + rtn + ")" + " , rtn2(" + rtn2 + ") , n("+n+") , rtn1 + n = " + (rtn + n)+"\n");

        return rtn + n;

    }


    public int reTest(int n) {
        if (n <=1 ) return 1;


        int rtn1 = reTest(n - 1);
        int rtn2 = reTest(n - 2);

        System.out.println("rtn = "+ rtn1+", rtn2 = "+rtn2);

        return rtn1+rtn2;
    }


    @Test
    public void test() {
        count = 0;
        int i = factorial(4);
        System.out.println(i);
    }

    @Test
    public void test2() {
        count = 0;
        int i = factorial2(4, "test2");
        System.out.println(i);
    }

    @Test
    public void test3() {
        int i = reTest(5);
    }
}
