package radars;


import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.URL;

public class SystemeAmendesClient{
//a lancer apres le lanceur
    public static void main(String[] args) throws Exception{
        URL url=new URL("http://localhost:9999/ws/amendes?wsdl");
        QName qname=new QName("http://radars/","SystemeAmendesImplService");
        Service service=Service.create(url,qname);
        SystemeAmendes sys=service.getPort(SystemeAmendes.class);

        Voiture v1 = new Voiture("AB 123 CD", "Clio 3");
        Voiture v2 = new Voiture("AB 124 CD", "Punto");

        Personne p1 = new Personne("Sponge", "Bob", "");
        Personne p2 = new Personne("Haddock", "Capitaine", "");

        v1.setProprietaire(p1);
        v2.setProprietaire(p2);

        sys.enregistrer(v1);
        sys.enregistrer(v2);

        Amende a1 = new Amende("AB 123 CD", 90);
        int result = sys.signaler(a1.getImmatriculation(), v1.getModele(), a1.getTarif());
        System.out.println("Amende n°" + result + " enregistrée");

        Amende a2 = new Amende("AB 123 CD", 140);
        result = sys.signaler(a2.getImmatriculation(), "Tracteur", a2.getTarif());
        System.out.println("Amende n°" + result + " enregistrée");

        Amende a3 = new Amende("AB 123 CD", 140);
        result = sys.signaler(a3.getImmatriculation(), v1.getModele(), a3.getTarif());
        System.out.println("Amende n°" + result + " enregistrée");

        System.out.println("Listing des amendes pour " + v1.getImmatriculation());
        for(Amende a : sys.lister(v1.getImmatriculation())){
            if(a.getImmatriculation() != null) {
                System.out.println("Amende n°" + a.getNumero() + " de " + a.getTarif() + " EUR pour " + a.getImmatriculation());
            }
        }

        sys.payer(1, "Capitaine", "Haddock");

        System.out.println("Listing des amendes pour " + v1.getImmatriculation());
        for(Amende a : sys.lister(v1.getImmatriculation())){
            if(a.getImmatriculation() != null) {
                System.out.println("Amende n°" + a.getNumero() + " de " + a.getTarif() + " EUR pour " + a.getImmatriculation());
            }
        }

        sys.payer(1, "Sponge", "Bob");

        System.out.println("Listing des amendes pour " + v1.getImmatriculation());
        for(Amende a : sys.lister(v1.getImmatriculation())){
            if(a.getImmatriculation() != null) {
                System.out.println("Amende n°" + a.getNumero() + " de " + a.getTarif() + " EUR pour " + a.getImmatriculation());
            }
        }
    }

}
