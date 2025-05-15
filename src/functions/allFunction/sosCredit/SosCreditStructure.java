package functions.allFunction.sosCredit;

import functions.allFunction.InvalidChoice;

import java.util.Scanner;

public class SosCreditStructure {
    private final Scanner scanner = new Scanner(System.in);
    private final InvalidChoice invalidChoice = new InvalidChoice();

    public void SosCredit() {
        while (true) {
            System.out.println(
                            "\n SOS Credit \n" +
                            "1 SOS credit a un ami \n" +
                            "2 SOS Credit a YAS \n" +
                            "3 SOS offre a YAS \n" +
                            "4 Rembourser SOS \n" +
                            "5 Aide");
            String choice = scanner.nextLine();
            switch(choice){
                case "1" -> System.out.println("SosCreditAmi()");
                case "2" -> System.out.println("SosCreditYas()");
                case "3" -> System.out.println("SosOffreYas()");
                case "4" -> System.out.println("RembourserSos()");
                case "5" -> System.out.println("Aide()");
                default -> invalidChoice.InvalidChoice();
            }
        }
    }
}
