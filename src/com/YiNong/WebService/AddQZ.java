
package com.YiNong.WebService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>anonymous complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="mid" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="jobid" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="attrid" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="work_years" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="low_price" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="hight_price" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="jobplaceid" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="job_desc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="begintime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="endtime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
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
    "jobid",
    "attrid",
    "workYears",
    "lowPrice",
    "hightPrice",
    "jobplaceid",
    "jobDesc",
    "begintime",
    "endtime",
    "contactPhone",
    "contactName"
})
@XmlRootElement(name = "AddQZ")
public class AddQZ {

    protected int mid;
    protected int jobid;
    protected int attrid;
    @XmlElement(name = "work_years")
    protected int workYears;
    @XmlElement(name = "low_price")
    protected double lowPrice;
    @XmlElement(name = "hight_price")
    protected double hightPrice;
    protected int jobplaceid;
    @XmlElement(name = "job_desc")
    protected String jobDesc;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar begintime;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endtime;
    @XmlElement(name = "contact_phone")
    protected String contactPhone;
    @XmlElement(name = "contact_name")
    protected String contactName;

    /**
     * 获取mid属性的值。
     * 
     */
    public int getMid() {
        return mid;
    }

    /**
     * 设置mid属性的值。
     * 
     */
    public void setMid(int value) {
        this.mid = value;
    }

    /**
     * 获取jobid属性的值。
     * 
     */
    public int getJobid() {
        return jobid;
    }

    /**
     * 设置jobid属性的值。
     * 
     */
    public void setJobid(int value) {
        this.jobid = value;
    }

    /**
     * 获取attrid属性的值。
     * 
     */
    public int getAttrid() {
        return attrid;
    }

    /**
     * 设置attrid属性的值。
     * 
     */
    public void setAttrid(int value) {
        this.attrid = value;
    }

    /**
     * 获取workYears属性的值。
     * 
     */
    public int getWorkYears() {
        return workYears;
    }

    /**
     * 设置workYears属性的值。
     * 
     */
    public void setWorkYears(int value) {
        this.workYears = value;
    }

    /**
     * 获取lowPrice属性的值。
     * 
     */
    public double getLowPrice() {
        return lowPrice;
    }

    /**
     * 设置lowPrice属性的值。
     * 
     */
    public void setLowPrice(double value) {
        this.lowPrice = value;
    }

    /**
     * 获取hightPrice属性的值。
     * 
     */
    public double getHightPrice() {
        return hightPrice;
    }

    /**
     * 设置hightPrice属性的值。
     * 
     */
    public void setHightPrice(double value) {
        this.hightPrice = value;
    }

    /**
     * 获取jobplaceid属性的值。
     * 
     */
    public int getJobplaceid() {
        return jobplaceid;
    }

    /**
     * 设置jobplaceid属性的值。
     * 
     */
    public void setJobplaceid(int value) {
        this.jobplaceid = value;
    }

    /**
     * 获取jobDesc属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJobDesc() {
        return jobDesc;
    }

    /**
     * 设置jobDesc属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJobDesc(String value) {
        this.jobDesc = value;
    }

    /**
     * 获取begintime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBegintime() {
        return begintime;
    }

    /**
     * 设置begintime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBegintime(XMLGregorianCalendar value) {
        this.begintime = value;
    }

    /**
     * 获取endtime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndtime() {
        return endtime;
    }

    /**
     * 设置endtime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndtime(XMLGregorianCalendar value) {
        this.endtime = value;
    }

    /**
     * 获取contactPhone属性的值。
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
     * 设置contactPhone属性的值。
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
     * 获取contactName属性的值。
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
     * 设置contactName属性的值。
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
