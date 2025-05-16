package main.java.allFunctions.sosCredit;

import main.java.allFunctions.InvalidChoice;

import java.util.Scanner;

public class SosCreditStructure {
    private final Scanner scanner = new Scanner(System.in);
    private final InvalidChoice invalidChoice = new InvalidChoice();

    public void SosCredit() {
        while (true) {
            System.out.println(
                            "\n SOS Credit \n" +
                            "1 SOS credit a un ami \n" +
                            "2 SOS Credit a YAS \n" +
                            "3 Aide");
            String choice = scanner.nextLine();
            switch(choice){
                case "1" -> System.out.println("SosCreditAmi()");
                case "2" -> System.out.println("SosCreditYas()");
                case "3" -> System.out.println("Aide()");
                default -> invalidChoice.InvalidChoice();
            }
        }
    }
}
