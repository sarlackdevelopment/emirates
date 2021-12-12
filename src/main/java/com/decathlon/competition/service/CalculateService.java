package com.decathlon.competition.service;

//import com.decathlon.competition.domain._Competitor;
//import com.decathlon.competition.domain._Disciplines;
//import com.decathlon.competition.domain._Results;
//import com.decathlon.competition.domain._Weights;
import com.decathlon.competition.domain.ArrivalBoard;
import com.decathlon.competition.repos.ResultsRepo;
//import java.util.Comparator;
//import java.util.HashMap;
//import java.util.LinkedHashMap;
//import java.util.List;
//import java.util.Map;
//import java.util.Map.Entry;
//import java.util.stream.Collectors;
//import java.util.stream.Stream;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

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
//  public Map<_Competitor, List<_Results>> resultsMap() {
//    return resultsRepo.getResults();
//  }
//
//  public List<_Disciplines> disciplinesList() {
//    return resultsRepo.getDisciplines();
//  }
//
//  public List<_Weights> weights() { return resultsRepo.getWeights(); }
//
//  public List<String>  calculatePlaces(Map<_Competitor, List<_Results>> results) {
//
//    Map<_Competitor, Double> places = new HashMap<>();
//
//    List<_Weights> weights = weights();
//
//    for(_Competitor competitor: results.keySet()) {
//      List<_Results> resultsOfCompetitor = results.get(competitor);
//      double score = 0;
//      for(_Results res : resultsOfCompetitor) {
//        _Weights targetWeight = weights.stream()
//            .filter(weight -> res.getName().equals(weight.getDiscipline())).findFirst().get();
//        score = score + targetWeight.getWeightA()
//            * Math.pow(Math.abs(res.getResult() - targetWeight.getWeightB()), targetWeight.getWeightC());
//      }
//      places.put(competitor, score);
//    }
//
//    Map<_Competitor, Double> sortedResult = sortByValue(places);
//    return sortedResult.keySet().stream()
//        .limit(3)
//        .map(current -> String.format("%s (%.2f)", current.getName(), sortedResult.get(current)))
//        .collect(Collectors.toList());
//
//  }
//
//  public static <K, V extends Comparable<? super V>> Map<K, V> sortByValue( Map<K, V> map ) {
//    Map<K,V> result = new LinkedHashMap<>();
//    Stream <Entry<K,V>> st = map.entrySet().stream();
//
//    st.sorted(Comparator.comparing(e -> e.getValue()))
//        .forEach(e ->result.put(e.getKey(), e.getValue()));
//
//    return result;
//  }

}
