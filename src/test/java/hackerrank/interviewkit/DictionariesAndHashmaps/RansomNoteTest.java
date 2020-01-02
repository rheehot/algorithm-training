package test.java.hackerrank.interviewkit.DictionariesAndHashmaps;

import main.java.hackerrank.interviewkit.DictionariesAndHashmaps.RansomNote;
import org.junit.Test;

public class RansomNoteTest {

    @Test
    public void test() {
        //Given
        String[] magazine = "apgo clm w lxkvg mwz elo bg elo lxkvg elo apgo apgo w elo bg".split(" ");
        String[] note = "elo lxkvg bg mwz clm w".split(" ");


        //When
        RansomNote.checkMagazine(magazine, note);

        //Then
    }

}