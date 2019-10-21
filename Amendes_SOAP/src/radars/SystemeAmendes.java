package radars;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface SystemeAmendes {
    @WebMethod void enregistrer(Voiture v);
    @WebMethod int signaler(String immatriculation, String modele, int tarif);
    @WebMethod Amende[] lister(String immatriculation);
    @WebMethod void payer(int numero, String nom, String prenom);

}
