
package com.YiNong.WebService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="Pageindex" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Pagesize" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="quest_catalog_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "questCatalogId",
    "startdate",
    "enddate"
})
@XmlRootElement(name = "GetWTList")
public class GetWTList {

    @XmlElement(name = "Pageindex")
    protected int pageindex;
    @XmlElement(name = "Pagesize")
    protected int pagesize;
    @XmlElement(name = "quest_catalog_id")
    protected int questCatalogId;
    protected String startdate;
    protected String enddate;

    /**
     * 获取pageindex属性的值。
     * 
     */
    public int getPageindex() {
        return pageindex;
    }

    /**
     * 设置pageindex属性的值。
     * 
     */
    public void setPageindex(int value) {
        this.pageindex = value;
    }

    /**
     * 获取pagesize属性的值。
     * 
     */
    public int getPagesize() {
        return pagesize;
    }

    /**
     * 设置pagesize属性的值。
     * 
     */
    public void setPagesize(int value) {
        this.pagesize = value;
    }

    /**
     * 获取questCatalogId属性的值。
     * 
     */
    public int getQuestCatalogId() {
        return questCatalogId;
    }

    /**
     * 设置questCatalogId属性的值。
     * 
     */
    public void setQuestCatalogId(int value) {
        this.questCatalogId = value;
    }

    /**
     * 获取startdate属性的值。
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
     * 设置startdate属性的值。
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
     * 获取enddate属性的值。
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
     * 设置enddate属性的值。
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
