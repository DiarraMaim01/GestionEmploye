public class Stagiaire extends Employe{
    String dureeStage ;

    public Stagiaire(String nom, double salaire,String poste, String dureeStage){
        super(nom,salaire,poste);
        this.dureeStage=dureeStage;
    }

    public String getDureeStage(){
        return dureeStage;
    }
    public void setDureeStage(String dureeStage){
        this.dureeStage=dureeStage;
    }

    @Override
    public String toString() {
        return "Nom : " +getNom() + "\nSalaire : " + getSalaire() + "\nPoste : " + getSalaire() + "\nDuree Stage : " + dureeStage;
    }


}
