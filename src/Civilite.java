/**
 * Revoir les énumération
 */

public enum Civilite {
    MONSIEUR("M."),
    MADAME("Mme"),
    MADEMOISELLE("Mille");

    private String titre;

    private Civilite(String titre){
        this.titre = titre;
    }

    public String toString(){
        return this.titre;
    }

}
