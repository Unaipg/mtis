/**
 * Booking.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.example.www.HotelService;

public class Booking  implements java.io.Serializable {
    private int roomid;  // attribute

    private java.util.Date startdate;  // attribute

    private java.util.Date enddate;  // attribute

    public Booking() {
    }

    public Booking(
           int roomid,
           java.util.Date startdate,
           java.util.Date enddate) {
           this.roomid = roomid;
           this.startdate = startdate;
           this.enddate = enddate;
    }


    /**
     * Gets the roomid value for this Booking.
     * 
     * @return roomid
     */
    public int getRoomid() {
        return roomid;
    }


    /**
     * Sets the roomid value for this Booking.
     * 
     * @param roomid
     */
    public void setRoomid(int roomid) {
        this.roomid = roomid;
    }


    /**
     * Gets the startdate value for this Booking.
     * 
     * @return startdate
     */
    public java.util.Date getStartdate() {
        return startdate;
    }


    /**
     * Sets the startdate value for this Booking.
     * 
     * @param startdate
     */
    public void setStartdate(java.util.Date startdate) {
        this.startdate = startdate;
    }


    /**
     * Gets the enddate value for this Booking.
     * 
     * @return enddate
     */
    public java.util.Date getEnddate() {
        return enddate;
    }


    /**
     * Sets the enddate value for this Booking.
     * 
     * @param enddate
     */
    public void setEnddate(java.util.Date enddate) {
        this.enddate = enddate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Booking)) return false;
        Booking other = (Booking) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.roomid == other.getRoomid() &&
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
        _hashCode += getRoomid();
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
        new org.apache.axis.description.TypeDesc(Booking.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.example.org/HotelService/", "Booking"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("roomid");
        attrField.setXmlName(new javax.xml.namespace.QName("", "roomid"));
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
