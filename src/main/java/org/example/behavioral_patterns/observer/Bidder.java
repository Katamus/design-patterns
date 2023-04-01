package org.example.behavioral_patterns.observer;


import org.example.behavioral_patterns.observer.pattern.Event;
import org.example.behavioral_patterns.observer.pattern.Observer;


public class Bidder implements Observer {

    private static int ID = 0;

    @Override
    public void update(Event event) {
        System.out.println(
                "ID: " + (++ID) +
                        ", Updating event type: " +  event.getType() +
                        ", Event description: " + event.getDescription());
    }
}
