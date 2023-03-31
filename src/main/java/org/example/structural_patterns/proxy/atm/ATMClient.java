package org.example.structural_patterns.proxy.atm;

public class ATMClient {

    public static void main(String[] args) {

        GetATMData realAtmMachine = new ATMMachine(1000);
        GetATMData atmProxy = new ATMProxy(realAtmMachine);

        System.out.println("ATM Machine, cash available: " + atmProxy.getCashInMachine());


    }
}
