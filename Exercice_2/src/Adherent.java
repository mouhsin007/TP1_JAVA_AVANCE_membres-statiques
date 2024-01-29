public class Adherent extends Personne{
    private int numAdherent;

    public Adherent(String nom, String prenom, String tel, int age) {
        super(nom, prenom, tel, age);
    }

    @Override
    public String toString() {
        return "Adherent{" +
                "numAdherent=" + numAdherent +
                "nom="+nom+
                "prenom="+prenom+
                "tel="+tel+
                "age="+age+
                '}';
    }
}
