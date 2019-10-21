package fr.paris10.miage.procs.exercice1;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.URL;

public class HelloWorldClient {

    public static void main(String[] args) throws Exception {
        URL url = new URL("http://localhost:9999/ws/calculatrice?wsdl");
        QName qname = new QName("http://exercice1.procs.miage.paris10.fr/", "HelloWorldImplService");
        Service service = Service.create(url, qname);
        HelloWorld hello = service.getPort(HelloWorld.class);
        System.out.println(hello.bonjour("Bob"));
    }

}
