package com.axity.mediator;

public class Main {

    public static void main(String[] args) {
	    Aircraft airplane = new Airplane(1572, "Airplane");
	    Aircraft helicopter = new Helicopter(1638, "Helicopter");

	    Mediator controlTower = new ControlTower();

	    controlTower.registerAircraft(airplane);
	    controlTower.registerAircraft(helicopter);

	    controlTower.sendMessage(airplane, helicopter, "Permiso de aterrizaje");
	    controlTower.sendMessage(helicopter, airplane, "Afirmativo, puede aterrizar");

    }
}