package com.decathlon.competition.service;

import static org.junit.jupiter.api.Assertions.*;

import com.decathlon.competition.domain.Competitor;
import com.decathlon.competition.domain.Disciplines;
import com.decathlon.competition.domain.Results;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import org.junit.jupiter.api.Test;

class CalculateSericeTest {

  @Test
  void calculatePlaces() {

    CalculateSerice calculateSerice = new CalculateSerice();

    Map<Competitor, List<Results>> mockResults = new HashMap<Competitor, List<Results>>() {{

      put(
          Competitor.builder().id(1).name("John Smith").build(),
          Arrays.asList(
              Results.builder().id(1).user_id(1).name(Disciplines.m100).result(1.0).build(),
              Results.builder().id(2).user_id(1).name(Disciplines.longJump).result(1.0).build(),
              Results.builder().id(3).user_id(1).name(Disciplines.shotPut).result(1.0).build()
          )
      );

      put(
          Competitor.builder().id(2).name("Jane Doe").build(),
          Arrays.asList(
              Results.builder().id(1).user_id(2).name(Disciplines.m100).result(2).build(),
              Results.builder().id(2).user_id(2).name(Disciplines.longJump).result(2).build(),
              Results.builder().id(3).user_id(2).name(Disciplines.shotPut).result(2).build()
          )
      );

      put(
          Competitor.builder().id(3).name("Jaan Lepp").build(),
          Arrays.asList(
              Results.builder().id(1).user_id(3).name(Disciplines.m100).result(3).build(),
              Results.builder().id(2).user_id(3).name(Disciplines.longJump).result(3).build(),
              Results.builder().id(3).user_id(3).name(Disciplines.shotPut).result(3).build()
          )
      );

    }};

    List<String> result  = calculateSerice.calculatePlaces(mockResults);

    List<String> waitResult = Arrays.asList("Jaan Lepp (3565,93)", "Jane Doe (3879,24)", "John Smith (4432,55)");

    assertIterableEquals(result, waitResult);

  }

  @Test
  void sortByValue() {

    Map<String, Double> mockMap = new HashMap<String, Double>() {{
      put("Two", 2.0);
      put("One", 1.0);
      put("Three", 3.0);
    }};

    List<String> result = CalculateSerice.sortByValue(mockMap).keySet().stream().collect(Collectors.toList());

    List<String> waitResult = Arrays.asList("One", "Two", "Three");

    assertIterableEquals(result, waitResult);

  }

}