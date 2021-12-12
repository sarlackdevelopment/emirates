package com.emirates.flights.repos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ResultsRepoTest {
  @Test
  void getArrivalBoard() {
    ResultsRepo resultsRepo = new ResultsRepo();
    String arrivalCode = resultsRepo.flightNumber("2020-01-01", "111", "222").getArrivalCode();
    assertEquals(arrivalCode, "222");
  }
}