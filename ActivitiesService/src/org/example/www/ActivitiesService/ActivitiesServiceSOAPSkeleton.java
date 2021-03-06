/**
 * ActivitiesServiceSOAPSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.example.www.ActivitiesService;

public class ActivitiesServiceSOAPSkeleton implements org.example.www.ActivitiesService.ActivitiesService_PortType, org.apache.axis.wsdl.Skeleton {
    private org.example.www.ActivitiesService.ActivitiesService_PortType impl;
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
        _oper = new org.apache.axis.description.OperationDesc("getActivities", _params, new javax.xml.namespace.QName("", "parameters"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.example.org/ActivitiesService/", "Activity"));
        _oper.setElementQName(new javax.xml.namespace.QName("", "getActivities"));
        _oper.setSoapAction("http://www.example.org/ActivitiesService/getActivities");
        _myOperationsList.add(_oper);
        if (_myOperations.get("getActivities") == null) {
            _myOperations.put("getActivities", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("getActivities")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parameters"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("bookActivity", _params, new javax.xml.namespace.QName("", "parameters"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        _oper.setElementQName(new javax.xml.namespace.QName("", "bookActivity"));
        _oper.setSoapAction("http://www.example.org/ActivitiesService/bookActivity");
        _myOperationsList.add(_oper);
        if (_myOperations.get("bookActivity") == null) {
            _myOperations.put("bookActivity", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("bookActivity")).add(_oper);
    }

    public ActivitiesServiceSOAPSkeleton() {
        this.impl = new org.example.www.ActivitiesService.ActivitiesServiceSOAPImpl();
    }

    public ActivitiesServiceSOAPSkeleton(org.example.www.ActivitiesService.ActivitiesService_PortType impl) {
        this.impl = impl;
    }
    public org.example.www.ActivitiesService.Activity getActivities(java.lang.String parameters) throws java.rmi.RemoteException
    {
        org.example.www.ActivitiesService.Activity ret = impl.getActivities(parameters);
        return ret;
    }

    public boolean bookActivity(int parameters) throws java.rmi.RemoteException
    {
        boolean ret = impl.bookActivity(parameters);
        return ret;
    }

}
