package com.bridgelabz;

public class MoodAnalyser {
    public String analyzMood(String message) {
        if(message.contains("sad"))
            return "SAD";
        else {
            return "HAPPY";
        }
    }


}
