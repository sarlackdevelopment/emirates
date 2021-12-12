package com.emirates.flights.service;

import com.emirates.flights.domain.ArrivalBoard;
import com.emirates.flights.repos.ResultsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

@Service
public class CalculateService {

  @Autowired
  ResultsRepo resultsRepo;

  public String calculatePrice(String flightNumber) {
    return pricingEngineRules(flightNumber);
  }

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

  private String pricingEngineRules(String flightNumber) {
    List<Integer> rules = new LinkedList<>();
    for (int i =  0; i < 100_000_00; i++) {
      if (rules.isEmpty()) {
        rules.add(flightNumber.length());
      } else {
        int randomDiscount = (int) (Math.random() * ((800 - 500) + 1)) + 500;
        rules.add(rules.get(rules.size() - 1) + ((i % 2) == 0 ? 1 : -1) * randomDiscount);
      }
    }
    return Integer.toString(Math.abs(rules.get(rules.size() - 1)));
  }

}
