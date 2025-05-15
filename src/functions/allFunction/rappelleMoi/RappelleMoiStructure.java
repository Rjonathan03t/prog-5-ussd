package functions.allFunction.rappelleMoi;

import java.util.Scanner;

public class RappelleMoiStructure {
    private final Scanner scanner = new Scanner(System.in);
    public void RappeleMoi(){
        while(true) {
            System.out.println("Rappelle moi");
            System.out.println("1 Envoyer un rappelle moi");
            System.out.println("2 Aide");
            int choice = scanner.nextInt();

            switch(choice){
                case 1 -> System.out.println("EnvoyerUnRappelleMoi()");
                case 2 -> System.out.println("Aide()");
                default -> System.out.println("choix invalide");
            }
        }
    }
}
