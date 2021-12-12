package com.emirates.flights.domain;

import lombok.Builder;
import lombok.Data;
import lombok.NonNull;

@Data
@Builder
public class ArrivalBoard {
    @NonNull
    private long id;
    @NonNull
    private String flightDate;
    @NonNull
    private String departureCode;
    @NonNull
    private String arrivalCode;

    public synchronized void changeDepartureCode(String newDepartureCode) {
        this.setDepartureCode(newDepartureCode);
    }
}
