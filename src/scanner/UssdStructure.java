package scanner;

import src.function.mvola.MvolaStructure;

import java.util.Scanner;

public class UssdStructure {
    private final Scanner scanner = new Scanner(System.in);
    private final MvolaStructure mvolaStructure = new MvolaStructure();

    public void Demarrer() {
        while (true) {
            System.out.println("\n YAS et MOI");
            System.out.println("1 MVola");
            System.out.println("2 Rappelle moi");
            System.out.println("3 SOS Credit");
            System.out.println("4 Service YAS");
            System.out.println("5 Promotion");
            System.out.println("6 Produits et Divertissement");
            System.out.println("7 Banques et Micro-finances");
            System.out.println("0 Page suivante");
            String choix = scanner.nextLine();

            switch (choix) {
                case "1" -> mvolaStructure.MVola();
                case "2" -> RappelleMoi();
                case "3" -> SosCredit();
                case "4" -> ServiceYas();
                case "5" -> Promotion();
                case "6" -> ProduitEtDivertissement();
                case "7" -> BanqueEtMicroFinance();
                case "0" -> PageSuivante();
                default -> System.out.println("choix invalide");
            }
        }
    }

    public void PageSuivante (){
        while(true){
            System.out.println("8 Mon identite");
            System.out.println("9 Configurer mon mobile");
            System.out.println("00 Page precedente");
            int choix = scanner.nextInt();

            switch(choix){
                case "8" -> MonIdentite();
                case "9" -> ConfigurerMonMobile();
                case "00" -> Demarrer();
                default -> System.out.println("choix invalide");
            }
        }
    }
}
