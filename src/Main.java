import functions.allFunction.mvola.MvolaStructure;
import functions.allFunction.rappelleMoi.RappelleMoiStructure;
import functions.allFunction.sosCredit.SosCreditStructure;
import scanner.UssdStructure;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        UssdStructure ussdStructure = new UssdStructure();
        MvolaStructure mvolaStructure = new MvolaStructure();
        RappelleMoiStructure rappelleMoiStructure = new RappelleMoiStructure();
        SosCreditStructure sosCreditStructure = new SosCreditStructure();

        ussdStructure.setMvolaStructure(mvolaStructure);
        ussdStructure.setRappelleMoiStructure(rappelleMoiStructure);
        ussdStructure.setSosCreditStructure(sosCreditStructure);
        mvolaStructure.setUssdStructure(ussdStructure);
        ussdStructure.Demarrer();
    }
}