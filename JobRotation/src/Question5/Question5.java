package Question5;

import java.util.Scanner;

public class Question5 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("digite uma string para inverter: ");
    String enter = scanner.nextLine();

    String reversed = "";
    for(int i = enter.length() - 1; i >= 0; i--){
      reversed += enter.charAt(i);
    }
    System.out.println(reversed);
  }
}
