package com.messager.entities;

import java.time.LocalDateTime;
import java.util.UUID;

public class Notification {
  private UUID senderId;
  private String content;
  private boolean isReaded = false;
  private LocalDateTime createdAt;

  public Notification(UUID senderId, String content) {
    this.senderId = senderId;
    this.content = content;
    this.createdAt = LocalDateTime.now();
  }

  public void markAsReaded() {
    this.isReaded = true;
  }
}
