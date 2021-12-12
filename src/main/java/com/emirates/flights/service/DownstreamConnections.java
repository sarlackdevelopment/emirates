package com.emirates.flights.service;

import com.emirates.flights.domain.ArrivalBoard;
import lombok.Data;

@Data
public class DownstreamConnections extends Thread {

    ArrivalBoard arrivalBoard;
    Integer randomNumber = (int) (Math.random() * ((800 - 500) + 1)) + 500;

    public void run() {
        try {
            Thread.sleep(randomNumber);
            arrivalBoard.changeDepartureCode(randomNumber.toString());
        }
        catch(InterruptedException ignored) {}
    }

}
