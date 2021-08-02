package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoodAnalyserTest {
    @Test
    public void testMoodanalysis() {
        MoodAnalyser moodanaliz = new MoodAnalyser();
        String mood = moodanaliz.analyzMood("This is a sad message");
        Assertions.assertEquals(mood, "SAD");

    }


    @Test
    public void testtoMoodanalysis() {
        MoodAnalyser moodanaliz = new MoodAnalyser();
        String mood = moodanaliz.analyzMood("This is a happy message");
        Assertions.assertEquals(mood, "HAPPY");
    }
}