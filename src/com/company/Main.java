package com.company;

import Bus.Bus;

public class Main {

    public static void main(String[] args) {
        Bus ourBus = new Bus();
        Bus firstBus = new Bus();
        Bus secondBus = new Bus();
        ourBus.color = "green";
        firstBus.color = "white" ;
        secondBus.color = "red";
        ourBus.showColor();
        firstBus.showColor();
        secondBus.showColor();
    }
}
