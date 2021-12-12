package com.decathlon.competition.service;

import com.decathlon.competition.domain.Competitor;
import com.decathlon.competition.domain.Disciplines;
import com.decathlon.competition.domain.Results;
import com.decathlon.competition.domain.Weights;
import com.decathlon.competition.repos.ResultsRepo;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CalculateSerice {

  @Autowired
  ResultsRepo resultsRepo;

  public Map<Competitor, List<Results>> resultsMap() {
    return resultsRepo.getResults();
  }

  public List<Disciplines> disciplinesList() {
    return resultsRepo.getDisciplines();
  }

  public List<Weights> weights() { return resultsRepo.getWeights(); }

  public List<String>  calculatePlaces(Map<Competitor, List<Results>> results) {

    Map<Competitor, Double> places = new HashMap<>();

    List<Weights> weights = weights();

    for(Competitor competitor: results.keySet()) {
      List<Results> resultsOfCompetitor = results.get(competitor);
      double score = 0;
      for(Results res : resultsOfCompetitor) {
        Weights targetWeight = weights.stream()
            .filter(weight -> res.getName().equals(weight.getDiscipline())).findFirst().get();
        score = score + targetWeight.getWeightA()
            * Math.pow(Math.abs(res.getResult() - targetWeight.getWeightB()), targetWeight.getWeightC());
      }
      places.put(competitor, score);
    }

    Map<Competitor, Double> sortedResult = sortByValue(places);
    return sortedResult.keySet().stream()
        .limit(3)
        .map(current -> String.format("%s (%.2f)", current.getName(), sortedResult.get(current)))
        .collect(Collectors.toList());

  }

  public static <K, V extends Comparable<? super V>> Map<K, V> sortByValue( Map<K, V> map ) {
    Map<K,V> result = new LinkedHashMap<>();
    Stream <Entry<K,V>> st = map.entrySet().stream();

    st.sorted(Comparator.comparing(e -> e.getValue()))
        .forEach(e ->result.put(e.getKey(), e.getValue()));

    return result;
  }

}
