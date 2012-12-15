
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
 *         &lt;element name="job_catalog_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="job_attr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="work_years" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="low_price" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="hight_price" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="is_discuss" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="recruit_num" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="job_place_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="job_desc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="begin_time" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="end_time" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="corp_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contact_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contact_phone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "jobCatalogId",
    "jobAttr",
    "workYears",
    "lowPrice",
    "hightPrice",
    "isDiscuss",
    "recruitNum",
    "jobPlaceId",
    "jobDesc",
    "beginTime",
    "endTime",
    "corpName",
    "contactName",
    "contactPhone"
})
@XmlRootElement(name = "AddZP")
public class AddZP {

    protected int mid;
    @XmlElement(name = "job_catalog_id")
    protected int jobCatalogId;
    @XmlElement(name = "job_attr")
    protected String jobAttr;
    @XmlElement(name = "work_years")
    protected int workYears;
    @XmlElement(name = "low_price")
    protected double lowPrice;
    @XmlElement(name = "hight_price")
    protected double hightPrice;
    @XmlElement(name = "is_discuss")
    protected String isDiscuss;
    @XmlElement(name = "recruit_num")
    protected int recruitNum;
    @XmlElement(name = "job_place_id")
    protected int jobPlaceId;
    @XmlElement(name = "job_desc")
    protected String jobDesc;
    @XmlElement(name = "begin_time", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar beginTime;
    @XmlElement(name = "end_time", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endTime;
    @XmlElement(name = "corp_name")
    protected String corpName;
    @XmlElement(name = "contact_name")
    protected String contactName;
    @XmlElement(name = "contact_phone")
    protected String contactPhone;

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
     * 获取jobCatalogId属性的值。
     * 
     */
    public int getJobCatalogId() {
        return jobCatalogId;
    }

    /**
     * 设置jobCatalogId属性的值。
     * 
     */
    public void setJobCatalogId(int value) {
        this.jobCatalogId = value;
    }

    /**
     * 获取jobAttr属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJobAttr() {
        return jobAttr;
    }

    /**
     * 设置jobAttr属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJobAttr(String value) {
        this.jobAttr = value;
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
     * 获取isDiscuss属性的值。
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
     * 设置isDiscuss属性的值。
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
     * 获取recruitNum属性的值。
     * 
     */
    public int getRecruitNum() {
        return recruitNum;
    }

    /**
     * 设置recruitNum属性的值。
     * 
     */
    public void setRecruitNum(int value) {
        this.recruitNum = value;
    }

    /**
     * 获取jobPlaceId属性的值。
     * 
     */
    public int getJobPlaceId() {
        return jobPlaceId;
    }

    /**
     * 设置jobPlaceId属性的值。
     * 
     */
    public void setJobPlaceId(int value) {
        this.jobPlaceId = value;
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
     * 获取beginTime属性的值。
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
     * 设置beginTime属性的值。
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
     * 获取endTime属性的值。
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
     * 设置endTime属性的值。
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
     * 获取corpName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorpName() {
        return corpName;
    }

    /**
     * 设置corpName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorpName(String value) {
        this.corpName = value;
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

}
