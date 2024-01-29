public class ApplicationLivre {
    public static void main(String... args){
        Adherent adherent = new Adherent("adh1","prenomAdh1","06283748498",30);
        Auteur auteur = new Auteur("au1","prenomAu1","0333748498",30);
        Livre livre = new Livre();
        livre.setIsbn(1);
        livre.setTitre("titre1");
        livre.setAuteur(auteur);
        System.out.println(adherent.toString());
        System.out.println(livre.toString());
    }
}
