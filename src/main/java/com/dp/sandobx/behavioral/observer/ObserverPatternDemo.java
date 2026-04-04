package com.dp.sandobx.behavioral.observer;


// ===== Client =====
public class ObserverPatternDemo {
    public static void main(String[] args) {
        NewsAgency agency = new NewsAgency();

        Observer dailyTimes = new Newspaper("Daily Times");
        Observer globalNews = new TVChannel("Global News");

        agency.attach(dailyTimes);
        agency.attach(globalNews);

        agency.setNews("New Observer Pattern Released!");
        agency.setNews("Java 17 Features Announced!");
    }
}