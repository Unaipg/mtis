/**
 * ActivitiesService_PortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.example.www.ActivitiesService;

public interface ActivitiesService_PortType extends java.rmi.Remote {
    public org.example.www.ActivitiesService.Activity getActivities(java.lang.String parameters) throws java.rmi.RemoteException;
    public boolean bookActivity(int parameters) throws java.rmi.RemoteException;
}
