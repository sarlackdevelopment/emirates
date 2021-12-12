package com.decathlon.competition.domain;

import lombok.Builder;
import lombok.Data;
import lombok.NonNull;

@Data
@Builder
public class Weights {

  // ( from the proposed article's table https://en.wikipedia.org/wiki/Decathlon, according to formula  y = a * |x - b|^c )

  @NonNull
  private Disciplines discipline;

  @NonNull
  private double weightA;

  @NonNull
  private double weightB;

  @NonNull
  private double weightC;

}
