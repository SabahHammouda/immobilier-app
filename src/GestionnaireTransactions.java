import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GestionnaireTransactions {
    private List<Transaction> transactions;
    private List<Contrat> contrats;

    public GestionnaireTransactions() {
        this.transactions = new ArrayList<>();
        this.contrats = new ArrayList<>();
    }

    public void ajouterTransaction(Transaction transaction) {
        transactions.add(transaction);
    }

    public void genererContrat(String type, String bienImmobilier, String client, Date dateDebut, Date dateFin, double montant) {
        contrats.add(new Contrat(type, bienImmobilier, client, dateDebut, dateFin, montant));
    }
}
