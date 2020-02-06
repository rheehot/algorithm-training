package hackerrank.algorithms;

/**
 * https://www.hackerrank.com/challenges/cats-and-a-mouse/problem
 *
 * 두고 양이 포지션이 다르고 앞으로 뒤로 1 칸씩 움직일 수 있음
 * 그리고 쥐의 표지션이 있음
 *
 * 누가 두 고양이 중 누가 먼저 쥐의 포지션에 가느냐 찾는다
 * 단 두 고양이의 위치가 같은 위치가 되면 쥐는 도망간다.
 */

public class CatsAndAMouse {
    public static String catAndMouse(int x, int y, int z) {

        int catA = x < z ? z - x : x - z;
        int catB = y < z ? z - y : y - z;

        return catA == catB ? "Mouse C" : catA < catB ? "Cat A" : "Cat B";
    }

}
