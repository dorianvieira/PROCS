package calculette;

import javax.xml.ws.Endpoint;

//C'est le service web WSDL/SOAP qu'on lance d'abord donc ici avant de lancer le CLIENT wsdl
public class CalculetteLanceur {
    public static void main(String[] args) {
        Endpoint.publish("http://localhost:9999/ws/calculatrice", new CalculetteImpl());
    }
}