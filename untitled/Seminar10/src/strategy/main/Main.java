package strategy.main;

import strategy.model.Operator;
import strategy.model.VerificarePersoanaFizica;
import strategy.model.VerificarePersoanaJuridica;

public class Main {
    public static void main(String[] args) {
        Operator operator = new Operator();
        operator.verificaClient();

        operator.setModVerificare(new VerificarePersoanaJuridica());
        operator.verificaClient();
    }
}
