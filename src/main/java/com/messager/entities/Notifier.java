package com.messager.entities;

import java.util.ArrayList;
import java.util.UUID;

public class Notifier {
  private UUID notifierId;
  private ArrayList<User> clients;

  public Notifier() {
    this.notifierId = UUID.randomUUID();
  }

  public void addClient(User user) {
    this.clients.add(user);
  }

  public void postNotification(Notification notification, ArrayList<UUID> targets) {

  }

}
