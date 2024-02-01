public class Avion extends Vehicule{
    private String compagnie;
    private float vitesseMax;

    public Avion(String nom, double prix, String compagnie, float vitesseMax) {
        super(nom, prix);
        this.compagnie = compagnie;
        this.vitesseMax = vitesseMax;
    }

    public String getCompagnie() {
        return compagnie;
    }

    public void setCompagnie(String compagnie) {
        this.compagnie = compagnie;
    }

    public float getVitesseMax() {
        return vitesseMax;
    }

    public void setVitesseMax(float vitesseMax) {
        this.vitesseMax = vitesseMax;
    }

    @Override
    public void emettreSon(){
        System.out.println("L'avion fait un bruit de moteur puissant.");
    }
}
