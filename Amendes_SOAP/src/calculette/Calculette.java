package calculette;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface Calculette {
    @WebMethod int ajouter(int num1,int num2);
    @WebMethod int soustraire(int num1,int num2);

}