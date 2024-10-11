import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class CorFactory {
    private static Map<String, Cor> map = new HashMap<>();

    public static Cor tipoCor(

            String cor
            ){

        Cor tipoCor = map.get(cor);



        tipoCor = new Cor( cor);
        map.put(cor, tipoCor);

        return  tipoCor;
    }
}
