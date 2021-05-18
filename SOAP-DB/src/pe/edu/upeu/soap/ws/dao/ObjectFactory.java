
package pe.edu.upeu.soap.ws.dao;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the pe.edu.upeu.soap.ws.dao package. 
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

    private final static QName _ReadVenta_QNAME = new QName("http://dao.ws.soap.upeu.edu.pe/", "readVenta");
    private final static QName _ReadVentaResponse_QNAME = new QName("http://dao.ws.soap.upeu.edu.pe/", "readVentaResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: pe.edu.upeu.soap.ws.dao
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ReadVenta }
     * 
     */
    public ReadVenta createReadVenta() {
        return new ReadVenta();
    }

    /**
     * Create an instance of {@link ReadVentaResponse }
     * 
     */
    public ReadVentaResponse createReadVentaResponse() {
        return new ReadVentaResponse();
    }

    /**
     * Create an instance of {@link Cliente }
     * 
     */
    public Cliente createCliente() {
        return new Cliente();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadVenta }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dao.ws.soap.upeu.edu.pe/", name = "readVenta")
    public JAXBElement<ReadVenta> createReadVenta(ReadVenta value) {
        return new JAXBElement<ReadVenta>(_ReadVenta_QNAME, ReadVenta.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadVentaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dao.ws.soap.upeu.edu.pe/", name = "readVentaResponse")
    public JAXBElement<ReadVentaResponse> createReadVentaResponse(ReadVentaResponse value) {
        return new JAXBElement<ReadVentaResponse>(_ReadVentaResponse_QNAME, ReadVentaResponse.class, null, value);
    }

}
