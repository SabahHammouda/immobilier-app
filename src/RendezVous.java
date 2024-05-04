import java.time.LocalDateTime;

public class RendezVous {
    private LocalDateTime date;
    private BienImmobilier bienImmobilier;
    private Client client;

    public RendezVous(Date date, BienImmobilier bienImmobilier, Client client) {
        this.date = date;
        this.bienImmobilier = bienImmobilier;
        this.client = client;
    }

      public LocalDateTime getDate() {
        return date;
    }
      
    public BienImmobilier getBienImmobilier() {
        return bienImmobilier;
    }

    public Client getClient() {
        return client;
    }

    // Méthodes supplémentaires peuvent être ajoutées selon les besoins
}
