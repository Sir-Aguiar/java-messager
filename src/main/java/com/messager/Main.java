package com.messager;

import java.time.LocalDateTime;

import com.messager.dto.UserDTO;
import com.messager.entities.Chat;
import com.messager.entities.Message;
import com.messager.entities.User;
import com.messager.views.UserView;

public class Main {
    public static void main(String[] args) {

        User FelipeUser = new User(new UserDTO("Felipe Aguiar", "sir-aguiar"));
        User JhonUser = new User(new UserDTO("Jhon Doe", "lil-doe"));

        Chat FJChat = new Chat();

        FJChat.addParticipant(FelipeUser);
        FJChat.addParticipant(JhonUser);

        System.out.println("\n[SUCCES] Chat padrão iniciado");
        System.out.println("[SUCCESS] Logado atualmente como sir-aguiar");
        UserView mainView = new UserView();

        int userChoice = mainView.RenderList();

        if (userChoice == 0) {
            String content = mainView.$inputUserMessage();
            Message newMessage = new Message(FelipeUser.getUserId(), LocalDateTime.now(), content);

            FJChat.sendMessage(newMessage);
        }

    }
}