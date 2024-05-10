import java.util.Date;

public class Paiement {
    private double montant;
    private Date date;

    public Paiement(double montant, Date date) {
        this.montant = montant;
        this.date = date;
    }

    public double getMontant() {
        return montant;
    }

    public Date getDate() {
        return date;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    
}
