package com.decathlon.competition.service;

import static org.junit.jupiter.api.Assertions.*;

import com.decathlon.competition.domain._Competitor;
import com.decathlon.competition.domain._Disciplines;
import com.decathlon.competition.domain._Results;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import org.junit.jupiter.api.Test;

class CalculateServiceTest {

  @Test
  void calculatePlaces() {

//    CalculateService calculateService = new CalculateService();
//
//    Map<_Competitor, List<_Results>> mockResults = new HashMap<_Competitor, List<_Results>>() {{
//
//      put(
//          _Competitor.builder().id(1).name("John Smith").build(),
//          Arrays.asList(
//              _Results.builder().id(1).user_id(1).name(_Disciplines.m100).result(1.0).build(),
//              _Results.builder().id(2).user_id(1).name(_Disciplines.longJump).result(1.0).build(),
//              _Results.builder().id(3).user_id(1).name(_Disciplines.shotPut).result(1.0).build()
//          )
//      );
//
//      put(
//          _Competitor.builder().id(2).name("Jane Doe").build(),
//          Arrays.asList(
//              _Results.builder().id(1).user_id(2).name(_Disciplines.m100).result(2).build(),
//              _Results.builder().id(2).user_id(2).name(_Disciplines.longJump).result(2).build(),
//              _Results.builder().id(3).user_id(2).name(_Disciplines.shotPut).result(2).build()
//          )
//      );
//
//      put(
//          _Competitor.builder().id(3).name("Jaan Lepp").build(),
//          Arrays.asList(
//              _Results.builder().id(1).user_id(3).name(_Disciplines.m100).result(3).build(),
//              _Results.builder().id(2).user_id(3).name(_Disciplines.longJump).result(3).build(),
//              _Results.builder().id(3).user_id(3).name(_Disciplines.shotPut).result(3).build()
//          )
//      );
//
//    }};
//
//    List<String> result  = calculateService.calculatePlaces(mockResults);
//
//    List<String> waitResult = Arrays.asList("Jaan Lepp (3565,93)", "Jane Doe (3879,24)", "John Smith (4432,55)");
//
//    assertIterableEquals(result, waitResult);

  }

  @Test
  void sortByValue() {

//    Map<String, Double> mockMap = new HashMap<String, Double>() {{
//      put("Two", 2.0);
//      put("One", 1.0);
//      put("Three", 3.0);
//    }};
//
//    List<String> result = CalculateService.sortByValue(mockMap).keySet().stream().collect(Collectors.toList());
//
//    List<String> waitResult = Arrays.asList("One", "Two", "Three");
//
//    assertIterableEquals(result, waitResult);

  }

}