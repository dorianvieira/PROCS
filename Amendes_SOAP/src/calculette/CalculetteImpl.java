package calculette;

import javax.jws.WebService;

@WebService(endpointInterface = "calculette.Calculette")

public class CalculetteImpl implements Calculette {

    @Override
    public int ajouter(int num1, int num2){
        return num1+num2;
    }

    @Override
    public int soustraire(int num1, int num2) {
        return num1-num2;
    }
}
