public class Compte {
    private String numero;
    private double solde;
    private static int nbCompte;

    public Compte() {
        numero = "";
        solde = 0;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        nbCompte ++;
        this.numero = numero;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public void deposer(double montant){
        solde = solde + montant;
    }

    public void retirer(double montant){
        if(solde > montant){
            solde = solde - montant;
        }else {
            System.out.println("le solde est insuffisant");
        }
    }

    public void afficherCompteInfo(){
        System.out.println("le compte N°: "+numero+" a le solde suivant: "+solde);
    }

    public void afficherNbComptes(){
        System.out.println("toltal des comptes est : "+nbCompte);
    }
}
