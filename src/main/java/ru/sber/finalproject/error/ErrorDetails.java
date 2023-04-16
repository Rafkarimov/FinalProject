package ru.sber.finalproject.error;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class ErrorDetails {

  private final Integer status;
  private final String message;
}
