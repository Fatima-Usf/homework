/**
 * Created by fatima YOUCEF and Mahdi ZAROUR  on 29/10/16.
 */
public class Main {
    public static void main(String[] args) {
        Personne p1 = new Personne("Fatima"," algerie");
        Personne p2 = new Personne("Ikram", " algerie");
        Personne p3= new Personne("Hakima", " espagne ");
        Personne p4 = new Personne("lila" , "France");
        Personne p5 = new Personne("Wisalle", "turkie ");
        Personne p6 = new Personne("eva", " algerie");

        System.out.println(" je suis "+ p1.getNom() + " j'ai de nv amis  ");
        p1.ajouterAmi(p6);
       p1.ajouterAmi(p2);
        p1.ajouterAmi(p3);
       p1.ajouterAmi(p4);
       p1.ajouterAmi(p5);

        System.out.println("La liste d'amis de " + p1.getNom() + " est ");
        p1.MaListeAmis();
        System.out.println(" La liste des Amis algériens de " + p1.getNom() + " est : ");
        p1.AmisAlgeriens();

        System.out.println("                                          "); // Pourquoi cet espace 
        System.out.println(" La liste des Amis etrangére de " + p1.getNom() + " est : ");
        p1.AmisEtrange();
    }
}

