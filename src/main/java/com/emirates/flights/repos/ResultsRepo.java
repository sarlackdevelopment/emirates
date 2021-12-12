package com.emirates.flights.repos;

//import com.emirates.flights.domain.*;
import com.emirates.flights.domain.ArrivalBoard;
import org.springframework.stereotype.Component;

@Component
public class ResultsRepo {

    public ArrivalBoard flightNumber(String flightDate, String departureCode, String arrivalCode) {
        return ArrivalBoard.builder()
                .id(1).flightDate(flightDate).departureCode(departureCode).arrivalCode(arrivalCode).build();
    }

}
