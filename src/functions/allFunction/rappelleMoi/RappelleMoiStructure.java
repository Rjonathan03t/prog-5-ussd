package functions.allFunction.rappelleMoi;

import functions.allFunction.InvalidChoice;

import java.util.Scanner;

public class RappelleMoiStructure {
    private final Scanner scanner = new Scanner(System.in);
    private final InvalidChoice invalidChoice = new InvalidChoice();

    public void RappeleMoi() {
        while (true) {
            System.out.println(
                    "\n Rappelle moi \n" +
                    "1 Envoyer un rappelle moi \n" +
                    "2 Aide");
            String choice = scanner.nextLine();
            switch (choice) {
                case "1" -> System.out.println("EnvoyerUnRappelleMoi()");
                case "2" -> System.out.println("Aide()");
                default -> invalidChoice.InvalidChoice();
            }
        }
    }
}
