package test.java.interviewkit.StacksAndQueues;

import main.java.interviewkit.StacksAndQueues.PoisonousPlants;
import org.junit.Test;

import static org.junit.Assert.*;

public class PoisonousPlantsTest {

    @Test
    public void test() {
        assertEquals(3, PoisonousPlants.poisonousPlants(new int[]{4, 3, 7, 5, 6, 4, 2}));
    }
}