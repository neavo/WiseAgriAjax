
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
     * ��ȡjobid���Ե�ֵ��
     * 
     */
    public int getJobid() {
        return jobid;
    }

    /**
     * ����jobid���Ե�ֵ��
     * 
     */
    public void setJobid(int value) {
        this.jobid = value;
    }

    /**
     * ��ȡattrid���Ե�ֵ��
     * 
     */
    public int getAttrid() {
        return attrid;
    }

    /**
     * ����attrid���Ե�ֵ��
     * 
     */
    public void setAttrid(int value) {
        this.attrid = value;
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
     * ��ȡjobplaceid���Ե�ֵ��
     * 
     */
    public int getJobplaceid() {
        return jobplaceid;
    }

    /**
     * ����jobplaceid���Ե�ֵ��
     * 
     */
    public void setJobplaceid(int value) {
        this.jobplaceid = value;
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
     * ��ȡbegintime���Ե�ֵ��
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
     * ����begintime���Ե�ֵ��
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
     * ��ȡendtime���Ե�ֵ��
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
     * ����endtime���Ե�ֵ��
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
