import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GestionEmployes gestionEmployes = new GestionEmployes();
        Scanner scanner = new Scanner(System.in);
        int choix;

        do {
            System.out.println("\n==== MENU ====");
            System.out.println("1. Liste des employés");
            System.out.println("2. Ajouter un employé");
            System.out.println("3. Quitter");
            System.out.print("Votre choix : ");
            choix = scanner.nextInt();
            scanner.nextLine();

            switch (choix) {
                case 1:
                    System.out.println("==== Liste des employés ====");
                    gestionEmployes.DisplayEmployes();
                    break;

                case 2:
                    System.out.println("1)Employe 2) Manager 3) Stagiaire");
                   int  decision = scanner.nextInt();
                   Employe employe ;
                    scanner.nextLine();

                    switch (decision) {
                        case 1:
                            System.out.println("==== Ajout d'un employé ====");
                            employe = gestionEmployes.saisirEmploye();
                            gestionEmployes.AddEmploye(employe);
                            break;
                        case 2:
                            System.out.println("==== Ajout d'un Manaher ====");
                            employe =  gestionEmployes.saisirManager();
                            gestionEmployes.AddEmploye(employe);
                            break;
                        case 3:
                            System.out.println("==== Ajout d'un stagiaire ====");
                            employe =  gestionEmployes.saisirStagiaire();
                            gestionEmployes.AddEmploye(employe);
                            break ;
                        default:
                            System.out.println("Veuillez choisir un chiffre valide");
                    }
                    break;

                case 3:
                    System.out.println("Fermeture du programme...");
                    break;

                default:
                    System.out.println("Choix invalide, veuillez réessayer.");
            }
        } while (choix != 3);

        scanner.close();
    }
}
