public class Manager extends Employe{

    private String service;

    public Manager(String service) {
        this.service = service;
    }

    public Manager(String nom, String prenom, String email, String tel, double salaire, String service) {
        super(nom, prenom, email, tel, salaire);
        this.service = service;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    @Override
    public double calculerSalire() {
        return getSalaire()+getSalaire() * 0.20;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "nom="+getNom()+ '\'' +
                "prenom="+getPrenom()+ '\'' +
                "email="+getEmail()+ '\'' +
                "tel="+getTel()+ '\'' +
                "salaire="+getSalaire()+ '\'' +
                "service='" + service + '\'' +

                '}';
    }
}
