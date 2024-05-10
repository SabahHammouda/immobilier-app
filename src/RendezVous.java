import java.time.LocalDateTime;

public class RendezVous {
    private String bienImmobilier;
    private String agentImmobilier;
    private String client;
    private LocalDateTime date;
    private String commentaire;

    public RendezVous(String bienImmobilier, String agentImmobilier, String client, LocalDateTime date, String commentaire) {
        this.bienImmobilier = bienImmobilier;
        this.agentImmobilier = agentImmobilier;
        this.client = client;
        this.date = date;
        this.commentaire = commentaire;
    }

    // Getters et setters pour tous les attributs
    public String getBienImmobilier() {
        return bienImmobilier;
    }

    public void setBienImmobilier(String bienImmobilier) {
        this.bienImmobilier = bienImmobilier;
    }

    public String getAgentImmobilier() {
        return agentImmobilier;
    }

    public void setAgentImmobilier(String agentImmobilier) {
        this.agentImmobilier = agentImmobilier;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public String getCommentaire() {
        return commentaire;
    }

    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }

    // Méthode toString() redéfinie pour obtenir une représentation textuelle du rendez-vous.
    @Override
    public String toString() {
        return "Rendez-vous pour le bien : " + bienImmobilier + ", Agent : " + agentImmobilier +
                ", Client : " + client + ", Date : " + date + ", Commentaire : " + commentaire;
    }
}
