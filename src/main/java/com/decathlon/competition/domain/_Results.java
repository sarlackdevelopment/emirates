package com.decathlon.competition.domain;

import lombok.Builder;
import lombok.Data;
import lombok.NonNull;

@Data
@Builder
public class _Results {

  @NonNull
  private long id;
  @NonNull
  private long user_id;
  @NonNull
  private _Disciplines name;
  @NonNull
  private double result;

}
