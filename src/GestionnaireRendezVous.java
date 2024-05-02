import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class GestionnaireRendezVous {
    private Map<Date, RendezVous> rendezVous;

    public GestionnaireRendezVous() {
        this.rendezVous = new HashMap<>();
    }

    public void ajouterRendezVous(RendezVous rdv) {
        rendezVous.put(rdv.getDate(), rdv);
    }

    public void supprimerRendezVous(Date date) {
        rendezVous.remove(date);
    }
}
