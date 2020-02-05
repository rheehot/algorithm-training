package test.java.hackerrank.interviewkit.sorting;

import java.Player;
import main.java.hackerrank.interviewkit.sorting.Checker;
import org.junit.Test;

import java.util.Arrays;

public class CheckerTest {

    @Test
    public void test() {
        //Given
        String playerString = "smith 20 jones 15 jones 20";
        Player[] players = createPlayers(playerString);
        Checker checker = new Checker();

        //When
        Arrays.sort(players, checker);

        //Then
        for (Player player : players) {
            System.out.println(player.name+" "+player.score);

        }
    }

    public Player[] createPlayers(String players) {
        String[] strings = players.split(" ");
        Player[] player = new Player[strings.length / 2];
        for (int i = 0; i < strings.length ; i+=2) {
            System.out.println(i);
            player[i/2] = new Player(strings[i], Integer.parseInt(strings[i + 1]));
        }

        return player;
    }
}