//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.11.06 at 03:31:29 PM CST 
//


package uia.message.model.xml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BitBlockSeqListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BitBlockSeqListType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://message.uia/model/xml}BitBlockSeqType">
 *       &lt;attribute name="count" type="{http://www.w3.org/2001/XMLSchema}int" default="1" />
 *       &lt;attribute name="countBlock" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="countFactor" type="{http://www.w3.org/2001/XMLSchema}int" default="1" />
 *       &lt;attribute name="countFactorOp" type="{http://www.w3.org/2001/XMLSchema}string" default="/" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BitBlockSeqListType")
public class BitBlockSeqListType
    extends BitBlockSeqType
{

    @XmlAttribute(name = "count")
    protected Integer count;
    @XmlAttribute(name = "countBlock")
    protected String countBlock;
    @XmlAttribute(name = "countFactor")
    protected Integer countFactor;
    @XmlAttribute(name = "countFactorOp")
    protected String countFactorOp;

    /**
     * Gets the value of the count property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getCount() {
        if (count == null) {
            return  1;
        } else {
            return count;
        }
    }

    /**
     * Sets the value of the count property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCount(Integer value) {
        this.count = value;
    }

    /**
     * Gets the value of the countBlock property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountBlock() {
        return countBlock;
    }

    /**
     * Sets the value of the countBlock property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountBlock(String value) {
        this.countBlock = value;
    }

    /**
     * Gets the value of the countFactor property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getCountFactor() {
        if (countFactor == null) {
            return  1;
        } else {
            return countFactor;
        }
    }

    /**
     * Sets the value of the countFactor property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCountFactor(Integer value) {
        this.countFactor = value;
    }

    /**
     * Gets the value of the countFactorOp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountFactorOp() {
        if (countFactorOp == null) {
            return "/";
        } else {
            return countFactorOp;
        }
    }

    /**
     * Sets the value of the countFactorOp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountFactorOp(String value) {
        this.countFactorOp = value;
    }

}
