/**
 * CarService_ServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.example.www.CarService;

public class CarService_ServiceLocator extends org.apache.axis.client.Service implements org.example.www.CarService.CarService_Service {

    public CarService_ServiceLocator() {
    }


    public CarService_ServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public CarService_ServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for CarServiceSOAP
    private java.lang.String CarServiceSOAP_address = "http://www.example.org/";

    public java.lang.String getCarServiceSOAPAddress() {
        return CarServiceSOAP_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String CarServiceSOAPWSDDServiceName = "CarServiceSOAP";

    public java.lang.String getCarServiceSOAPWSDDServiceName() {
        return CarServiceSOAPWSDDServiceName;
    }

    public void setCarServiceSOAPWSDDServiceName(java.lang.String name) {
        CarServiceSOAPWSDDServiceName = name;
    }

    public org.example.www.CarService.CarService_PortType getCarServiceSOAP() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(CarServiceSOAP_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getCarServiceSOAP(endpoint);
    }

    public org.example.www.CarService.CarService_PortType getCarServiceSOAP(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            org.example.www.CarService.CarServiceSOAPStub _stub = new org.example.www.CarService.CarServiceSOAPStub(portAddress, this);
            _stub.setPortName(getCarServiceSOAPWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setCarServiceSOAPEndpointAddress(java.lang.String address) {
        CarServiceSOAP_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (org.example.www.CarService.CarService_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                org.example.www.CarService.CarServiceSOAPStub _stub = new org.example.www.CarService.CarServiceSOAPStub(new java.net.URL(CarServiceSOAP_address), this);
                _stub.setPortName(getCarServiceSOAPWSDDServiceName());
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
        if ("CarServiceSOAP".equals(inputPortName)) {
            return getCarServiceSOAP();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://www.example.org/CarService/", "CarService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://www.example.org/CarService/", "CarServiceSOAP"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("CarServiceSOAP".equals(portName)) {
            setCarServiceSOAPEndpointAddress(address);
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
