import java.awt.*;

public class Forma {

        private int tamanho;
        private Cor cor;
        private String formato;

        public Forma(int tamanho, Cor cor, String formato) {
            this.tamanho = tamanho;
            this.cor = cor;
            this.formato = formato;
        }

    @Override
    public String toString() {
        return "Forma{" +
                "cor=" + this.cor.getCor() +
                ", tamanho=" + this.tamanho +
                ", formato='" + this.formato + '\'' +
                '}';
    }
}
