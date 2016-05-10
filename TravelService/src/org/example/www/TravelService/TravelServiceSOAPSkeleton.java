/**
 * TravelServiceSOAPSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.example.www.TravelService;

public class TravelServiceSOAPSkeleton implements org.example.www.TravelService.TravelService_PortType, org.apache.axis.wsdl.Skeleton {
    private org.example.www.TravelService.TravelService_PortType impl;
    private static java.util.Map _myOperations = new java.util.Hashtable();
    private static java.util.Collection _myOperationsList = new java.util.ArrayList();

    /**
    * Returns List of OperationDesc objects with this name
    */
    public static java.util.List getOperationDescByName(java.lang.String methodName) {
        return (java.util.List)_myOperations.get(methodName);
    }

    /**
    * Returns Collection of OperationDescs
    */
    public static java.util.Collection getOperationDescs() {
        return _myOperationsList;
    }

    static {
        org.apache.axis.description.OperationDesc _oper;
        org.apache.axis.description.FaultDesc _fault;
        org.apache.axis.description.ParameterDesc [] _params;
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parameters"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.example.org/TravelService/", "emptyType"), org.example.www.TravelService.EmptyType.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("getAirports", _params, new javax.xml.namespace.QName("", "parameters"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.example.org/TravelService/", "Airport"));
        _oper.setElementQName(new javax.xml.namespace.QName("", "getAirports"));
        _oper.setSoapAction("http://www.example.org/TravelService/getAirports");
        _myOperationsList.add(_oper);
        if (_myOperations.get("getAirports") == null) {
            _myOperations.put("getAirports", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("getAirports")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "getFlightsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.example.org/TravelService/", "flightsReq"), org.example.www.TravelService.FlightsReq.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("getFlights", _params, new javax.xml.namespace.QName("", "getFlightsResponse"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.example.org/TravelService/", "Flight"));
        _oper.setElementQName(new javax.xml.namespace.QName("", "getFlights"));
        _oper.setSoapAction("http://www.example.org/TravelService/getFlights");
        _myOperationsList.add(_oper);
        if (_myOperations.get("getFlights") == null) {
            _myOperations.put("getFlights", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("getFlights")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "bookFlightRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("bookFlight", _params, new javax.xml.namespace.QName("", "bookFlightResponse"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        _oper.setElementQName(new javax.xml.namespace.QName("", "bookFlight"));
        _oper.setSoapAction("http://www.example.org/TravelService/bookFlight");
        _myOperationsList.add(_oper);
        if (_myOperations.get("bookFlight") == null) {
            _myOperations.put("bookFlight", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("bookFlight")).add(_oper);
    }

    public TravelServiceSOAPSkeleton() {
        this.impl = new org.example.www.TravelService.TravelServiceSOAPImpl();
    }

    public TravelServiceSOAPSkeleton(org.example.www.TravelService.TravelService_PortType impl) {
        this.impl = impl;
    }
    public org.example.www.TravelService.Airport getAirports(org.example.www.TravelService.EmptyType parameters) throws java.rmi.RemoteException
    {
        org.example.www.TravelService.Airport ret = impl.getAirports(parameters);
        return ret;
    }

    public org.example.www.TravelService.Flight getFlights(org.example.www.TravelService.FlightsReq getFlightsRequest) throws java.rmi.RemoteException
    {
        org.example.www.TravelService.Flight ret = impl.getFlights(getFlightsRequest);
        return ret;
    }

    public boolean bookFlight(int bookFlightRequest) throws java.rmi.RemoteException
    {
        boolean ret = impl.bookFlight(bookFlightRequest);
        return ret;
    }

}
