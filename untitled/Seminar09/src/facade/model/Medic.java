package facade.model;

import java.util.ArrayList;
import java.util.List;

public class Medic {
    private List<Pacient> pacienti;

    public Medic() {
        this.pacienti = new ArrayList<>();
    }

    public void adaugaPacient(Pacient pacient) {
        this.pacienti.add(pacient);
    }

    public Pacient getPacient(String numePacient) {
        for (Pacient pacient : pacienti) {
            if (pacient.getNume().equals(numePacient)) {
                return pacient;
            }
        }
        return null;
    }

    public Boolean verificaTrimitere(Pacient pacient) {
        return this.pacienti.contains(pacient);
    }
}
