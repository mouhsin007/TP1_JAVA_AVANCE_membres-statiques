public class Auteur extends Personne{
    private int numAuteur;

    public Auteur(String nom, String prenom, String tel, int age) {
        super(nom, prenom, tel, age);
    }

    @Override
    public String toString() {
        return "Auteur{" +
                "numAuteur=" + numAuteur +
                '}';
    }
}
