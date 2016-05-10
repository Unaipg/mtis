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
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parameters"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.example.org/CarService/", "getCarsInput"), org.example.www.CarService.GetCarsInput.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("getCars", _params, new javax.xml.namespace.QName("", "parameters"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.example.org/CarService/", "Car"));
        _oper.setElementQName(new javax.xml.namespace.QName("", "getCars"));
        _oper.setSoapAction("http://www.example.org/CarService/getCars");
        _myOperationsList.add(_oper);
        if (_myOperations.get("getCars") == null) {
            _myOperations.put("getCars", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("getCars")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "rentCartRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.example.org/CarService/", "rentInfo"), org.example.www.CarService.RentInfo.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("rentCart", _params, new javax.xml.namespace.QName("", "rentCartResponse"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        _oper.setElementQName(new javax.xml.namespace.QName("", "rentCart"));
        _oper.setSoapAction("http://www.example.org/CarService/rentCart");
        _myOperationsList.add(_oper);
        if (_myOperations.get("rentCart") == null) {
            _myOperations.put("rentCart", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("rentCart")).add(_oper);
    }

    public CarServiceSOAPSkeleton() {
        this.impl = new org.example.www.CarService.CarServiceSOAPImpl();
    }

    public CarServiceSOAPSkeleton(org.example.www.CarService.CarService_PortType impl) {
        this.impl = impl;
    }
    public org.example.www.CarService.Car getCars(org.example.www.CarService.GetCarsInput parameters) throws java.rmi.RemoteException
    {
        org.example.www.CarService.Car ret = impl.getCars(parameters);
        return ret;
    }

    public boolean rentCart(org.example.www.CarService.RentInfo rentCartRequest) throws java.rmi.RemoteException
    {
        boolean ret = impl.rentCart(rentCartRequest);
        return ret;
    }

}
