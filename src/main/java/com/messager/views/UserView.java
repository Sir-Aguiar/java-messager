package com.messager.views;

import java.util.Scanner;

public class UserView {

  private final Scanner Input = new Scanner(System.in);

  public int RenderList() {
    System.out.println("[ 0 ] -> Enviar mensagem \n");

    int userInput = this.Input.nextInt();
    this.Input.nextLine();
    return userInput;
  }

  public String $inputUserMessage() {
    System.out.println("\n Insira sua mensagem: ");
    return this.Input.nextLine();
  }

}
