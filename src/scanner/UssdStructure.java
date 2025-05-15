package scanner;

import function.mvola.MvolaStructure;

import java.util.Scanner;

public class UssdStructure {
    private final Scanner scanner = new Scanner(System.in);
    private  MvolaStructure mvolaStructure;

    public void setMvolaStructure(MvolaStructure mvolaStructure) {
        this.mvolaStructure = mvolaStructure;
    }


    public void Demarrer() {
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
                case "1" -> mvolaStructure.Mvola();
                case "2" -> System.out.println("RappelleMoi()");
                case "3" -> System.out.println("SosCredit()");
                case "4" -> System.out.println("ServiceYas()");
                case "5" -> System.out.println("Promotion()");
                case "6" -> System.out.println("ProduitEtDivertissement()");
                case "7" -> System.out.println("BanqueEtMicroFinance()");
                case "0" -> PageSuivante();
                default -> System.out.println("choix invalide");
            }

    }

    public void PageSuivante (){
        while(true){
            System.out.println("8 Mon identite");
            System.out.println("9 Configurer mon mobile");
            System.out.println("00 Page precedente");
            String choix = scanner.nextLine();

            switch(choix){
                case "8" -> System.out.println("MonIdentite()");
                case "9" -> System.out.println("ConfigurerMonMobile()");
                case "00" -> Demarrer();
                default -> System.out.println("choix invalide");
            }
        }
    }
}
