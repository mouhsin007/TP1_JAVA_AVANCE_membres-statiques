public class ApplicationEmploye {

    public static void main(String... args){
        Employe e1 = new Ingénieur("i1","e1","eee@gmail.com","0302324924",12033,"it");
        Employe e2 = new Manager("i1","e1","eee@gmail.com","0302324924",12033,"it");

        e1.setSalaire(e1.calculerSalire());
        e2.setSalaire(e2.calculerSalire());
        System.out.println(e1.toString());
        System.out.println(e2.toString());

    }
}
