package test.java.interviewkit.DictionariesAndHashmaps;

import main.java.interviewkit.DictionariesAndHashmaps.RansomNote;
import org.junit.Test;

import java.util.List;
import java.util.stream.Collectors;

import static org.junit.Assert.*;

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