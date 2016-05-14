/**
 * HotelServiceSOAPImpl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.example.www.HotelService;

import java.util.List;

public class HotelServiceSOAPImpl implements org.example.www.HotelService.HotelService_PortType{
    public org.example.www.HotelService.Hotel[] getHotels(java.lang.String parameters) throws java.rmi.RemoteException {
        /*Hotel h1 = new Hotel(3, "Sitio molÃ³n");
        Hotel h2 = new Hotel(4, "Sitio cutre");
        List<Hotel> hoteles;
        hoteles.add(h1);hoteles.add(h2);
    	return hoteles;*/
    	return null;
    }

    public org.example.www.HotelService.Room[] getRooms(org.example.www.HotelService.BookDates getRoomsRequest) throws java.rmi.RemoteException {
        return null;
    }
    //Esto es antiguo y se deberÃ­a haber borrado pero como eclipse va como va... no me atrevo a quitarlo a mano
	public org.example.www.HotelService.Room getRooms(int getRoomsRequest) throws java.rmi.RemoteException {
        return null;
    }

    public boolean makeBooking(org.example.www.HotelService.Booking makeBookingRequest) throws java.rmi.RemoteException {
        return false;
    }

}
