
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
    "pagesize"
})
@XmlRootElement(name = "GetTownList")
public class GetTownList {

    @XmlElement(name = "Pageindex")
    protected int pageindex;
    @XmlElement(name = "Pagesize")
    protected int pagesize;

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

}
