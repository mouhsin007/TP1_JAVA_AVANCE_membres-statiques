import java.util.Date;

public class ApplicationVehicule {
    public static void main(String... args){
        Vehicule v1 = new Voiture("v1",200000,"m1",new Date());
        v1.emettreSon();
        Vehicule v2= new Moto("m1",23400,"MS234","44w");
        v2.emettreSon();
        Vehicule v3= new Avion("m1",2340000,"buing",1000);
        v3.emettreSon();
        v1.afficherInformations();
        v2.afficherInformations();
        v3.afficherInformations();
    }
}
