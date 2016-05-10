/**
 * HotelService_PortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.example.www.HotelService;

public interface HotelService_PortType extends java.rmi.Remote {
    public org.example.www.HotelService.Hotel getHotels(java.lang.String parameters) throws java.rmi.RemoteException;
    public org.example.www.HotelService.Room getRooms(org.example.www.HotelService.BookDates getRoomsRequest) throws java.rmi.RemoteException;
    public boolean makeBooking(org.example.www.HotelService.Booking makeBookingRequest) throws java.rmi.RemoteException;
}
