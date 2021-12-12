package com.decathlon.competition.repos;

import com.decathlon.competition.domain.Competitor;
import com.decathlon.competition.domain.Disciplines;
import com.decathlon.competition.domain.Results;
import com.decathlon.competition.domain.Weights;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Component;

@Component
public class ResultsRepo {

  public static List<Disciplines> getDisciplines() {
    return Arrays.asList(Disciplines.values());
  }

  public static Map<Competitor, List<Results>> getResults() {
    return new HashMap<Competitor, List<Results>>() {{

      put(
          Competitor.builder().id(1).name("John Smith").build(),
          Arrays.asList(
              Results.builder().id(1).user_id(1).name(Disciplines.m100).result(12.61).build(),
              Results.builder().id(2).user_id(1).name(Disciplines.longJump).result(5.00).build(),
              Results.builder().id(3).user_id(1).name(Disciplines.shotPut).result(9.22).build(),
              Results.builder().id(4).user_id(1).name(Disciplines.highJump).result(1.50).build(),
              Results.builder().id(5).user_id(1).name(Disciplines.m400).result(60.39).build(),
              Results.builder().id(6).user_id(1).name(Disciplines.hurdlesM110).result(16.43).build(),
              Results.builder().id(7).user_id(1).name(Disciplines.DiscusThrow).result(21.60).build(),
              Results.builder().id(8).user_id(1).name(Disciplines.PoleVault).result(2.60).build(),
              Results.builder().id(9).user_id(1).name(Disciplines.JavelinThrow).result(35.81).build(),
              Results.builder().id(10).user_id(1).name(Disciplines.m1500).result(5.25).build()
          )
      );

      put(
          Competitor.builder().id(2).name("Jane Doe").build(),
          Arrays.asList(
              Results.builder().id(1).user_id(2).name(Disciplines.m100).result(13.04).build(),
              Results.builder().id(2).user_id(2).name(Disciplines.longJump).result(4.53).build(),
              Results.builder().id(3).user_id(2).name(Disciplines.shotPut).result(7.79).build(),
              Results.builder().id(4).user_id(2).name(Disciplines.highJump).result(1.55).build(),
              Results.builder().id(5).user_id(2).name(Disciplines.m400).result(64.72).build(),
              Results.builder().id(6).user_id(2).name(Disciplines.hurdlesM110).result(18.74).build(),
              Results.builder().id(7).user_id(2).name(Disciplines.DiscusThrow).result(24.20).build(),
              Results.builder().id(8).user_id(2).name(Disciplines.PoleVault).result(2.40).build(),
              Results.builder().id(9).user_id(2).name(Disciplines.JavelinThrow).result(28.20).build(),
              Results.builder().id(10).user_id(2).name(Disciplines.m1500).result(6.50).build()
          )
      );

      put(
          Competitor.builder().id(3).name("Jaan Lepp").build(),
          Arrays.asList(
              Results.builder().id(1).user_id(3).name(Disciplines.m100).result(13.75).build(),
              Results.builder().id(2).user_id(3).name(Disciplines.longJump).result(4.84).build(),
              Results.builder().id(3).user_id(3).name(Disciplines.shotPut).result(10.12).build(),
              Results.builder().id(4).user_id(3).name(Disciplines.highJump).result(1.50).build(),
              Results.builder().id(5).user_id(3).name(Disciplines.m400).result(68.44).build(),
              Results.builder().id(6).user_id(3).name(Disciplines.hurdlesM110).result(19.18).build(),
              Results.builder().id(7).user_id(3).name(Disciplines.DiscusThrow).result(30.85).build(),
              Results.builder().id(8).user_id(3).name(Disciplines.PoleVault).result(2.80).build(),
              Results.builder().id(9).user_id(3).name(Disciplines.JavelinThrow).result(33.88).build(),
              Results.builder().id(10).user_id(3).name(Disciplines.m1500).result(6.22).build()
          )
      );

      put(
          Competitor.builder().id(4).name("Foo Bar").build(),
          Arrays.asList(
              Results.builder().id(1).user_id(4).name(Disciplines.m100).result(13.43).build(),
              Results.builder().id(2).user_id(4).name(Disciplines.longJump).result(4.35).build(),
              Results.builder().id(3).user_id(4).name(Disciplines.shotPut).result(8.64).build(),
              Results.builder().id(4).user_id(4).name(Disciplines.highJump).result(1.50).build(),
              Results.builder().id(5).user_id(4).name(Disciplines.m400).result(66.06).build(),
              Results.builder().id(6).user_id(4).name(Disciplines.hurdlesM110).result(19.05).build(),
              Results.builder().id(7).user_id(4).name(Disciplines.DiscusThrow).result(24.89).build(),
              Results.builder().id(8).user_id(4).name(Disciplines.PoleVault).result(2.20).build(),
              Results.builder().id(9).user_id(4).name(Disciplines.JavelinThrow).result(33.48).build(),
              Results.builder().id(10).user_id(4).name(Disciplines.m1500).result(6.51).build()
          )
      );

    }};
  }

  public static List<Weights> getWeights() {

    return Arrays.asList(
        Weights.builder().discipline(Disciplines.m100).weightA(25.4348).weightB(18).weightC(1.81).build(),
        Weights.builder().discipline(Disciplines.longJump).weightA(90.5674).weightB(2.2).weightC(1.4).build(),
        Weights.builder().discipline(Disciplines.shotPut).weightA(51.39).weightB(1.5).weightC(1.05).build(),
        Weights.builder().discipline(Disciplines.highJump).weightA(585.64).weightB(0.75).weightC(1.42).build(),
        Weights.builder().discipline(Disciplines.m400).weightA(1.53775).weightB(82).weightC(1.81).build(),
        Weights.builder().discipline(Disciplines.hurdlesM110).weightA(5.74354).weightB(28.5).weightC(1.92).build(),
        Weights.builder().discipline(Disciplines.DiscusThrow).weightA(12.91).weightB(4).weightC(1.1).build(),
        Weights.builder().discipline(Disciplines.PoleVault).weightA(140.182).weightB(1).weightC(1.35).build(),
        Weights.builder().discipline(Disciplines.JavelinThrow).weightA(10.14).weightB(7).weightC(1.08).build(),
        Weights.builder().discipline(Disciplines.m1500).weightA(0.03768).weightB(480).weightC(1.85).build()
    );

  }

}
