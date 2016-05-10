/**
 * HotelService_ServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.example.www.HotelService;

public class HotelService_ServiceLocator extends org.apache.axis.client.Service implements org.example.www.HotelService.HotelService_Service {

    public HotelService_ServiceLocator() {
    }


    public HotelService_ServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public HotelService_ServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for HotelServiceSOAP
    private java.lang.String HotelServiceSOAP_address = "http://www.example.org/";

    public java.lang.String getHotelServiceSOAPAddress() {
        return HotelServiceSOAP_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String HotelServiceSOAPWSDDServiceName = "HotelServiceSOAP";

    public java.lang.String getHotelServiceSOAPWSDDServiceName() {
        return HotelServiceSOAPWSDDServiceName;
    }

    public void setHotelServiceSOAPWSDDServiceName(java.lang.String name) {
        HotelServiceSOAPWSDDServiceName = name;
    }

    public org.example.www.HotelService.HotelService_PortType getHotelServiceSOAP() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(HotelServiceSOAP_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getHotelServiceSOAP(endpoint);
    }

    public org.example.www.HotelService.HotelService_PortType getHotelServiceSOAP(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            org.example.www.HotelService.HotelServiceSOAPStub _stub = new org.example.www.HotelService.HotelServiceSOAPStub(portAddress, this);
            _stub.setPortName(getHotelServiceSOAPWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setHotelServiceSOAPEndpointAddress(java.lang.String address) {
        HotelServiceSOAP_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (org.example.www.HotelService.HotelService_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                org.example.www.HotelService.HotelServiceSOAPStub _stub = new org.example.www.HotelService.HotelServiceSOAPStub(new java.net.URL(HotelServiceSOAP_address), this);
                _stub.setPortName(getHotelServiceSOAPWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("HotelServiceSOAP".equals(inputPortName)) {
            return getHotelServiceSOAP();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://www.example.org/HotelService/", "HotelService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://www.example.org/HotelService/", "HotelServiceSOAP"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("HotelServiceSOAP".equals(portName)) {
            setHotelServiceSOAPEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
