//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.04.15 at 11:24:49 PM BST 
//


package pl.baczkowicz.mqttspy.daemon.configuration.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RunningMode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RunningMode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CONTINUOUS"/>
 *     &lt;enumeration value="SCRIPTS_ONLY"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RunningMode")
@XmlEnum
public enum RunningMode {

    CONTINUOUS,
    SCRIPTS_ONLY;

    public String value() {
        return name();
    }

    public static RunningMode fromValue(String v) {
        return valueOf(v);
    }

}
