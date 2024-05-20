import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Client {
    private String nom;
     private String prenom;
    private String adresse; // Informations supplémentaires sur le client
     private String type; // Acheteur, locataire, vendeur, bailleur

    public Client(String nom, String prenom, String adresse, String type) {
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.type = type;
    }

    public String getAdresse() {
        return adresse;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getType() {
        return type;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setType(String type) {
        this.type = type;
    }
  

    @Override
    public String toString() {
     String affichage = "le nom de client est "+getNom()+" de prenom "+getPrenom()+" et l'adresse "+getAdresse()+" de type "+getType();
        return affichage;
    }
    
}
