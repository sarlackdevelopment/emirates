package com.decathlon.competition.repos;

import com.decathlon.competition.domain.*;

import java.util.*;

import org.springframework.stereotype.Component;

@Component
public class ResultsRepo {

    public ArrivalBoard flightNumber(String flightDate, String departureCode, String arrivalCode) {
        return ArrivalBoard.builder()
                .id(1).flightDate(flightDate).departureCode(departureCode).arrivalCode(arrivalCode).build();
//        return new StringBuffer()
//                .append(flightDate)
//                .append("~")
//                .append(departureCode)
//                .append("~")
//                .append(arrivalCode)
//                .toString();
    }

//  public static List<_Disciplines> getDisciplines() {
//    return Arrays.asList(_Disciplines.values());
//  }
//
//  public static Map<_Competitor, List<_Results>> getResults() {
//    return new HashMap<_Competitor, List<_Results>>() {{
//
//      put(
//          _Competitor.builder().id(1).name("John Smith").build(),
//          Arrays.asList(
//              _Results.builder().id(1).user_id(1).name(_Disciplines.m100).result(12.61).build(),
//              _Results.builder().id(2).user_id(1).name(_Disciplines.longJump).result(5.00).build(),
//              _Results.builder().id(3).user_id(1).name(_Disciplines.shotPut).result(9.22).build(),
//              _Results.builder().id(4).user_id(1).name(_Disciplines.highJump).result(1.50).build(),
//              _Results.builder().id(5).user_id(1).name(_Disciplines.m400).result(60.39).build(),
//              _Results.builder().id(6).user_id(1).name(_Disciplines.hurdlesM110).result(16.43).build(),
//              _Results.builder().id(7).user_id(1).name(_Disciplines.DiscusThrow).result(21.60).build(),
//              _Results.builder().id(8).user_id(1).name(_Disciplines.PoleVault).result(2.60).build(),
//              _Results.builder().id(9).user_id(1).name(_Disciplines.JavelinThrow).result(35.81).build(),
//              _Results.builder().id(10).user_id(1).name(_Disciplines.m1500).result(5.25).build()
//          )
//      );
//
//      put(
//          _Competitor.builder().id(2).name("Jane Doe").build(),
//          Arrays.asList(
//              _Results.builder().id(1).user_id(2).name(_Disciplines.m100).result(13.04).build(),
//              _Results.builder().id(2).user_id(2).name(_Disciplines.longJump).result(4.53).build(),
//              _Results.builder().id(3).user_id(2).name(_Disciplines.shotPut).result(7.79).build(),
//              _Results.builder().id(4).user_id(2).name(_Disciplines.highJump).result(1.55).build(),
//              _Results.builder().id(5).user_id(2).name(_Disciplines.m400).result(64.72).build(),
//              _Results.builder().id(6).user_id(2).name(_Disciplines.hurdlesM110).result(18.74).build(),
//              _Results.builder().id(7).user_id(2).name(_Disciplines.DiscusThrow).result(24.20).build(),
//              _Results.builder().id(8).user_id(2).name(_Disciplines.PoleVault).result(2.40).build(),
//              _Results.builder().id(9).user_id(2).name(_Disciplines.JavelinThrow).result(28.20).build(),
//              _Results.builder().id(10).user_id(2).name(_Disciplines.m1500).result(6.50).build()
//          )
//      );
//
//      put(
//          _Competitor.builder().id(3).name("Jaan Lepp").build(),
//          Arrays.asList(
//              _Results.builder().id(1).user_id(3).name(_Disciplines.m100).result(13.75).build(),
//              _Results.builder().id(2).user_id(3).name(_Disciplines.longJump).result(4.84).build(),
//              _Results.builder().id(3).user_id(3).name(_Disciplines.shotPut).result(10.12).build(),
//              _Results.builder().id(4).user_id(3).name(_Disciplines.highJump).result(1.50).build(),
//              _Results.builder().id(5).user_id(3).name(_Disciplines.m400).result(68.44).build(),
//              _Results.builder().id(6).user_id(3).name(_Disciplines.hurdlesM110).result(19.18).build(),
//              _Results.builder().id(7).user_id(3).name(_Disciplines.DiscusThrow).result(30.85).build(),
//              _Results.builder().id(8).user_id(3).name(_Disciplines.PoleVault).result(2.80).build(),
//              _Results.builder().id(9).user_id(3).name(_Disciplines.JavelinThrow).result(33.88).build(),
//              _Results.builder().id(10).user_id(3).name(_Disciplines.m1500).result(6.22).build()
//          )
//      );
//
//      put(
//          _Competitor.builder().id(4).name("Foo Bar").build(),
//          Arrays.asList(
//              _Results.builder().id(1).user_id(4).name(_Disciplines.m100).result(13.43).build(),
//              _Results.builder().id(2).user_id(4).name(_Disciplines.longJump).result(4.35).build(),
//              _Results.builder().id(3).user_id(4).name(_Disciplines.shotPut).result(8.64).build(),
//              _Results.builder().id(4).user_id(4).name(_Disciplines.highJump).result(1.50).build(),
//              _Results.builder().id(5).user_id(4).name(_Disciplines.m400).result(66.06).build(),
//              _Results.builder().id(6).user_id(4).name(_Disciplines.hurdlesM110).result(19.05).build(),
//              _Results.builder().id(7).user_id(4).name(_Disciplines.DiscusThrow).result(24.89).build(),
//              _Results.builder().id(8).user_id(4).name(_Disciplines.PoleVault).result(2.20).build(),
//              _Results.builder().id(9).user_id(4).name(_Disciplines.JavelinThrow).result(33.48).build(),
//              _Results.builder().id(10).user_id(4).name(_Disciplines.m1500).result(6.51).build()
//          )
//      );
//
//    }};
//  }
//
//  public static List<_Weights> getWeights() {
//
//    return Arrays.asList(
//        _Weights.builder().discipline(_Disciplines.m100).weightA(25.4348).weightB(18).weightC(1.81).build(),
//        _Weights.builder().discipline(_Disciplines.longJump).weightA(90.5674).weightB(2.2).weightC(1.4).build(),
//        _Weights.builder().discipline(_Disciplines.shotPut).weightA(51.39).weightB(1.5).weightC(1.05).build(),
//        _Weights.builder().discipline(_Disciplines.highJump).weightA(585.64).weightB(0.75).weightC(1.42).build(),
//        _Weights.builder().discipline(_Disciplines.m400).weightA(1.53775).weightB(82).weightC(1.81).build(),
//        _Weights.builder().discipline(_Disciplines.hurdlesM110).weightA(5.74354).weightB(28.5).weightC(1.92).build(),
//        _Weights.builder().discipline(_Disciplines.DiscusThrow).weightA(12.91).weightB(4).weightC(1.1).build(),
//        _Weights.builder().discipline(_Disciplines.PoleVault).weightA(140.182).weightB(1).weightC(1.35).build(),
//        _Weights.builder().discipline(_Disciplines.JavelinThrow).weightA(10.14).weightB(7).weightC(1.08).build(),
//        _Weights.builder().discipline(_Disciplines.m1500).weightA(0.03768).weightB(480).weightC(1.85).build()
//    );
//
//  }

}
