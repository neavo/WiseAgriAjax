
package com.YiNong.WebService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="Pageindex" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Pagesize" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="startdate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="enddate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "pageindex",
    "pagesize",
    "status",
    "startdate",
    "enddate"
})
@XmlRootElement(name = "GetQGList")
public class GetQGList {

    @XmlElement(name = "Pageindex")
    protected int pageindex;
    @XmlElement(name = "Pagesize")
    protected int pagesize;
    @XmlElement(name = "Status")
    protected int status;
    protected String startdate;
    protected String enddate;

    /**
     * ��ȡpageindex���Ե�ֵ��
     * 
     */
    public int getPageindex() {
        return pageindex;
    }

    /**
     * ����pageindex���Ե�ֵ��
     * 
     */
    public void setPageindex(int value) {
        this.pageindex = value;
    }

    /**
     * ��ȡpagesize���Ե�ֵ��
     * 
     */
    public int getPagesize() {
        return pagesize;
    }

    /**
     * ����pagesize���Ե�ֵ��
     * 
     */
    public void setPagesize(int value) {
        this.pagesize = value;
    }

    /**
     * ��ȡstatus���Ե�ֵ��
     * 
     */
    public int getStatus() {
        return status;
    }

    /**
     * ����status���Ե�ֵ��
     * 
     */
    public void setStatus(int value) {
        this.status = value;
    }

    /**
     * ��ȡstartdate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartdate() {
        return startdate;
    }

    /**
     * ����startdate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartdate(String value) {
        this.startdate = value;
    }

    /**
     * ��ȡenddate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnddate() {
        return enddate;
    }

    /**
     * ����enddate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnddate(String value) {
        this.enddate = value;
    }

}
