package main.java.allFunctions.scanner;

import main.java.allFunctions.InvalidChoice;
import main.java.allFunctions.monIdentite.MonIdentiteStructure;
import main.java.allFunctions.mvola.MvolaStructure;
import main.java.allFunctions.rappelleMoi.RappelleMoiStructure;
import main.java.allFunctions.serviceYas.ServiceYasStructure;
import main.java.allFunctions.sosCredit.SosCreditStructure;

import java.util.Scanner;

public class UssdStructure {
    private final Scanner scanner = new Scanner(System.in);
    private final InvalidChoice invalidChoice= new InvalidChoice();
    private MvolaStructure mvolaStructure;
    private RappelleMoiStructure rappelleMoiStructure;
    private SosCreditStructure sosCreditStructure;
    private ServiceYasStructure serviceYasStructure;
    private MonIdentiteStructure monIdentiteStructure;

    public void setMvolaStructure(MvolaStructure mvolaStructure) {
        this.mvolaStructure = mvolaStructure;
    }

    public void setRappelleMoiStructure(RappelleMoiStructure rappelleMoiStructure) {
        this.rappelleMoiStructure = rappelleMoiStructure;
    }

    public void setSosCreditStructure (SosCreditStructure sosCreditStructure){
        this.sosCreditStructure = sosCreditStructure;
    }

    public void setServiceYasStructure (ServiceYasStructure serviceYasStructure){
        this.serviceYasStructure = serviceYasStructure;
    }

    public void setMonIdentiteStructure(MonIdentiteStructure monIdentiteStructure){
        this.monIdentiteStructure = monIdentiteStructure;
    }

    public void Demarrer() {
        while (true) {
            System.out.println(
                    "\n YAS et MOI \n" +
                            "1 Mvola \n" +
                            "2 Rappelle moi \n" +
                            "3 SOS Credit \n" +
                            "4 Service YAS \n" +
                            "0 Page suivante");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1" -> mvolaStructure.Mvola();
                case "2" -> rappelleMoiStructure.RappeleMoi();
                case "3" -> sosCreditStructure.SosCredit();
                case "4" -> serviceYasStructure.ServiceYas();
                case "0" -> PageSuivante();
                default -> invalidChoice.InvalidChoice();
            }
        }
    }

    public void PageSuivante() {
        while (true) {
            System.out.println(
                    "\n 5 Mon identite \n" +
                            "00 Page precendente");
            String choice = scanner.nextLine();

            switch (choice) {
                case "5" -> monIdentiteStructure.MonIdentite();
                case "00" -> Demarrer();
                default -> invalidChoice.InvalidChoice();
            }
        }
    }
}
