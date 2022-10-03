
public class Personne {

    /*
        Nom de la personne
     */
    private String nom;

    /*
        Prénom
     */
    private String prenom;

    /*
        Age de la personne
     */
    private int date_de_naissance;
    /*
        Statut de la personne
     */
    private boolean statut;
    /*
        Civilité de la personne
     */
    private Civilite civilite;

    /*
        Numéro de la personne
     */
    static int numeroPersonne =0;

    public Personne(Civilite civilite, String nom, String prenom, int date_de_naissance, boolean statut){
        this.nom = nom;
        this.prenom = prenom;
        this.date_de_naissance = date_de_naissance;
        this.civilite = civilite;
        this.statut = statut;
        String statu = "";
        if (statut==true){
            statu = "célibataire";
        }
        numeroPersonne ++;
        System.out.println("Naissance de la " + numeroPersonne);
    }

    public Personne(Civilite civilite, String nom, String prenom, int date_de_naissance){
        this(civilite, nom, prenom, date_de_naissance, null);

    }

   @Override
    public String toString(){
        String result = civilite + " " + prenom + " " + nom + " né en " + date_de_naissance + " est " + statu;
    }
}

