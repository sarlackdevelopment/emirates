package com.decathlon.competition.domain;

import lombok.Builder;
import lombok.Data;
import lombok.NonNull;
//import lombok.Synchronized;

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
