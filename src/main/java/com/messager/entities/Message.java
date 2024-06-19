package com.messager.entities;

import java.time.LocalDateTime;
import java.util.UUID;

public record Message(UUID messageId, UUID senderId, LocalDateTime createdAt, String content) {

}
