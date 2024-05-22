public class BienImmobilier {
    private String type;
    private String taille;
    private String prix;
    private String localisation;
     

    public BienImmobilier(String type, String taille, String prix,String localisation  ) {
        this.type = type;
        this.taille = taille;
        this.prix = prix;
        this.localisation = localisation;
         
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTaille() {
        return taille;
    }

    public void setTaille(String taille) {
        this.taille = taille;
    }

    public String getPrix() {
        return prix;
    }

    
    public void setPrix(String prix) {
        this.prix = prix;
    }

    public String getLocalisation() {
        return localisation;
    }

    public void setLocalisation(String localisation) {
        this.localisation = localisation;
    }
    @Override
    public String toString()  {
       String affichage = "le Bien est de type :"+getType()+ " "+"sa taille est :"
               +getTaille()+" "+ "son Prix est : "+getPrix()+" "+ "et sa localisation est :" + getLocalisation();
        return affichage ;
     
     }
}