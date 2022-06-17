package com.luv2code.springdemo;

public class BadmintonCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "Practice smashes and drops";
    }

    @Override
    public String getDailyFortune() {
        return null;
    }
}
