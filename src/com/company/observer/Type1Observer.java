package com.company.observer;

//reading the news
public class Type1Observer implements Observer{
//    private String email;

    @Override
    public void notifyObserver(String news) {
        System.out.println("Reading the news: " + news);
    }
}
