import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class RendezVous {
    private String bienImmobilier;
    private String agentImmobilier;
    private String client;
    private Date date;
    private String commentaire;

    public RendezVous(String bienImmobilier, String agentImmobilier, String client, Date date, String commentaire) {
        this.bienImmobilier = bienImmobilier;
        this.agentImmobilier = agentImmobilier;
        this.client = client;
        this.date = date;
        this.commentaire = commentaire;
    }
}
