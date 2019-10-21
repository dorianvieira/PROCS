
package radars;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour amende complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="amende"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="immatriculation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="numero" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="tarif" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "amende", propOrder = {
    "immatriculation",
    "numero",
    "tarif"
})
public class Amende {

    protected String immatriculation;
    protected int numero;
    protected int tarif;

    /**
     * Obtient la valeur de la propriété immatriculation.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImmatriculation() {
        return immatriculation;
    }

    /**
     * Définit la valeur de la propriété immatriculation.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImmatriculation(String value) {
        this.immatriculation = value;
    }

    /**
     * Obtient la valeur de la propriété numero.
     * 
     */
    public int getNumero() {
        return numero;
    }

    /**
     * Définit la valeur de la propriété numero.
     * 
     */
    public void setNumero(int value) {
        this.numero = value;
    }

    /**
     * Obtient la valeur de la propriété tarif.
     * 
     */
    public int getTarif() {
        return tarif;
    }

    /**
     * Définit la valeur de la propriété tarif.
     * 
     */
    public void setTarif(int value) {
        this.tarif = value;
    }

}
