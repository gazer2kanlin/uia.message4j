//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.07.30 at 08:34:42 \u4e0a\u5348 CST 
//


package uia.message.model.xml;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the uia.message.model.xml package. 
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

    private final static QName _DataEx_QNAME = new QName("http://message.uia/model/xml", "DataEx");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: uia.message.model.xml
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PropType }
     * 
     */
    public PropType createPropType() {
        return new PropType();
    }

    /**
     * Create an instance of {@link BlockSpaceType }
     * 
     */
    public BlockSpaceType createBlockSpaceType() {
        return new BlockSpaceType();
    }

    /**
     * Create an instance of {@link BitBlockListType }
     * 
     */
    public BitBlockListType createBitBlockListType() {
        return new BitBlockListType();
    }

    /**
     * Create an instance of {@link BlockCodecType }
     * 
     */
    public BlockCodecType createBlockCodecType() {
        return new BlockCodecType();
    }

    /**
     * Create an instance of {@link BitBlockType }
     * 
     */
    public BitBlockType createBitBlockType() {
        return new BitBlockType();
    }

    /**
     * Create an instance of {@link BitBlockSeqType }
     * 
     */
    public BitBlockSeqType createBitBlockSeqType() {
        return new BitBlockSeqType();
    }

    /**
     * Create an instance of {@link CodecPropSetType }
     * 
     */
    public CodecPropSetType createCodecPropSetType() {
        return new CodecPropSetType();
    }

    /**
     * Create an instance of {@link DataExType }
     * 
     */
    public DataExType createDataExType() {
        return new DataExType();
    }

    /**
     * Create an instance of {@link MessageSpaceType }
     * 
     */
    public MessageSpaceType createMessageSpaceType() {
        return new MessageSpaceType();
    }

    /**
     * Create an instance of {@link BlockCodecSpaceType }
     * 
     */
    public BlockCodecSpaceType createBlockCodecSpaceType() {
        return new BlockCodecSpaceType();
    }

    /**
     * Create an instance of {@link BitBlockRefType }
     * 
     */
    public BitBlockRefType createBitBlockRefType() {
        return new BitBlockRefType();
    }

    /**
     * Create an instance of {@link MessageType }
     * 
     */
    public MessageType createMessageType() {
        return new MessageType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataExType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://message.uia/model/xml", name = "DataEx")
    public JAXBElement<DataExType> createDataEx(DataExType value) {
        return new JAXBElement<DataExType>(_DataEx_QNAME, DataExType.class, null, value);
    }

}
