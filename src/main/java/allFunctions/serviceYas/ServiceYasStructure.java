package main.java.allFunctions.serviceYas;

import main.java.allFunctions.InvalidChoice;

import java.util.Scanner;

public class ServiceYasStructure {
    private final Scanner scanner = new Scanner(System.in);
    private final InvalidChoice invalidChoice = new InvalidChoice();

    public void ServiceYas() {
        while (true) {
            System.out.println(
                    "\n Services YAS \n" +
                            "1 info credit \n" +
                            "2 Recharge \n" +
                            "3 Envoyer Credit/Offre/Mega");
            String choice = scanner.nextLine();
            switch(choice){
                case "1" -> System.out.println("infoCredit()");
                case "2" -> System.out.println("Recharge()");
                case "3" -> System.out.println("EnvoyerCredit()");
            }
        }
    }

}
