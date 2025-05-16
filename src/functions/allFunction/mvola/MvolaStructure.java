package functions.allFunction.mvola;

import functions.allFunction.InvalidChoice;
import scanner.UssdStructure;

import java.util.Scanner;

public class MvolaStructure {
    private final Scanner scanner = new Scanner(System.in);
    private final InvalidChoice invalidChoice = new InvalidChoice();
    private UssdStructure ussdStructure;

    public void setUssdStructure(UssdStructure ussdStructure) {
        this.ussdStructure = ussdStructure;
    }

    public void Mvola() {
        while (true) {
            System.out.println("\n MVOLA \n" +
                    "1 Acheter Credit ou Offre Yas \n" +
                    "2 Retrait d'argent \n" +
                    "# Page suivante");
            String choice = scanner.nextLine();
            switch (choice) {
                case "1" -> System.out.println("AcheterCreditOuOffre()");
                case "2" -> System.out.println("TransfererArgent()");
                case "#" -> PageSuivante();
                default -> invalidChoice.InvalidChoice();
            }
        }
    }

    public void PageSuivante() {
        while (true) {
            System.out.println(
                    "\n MVOLA \n" +
                    "3 Mon compte \n" +
                    "* Page precedente \n" +
                    "** Menu principal");
            String choice = scanner.nextLine();
            switch (choice) {
                case "3" -> System.out.println("MonCompte()");
                case "*" -> Mvola();
                case "**" -> ussdStructure.Demarrer();
                default -> invalidChoice.InvalidChoice();
            }
        }
    }
}
