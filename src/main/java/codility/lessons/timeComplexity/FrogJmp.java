package codility.lessons.timeComplexity;

/**
 * Created by kimchanjung on 2020-03-05 5:37 오후
 * https://app.codility.com/programmers/lessons/3-time_complexity/frog_jmp/
 * [FrogJmp]
 * [EASY]
 *
 * X 값이 Y 값이 되기 위해서 한번에 D 만큼 움직일 수 있는데
 * 몇번 만에 Y에 도달 하느냐 찾는 문제
 *
 * X = 10
 * Y = 85
 * D = 30
 *
 * 10 + 30 = 40
 * 10 + 30 + 30 = 70
 * 10 + 30 + 30 + 30 = 100
 */
public class FrogJmp {
    public static int solution(int X, int Y, int D){
        int multiplication = (Y - X) / D;
        return D * multiplication + X < Y ? multiplication + 1 : multiplication;
    }
}
