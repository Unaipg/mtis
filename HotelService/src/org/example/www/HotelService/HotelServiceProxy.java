package org.example.www.HotelService;

public class HotelServiceProxy implements org.example.www.HotelService.HotelService_PortType {
  private String _endpoint = null;
  private org.example.www.HotelService.HotelService_PortType hotelService_PortType = null;
  
  public HotelServiceProxy() {
    _initHotelServiceProxy();
  }
  
  public HotelServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initHotelServiceProxy();
  }
  
  private void _initHotelServiceProxy() {
    try {
      hotelService_PortType = (new org.example.www.HotelService.HotelService_ServiceLocator()).getHotelServiceSOAP();
      if (hotelService_PortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)hotelService_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)hotelService_PortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (hotelService_PortType != null)
      ((javax.xml.rpc.Stub)hotelService_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public org.example.www.HotelService.HotelService_PortType getHotelService_PortType() {
    if (hotelService_PortType == null)
      _initHotelServiceProxy();
    return hotelService_PortType;
  }
  
  public org.example.www.HotelService.Hotel getHotels(java.lang.String parameters) throws java.rmi.RemoteException{
    if (hotelService_PortType == null)
      _initHotelServiceProxy();
    return hotelService_PortType.getHotels(parameters);
  }
  
  public org.example.www.HotelService.Room getRooms(org.example.www.HotelService.BookDates getRoomsRequest) throws java.rmi.RemoteException{
    if (hotelService_PortType == null)
      _initHotelServiceProxy();
    return hotelService_PortType.getRooms(getRoomsRequest);
  }
  
  public boolean makeBooking(org.example.www.HotelService.Booking makeBookingRequest) throws java.rmi.RemoteException{
    if (hotelService_PortType == null)
      _initHotelServiceProxy();
    return hotelService_PortType.makeBooking(makeBookingRequest);
  }
  
  
}