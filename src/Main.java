import java.awt.*;

public class Main {
    public static void main(String[] args) {
        GerenciaCor gerenciador = new GerenciaCor();
        gerenciador.gerenciaCor(0, "vermelho", "10");
        gerenciador.gerenciaCor(5, "Verde", "20");
        gerenciador.gerenciaCor(2, "vermelho", "15");

        gerenciador.apresentar();
    }
}