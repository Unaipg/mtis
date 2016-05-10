/**
 * HotelServiceSOAPSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.example.www.HotelService;

public class HotelServiceSOAPSkeleton implements org.example.www.HotelService.HotelService_PortType, org.apache.axis.wsdl.Skeleton {
    private org.example.www.HotelService.HotelService_PortType impl;
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
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parameters"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("getHotels", _params, new javax.xml.namespace.QName("", "parameters"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.example.org/HotelService/", "Hotel"));
        _oper.setElementQName(new javax.xml.namespace.QName("", "getHotels"));
        _oper.setSoapAction("http://www.example.org/HotelService/getHotels");
        _myOperationsList.add(_oper);
        if (_myOperations.get("getHotels") == null) {
            _myOperations.put("getHotels", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("getHotels")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "getRoomsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.example.org/HotelService/", "BookDates"), org.example.www.HotelService.BookDates.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("getRooms", _params, new javax.xml.namespace.QName("", "parameters"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.example.org/HotelService/", "Room"));
        _oper.setElementQName(new javax.xml.namespace.QName("", "getRooms"));
        _oper.setSoapAction("http://www.example.org/HotelService/getRooms");
        _myOperationsList.add(_oper);
        if (_myOperations.get("getRooms") == null) {
            _myOperations.put("getRooms", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("getRooms")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "makeBookingRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.example.org/HotelService/", "Booking"), org.example.www.HotelService.Booking.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("makeBooking", _params, new javax.xml.namespace.QName("", "parameters"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        _oper.setElementQName(new javax.xml.namespace.QName("", "makeBooking"));
        _oper.setSoapAction("http://www.example.org/HotelService/makeBooking");
        _myOperationsList.add(_oper);
        if (_myOperations.get("makeBooking") == null) {
            _myOperations.put("makeBooking", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("makeBooking")).add(_oper);
    }

    public HotelServiceSOAPSkeleton() {
        this.impl = new org.example.www.HotelService.HotelServiceSOAPImpl();
    }

    public HotelServiceSOAPSkeleton(org.example.www.HotelService.HotelService_PortType impl) {
        this.impl = impl;
    }
    public org.example.www.HotelService.Hotel getHotels(java.lang.String parameters) throws java.rmi.RemoteException
    {
        org.example.www.HotelService.Hotel ret = impl.getHotels(parameters);
        return ret;
    }

    public org.example.www.HotelService.Room getRooms(org.example.www.HotelService.BookDates getRoomsRequest) throws java.rmi.RemoteException
    {
        org.example.www.HotelService.Room ret = impl.getRooms(getRoomsRequest);
        return ret;
    }

    public boolean makeBooking(org.example.www.HotelService.Booking makeBookingRequest) throws java.rmi.RemoteException
    {
        boolean ret = impl.makeBooking(makeBookingRequest);
        return ret;
    }

}
