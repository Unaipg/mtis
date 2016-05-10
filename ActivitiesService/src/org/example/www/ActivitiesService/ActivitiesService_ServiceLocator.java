/**
 * ActivitiesService_ServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.example.www.ActivitiesService;

public class ActivitiesService_ServiceLocator extends org.apache.axis.client.Service implements org.example.www.ActivitiesService.ActivitiesService_Service {

    public ActivitiesService_ServiceLocator() {
    }


    public ActivitiesService_ServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ActivitiesService_ServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ActivitiesServiceSOAP
    private java.lang.String ActivitiesServiceSOAP_address = "http://www.example.org/";

    public java.lang.String getActivitiesServiceSOAPAddress() {
        return ActivitiesServiceSOAP_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ActivitiesServiceSOAPWSDDServiceName = "ActivitiesServiceSOAP";

    public java.lang.String getActivitiesServiceSOAPWSDDServiceName() {
        return ActivitiesServiceSOAPWSDDServiceName;
    }

    public void setActivitiesServiceSOAPWSDDServiceName(java.lang.String name) {
        ActivitiesServiceSOAPWSDDServiceName = name;
    }

    public org.example.www.ActivitiesService.ActivitiesService_PortType getActivitiesServiceSOAP() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ActivitiesServiceSOAP_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getActivitiesServiceSOAP(endpoint);
    }

    public org.example.www.ActivitiesService.ActivitiesService_PortType getActivitiesServiceSOAP(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            org.example.www.ActivitiesService.ActivitiesServiceSOAPStub _stub = new org.example.www.ActivitiesService.ActivitiesServiceSOAPStub(portAddress, this);
            _stub.setPortName(getActivitiesServiceSOAPWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setActivitiesServiceSOAPEndpointAddress(java.lang.String address) {
        ActivitiesServiceSOAP_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (org.example.www.ActivitiesService.ActivitiesService_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                org.example.www.ActivitiesService.ActivitiesServiceSOAPStub _stub = new org.example.www.ActivitiesService.ActivitiesServiceSOAPStub(new java.net.URL(ActivitiesServiceSOAP_address), this);
                _stub.setPortName(getActivitiesServiceSOAPWSDDServiceName());
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
        if ("ActivitiesServiceSOAP".equals(inputPortName)) {
            return getActivitiesServiceSOAP();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://www.example.org/ActivitiesService/", "ActivitiesService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://www.example.org/ActivitiesService/", "ActivitiesServiceSOAP"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ActivitiesServiceSOAP".equals(portName)) {
            setActivitiesServiceSOAPEndpointAddress(address);
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
