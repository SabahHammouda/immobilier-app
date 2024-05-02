import java.util.ArrayList;
import java.util.List;


public class GestionnaireBiens {
    private List<BienImmobilier> biens;

    public GestionnaireBiens() {
        this.biens = new ArrayList<>();
    }

    public void ajouterBien(BienImmobilier bien) {
        biens.add(bien);
    }

    public List<BienImmobilier> rechercherBiens(double prixMax, String type, String localisation) {
        List<BienImmobilier> resultats = new ArrayList<>();
        for (BienImmobilier bien : biens) {
            if (bien.getPrix() <= prixMax &&
                bien.getType().equals(type) &&
                bien.getLocalisation().equals(localisation)) {
                resultats.add(bien);
            }
        }
        return resultats;
    }

    public void modifierBien(BienImmobilier bien, String type, double taille, double prix, String localisation, String description) {
        bien.setType(type);
        bien.setTaille(taille);
        bien.setPrix(prix);
        bien.setLocalisation(localisation);
        bien.setDescription(description);
    }

    public void supprimerBien(BienImmobilier bien) {
        biens.remove(bien);
    }
}
