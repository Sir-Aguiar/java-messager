package com.messager.entities;

import java.time.LocalDateTime;
import java.util.UUID;

public class Message {
  public UUID messageId;
  public UUID senderId;
  public LocalDateTime createdAt;
  public String content;

  public Message(UUID senderId, LocalDateTime createdAt, String content) {
    this.messageId = UUID.randomUUID();
    this.content = content;
    this.senderId = senderId;
    this.createdAt = createdAt;
  }
}
