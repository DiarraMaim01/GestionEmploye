import java.util.ArrayList;
import java.util.Scanner;

public class GestionEmployes {
    public ArrayList<Employe> employees = new ArrayList<>();


    //ajouter un employé
    public void AddEmploye (){
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Saisissez les informations du nouvel employé");
        System.out.println(" Entrez le nom");
        String nom = scanner.nextLine();
        System.out.println(" Saisissez le salaire");
        double salaire = scanner.nextDouble();
        scanner.nextLine();
        System.out.println(" Saisissez le poste");
        String poste = scanner.nextLine();
        Employe newEmploye = new Employe(nom,salaire,poste);
        employees.add(newEmploye);
        System.out.println("employé ajouté avec succès ✅");
    }

    //aafficher la liste
    public void DisplayEmployes() {
        if (employees.isEmpty()) {
            System.out.println("Pas encore d'employés");
        } else {
            for (int i = 0; i < employees.size(); i++) {
                System.out.println((i + 1) + " - " + employees.get(i));
            }
        }
    }

}
