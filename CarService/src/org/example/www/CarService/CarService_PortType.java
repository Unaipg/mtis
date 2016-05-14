/**
 * CarService_PortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.example.www.CarService;

public interface CarService_PortType extends java.rmi.Remote {
    public org.example.www.CarService.Car[] getCars(java.lang.String in) throws java.rmi.RemoteException;
    public boolean rentCars(org.example.www.CarService.RentInfo in) throws java.rmi.RemoteException;
}
