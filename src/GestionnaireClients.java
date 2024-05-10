import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

public class GestionnaireClients {

    private List<Client> clients;

    public GestionnaireClients() {
        this.clients = new ArrayList<>();
    }

    public void ajouterClient(String nom, String adresse, String telephone) {
        Map<String, String> informations = new HashMap<>();
        informations.put("nom", nom);
        informations.put("adresse", adresse);
        informations.put("telephone", telephone);
        clients.add(new Client(informations));
    }

    public void modifierTypeClient(Client client, String nouveauType) {
        client.setType(nouveauType);
    }

    public void modifierNomClient(Client client, String nouveauNom) {
        client.getInformations().put("nom", nouveauNom);
    }

    public void modifierAdresseClient(Client client, String nouvelleAdresse) {
        client.getInformations().put("adresse", nouvelleAdresse);
    }

    public void modifierTelephoneClient(Client client, String nouveauTelephone) {
        client.getInformations().put("telephone", nouveauTelephone);
    }

    public void supprimerClient(String nom) {
        Client clientASupprimer = null;
        for (Client client : clients) {
            if (client.getNom().equals(nom)) {
                clientASupprimer = client;
                break;
            }
        }
        if (clientASupprimer != null) {
            clients.remove(clientASupprimer);
        }
    }
}
