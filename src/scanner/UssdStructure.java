package scanner;

import functions.allFunction.InvalidChoice;
import functions.allFunction.mvola.MvolaStructure;
import functions.allFunction.rappelleMoi.RappelleMoiStructure;
import functions.allFunction.sosCredit.SosCreditStructure;

import java.util.Scanner;

public class UssdStructure {
    private final Scanner scanner = new Scanner(System.in);
    private final InvalidChoice invalidChoice= new InvalidChoice();
    private MvolaStructure mvolaStructure;
    private RappelleMoiStructure rappelleMoiStructure;
    private SosCreditStructure sosCreditStructure;

    public void setMvolaStructure(MvolaStructure mvolaStructure) {
        this.mvolaStructure = mvolaStructure;
    }

    public void setRappelleMoiStructure(RappelleMoiStructure rappelleMoiStructure) {
        this.rappelleMoiStructure = rappelleMoiStructure;
    }

    public void setSosCreditStructure (SosCreditStructure sosCreditStructure){
        this.sosCreditStructure = sosCreditStructure;
    }

    public void Demarrer() {
        while (true) {
            System.out.println(
                    "YAS et MOI \n" +
                            "1 Mvola \n" +
                            "2 Rappelle moi \n" +
                            "3 SOS Credit \n" +
                            "4 Service YAS \n" +
                            "5 Promotion \n" +
                            "6 Produits et Divertissment \n" +
                            "7 Banques et Micro-finances \n" +
                            "0 Page suivante");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1" -> mvolaStructure.Mvola();
                case "2" -> rappelleMoiStructure.RappeleMoi();
                case "3" -> sosCreditStructure.SosCredit();
                case "4" -> System.out.println("ServiceYas()");
                case "5" -> System.out.println("Promotion()");
                case "6" -> System.out.println("ProduitEtDivertissement()");
                case "7" -> System.out.println("BanqueEtMicroFinance()");
                case "0" -> PageSuivante();
                default -> invalidChoice.InvalidChoice();
            }
        }
    }

    public void PageSuivante() {
        while (true) {
            System.out.println(
                    "\n 8 Mon identite \n" +
                            "9 Configurer mon mobile \n" +
                            "00 Page precendente");
            String choice = scanner.nextLine();

            switch (choice) {
                case "8" -> System.out.println("MonIdentite()");
                case "9" -> System.out.println("ConfigurerMonMobile()");
                case "00" -> Demarrer();
                default -> invalidChoice.InvalidChoice();
            }
        }
    }
}
