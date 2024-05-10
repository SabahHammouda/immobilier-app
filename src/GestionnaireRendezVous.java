import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class GestionnaireRendezVous {
    private List<RendezVous> listeRendezVous;

    public GestionnaireRendezVous() {
        this.listeRendezVous = new ArrayList<>();
    }

    // Ajouter un rendez-vous
public void ajouterRendezVous(RendezVous nouveauRendezVous) {
    // Vérifier si un rendez-vous existe déjà pour le même bien immobilier à la même date et heure
    boolean conflit = listeRendezVous.stream()
            .anyMatch(rendezVous -> rendezVous.getBienImmobilier().equals(nouveauRendezVous.getBienImmobilier()) &&rendezVous.getDate().equals(nouveauRendezVous.getDate()));

    if (conflit) {
        System.out.println("Impossible d'ajouter le rendez-vous. Un rendez-vous existe déjà pour le même bien immobilier à la même date et heure.");
    } else {
        // Ajouter le rendez-vous à la liste
        listeRendezVous.add(nouveauRendezVous);
        System.out.println("Rendez-vous ajouté avec succès !");
    }
  } 

    // Supprimer un rendez-vous
    public void supprimerRendezVous(RendezVous rendezVous) {
        listeRendezVous.remove(rendezVous);
    }

    // Obtenir tous les rendez-vous
    public List<RendezVous> getTousLesRendezVous() {
        return listeRendezVous;
    }

    // Rechercher les rendez-vous pour un bien immobilier donné
    public List<RendezVous> rechercherRendezVousParBien(String bienImmobilier) {
        return listeRendezVous.stream()
                .filter(rendezVous -> rendezVous.getBienImmobilier().equals(bienImmobilier))
                   .collect(Collectors.toList());
    }

    // Rechercher les rendez-vous pour un agent immobilier donné
    public List<RendezVous> rechercherRendezVousParAgent(String agentImmobilier) {
        return listeRendezVous.stream()
                .filter(rendezVous -> rendezVous.getAgentImmobilier().equals(agentImmobilier))
                .collect(Collectors.toList());
    }

    // Rechercher les rendez-vous pour un client donné
    public List<RendezVous> rechercherRendezVousParClient(String client) {
        return listeRendezVous.stream()
                .filter(rendezVous -> rendezVous.getClient().equals(client))
                .collect(Collectors.toList());
    }
}
