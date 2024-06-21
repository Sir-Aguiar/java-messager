package com.messager.entities;

import java.util.ArrayList;
import java.util.UUID;
import java.util.stream.Collectors;

public class Chat {
  private UUID chatId;
  private ArrayList<UUID> participants = new ArrayList<>();
  private ArrayList<Message> messages = new ArrayList<>();
  private Notifier notifier = new Notifier();

  public Chat() {
    this.chatId = UUID.randomUUID();
  }

  public void sendMessage(Message message) {
    this.messages.add(message);
    Notification notification = new Notification(message.senderId, message.content);
    ArrayList<UUID> targets = this.participants
        .stream()
        .filter(participantId -> !participantId.equals(message.senderId))
        .collect(Collectors.toCollection(ArrayList::new));
    this.notifier.postNotification(notification, targets);
  }

  public void removeParticipant(UUID userId) {

  }

  public void addParticipant(User user) {
    this.notifier.addClient(user);
    this.participants.add(user.getUserId());
  }
}
