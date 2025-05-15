package function.mvola;

import scanner.UssdStructure;

import java.util.Scanner;

public class MvolaStructure {
    private final Scanner scanner = new Scanner(System.in);
    private UssdStructure ussdStructure;

    public void setUssdStructure(UssdStructure ussdStructure) {
        this.ussdStructure = ussdStructure;
    }



    public void Mvola() {
        while (true) {
            System.out.println("MVOLA");
            System.out.println("1 Acheter Credit ou Offre Yas");
            System.out.println("2 Transferer argent (vers toute destination)");
            System.out.println("3 Mvola Credit ou Epargne");
            System.out.println("4 Retrait d'argent");
            System.out.println("# Page suivante");
            String choix = scanner.nextLine();

            switch (choix) {
                case "1" -> System.out.println("AcheterCreditOuOffre()");
                case "2" -> System.out.println("TransfererArgent()");
                case "3" -> System.out.println("MvolaCreditOuEpargne()");
                case "4" -> System.out.println("RetraitArgent()");
                case "#" -> PageSuivante();
                default -> System.out.println("choix invalide");
            }
        }
    }

    public void PageSuivante() {
        while (true) {
            System.out.println("MVOLA");
            System.out.println("5 Paiement Factures & Partenaires");
            System.out.println("6 Mon compte");
            System.out.println("7 Recevoir de l'argent");
            System.out.println("8 Banques et Micro-Fincances");
            System.out.println("* Page precedente");
            System.out.println("** Menu principal");
            String choix = scanner.nextLine();

            switch (choix) {
                case "5" -> System.out.println("PaiementFacture()");
                case "6" -> System.out.println("MonCompte()");
                case "7" -> System.out.println("RecevoirArgent()");
                case "8" -> System.out.println("BanqueEtMicroFinance()");
                case "*" -> System.out.println("PagePrecedente()");
                case "**" -> ussdStructure.Demarrer();
                default -> System.out.println("choix invalide");
            }
        }
    }
}
