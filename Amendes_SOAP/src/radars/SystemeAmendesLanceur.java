package radars;

import javax.xml.ws.Endpoint;
//A lancer en 1er avant le client
public class SystemeAmendesLanceur {
    public static void main(String[] args) {
        Endpoint.publish("http://localhost:9999/ws/amendes", new SystemeAmendesImpl());
    }

}
