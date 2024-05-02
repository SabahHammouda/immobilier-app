import java.util.ArrayList;
import java.util.List;

public class AgentImmobilier {
    private String nom;
    private List<BienImmobilier> biensGeres;

    public AgentImmobilier(String nom) {
        this.nom = nom;
        this.biensGeres = new ArrayList<>();
    }

    public void ajouterBien(BienImmobilier bien) {
        biensGeres.add(bien);
    }
}
