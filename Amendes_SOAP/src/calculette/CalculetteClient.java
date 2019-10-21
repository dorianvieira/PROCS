package calculette;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.URL;

public class CalculetteClient {

    public static void main(String[] args) throws Exception {
        URL url = new URL("http://localhost:9999/ws/calculatrice?wsdl");
        QName qname = new QName("http://calculette/", "CalculetteImplService");
        Service service = Service.create(url, qname);
        Calculette c = service.getPort(Calculette.class);
        System.out.println(c.ajouter(2,3));
        System.out.println(c.soustraire(5,3));

    }

    }
