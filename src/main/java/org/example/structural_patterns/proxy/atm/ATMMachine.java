package org.example.structural_patterns.proxy.atm;

public class ATMMachine implements GetATMData{
    private int cashInMachine;

    public ATMMachine(int cashInMachine){
        this.cashInMachine = cashInMachine;
    }
    @Override
    public int getCashInMachine() {
        return cashInMachine;
    }
}
