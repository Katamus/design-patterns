package org.example.behavioral_patterns.state.mobilealerts;

public class Ring implements MobileAlertState {
    @Override
    public void alert(AlertStateContext ctx) {
        System.out.println("ringing...");
    }
}
