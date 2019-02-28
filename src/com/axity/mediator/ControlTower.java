package com.axity.mediator;

import java.util.HashMap;

public class ControlTower implements Mediator{
    private HashMap<Integer, Aircraft> aircrafts;

    public ControlTower() {
        this.aircrafts = new HashMap<Integer, Aircraft>();
    }

    @Override
    public void registerAircraft(Aircraft aircraft) {
        this.aircrafts.put(aircraft.getIdAircraft(), aircraft);
    }

    @Override
    public void sendMessage(Aircraft sender, Aircraft receiver, String message){
        message = "From: " + sender.getTypeOfAircraft() + "_" + sender.getIdAircraft() +
                "\tTo: " + receiver.getTypeOfAircraft() + "_" + receiver.getIdAircraft() +
                ".\n\tmensaje: " + message;
        receiver.receiveMessage(message);
    }
}
