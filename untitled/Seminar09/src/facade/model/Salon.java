package facade.model;

import java.util.ArrayList;
import java.util.List;

public class Salon {
    private List<Integer> coduriPaduriLibere;

    public Salon() {
        this.coduriPaduriLibere = new ArrayList<>();
    }

    public void adaugaPatLiber(int codPat) {
        this.coduriPaduriLibere.add(codPat);
    }

    public boolean verificaPaturiLibere() {
        return this.coduriPaduriLibere.size() > 0; // sau cu .isEmplty
    }

    public void ocupaPat() {
        this.coduriPaduriLibere.remove(0);
    }
}
