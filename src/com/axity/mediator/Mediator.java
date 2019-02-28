package com.axity.mediator;

public interface Mediator {
    void registerAircraft(Aircraft aircraft);
    void sendMessage(Aircraft sender, Aircraft receiver, String message);
}
