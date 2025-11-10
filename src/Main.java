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
            System.out.println("4. Supprimer un employé");
            System.out.println("5. Calculer la masse salariale");
            System.out.println("6. Quitter");
            System.out.print("Votre choix : ");

            if (!scanner.hasNextInt()) {
                System.out.println("Entrée invalide. Tapez un chiffre (1-6).");
                scanner.nextLine();
                continue;
            }
            choix = scanner.nextInt();
            scanner.nextLine();

            switch (choix) {
                case 1:
                    System.out.println("==== Liste des employés ====");
                    gestionEmployes.displayEmployes();
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
                            gestionEmployes.addEmploye(employe);
                            break;
                        case 2:
                            System.out.println("==== Ajout d'un Manager ====");
                            employe = gestionEmployes.saisirManager();
                            gestionEmployes.addEmploye(employe);
                            break;
                        case 3:
                            System.out.println("==== Ajout d'un Stagiaire ====");
                            employe = gestionEmployes.saisirStagiaire();
                            gestionEmployes.addEmploye(employe);
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
                    System.out.println("==== Suppression employé ====");
                    System.out.print("Saisissez le nom : ");
                    String cible = scanner.nextLine();
                    Employe emp = gestionEmployes.chercherEmploye(cible);
                    if (emp == null) break;

                    System.out.println(emp);
                    System.out.print("Supprimer cet employé ?  1) oui  2) non : ");
                    if (!scanner.hasNextInt()) {
                        System.out.println("Entrée invalide, retour menu.");
                        scanner.nextLine();
                        break;
                    }
                    int confirmation = scanner.nextInt();
                    scanner.nextLine();
                    if (confirmation == 1) {
                        gestionEmployes.supprimerEmploye(cible);
                    } else {
                        System.out.println("Annulé, retour au menu.");
                    }
                    break;

                case 5:
                    double masse = gestionEmployes.calculMasseSalariale();
                    System.out.printf("Masse salariale : %.2f%n", masse);
                    break;
                case 6:
                    System.out.println("Fermeture du programme...");
                    break;

                default:
                    System.out.println("Choix invalide, veuillez réessayer.");
            }
        } while (choix != 6);

    }
}
