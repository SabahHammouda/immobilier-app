import java.util.ArrayList;
import java.util.List;

public class BienImmobilier {
    
    private String type;
    private double taille;
    private double prix;
    private String localisation;
    private String description;
    private AgentImmobilier agent;

    public BienImmobilier(String type, double taille, double prix, String localisation, String description) {
        this.type = type;
        this.taille = taille;
        this.prix = prix;
        this.localisation = localisation;
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getTaille() {
        return taille;
    }

    public void setTaille(double taille) {
        this.taille = taille;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public String getLocalisation() {
        return localisation;
    }

    public void setLocalisation(String localisation) {
        this.localisation = localisation;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public AgentImmobilier getAgent() {
        return agent;
    }

    public void setAgent(AgentImmobilier agent) {
        this.agent = agent;
    }

    

    

}
