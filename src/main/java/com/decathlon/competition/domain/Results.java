package com.decathlon.competition.domain;

import lombok.Builder;
import lombok.Data;
import lombok.NonNull;

@Data
@Builder
public class Results {

  @NonNull
  private long id;
  @NonNull
  private long user_id;
  @NonNull
  private Disciplines name;
  @NonNull
  private double result;

}
