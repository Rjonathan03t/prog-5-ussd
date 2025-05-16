import functions.allFunction.monIdentite.MonIdentiteStructure;
import functions.allFunction.mvola.MvolaStructure;
import functions.allFunction.rappelleMoi.RappelleMoiStructure;
import functions.allFunction.serviceYas.ServiceYasStructure;
import functions.allFunction.sosCredit.SosCreditStructure;
import scanner.UssdStructure;

import java.util.Timer;

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