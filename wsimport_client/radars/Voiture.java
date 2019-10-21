
package radars;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour voiture complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="voiture"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="immatriculation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="modele" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="proprietaire" type="{http://radars/}personne" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "voiture", propOrder = {
    "immatriculation",
    "modele",
    "proprietaire"
})
public class Voiture {

    protected String immatriculation;
    protected String modele;
    protected Personne proprietaire;

    /**
     * Obtient la valeur de la propri�t� immatriculation.
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
     * D�finit la valeur de la propri�t� immatriculation.
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
     * Obtient la valeur de la propri�t� modele.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModele() {
        return modele;
    }

    /**
     * D�finit la valeur de la propri�t� modele.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModele(String value) {
        this.modele = value;
    }

    /**
     * Obtient la valeur de la propri�t� proprietaire.
     * 
     * @return
     *     possible object is
     *     {@link Personne }
     *     
     */
    public Personne getProprietaire() {
        return proprietaire;
    }

    /**
     * D�finit la valeur de la propri�t� proprietaire.
     * 
     * @param value
     *     allowed object is
     *     {@link Personne }
     *     
     */
    public void setProprietaire(Personne value) {
        this.proprietaire = value;
    }

}
