/**
 * CarServiceSOAPSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.example.www.CarService;

public class CarServiceSOAPSkeleton implements org.example.www.CarService.CarService_PortType, org.apache.axis.wsdl.Skeleton {
    private org.example.www.CarService.CarService_PortType impl;
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
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("getCars", _params, new javax.xml.namespace.QName("", "out"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.example.org/CarService/", "Cars"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://www.example.org/CarService/", "getCars"));
        _oper.setSoapAction("http://www.example.org/CarService/getCars");
        _myOperationsList.add(_oper);
        if (_myOperations.get("getCars") == null) {
            _myOperations.put("getCars", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("getCars")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.example.org/CarService/", "rentInfo"), org.example.www.CarService.RentInfo.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("rentCars", _params, new javax.xml.namespace.QName("", "out"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://www.example.org/CarService/", "rentCars"));
        _oper.setSoapAction("http://www.example.org/CarService/rentCars");
        _myOperationsList.add(_oper);
        if (_myOperations.get("rentCars") == null) {
            _myOperations.put("rentCars", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("rentCars")).add(_oper);
    }

    public CarServiceSOAPSkeleton() {
        this.impl = new org.example.www.CarService.CarServiceSOAPImpl();
    }

    public CarServiceSOAPSkeleton(org.example.www.CarService.CarService_PortType impl) {
        this.impl = impl;
    }
    public org.example.www.CarService.Car[] getCars(java.lang.String in) throws java.rmi.RemoteException
    {
        org.example.www.CarService.Car[] ret = impl.getCars(in);
        return ret;
    }

    public boolean rentCars(org.example.www.CarService.RentInfo in) throws java.rmi.RemoteException
    {
        boolean ret = impl.rentCars(in);
        return ret;
    }

}
