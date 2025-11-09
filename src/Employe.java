import java.util.ArrayList;
import java.util.Scanner;

public class Employe {
    private String nom ;
    private double salaire ;
    private String poste ;

    Employe (String nom, double salaire, String poste) {
        this.nom= nom;
        this.salaire = salaire ;
        this.poste = poste ;
    }

    public String getNom(){
        return nom;
    }
    public void setNom(String nom){
        this.nom = nom;
    }
    public double getSalaire(){
        return salaire;
    }
    public void setSalaire(double salaire){
        if(salaire<0){
            System.out.println("Le salaire n'est pas valide");
        }
        this.salaire = salaire ;
    }
    public String getPoste(){
        return poste;
    }
    public void setPoste(String poste){
        this.poste = poste;
    }
    @Override
    public String toString() {
        return "Nom : " + nom + "\nSalaire : " + salaire + "\nPoste : " + poste;
    }

}
