import java.util.ArrayList;
import java.util.Scanner;

public class GestionEmployes {

    private final ArrayList<Employe> employees = new ArrayList<>();

    public static final Scanner SC = new Scanner(System.in);

    //ajout d'employé
    public void AddEmploye(Employe employe) {
        employees.add(employe);
        System.out.println("Employé ajouté avec succès ✅✅");
    }

    // Saisies
    public Employe saisirEmploye() {
        System.out.println(" Saisissez les informations du nouvel employé");
        System.out.print(" Entrez le nom: ");
        String nom = SC.nextLine();

        System.out.print(" Saisissez le salaire: ");
        double salaire = lireDouble();

        System.out.print(" Saisissez le poste: ");
        String poste = SC.nextLine();

        return new Employe(nom, salaire, poste);
    }

    public Manager saisirManager() {
        System.out.println(" Saisissez les informations du nouveau manager");
        System.out.print(" Entrez le nom: ");
        String nom = SC.nextLine();

        System.out.print(" Saisissez le salaire: ");
        double salaire = lireDouble();

        System.out.print(" Saisissez le poste: ");
        String poste = SC.nextLine();

        System.out.print(" Saisissez la prime: ");
        double prime = lireDouble();

        return new Manager(nom, salaire, poste, prime);
    }

    public Stagiaire saisirStagiaire() {
        System.out.println(" Saisissez les informations du nouveau stagiaire");
        System.out.print(" Entrez le nom: ");
        String nom = SC.nextLine();

        System.out.print(" Saisissez le salaire: ");
        double salaire = lireDouble();

        System.out.print(" Saisissez le poste: ");
        String poste = SC.nextLine();

        System.out.print(" Saisissez la durée de stage: ");
        String dureeStage = SC.nextLine();

        return new Stagiaire(nom, salaire, poste, dureeStage);
    }

    // Helper pour fiabiliser la saisie des nombres
    private double lireDouble() {
        while (!SC.hasNextDouble()) {
            System.out.print("Veuillez saisir un nombre: ");
            SC.nextLine();
        }
        double v = SC.nextDouble();
        SC.nextLine();
        return v;
    }

    //  Affichage liste
    public void DisplayEmployes() {
        if (employees.isEmpty()) {
            System.out.println("Pas encore d'employés");
        } else {
            for (int i = 0; i < employees.size(); i++) {
                System.out.println((i + 1) + " - " + employees.get(i));
            }
        }
    }

    // Recherche par nom
    public Employe chercherEmploye(String nom) {
        String cible = nom.trim();
        for (Employe employe : employees) {
            if (employe.getNom().equalsIgnoreCase(cible)) {
                return employe;
            }
        }
        System.out.println("Aucun employé de ce nom");
        return null;
    }
}
