import java.util.Date;

public class Contrat {
    private String type;
    private String bienImmobilier;
    private String client;
    private Date dateDebut;
    private Date dateFin;
    private double montant;

    public Contrat(String type, String bienImmobilier, String client, Date dateDebut, Date dateFin, double montant) {
        this.type = type;
        this.bienImmobilier = bienImmobilier;
        this.client = client;
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
        this.montant = montant;
    }

    public String getType() {
        return type;
    }
    public String getBienImmobilier() {
        return bienImmobilier;
    }

    public String getClient() {
        return client;
    }

    public Date getDateDebut() {
        return dateDebut;
    }

    public Date getDateFin() {
        return dateFin;
    }

    public double getMontant() {
        return montant;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setBienImmobilier(String bienImmobilier) {
        this.bienImmobilier = bienImmobilier;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public void setDateDebut(Date dateDebut) {
        this.dateDebut = dateDebut;
    }

    public void setDateFin(Date dateFin) {
        this.dateFin = dateFin;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }
    
}
