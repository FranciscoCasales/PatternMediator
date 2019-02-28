package com.axity.mediator;

public class Airplane extends Aircraft{

    public Airplane(int idAirplane, String typeOfAircraft) {
        super(idAirplane, typeOfAircraft);
    }

    @Override
    public void receiveMessage(String message) {
        System.out.println(message);
    }
}
