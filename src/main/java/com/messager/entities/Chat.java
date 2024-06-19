package com.messager.entities;

import java.util.ArrayList;
import java.util.UUID;

public class Chat {
  private UUID chatId;
  private ArrayList<UUID> participants = new ArrayList<>();
  private ArrayList<Message> messages = new ArrayList<>();

  public Chat() {
    this.chatId = UUID.randomUUID();
  }

  public void sendMessage(Message message) {
    this.messages.add(message);
  }

  public void removeParticipant(UUID userId) {
    
  }

  public void addParticipant(UUID userId) {
    this.participants.add(userId);
  }
}
