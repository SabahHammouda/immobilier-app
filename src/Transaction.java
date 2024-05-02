import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Transaction {
    private String type;
    private String bienImmobilier;
    private String client;
    private Date dateTransaction;
    private double montant;
    private List<Paiement> paiements;

    public Transaction(String type, String bienImmobilier, String client, double montant) {
        this.type = type;
        this.bienImmobilier = bienImmobilier;
        this.client = client;
        this.montant = montant;
        this.dateTransaction = new Date();
        this.paiements = new ArrayList<>();
    }

    public void enregistrerPaiement(double montant, Date date) {
        paiements.add(new Paiement(montant, date));
    }
}
