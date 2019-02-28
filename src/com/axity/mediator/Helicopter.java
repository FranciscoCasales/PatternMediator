package com.axity.mediator;

public class Helicopter extends Aircraft{

    public Helicopter(int idHelicopter, String typeOfAircraft) {
        super(idHelicopter, typeOfAircraft);
    }

    @Override
    public void receiveMessage(String message) {
        System.out.println(message);
    }

}
