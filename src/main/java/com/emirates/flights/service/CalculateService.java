package com.emirates.flights.service;

import com.emirates.flights.domain.ArrivalBoard;
import com.emirates.flights.repos.ResultsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CalculateService {

  @Autowired
  ResultsRepo resultsRepo;

  public String flightNumber(String flightDate, String departureCode, String arrivalCode) {

    int randomNumber = (int) (Math.random() * ((800 - 500) + 1)) + 500;

    ArrivalBoard instanceBoard = resultsRepo.flightNumber(flightDate, departureCode, arrivalCode);
    this.downstreamConnections(instanceBoard);

    try {
      Thread.sleep(randomNumber);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

    return new StringBuffer()
            .append(instanceBoard.getFlightDate())
            .append("~")
            .append(instanceBoard.getDepartureCode())
            .append("~")
            .append(instanceBoard.getArrivalCode())
            .toString();
  }

  private void downstreamConnections(ArrivalBoard instanceBoard) {
    for (int i = 1; i <= 5; i++) {
      DownstreamConnections connection = new DownstreamConnections();
      connection.setArrivalBoard(instanceBoard);
      connection.start();
    }
  }

}
