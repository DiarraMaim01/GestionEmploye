public class Manager extends Employe{
    double prime ;

    public Manager (String nom, double salaire,String poste, double prime){
    super(nom, salaire, poste);
    this.prime = prime;
    }

    public double getPrime() {
        return this.prime;
    }
    public void setPrime(double prime) {
        if(prime < 0){
            System.out.println("prime invalide");
        }
        this.prime = prime;
    }

    @Override
    public String toString() {
        return "Nom : " + getNom() + "\nSalaire : " + getSalaire() + "\nPoste : " + getPoste() + "\nprime: " + prime + "\nsalaire total :" + (getSalaire()+prime);
    }
}
