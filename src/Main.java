import function.mvola.MvolaStructure;
import scanner.UssdStructure;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        UssdStructure ussdStructure = new UssdStructure();
        MvolaStructure mvolaStructure = new MvolaStructure();

        ussdStructure.setMvolaStructure(mvolaStructure);
        mvolaStructure.setUssdStructure(ussdStructure);
        ussdStructure.Demarrer();
    }
}