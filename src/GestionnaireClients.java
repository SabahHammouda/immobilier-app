public class GestionnaireClients {
    private List<Client> clients;

    public GestionnaireClients() {
        this.clients = new ArrayList<>();
    }

    public void ajouterClient(Client client) {
        clients.add(client);
    }

    public void modifierClient(Client client, String type, Map<String, String> informations) {
        client.setType(type);
        client.setInformations(informations);
    }

    public void supprimerClient(Client client) {
        clients.remove(client);
    }
}
