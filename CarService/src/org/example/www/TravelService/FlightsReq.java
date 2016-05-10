/**
 * FlightsReq.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.example.www.TravelService;

public class FlightsReq  implements java.io.Serializable {
    private int airport1;  // attribute

    private int airport2;  // attribute

    private java.util.Date startdate;  // attribute

    private java.util.Date enddate;  // attribute

    public FlightsReq() {
    }

    public FlightsReq(
           int airport1,
           int airport2,
           java.util.Date startdate,
           java.util.Date enddate) {
           this.airport1 = airport1;
           this.airport2 = airport2;
           this.startdate = startdate;
           this.enddate = enddate;
    }


    /**
     * Gets the airport1 value for this FlightsReq.
     * 
     * @return airport1
     */
    public int getAirport1() {
        return airport1;
    }


    /**
     * Sets the airport1 value for this FlightsReq.
     * 
     * @param airport1
     */
    public void setAirport1(int airport1) {
        this.airport1 = airport1;
    }


    /**
     * Gets the airport2 value for this FlightsReq.
     * 
     * @return airport2
     */
    public int getAirport2() {
        return airport2;
    }


    /**
     * Sets the airport2 value for this FlightsReq.
     * 
     * @param airport2
     */
    public void setAirport2(int airport2) {
        this.airport2 = airport2;
    }


    /**
     * Gets the startdate value for this FlightsReq.
     * 
     * @return startdate
     */
    public java.util.Date getStartdate() {
        return startdate;
    }


    /**
     * Sets the startdate value for this FlightsReq.
     * 
     * @param startdate
     */
    public void setStartdate(java.util.Date startdate) {
        this.startdate = startdate;
    }


    /**
     * Gets the enddate value for this FlightsReq.
     * 
     * @return enddate
     */
    public java.util.Date getEnddate() {
        return enddate;
    }


    /**
     * Sets the enddate value for this FlightsReq.
     * 
     * @param enddate
     */
    public void setEnddate(java.util.Date enddate) {
        this.enddate = enddate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FlightsReq)) return false;
        FlightsReq other = (FlightsReq) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.airport1 == other.getAirport1() &&
            this.airport2 == other.getAirport2() &&
            ((this.startdate==null && other.getStartdate()==null) || 
             (this.startdate!=null &&
              this.startdate.equals(other.getStartdate()))) &&
            ((this.enddate==null && other.getEnddate()==null) || 
             (this.enddate!=null &&
              this.enddate.equals(other.getEnddate())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        _hashCode += getAirport1();
        _hashCode += getAirport2();
        if (getStartdate() != null) {
            _hashCode += getStartdate().hashCode();
        }
        if (getEnddate() != null) {
            _hashCode += getEnddate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FlightsReq.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.example.org/TravelService/", "flightsReq"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("airport1");
        attrField.setXmlName(new javax.xml.namespace.QName("", "airport1"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("airport2");
        attrField.setXmlName(new javax.xml.namespace.QName("", "airport2"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("startdate");
        attrField.setXmlName(new javax.xml.namespace.QName("", "startdate"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("enddate");
        attrField.setXmlName(new javax.xml.namespace.QName("", "enddate"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        typeDesc.addFieldDesc(attrField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
