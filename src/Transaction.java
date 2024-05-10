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

     public String getType() {
        return type;
    }
    
    public String getBienImmobilier() {
        return bienImmobilier;
    }

    public String getClient() {
        return client;
    }

    public Date getDateTransaction() {
        return dateTransaction;
    }

    public double getMontant() {
        return montant;
    }

    public List<Paiement> getPaiements() {
        return paiements;
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

    public void setDateTransaction(Date dateTransaction) {
        this.dateTransaction = dateTransaction;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }

    public void setPaiements(List<Paiement> paiements) {
        this.paiements = paiements;
    }
     
    public void enregistrerPaiement(double montant, Date date) {
        paiements.add(new Paiement(montant, date));
    }
}
