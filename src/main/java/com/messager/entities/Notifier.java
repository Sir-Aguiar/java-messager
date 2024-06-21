package com.messager.entities;

import java.util.ArrayList;
import java.util.UUID;
import java.util.stream.Collectors;

public class Notifier {
  private UUID notifierId;
  private ArrayList<User> clients = new ArrayList<>();

  public Notifier() {
    this.notifierId = UUID.randomUUID();
  }

  public void addClient(User user) {
    this.clients.add(user);
  }

  public void postNotification(Notification notification, ArrayList<UUID> targets) {
    ArrayList<User> targetClients = this.clients.stream()
        .filter(client -> targets.contains(client.getUserId()))
        .collect(Collectors.toCollection(ArrayList::new));

    targetClients.forEach(client -> {
      System.out.printf("[Noficação para - %s]: %s", client.getUsername(), notification.getContent());
    });
  }

}
