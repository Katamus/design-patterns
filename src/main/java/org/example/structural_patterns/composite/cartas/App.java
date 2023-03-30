package org.example.structural_patterns.composite.cartas;

public class App {

    /**
     * Program entry point.
     *
     * @param args command line args
     */
    public static void main(String[] args) {

        var messenger = new Messenger();

        System.out.println("Message from the orcs: ");
        messenger.messageFromOrcs().print();

        System.out.println("Message from the elves: ");
        messenger.messageFromElves().print();
    }
}
