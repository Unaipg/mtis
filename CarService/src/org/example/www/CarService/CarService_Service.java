/**
 * CarService_Service.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.example.www.CarService;

public interface CarService_Service extends javax.xml.rpc.Service {
    public java.lang.String getCarServiceSOAPAddress();

    public org.example.www.CarService.CarService_PortType getCarServiceSOAP() throws javax.xml.rpc.ServiceException;

    public org.example.www.CarService.CarService_PortType getCarServiceSOAP(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
