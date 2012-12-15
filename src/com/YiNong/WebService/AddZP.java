
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
     * ��ȡjobCatalogId���Ե�ֵ��
     * 
     */
    public int getJobCatalogId() {
        return jobCatalogId;
    }

    /**
     * ����jobCatalogId���Ե�ֵ��
     * 
     */
    public void setJobCatalogId(int value) {
        this.jobCatalogId = value;
    }

    /**
     * ��ȡjobAttr���Ե�ֵ��
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
     * ����jobAttr���Ե�ֵ��
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
     * ��ȡworkYears���Ե�ֵ��
     * 
     */
    public int getWorkYears() {
        return workYears;
    }

    /**
     * ����workYears���Ե�ֵ��
     * 
     */
    public void setWorkYears(int value) {
        this.workYears = value;
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
     * ��ȡhightPrice���Ե�ֵ��
     * 
     */
    public double getHightPrice() {
        return hightPrice;
    }

    /**
     * ����hightPrice���Ե�ֵ��
     * 
     */
    public void setHightPrice(double value) {
        this.hightPrice = value;
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
     * ��ȡrecruitNum���Ե�ֵ��
     * 
     */
    public int getRecruitNum() {
        return recruitNum;
    }

    /**
     * ����recruitNum���Ե�ֵ��
     * 
     */
    public void setRecruitNum(int value) {
        this.recruitNum = value;
    }

    /**
     * ��ȡjobPlaceId���Ե�ֵ��
     * 
     */
    public int getJobPlaceId() {
        return jobPlaceId;
    }

    /**
     * ����jobPlaceId���Ե�ֵ��
     * 
     */
    public void setJobPlaceId(int value) {
        this.jobPlaceId = value;
    }

    /**
     * ��ȡjobDesc���Ե�ֵ��
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
     * ����jobDesc���Ե�ֵ��
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
     * ��ȡcorpName���Ե�ֵ��
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
     * ����corpName���Ե�ֵ��
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

}
