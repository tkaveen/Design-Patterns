package com.company.observer;

import com.company.adaptor.ImageAdaptor;
import com.company.adaptor.MoviePlayer;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        //publisher -> subject
        //subscriber -> observer
        //types of observers -> newsreader, foodwrapper

        Observer observer1 = new Type1Observer(); //reading news
        Observer observer2 = new Type1Observer();//reading news
        Observer observer3 = new Type2Observer();//wrap food

        Subject subject = new Subject();
        subject.subscribe(observer1);
        subject.subscribe(observer2);
        subject.subscribe(observer3);


        Scanner input = new Scanner (System.in);
        System.out.print("Type The News You want to publish : ");
        String response = input.nextLine();

        subject.notifyObservers( response);
        Thread.sleep(10000);
        System.out.println("====================================================================");
        subject.notifyObservers(response);
        Thread.sleep(5000);
        subject.unsubscribe(observer2);
        Thread.sleep(5000);
        System.out.println("====================================================================");
        subject.notifyObservers(response);


    }
}
