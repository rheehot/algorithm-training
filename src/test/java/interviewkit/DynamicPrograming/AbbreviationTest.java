package test.java.interviewkit.DynamicPrograming;

import main.java.interviewkit.DynamincPrograming.Abbreviation;
import org.junit.Test;

import static org.junit.Assert.*;

public class AbbreviationTest {
    @Test
    public void test() {

       assertEquals("NO", Abbreviation.abbreviation("CaaBa", "BAAA"));

    }
}