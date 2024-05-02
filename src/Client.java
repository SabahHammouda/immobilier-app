import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Client {
    private String nom;
    private String type; // Acheteur, locataire, vendeur, bailleur
    private Map<String, String> informations; // Informations supplémentaires sur le client
    private List<String> historiqueInteractions;

    public Client(String nom, String type) {
        this.nom = nom;
        this.type = type;
        this.informations = new HashMap<>();
        this.historiqueInteractions = new ArrayList<>();
    }

    public void ajouterInformation(String cle, String valeur) {
        informations.put(cle, valeur);
    }

    public void modifierInformation(String cle, String nouvelleValeur) {
        if (informations.containsKey(cle)) {
            informations.put(cle, nouvelleValeur);
        } else {
            System.out.println("Cette information n'existe pas pour ce client.");
        }
    }

    public void supprimerInformation(String cle) {
        informations.remove(cle);
    }

    public void ajouterInteraction(String interaction) {
        historiqueInteractions.add(interaction);
    } 
}
