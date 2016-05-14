/**
 * NewWSDLFileSOAPSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.example.www.NewWSDLFile;

public class NewWSDLFileSOAPSkeleton implements org.example.www.NewWSDLFile.NewWSDLFile_PortType, org.apache.axis.wsdl.Skeleton {
    private org.example.www.NewWSDLFile.NewWSDLFile_PortType impl;
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
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parameters"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.example.org/NewWSDLFile/", "empty"), org.example.www.NewWSDLFile.Empty.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("prueba", _params, new javax.xml.namespace.QName("", "parameters"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        _oper.setElementQName(new javax.xml.namespace.QName("", "prueba"));
        _oper.setSoapAction("http://www.example.org/NewWSDLFile/prueba");
        _myOperationsList.add(_oper);
        if (_myOperations.get("prueba") == null) {
            _myOperations.put("prueba", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("prueba")).add(_oper);
    }

    public NewWSDLFileSOAPSkeleton() {
        this.impl = new org.example.www.NewWSDLFile.NewWSDLFileSOAPImpl();
    }

    public NewWSDLFileSOAPSkeleton(org.example.www.NewWSDLFile.NewWSDLFile_PortType impl) {
        this.impl = impl;
    }
    public java.lang.String prueba(org.example.www.NewWSDLFile.Empty parameters) throws java.rmi.RemoteException
    {
        java.lang.String ret = impl.prueba(parameters);
        return ret;
    }

}
