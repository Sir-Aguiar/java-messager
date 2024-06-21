package com.messager.entities;

import java.util.ArrayList;
import java.util.UUID;

import com.messager.dto.UserDTO;

public class User {
  private final UUID userId;
  private String name;
  private String username;
  private ArrayList<Notification> notifications;

  public User(UserDTO user) {
    this.userId = UUID.randomUUID();
    this.username = user.username;
    this.name = user.name;
  }

  public UUID getUserId() {
    return userId;
  }

  public String getName() {
    return name;
  }

  public String getUsername() {
    return username;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public void addNotification(Notification notification) {
    this.notifications.add(notification);
  }

  public void getNotifications() {
    this.notifications.forEach((each) -> {
      System.out.println("");
      each.markAsReaded();
    });
  }

}
