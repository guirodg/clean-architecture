package com.app.exception;

public class ValidationException extends RuntimeException{
  private final String message;

  public ValidationException(String message) {
    this.message = message;
  }
}
