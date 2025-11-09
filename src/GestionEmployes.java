import java.util.ArrayList;
import java.util.Scanner;

public class GestionEmployes {
    public ArrayList<Employe> employees = new ArrayList<>();


    //ajouter un employé
    public void AddEmploye (Employe employe){
        employees.add(employe);
        System.out.println(" employé ajouté avec succès ✅✅");

    }

    public Employe saisirEmploye (){
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Saisissez les informations du nouvel employé");
        System.out.println(" Entrez le nom");
        String nom = scanner.nextLine();
        System.out.println(" Saisissez le salaire");
        double salaire = scanner.nextDouble();
        scanner.nextLine();
        System.out.println(" Saisissez le poste");
        String poste = scanner.nextLine();

        return new Employe(nom,salaire,poste);
    }

    public Manager saisirManager(){
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Saisissez les informations du nouveau manager");
        System.out.println(" Entrez le nom");
        String nom = scanner.nextLine();
        System.out.println(" Saisissez le salaire");
        double salaire = scanner.nextDouble();
        scanner.nextLine();
        System.out.println(" Saisissez le poste");
        String poste = scanner.nextLine();

        System.out.println(" Saisissez la prime");
        double prime = scanner.nextDouble();
        scanner.nextLine();

        return new Manager(nom,salaire,poste,prime);

    }

    public Stagiaire saisirStagiaire(){
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Saisissez les informations du nouveau manager");
        System.out.println(" Entrez le nom");
        String nom = scanner.nextLine();
        System.out.println(" Saisissez le salaire");
        double salaire = scanner.nextDouble();
        scanner.nextLine();
        System.out.println(" Saisissez le poste");
        String poste = scanner.nextLine();

        System.out.println(" Saisissez la prime");
        String dureeStage = scanner.nextLine();

        return new Stagiaire(nom,salaire,poste,dureeStage);

    }




    //aafficher la liste d'employés
    public void DisplayEmployes() {
        if (employees.isEmpty()) {
            System.out.println("Pas encore d'employés");
        } else {
            for (int i = 0; i < employees.size(); i++) {
                System.out.println((i + 1) + " - " + employees.get(i));
            }
        }
    }

    //

}
