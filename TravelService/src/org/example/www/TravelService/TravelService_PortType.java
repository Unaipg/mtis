/**
 * TravelService_PortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.example.www.TravelService;

public interface TravelService_PortType extends java.rmi.Remote {
    public org.example.www.TravelService.Airport getAirports(org.example.www.TravelService.EmptyType parameters) throws java.rmi.RemoteException;
    public org.example.www.TravelService.Flight getFlights(org.example.www.TravelService.FlightsReq getFlightsRequest) throws java.rmi.RemoteException;
    public boolean bookFlight(int bookFlightRequest) throws java.rmi.RemoteException;
}
