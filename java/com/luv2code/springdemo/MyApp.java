package com.luv2code.springdemo;

public class MyApp {
    public static void main(String[] args) {
        //create an object
        //Coach theCoach = new BaseballCoach();
        Coach theCoach = new TrackCoach();
        //use an object
        System.out.println(theCoach.getDailyWorkout());
    }
}
