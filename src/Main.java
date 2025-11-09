import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        GestionEmployes gestionEmployes = new GestionEmployes();
          Scanner scanner = new Scanner(System.in);
          System.out.println("Bienvenue sur ce système de gestion d'employés ");
          System.out.println("==== MENU ====");
          System.out.println("1. Liste des employés");
          System.out.println("2. ajouter un employé");

          System.out.println("votre choix");
          int choix = scanner.nextInt();
          switch (choix) {
              case 1:
                  System.out.println("==== Liste des employés ====");
                  gestionEmployes.DisplayEmployes();
                  break;

              case 2:
                  System.out.println("==== Ajout d'employé ====");
                  gestionEmployes.AddEmploye();
                  break;
          }
    }
}