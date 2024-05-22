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

    
    
}
