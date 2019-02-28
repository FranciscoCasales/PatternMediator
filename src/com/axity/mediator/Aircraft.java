package com.axity.mediator;

public abstract class Aircraft {

    private int idAircraft;
    private String typeOfAircraft;

    public Aircraft(int idAircraft, String typeOfAircraft) {
        this.idAircraft = idAircraft;
        this.typeOfAircraft = typeOfAircraft;
    }

    public int getIdAircraft() {
        return idAircraft;
    }

    public void setIdAircraft(int idAircraft) {
        this.idAircraft = idAircraft;
    }

    public String getTypeOfAircraft() {
        return typeOfAircraft;
    }

    public void setTypeOfAircraft(String typeOfAircraft) {
        this.typeOfAircraft = typeOfAircraft;
    }

    public abstract void receiveMessage(String message);
}
