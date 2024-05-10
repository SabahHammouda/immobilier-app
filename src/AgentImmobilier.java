import java.util.ArrayList;
import java.util.List;

public class AgentImmobilier {
    private String nom;
    private List<BienImmobilier> biensGeres;

    public AgentImmobilier(String nom) {
        this.nom = nom;
        this.biensGeres = new ArrayList<>();
    }

    public String getNom() {
        return nom;
    }

    public void ajouterBien(BienImmobilier bien) {
        biensGeres.add(bien);
    }

    public void rechercherBiensParType(String type) {
        for (BienImmobilier bien : biensGeres) {
            if (bien.getType().equals(type)) {
                System.out.println(bien.getDescription());
            }
        }
    }

    public void supprimerBien(BienImmobilier bien) {
        biensGeres.remove(bien);
    }

    public void afficherBiensGeres() {
        System.out.println("Biens gérés par l'agent " + nom + " :");
        for (BienImmobilier bien : biensGeres) {
            System.out.println("Type: " + bien.getType() + ", Localisation: " + bien.getLocalisation() + ", Prix: " + bien.getPrix());
        }
    }
}
