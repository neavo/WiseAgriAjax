
package com.YiNong.WebService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>anonymous complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="mid" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="product_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="low_price" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="high_price" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="is_discuss" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="product_desc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="begin_time" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="end_time" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="contact_phone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contact_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "mid",
    "productName",
    "lowPrice",
    "highPrice",
    "isDiscuss",
    "productDesc",
    "beginTime",
    "endTime",
    "contactPhone",
    "contactName"
})
@XmlRootElement(name = "AddQG")
public class AddQG {

    protected int mid;
    @XmlElement(name = "product_name")
    protected String productName;
    @XmlElement(name = "low_price")
    protected double lowPrice;
    @XmlElement(name = "high_price")
    protected double highPrice;
    @XmlElement(name = "is_discuss")
    protected String isDiscuss;
    @XmlElement(name = "product_desc")
    protected String productDesc;
    @XmlElement(name = "begin_time", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar beginTime;
    @XmlElement(name = "end_time", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endTime;
    @XmlElement(name = "contact_phone")
    protected String contactPhone;
    @XmlElement(name = "contact_name")
    protected String contactName;

    /**
     * ��ȡmid���Ե�ֵ��
     * 
     */
    public int getMid() {
        return mid;
    }

    /**
     * ����mid���Ե�ֵ��
     * 
     */
    public void setMid(int value) {
        this.mid = value;
    }

    /**
     * ��ȡproductName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductName() {
        return productName;
    }

    /**
     * ����productName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductName(String value) {
        this.productName = value;
    }

    /**
     * ��ȡlowPrice���Ե�ֵ��
     * 
     */
    public double getLowPrice() {
        return lowPrice;
    }

    /**
     * ����lowPrice���Ե�ֵ��
     * 
     */
    public void setLowPrice(double value) {
        this.lowPrice = value;
    }

    /**
     * ��ȡhighPrice���Ե�ֵ��
     * 
     */
    public double getHighPrice() {
        return highPrice;
    }

    /**
     * ����highPrice���Ե�ֵ��
     * 
     */
    public void setHighPrice(double value) {
        this.highPrice = value;
    }

    /**
     * ��ȡisDiscuss���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsDiscuss() {
        return isDiscuss;
    }

    /**
     * ����isDiscuss���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsDiscuss(String value) {
        this.isDiscuss = value;
    }

    /**
     * ��ȡproductDesc���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductDesc() {
        return productDesc;
    }

    /**
     * ����productDesc���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductDesc(String value) {
        this.productDesc = value;
    }

    /**
     * ��ȡbeginTime���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBeginTime() {
        return beginTime;
    }

    /**
     * ����beginTime���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBeginTime(XMLGregorianCalendar value) {
        this.beginTime = value;
    }

    /**
     * ��ȡendTime���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndTime() {
        return endTime;
    }

    /**
     * ����endTime���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndTime(XMLGregorianCalendar value) {
        this.endTime = value;
    }

    /**
     * ��ȡcontactPhone���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactPhone() {
        return contactPhone;
    }

    /**
     * ����contactPhone���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactPhone(String value) {
        this.contactPhone = value;
    }

    /**
     * ��ȡcontactName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactName() {
        return contactName;
    }

    /**
     * ����contactName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactName(String value) {
        this.contactName = value;
    }

}
