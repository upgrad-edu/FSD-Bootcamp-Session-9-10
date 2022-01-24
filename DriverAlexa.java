package com.upgrad.fsd;

public class DriverAlexa {

    public static void main(String[] args) {
        DriverAlexa driverAlexa = new DriverAlexa();
        Alexa alexa = new AlexaFrance();
        driverAlexa.execute(alexa, "Arko");
        System.out.println();

        alexa = new AlexaIndia();
        driverAlexa.execute(alexa, "Arko");
    }


    public void execute(Alexa alexa, String name) {
        alexa.greeting(name);
    }

}
