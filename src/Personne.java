import java.util.ArrayList;

/**
 * Created by fatima YOUCEF and Mahdi ZAROUR on 29/10/16.
 */
public class Personne {

    private String nom;
    private String nationalite;
    private int nbAmis = 0;
    private ArrayList<Personne>Amis = new ArrayList<>();

    public Personne(String nom, String nationalite,ArrayList<Personne>Amis)
    {
        this.nom = nom;

        this.nationalite = nationalite;

        this.Amis = Amis;
    }

    public Personne (String nom, String nationalite) {
        this.nom=nom;
        this.nationalite = nationalite;
    }
    public Personne(Personne autre) {
        this.nom = autre.nom;
        this.nationalite = autre.nationalite;

    }



    public String getNom() {
        return this.nom;
    }

    public String getNationalite() {
        return this.nationalite;
    }

    public int getNbAmis() {
        return nbAmis;
    }

    public void setNbAmis() {

        this.nbAmis = nbAmis;
    }

    public String toString() {
        return nom + " de " + nationalite;
    }

    public void ajouterAmi(Personne p) {
        Amis.add(p);
 nbAmis++;
    }
    public void MaListeAmis(){
        for (int i = 0; i < Amis.size(); i++) {
            System.out.println((i + 1)+ "  " + Amis.get(i));

        }
    }

    public void AmisAlgeriens(){
        for (int i = 0; i <Amis.size(); i++) {
            if (this.nationalite.equals(Amis.get(i).getNationalite()))
            System.out.println(" * " + Amis.get(i).getNom());
        }
    }

    public void AmisEtrange(){
        for (int i = 0; i < this.Amis.size(); i++) {
            if (!this.nationalite.equals(Amis.get(i).getNationalite())){
                System.out.println("* " + Amis.get(i).getNom());
            }

        }
    }


 }


