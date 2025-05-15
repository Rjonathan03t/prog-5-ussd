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
                    "2 Transferer argent (vers toute destination) \n" +
                    "3 Mvola Credit ou Epargne \n" +
                    "4 Retrait d'argent \n" +
                    "# Page suivante");
            String choice = scanner.nextLine();
            switch (choice) {
                case "1" -> System.out.println("AcheterCreditOuOffre()");
                case "2" -> System.out.println("TransfererArgent()");
                case "3" -> System.out.println("MvolaCreditOuEpargne()");
                case "4" -> System.out.println("RetraitArgent()");
                case "#" -> PageSuivante();
                default -> invalidChoice.InvalidChoice();
            }
        }
    }

    public void PageSuivante() {
        while (true) {
            System.out.println(
                    "\n MVOLA \n" +
                    "5 Paiement Factures & Partenaires \n" +
                    "6 Mon compte \n" +
                    "7 Recevoir de l'argent \n" +
                    "* Page precedente \n" +
                    "** Menu principal");
            String choice = scanner.nextLine();
            switch (choice) {
                case "5" -> System.out.println("PaiementFacture()");
                case "6" -> System.out.println("MonCompte()");
                case "7" -> System.out.println("RecevoirArgent()");
                case "8" -> System.out.println("BanqueEtMicroFinance()");
                case "*" -> Mvola();
                case "**" -> ussdStructure.Demarrer();
                default -> invalidChoice.InvalidChoice();
            }
        }
    }
}
