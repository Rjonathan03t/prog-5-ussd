package functions.allFunction.monIdentite;

import functions.allFunction.InvalidChoice;

import java.util.Scanner;

public class MonIdentiteStructure {
    private final Scanner scanner = new Scanner(System.in);
    private final InvalidChoice invalidChoice = new InvalidChoice();

    public void MonIdentiteStructure(){
        while(true){
            System.out.println(
                    "\n 1 Mon identite enregistre"
            );
            String choice = scanner.nextLine();
            switch(choice){
                case "1" -> System.out.println(
                        "\n Votre compte est identifié et certifié Mvola mais enrollement biometrique en cours"
                );
                default -> invalidChoice.InvalidChoice();
            }
        }
    }
}
