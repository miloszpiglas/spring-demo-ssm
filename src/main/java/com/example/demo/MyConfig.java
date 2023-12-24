package com.example.demo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@ConfigurationProperties()
@Configuration
public class MyConfig {

  private String message;

  public String getMessage() {
    return message;
  }

  public void setMessage(String newMessage) {
    System.out.println(
        "------------------------ Old value=%s, New value=%s".formatted(this.message, newMessage));
    this.message = newMessage;
  }
}
