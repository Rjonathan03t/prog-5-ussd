package functions.allFunction.serviceYas;

import functions.allFunction.InvalidChoice;

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
                            "3 Gerer Friends and Family \n" +
                            "4 Envoyer Credit/Offre/Mega \n" +
                            "5 Ajouter des jours de validite \n" +
                            "6 Acheter une offre \n" +
                            "7 Mon numero \n" +
                            "0 Page suivante");
            String choice = scanner.nextLine();
            switch(choice){
                case "1" -> System.out.println("infoCredit()");
                case "2" -> System.out.println("Recharge()");
                case "3" -> System.out.println("GererFriends()");
                case "4" -> System.out.println("AjouterJourValidite");
            }
        }
    }

}
