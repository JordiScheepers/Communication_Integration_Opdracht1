
package nl.hu.fnt.gsos.wsinterface;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the nl.hu.fnt.gsos.wsinterface package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _MinTemp_QNAME = new QName("/entities/climat", "minTemp");
    private final static QName _NameMonth_QNAME = new QName("/entities/climat", "nameMonth");
    private final static QName _MeanSunDays_QNAME = new QName("/entities/climat", "meanSunDays");
    private final static QName _NumberMonth_QNAME = new QName("/entities/climat", "numberMonth");
    private final static QName _NameCountry_QNAME = new QName("/entities/climat", "nameCountry");
    private final static QName _MaxTemp_QNAME = new QName("/entities/climat", "maxTemp");
    private final static QName _SeaTemp_QNAME = new QName("/entities/climat", "seaTemp");
    private final static QName _CodeCountry_QNAME = new QName("/entities/climat", "codeCountry");
    private final static QName _MeanRainDays_QNAME = new QName("/entities/climat", "meanRainDays");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: nl.hu.fnt.gsos.wsinterface
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ResponseClimat }
     * 
     */
    public ResponseClimat createResponseClimat() {
        return new ResponseClimat();
    }

    /**
     * Create an instance of {@link RequestClimat }
     * 
     */
    public RequestClimat createRequestClimat() {
        return new RequestClimat();
    }

    /**
     * Create an instance of {@link RequestClimat.Country }
     * 
     */
    public RequestClimat.Country createRequestClimatCountry() {
        return new RequestClimat.Country();
    }

    /**
     * Create an instance of {@link ResponseClimat.Climat }
     * 
     */
    public ResponseClimat.Climat createResponseClimatClimat() {
        return new ResponseClimat.Climat();
    }

    /**
     * Create an instance of {@link Fault }
     * 
     */
    public Fault createFault() {
        return new Fault();
    }

    /**
     * Create an instance of {@link RequestClimat.Country.Month }
     * 
     */
    public RequestClimat.Country.Month createRequestClimatCountryMonth() {
        return new RequestClimat.Country.Month();
    }

    /**
     * Create an instance of {@link ResponseClimat.Climat.Country }
     * 
     */
    public ResponseClimat.Climat.Country createResponseClimatClimatCountry() {
        return new ResponseClimat.Climat.Country();
    }

    /**
     * Create an instance of {@link ResponseClimat.Climat.Month }
     * 
     */
    public ResponseClimat.Climat.Month createResponseClimatClimatMonth() {
        return new ResponseClimat.Climat.Month();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/entities/climat", name = "minTemp")
    public JAXBElement<Integer> createMinTemp(Integer value) {
        return new JAXBElement<Integer>(_MinTemp_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/entities/climat", name = "nameMonth")
    public JAXBElement<String> createNameMonth(String value) {
        return new JAXBElement<String>(_NameMonth_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/entities/climat", name = "meanSunDays")
    public JAXBElement<Integer> createMeanSunDays(Integer value) {
        return new JAXBElement<Integer>(_MeanSunDays_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/entities/climat", name = "numberMonth")
    public JAXBElement<Integer> createNumberMonth(Integer value) {
        return new JAXBElement<Integer>(_NumberMonth_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/entities/climat", name = "nameCountry")
    public JAXBElement<String> createNameCountry(String value) {
        return new JAXBElement<String>(_NameCountry_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/entities/climat", name = "maxTemp")
    public JAXBElement<Integer> createMaxTemp(Integer value) {
        return new JAXBElement<Integer>(_MaxTemp_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/entities/climat", name = "seaTemp")
    public JAXBElement<Integer> createSeaTemp(Integer value) {
        return new JAXBElement<Integer>(_SeaTemp_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/entities/climat", name = "codeCountry")
    public JAXBElement<String> createCodeCountry(String value) {
        return new JAXBElement<String>(_CodeCountry_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/entities/climat", name = "meanRainDays")
    public JAXBElement<Integer> createMeanRainDays(Integer value) {
        return new JAXBElement<Integer>(_MeanRainDays_QNAME, Integer.class, null, value);
    }

}
