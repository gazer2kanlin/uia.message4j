//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.11.06 at 03:31:29 PM CST 
//


package uia.message.model.xml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BitBlockSeqType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BitBlockSeqType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://message.uia/model/xml}BlockBaseType">
 *       &lt;sequence>
 *         &lt;choice maxOccurs="unbounded">
 *           &lt;element name="Block" type="{http://message.uia/model/xml}BitBlockType"/>
 *           &lt;element name="BlockList" type="{http://message.uia/model/xml}BitBlockListType"/>
 *           &lt;element name="BlockSeq" type="{http://message.uia/model/xml}BitBlockSeqType"/>
 *           &lt;element name="BlockSeqList" type="{http://message.uia/model/xml}BitBlockSeqListType"/>
 *           &lt;element name="BlockRef" type="{http://message.uia/model/xml}BitBlockRefType"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="className" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BitBlockSeqType", propOrder = {
    "blockOrBlockListOrBlockSeq"
})
@XmlSeeAlso({
    BitBlockSeqListType.class
})
public class BitBlockSeqType
    extends BlockBaseType
{

    @XmlElements({
        @XmlElement(name = "Block", type = BitBlockType.class),
        @XmlElement(name = "BlockList", type = BitBlockListType.class),
        @XmlElement(name = "BlockSeq", type = BitBlockSeqType.class),
        @XmlElement(name = "BlockSeqList", type = BitBlockSeqListType.class),
        @XmlElement(name = "BlockRef", type = BitBlockRefType.class)
    })
    protected List<BlockBaseType> blockOrBlockListOrBlockSeq;
    @XmlAttribute(name = "className", required = true)
    protected String className;

    /**
     * Gets the value of the blockOrBlockListOrBlockSeq property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the blockOrBlockListOrBlockSeq property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBlockOrBlockListOrBlockSeq().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BitBlockType }
     * {@link BitBlockListType }
     * {@link BitBlockSeqType }
     * {@link BitBlockSeqListType }
     * {@link BitBlockRefType }
     * 
     * 
     */
    public List<BlockBaseType> getBlockOrBlockListOrBlockSeq() {
        if (blockOrBlockListOrBlockSeq == null) {
            blockOrBlockListOrBlockSeq = new ArrayList<BlockBaseType>();
        }
        return this.blockOrBlockListOrBlockSeq;
    }

    /**
     * Gets the value of the className property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClassName() {
        return className;
    }

    /**
     * Sets the value of the className property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClassName(String value) {
        this.className = value;
    }

}
