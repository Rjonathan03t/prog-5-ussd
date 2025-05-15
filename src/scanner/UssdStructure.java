package scanner;

import functions.allFunction.mvola.MvolaStructure;
import functions.allFunction.rappelleMoi.RappelleMoiStructure;

import java.util.Scanner;

public class UssdStructure {
    private final Scanner scanner = new Scanner(System.in);
    private MvolaStructure mvolaStructure;
    private RappelleMoiStructure rappelleMoiStructure;

    public void setMvolaStructure(MvolaStructure mvolaStructure) {
        this.mvolaStructure = mvolaStructure;
    }

    public void setRappelleMoiStructure(RappelleMoiStructure rappelleMoiStructure){
        this.rappelleMoiStructure = rappelleMoiStructure;
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
        String choice = scanner.nextLine();

        switch (choice) {
            case "1" -> mvolaStructure.Mvola();
            case "2" -> rappelleMoiStructure.RappeleMoi();
            case "3" -> System.out.println("SosCredit()");
            case "4" -> System.out.println("ServiceYas()");
            case "5" -> System.out.println("Promotion()");
            case "6" -> System.out.println("ProduitEtDivertissement()");
            case "7" -> System.out.println("BanqueEtMicroFinance()");
            case "0" -> PageSuivante();
            default -> System.out.println("choix invalide");
        }

    }

    public void PageSuivante() {
        while (true) {
            System.out.println("8 Mon identite");
            System.out.println("9 Configurer mon mobile");
            System.out.println("00 Page precedente");
            String choice = scanner.nextLine();

            switch (choice) {
                case "8" -> System.out.println("MonIdentite()");
                case "9" -> System.out.println("ConfigurerMonMobile()");
                case "00" -> Demarrer();
                default -> System.out.println("choix invalide");
            }
        }
    }
}
