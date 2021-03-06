//
// Copyright (c) 2015 Kamil Baczkowicz
//
// CSOFF: a.*
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Timestamp removed by maven-replacer-plugin to avoid detecting changes - see the project POM for details
//


package pl.baczkowicz.mqttspy.stats.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.jvnet.jaxb2_commons.lang.CopyTo;
import org.jvnet.jaxb2_commons.lang.Copyable;
import org.jvnet.jaxb2_commons.lang.Equals;
import org.jvnet.jaxb2_commons.lang.HashCode;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.builder.CopyBuilder;
import org.jvnet.jaxb2_commons.lang.builder.JAXBCopyBuilder;
import org.jvnet.jaxb2_commons.lang.builder.JAXBEqualsBuilder;
import org.jvnet.jaxb2_commons.lang.builder.JAXBHashCodeBuilder;
import org.jvnet.jaxb2_commons.lang.builder.JAXBToStringBuilder;


/**
 * <p>Java class for MqttSpyStats complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MqttSpyStats">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="StartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Connections" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="Subscriptions" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="MessagesPublished" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="MessagesReceived" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
*/
@SuppressWarnings("all")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MqttSpyStats", propOrder = {
    "id",
    "startDate",
    "connections",
    "subscriptions",
    "messagesPublished",
    "messagesReceived"
})
public class MqttSpyStats
    implements CopyTo, Copyable, Equals, HashCode, ToString
{

    @XmlElement(name = "ID")
    protected long id;
    @XmlElement(name = "StartDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startDate;
    @XmlElement(name = "Connections")
    protected long connections;
    @XmlElement(name = "Subscriptions")
    protected long subscriptions;
    @XmlElement(name = "MessagesPublished")
    protected long messagesPublished;
    @XmlElement(name = "MessagesReceived")
    protected long messagesReceived;

    /**
     * Gets the value of the id property.
     * 
     */
    public long getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setID(long value) {
        this.id = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDate(XMLGregorianCalendar value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the connections property.
     * 
     */
    public long getConnections() {
        return connections;
    }

    /**
     * Sets the value of the connections property.
     * 
     */
    public void setConnections(long value) {
        this.connections = value;
    }

    /**
     * Gets the value of the subscriptions property.
     * 
     */
    public long getSubscriptions() {
        return subscriptions;
    }

    /**
     * Sets the value of the subscriptions property.
     * 
     */
    public void setSubscriptions(long value) {
        this.subscriptions = value;
    }

    /**
     * Gets the value of the messagesPublished property.
     * 
     */
    public long getMessagesPublished() {
        return messagesPublished;
    }

    /**
     * Sets the value of the messagesPublished property.
     * 
     */
    public void setMessagesPublished(long value) {
        this.messagesPublished = value;
    }

    /**
     * Gets the value of the messagesReceived property.
     * 
     */
    public long getMessagesReceived() {
        return messagesReceived;
    }

    /**
     * Sets the value of the messagesReceived property.
     * 
     */
    public void setMessagesReceived(long value) {
        this.messagesReceived = value;
    }

    public void toString(ToStringBuilder toStringBuilder) {
        {
            long theID;
            theID = this.getID();
            toStringBuilder.append("id", theID);
        }
        {
            XMLGregorianCalendar theStartDate;
            theStartDate = this.getStartDate();
            toStringBuilder.append("startDate", theStartDate);
        }
        {
            long theConnections;
            theConnections = this.getConnections();
            toStringBuilder.append("connections", theConnections);
        }
        {
            long theSubscriptions;
            theSubscriptions = this.getSubscriptions();
            toStringBuilder.append("subscriptions", theSubscriptions);
        }
        {
            long theMessagesPublished;
            theMessagesPublished = this.getMessagesPublished();
            toStringBuilder.append("messagesPublished", theMessagesPublished);
        }
        {
            long theMessagesReceived;
            theMessagesReceived = this.getMessagesReceived();
            toStringBuilder.append("messagesReceived", theMessagesReceived);
        }
    }

    public String toString() {
        final ToStringBuilder toStringBuilder = new JAXBToStringBuilder(this);
        toString(toStringBuilder);
        return toStringBuilder.toString();
    }

    public void equals(Object object, EqualsBuilder equalsBuilder) {
        if (!(object instanceof MqttSpyStats)) {
            equalsBuilder.appendSuper(false);
            return ;
        }
        if (this == object) {
            return ;
        }
        final MqttSpyStats that = ((MqttSpyStats) object);
        equalsBuilder.append(this.getID(), that.getID());
        equalsBuilder.append(this.getStartDate(), that.getStartDate());
        equalsBuilder.append(this.getConnections(), that.getConnections());
        equalsBuilder.append(this.getSubscriptions(), that.getSubscriptions());
        equalsBuilder.append(this.getMessagesPublished(), that.getMessagesPublished());
        equalsBuilder.append(this.getMessagesReceived(), that.getMessagesReceived());
    }

    public boolean equals(Object object) {
        if (!(object instanceof MqttSpyStats)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final EqualsBuilder equalsBuilder = new JAXBEqualsBuilder();
        equals(object, equalsBuilder);
        return equalsBuilder.isEquals();
    }

    public void hashCode(HashCodeBuilder hashCodeBuilder) {
        hashCodeBuilder.append(this.getID());
        hashCodeBuilder.append(this.getStartDate());
        hashCodeBuilder.append(this.getConnections());
        hashCodeBuilder.append(this.getSubscriptions());
        hashCodeBuilder.append(this.getMessagesPublished());
        hashCodeBuilder.append(this.getMessagesReceived());
    }

    public int hashCode() {
        final HashCodeBuilder hashCodeBuilder = new JAXBHashCodeBuilder();
        hashCode(hashCodeBuilder);
        return hashCodeBuilder.toHashCode();
    }

    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        final MqttSpyStats copy = ((target == null)?((MqttSpyStats) createCopy()):((MqttSpyStats) target));
        {
            long sourceID;
            sourceID = this.getID();
            long copyID = ((long) copyBuilder.copy(sourceID));
            copy.setID(copyID);
        }
        {
            XMLGregorianCalendar sourceStartDate;
            sourceStartDate = this.getStartDate();
            XMLGregorianCalendar copyStartDate = ((XMLGregorianCalendar) copyBuilder.copy(sourceStartDate));
            copy.setStartDate(copyStartDate);
        }
        {
            long sourceConnections;
            sourceConnections = this.getConnections();
            long copyConnections = ((long) copyBuilder.copy(sourceConnections));
            copy.setConnections(copyConnections);
        }
        {
            long sourceSubscriptions;
            sourceSubscriptions = this.getSubscriptions();
            long copySubscriptions = ((long) copyBuilder.copy(sourceSubscriptions));
            copy.setSubscriptions(copySubscriptions);
        }
        {
            long sourceMessagesPublished;
            sourceMessagesPublished = this.getMessagesPublished();
            long copyMessagesPublished = ((long) copyBuilder.copy(sourceMessagesPublished));
            copy.setMessagesPublished(copyMessagesPublished);
        }
        {
            long sourceMessagesReceived;
            sourceMessagesReceived = this.getMessagesReceived();
            long copyMessagesReceived = ((long) copyBuilder.copy(sourceMessagesReceived));
            copy.setMessagesReceived(copyMessagesReceived);
        }
        return copy;
    }

    public Object copyTo(Object target) {
        final CopyBuilder copyBuilder = new JAXBCopyBuilder();
        return copyTo(target, copyBuilder);
    }

    public Object createCopy() {
        return new MqttSpyStats();
    }

}
