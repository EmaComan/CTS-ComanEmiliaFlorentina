package flyweight.main;

import flyweight.model.Cont;
import flyweight.model.Detinator;
import flyweight.model.FlyweightFactory;
import flyweight.model.IClientBanca;

public class Main {
    public static void main(String[] args) {
        FlyweightFactory fabrica = new FlyweightFactory();
        Cont cont1 = new Cont(2300f, 12);
        Cont cont2 = new Cont(4000f, 14);
        Cont cont3 = new Cont(5000f, 15);

        IClientBanca detinator1 = fabrica.getDestinatar("Ion", "0714253698", "Ghionea");
        detinator1.descriere(cont1);

        fabrica.getDestinatar("Maria", "0789562314", "Ulmi").descriere(cont2);
        fabrica.getDestinatar("Ion", "0714253698", "Ghionea").descriere(cont3);
        fabrica.getDestinatar("Maria", "0789562314", "Ulmi").descriere(cont1);
    }
}
