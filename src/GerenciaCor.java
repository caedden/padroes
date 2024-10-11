import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class GerenciaCor {
    private List<Forma> cores = new ArrayList<>();
     CorFactory corFactory = new CorFactory();
    public void gerenciaCor( int posicao, String cor, String formato) {
        Cor tipoCor = CorFactory.tipoCor(cor);
    Forma forma = new  Forma(posicao,tipoCor,formato);
        cores.add(forma);
    }

    public void apresentar() {
        for (Forma forma : cores) {
            System.out.println(forma.toString());
        }
    }
}
