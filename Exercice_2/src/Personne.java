public class Personne {
    public String nom;
    public String prenom;
    public String tel;
    public int age;

    public Personne(String nom, String prenom, String tel, int age) {
        this.nom = nom;
        this.prenom = prenom;
        this.tel = tel;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Personne{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", tel='" + tel + '\'' +
                ", age=" + age +
                '}';
    }
}
