public class Ingénieur extends Employe{

    private String spécialité;

    public Ingénieur(String spécialité) {
        this.spécialité = spécialité;
    }

    public Ingénieur(String nom, String prenom, String email, String tel, double salaire, String spécialité) {
        super(nom, prenom, email, tel, salaire);
        this.spécialité = spécialité;
    }

    public String getSpécialité() {
        return spécialité;
    }

    public void setSpécialité(String spécialité) {
        this.spécialité = spécialité;
    }

    @Override
    public double calculerSalire() {
        return getSalaire()+getSalaire() * 0.15;
    }

    @Override
    public String toString() {
        return "Ingénieur{" +
                "nom="+getNom()+ '\'' +
                "prenom="+getPrenom()+ '\'' +
                "email="+getEmail()+ '\'' +
                "tel="+getTel()+ '\'' +
                "salaire="+getSalaire()+ '\'' +
                "spécialité='" + spécialité + '\'' +

                '}';
    }
}
