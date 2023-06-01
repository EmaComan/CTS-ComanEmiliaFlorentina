package restaurant.template.main;

import restaurant.template.model.IMasa;
import restaurant.template.model.Masa;
import restaurant.template.model.MasaRezervata;

public class Main {
    public static void main(String[] args) {
        IMasa masa = new Masa(1);
        masa.ocupaMasa();

        IMasa masaRezervata = new MasaRezervata(2, "14:30");
        masaRezervata.ocupaMasa();
    }
}
