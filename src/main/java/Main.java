package main.java;

import main.java.allFunctions.monIdentite.MonIdentiteStructure;
import main.java.allFunctions.mvola.MvolaStructure;
import main.java.allFunctions.rappelleMoi.RappelleMoiStructure;
import main.java.allFunctions.serviceYas.ServiceYasStructure;
import main.java.allFunctions.sosCredit.SosCreditStructure;
import main.java.allFunctions.scanner.UssdStructure;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        UssdStructure ussdStructure = new UssdStructure();
        MvolaStructure mvolaStructure = new MvolaStructure();
        RappelleMoiStructure rappelleMoiStructure = new RappelleMoiStructure();
        SosCreditStructure sosCreditStructure = new SosCreditStructure();
        ServiceYasStructure serviceYasStructure = new ServiceYasStructure();
        MonIdentiteStructure monIdentiteStructure = new MonIdentiteStructure();


        ussdStructure.setMvolaStructure(mvolaStructure);
        ussdStructure.setRappelleMoiStructure(rappelleMoiStructure);
        ussdStructure.setSosCreditStructure(sosCreditStructure);
        ussdStructure.setServiceYasStructure(serviceYasStructure);
        ussdStructure.setMonIdentiteStructure(monIdentiteStructure);
        mvolaStructure.setUssdStructure(ussdStructure);
        ussdStructure.Demarrer();
    }
}