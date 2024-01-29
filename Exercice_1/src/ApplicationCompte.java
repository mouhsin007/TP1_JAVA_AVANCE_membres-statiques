public class ApplicationCompte {

    public static void main(String... args){

        Compte compte = new Compte();

        compte.setNumero("A1");
        compte.setSolde(1000);
        compte.deposer(30);
        compte.retirer(300);
        compte.afficherCompteInfo();
        compte.afficherNbComptes();
    }
}
