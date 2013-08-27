/*
 * Copyright 2013 EnergyOS.org
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.08.22 at 10:21:34 AM EDT 
//


package org.energyos.espi.datacustodian.domain;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.annotation.*;
import java.io.StringWriter;


/**
 * This is a root class to provide common naming attributes for all classes needing naming attributes
 * 
 * <p>Java class for IdentifiedObject complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IdentifiedObject">
 *   &lt;complexContent>
 *     &lt;extension base="{http://naesb.org/espi}Resource">
 *       &lt;sequence>
 *         &lt;element name="mRID" type="{http://naesb.org/espi}UUIDType" minOccurs="0"/>
 *         &lt;element name="description" type="{http://naesb.org/espi}String32" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IdentifiedObject", propOrder = {
    "mrid",
    "description"
})
@XmlSeeAlso({
    MeterReading.class,
    UsagePoint.class,
    ElectricPowerUsageSummary.class,
    TimeConfiguration.class,
    ApplicationInformation.class,
    Authorization.class,
    Subscription.class,
    ElectricPowerQualitySummary.class,
    IntervalBlock.class,
    ReadingType.class
})
@MappedSuperclass
public class IdentifiedObject
    extends Resource
{

    @XmlElement(name = "mRID")
    protected String mrid;
    protected String description;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @XmlTransient
    protected Long id;

    public boolean isNew() {
        return (this.id == null);
    }

    /**
     * Gets the value of the mrid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMRID() {
        return mrid;
    }

    /**
     * Sets the value of the mrid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMRID(String value) {
        this.mrid = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Sets the value of the id property.
     *
     * @param id
     *     allowed object is
     *     {@link Long }
     *
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Gets the value of the id property
     *
     * @return
     *     possible object is
     *     {@link Long }
     *
     */
    public Long getId() {
        return id;
    }

    public String marshal() throws JAXBException {
        StringWriter w = new StringWriter();
        JAXBContext context;
        context = JAXBContext.newInstance(this.getClass());
        Marshaller m = context.createMarshaller();
        m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        m.marshal(this, w);
        return w.toString();
    }


}