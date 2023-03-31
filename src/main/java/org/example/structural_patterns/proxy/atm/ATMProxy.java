package org.example.structural_patterns.proxy.atm;

public class ATMProxy implements GetATMData{

    private GetATMData atmMachine;

    public ATMProxy(GetATMData atmMachine){
        this.atmMachine = atmMachine;
    }

    @Override
    public int getCashInMachine() {
        return atmMachine.getCashInMachine();
    }
}
