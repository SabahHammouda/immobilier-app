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
}
