import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GestionEmployes gestionEmployes = new GestionEmployes();

        Scanner scanner = GestionEmployes.SC;

        int choix =0 ;
        do {
            System.out.println("\n==== MENU ====");
            System.out.println("1. Liste des employés");
            System.out.println("2. Ajouter un employé");
            System.out.println("3. Rechercher un employé");
            System.out.println("4. Quitter");
            System.out.print("Votre choix : ");

            if (!scanner.hasNextInt()) {
                System.out.println("Entrée invalide. Tapez un chiffre (1-4).");
                scanner.nextLine();
                continue;
            }
            choix = scanner.nextInt();
            scanner.nextLine();

            switch (choix) {
                case 1:
                    System.out.println("==== Liste des employés ====");
                    gestionEmployes.DisplayEmployes();
                    break;

                case 2:
                    System.out.println("Type à ajouter : 1) Employé  2) Manager  3) Stagiaire");
                    if (!scanner.hasNextInt()) {
                        System.out.println("Entrée invalide.");
                        scanner.nextLine();
                        break;
                    }
                    int decision = scanner.nextInt();
                    scanner.nextLine();

                    Employe employe;
                    switch (decision) {
                        case 1:
                            System.out.println("==== Ajout d'un Employé ====");
                            employe = gestionEmployes.saisirEmploye();
                            gestionEmployes.AddEmploye(employe);
                            break;
                        case 2:
                            System.out.println("==== Ajout d'un Manager ====");
                            employe = gestionEmployes.saisirManager();
                            gestionEmployes.AddEmploye(employe);
                            break;
                        case 3:
                            System.out.println("==== Ajout d'un Stagiaire ====");
                            employe = gestionEmployes.saisirStagiaire();
                            gestionEmployes.AddEmploye(employe);
                            break;
                        default:
                            System.out.println("Veuillez choisir 1, 2 ou 3.");
                    }
                    break;

                case 3:
                    System.out.println("==== Recherche employé ====");
                    System.out.print("Saisissez le nom : ");
                    String nom = scanner.nextLine();
                    Employe result = gestionEmployes.chercherEmploye(nom);
                    if (result != null) {
                        System.out.println("Trouvé :\n" + result);
                    }
                    break;

                case 4:
                    System.out.println("Fermeture du programme...");
                    break;

                default:
                    System.out.println("Choix invalide, veuillez réessayer.");
            }
        } while (choix != 4);

    }
}
