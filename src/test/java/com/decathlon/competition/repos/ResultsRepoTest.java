package com.decathlon.competition.repos;

import static org.junit.jupiter.api.Assertions.*;

import com.decathlon.competition.domain.Weights;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import org.junit.jupiter.api.Test;

class ResultsRepoTest {

  @Test
  void getDisciplines() {

    List<String> first = ResultsRepo.getDisciplines().stream()
        .map(item -> item.name()).collect(Collectors.toList());

    List<String> second = Arrays.asList("m100", "longJump", "shotPut", "highJump", "m400",
        "hurdlesM110", "DiscusThrow", "PoleVault", "JavelinThrow", "m1500");

    assertIterableEquals(first, second);

  }

  @Test
  void getWeights() {

    List<Weights> weights = ResultsRepo.getWeights();

    List<String> first = weights.stream()
        .map(item -> item.getDiscipline().name()).collect(Collectors.toList());

    List<String> second = Arrays.asList("m100", "longJump", "shotPut", "highJump", "m400",
        "hurdlesM110", "DiscusThrow", "PoleVault", "JavelinThrow", "m1500");

    List<Double> weightsA = weights.stream()
        .map(item -> item.getWeightA()).collect(Collectors.toList());

    List<Double> weightsAValues = Arrays.asList(25.4348, 90.5674, 51.39, 585.64, 1.53775,
        5.74354, 12.91, 140.182, 10.14, 0.03768);

    List<Double> weightsB = weights.stream()
        .map(item -> item.getWeightB()).collect(Collectors.toList());

    List<Double> weightsBValues = Arrays.asList(18.0, 2.2, 1.5, 0.75, 82.0, 28.5, 4.0, 1.0, 7.0, 480.0);

    List<Double> weightsC = weights.stream()
        .map(item -> item.getWeightC()).collect(Collectors.toList());

    List<Double> weightsCValues = Arrays.asList(1.81, 1.4, 1.05, 1.42, 1.81, 1.92, 1.1, 1.35, 1.08, 1.85);

    assertAll("weights is perfect",
        () -> assertIterableEquals(first, second),
        () -> assertIterableEquals(weightsA, weightsAValues),
        () -> assertIterableEquals(weightsB, weightsBValues),
        () -> assertIterableEquals(weightsC, weightsCValues)
    );

  }
}