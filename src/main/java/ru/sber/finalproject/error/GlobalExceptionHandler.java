package ru.sber.finalproject.error;

import java.util.Arrays;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
@Order(Ordered.HIGHEST_PRECEDENCE)
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {

  private enum DataIntegrityMessage {
    PERSON_LOGIN_KEY,
    PERSON_PHONE_KEY,
    PERSON_EMAIL_KEY
  }

  @ExceptionHandler(DataIntegrityViolationException.class) // обработчик ошибок, связанных с целостностью данных
  public ResponseEntity<ErrorDetails> handleDataIntegrityException(Exception ex) {
    String errorMessage = getErrorMessage(ex.getMessage());
    System.out.println(ex.getMessage());
    System.out.println(errorMessage);
    ErrorDetails errorModel = new ErrorDetails(HttpStatus.INTERNAL_SERVER_ERROR.value(), errorMessage);
    return new ResponseEntity<>(errorModel, HttpStatus.INTERNAL_SERVER_ERROR);
  }

  @ExceptionHandler(Exception.class)
  public ResponseEntity<ErrorDetails> handleGlobalException() { // глобальный обработчик ошибок
    ErrorDetails errorModel = new ErrorDetails(HttpStatus.INTERNAL_SERVER_ERROR.value(), "Server error");
    return new ResponseEntity<>(errorModel, HttpStatus.INTERNAL_SERVER_ERROR);
  }

  private String getErrorMessage(String message) {
    return Arrays.stream(DataIntegrityMessage.values())
        .map(Enum::name)
        .filter(name -> message.contains(name.toLowerCase()))
        .findFirst().orElse("Server error");
  }
}
