import java.util.ArrayList;
import java.util.Scanner;

public class GestionEmployes {

    private final ArrayList<Employe> employees = new ArrayList<>();

    public static final Scanner SC = new Scanner(System.in);

    //ajout d'employé
    public void addEmploye(Employe employe) {
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
    public void displayEmployes() {
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

    //supprimer un employé
    public void supprimerEmploye(String nom) {
        String cible = nom.trim();
        Employe employee = chercherEmploye(cible);
        if (employee != null) {
            employees.remove(employee);
            System.out.println("Employé supprimé avec succès ✅");
        } else {
            System.out.println("Aucune suppression (employé introuvable).");
        }
    }


    //calcul masse salariale
    public double calculMasseSalariale(){
        double masse = 0;
        for (Employe employe : employees) {
            masse += employe.getSalaire();
        }
        return masse;
    }
}
